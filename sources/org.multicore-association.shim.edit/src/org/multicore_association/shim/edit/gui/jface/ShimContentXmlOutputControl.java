package org.multicore_association.shim.edit.gui.jface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.multicore_association.shim.edit.binding.ShimDataLoader;

public class ShimContentXmlOutputControl extends ShimContentControl implements MouseListener, MouseMoveListener {
	
	private ECPSWTView view;
	private StackLayout stack;
	private String path;
	
	private StyledText text;
	private Vector ranges = new Vector();
	private Cursor handCursor;
	private Cursor arrowCursor;
	
	private String he = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
			"<shim:Shim \r\n" + 
			"    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n" + 
			"    xmlns:shim=\"http://www.multicore-association.org/2017/SHIM2.0/\"\r\n" + 
			"    xsi:schemaLocation=\"http://www.multicore-association.org/2017/SHIM2.0/ ../../schemas/shim20.xsd\"\r\n" + 
			"    name=\"MySystem\" shimVersion=\"2.0\">\n";
	private String head = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<shim:Shim\n    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n    xmlns:shim=\"http://www.multicore-association.org/2017/SHIM2.0/\"\n    xsi:schemaLocation=\"http://www.multicore-association.org/2017/SHIM2.0/ ../../schemas/shim20.xsd\"\n    name=\"MySystemVe\"shimVersion=\"2.0\">\n";
	private String last = "\n</shim:Shim>";

	
	public ShimContentXmlOutputControl(Composite parent, int style, String path) {
		super(parent, style);
		
		stack = new StackLayout();
		this.setLayout(stack);
		this.path = path;
	}
	
	@Override
	public void dispose() {
		if (view != null) {
			view.dispose();
			view = null;
		}

		super.dispose();
	}

	@Override
	public void setInput(EObject object) {
		// TODO Auto-generated method stub
		if (view != null) {
			view.dispose();
			view = null;
		}

		Composite container = this;
		
		File sampleFile = new File("sample.xml");
		String filePath = sampleFile.getPath();
		Resource resource = object.eResource();
				
		try (FileOutputStream fos = new FileOutputStream(sampleFile)) {
			resource.save(fos, ShimDataLoader.createSaveOptions());
		} catch (IOException e) {
			
		}
		
		text = new StyledText(container, SWT.MULTI|SWT.BORDER|SWT.H_SCROLL|SWT.V_SCROLL);
		String fileStr = "";
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line;
			while ((line = br.readLine()) != null) {
				text.append(line + '\n');
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			if (sampleFile.exists()) {
				sampleFile.delete();
			}
		}
				
		text.setEditable(false);
		text.setCaret(null);
		
		handCursor = new Cursor(null, SWT.CURSOR_HAND);
		arrowCursor = new Cursor(null, SWT.CURSOR_ARROW);
		
		createHyperLink(text);
		text.addMouseListener(this);
		text.addMouseMoveListener(this);
	
		stack.topControl = text;

		container.layout(true, true);

	}

	@Override
	public boolean findAndSelect(Object selectedItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

	}
	
	private void createHyperLink(StyledText text) {
		String content = text.getText();
		Pattern pattern = Pattern.compile("<[^\n]*FunctionalUnitSet>");
		Matcher matcher = pattern.matcher(content);
		
		int index = 0;
		while (matcher.find()) {
			String line = matcher.group();
			index = content.indexOf(line, index+1);
			HyperLinkRange range = new HyperLinkRange();
			
			range.start = index;
			range.length = line.length();
			range.fontStyle = SWT.BOLD;
			range.foreground = getDisplay().getSystemColor(SWT.COLOR_RED);
			range.keyword = line;
			ranges.add(range);
									
			text.setStyleRange(range);
		}
	}

	private HyperLinkRange getHyperLinkRange(int x, int y) {
		Point p = new Point(x, y);
		try {
			int offset = text.getOffsetAtPoint(p);
			for (int i=0; i<ranges.size(); i++) {
				HyperLinkRange r = (HyperLinkRange) ranges.get(i);
				int offset1 = r.start;
				int offset2 = offset1 + r.length;
				if (offset >= offset1 && offset <= offset2) {
					return r;
				}
			}
		} catch (IllegalArgumentException e) {
			
		}
		return null;
	}

	@Override
	public void mouseDoubleClick(MouseEvent event) {
		
		int x = event.x;
		int y = event.y;
		HyperLinkRange range = getHyperLinkRange(x, y);
		
		if (range != null) {
			String content = text.getText();
			Pattern pattern = Pattern.compile("(?s)[ ]*?<[^\n]*FunctionalUnitSet>.*?</[^\n]*FunctionalUnitSet>");
			Matcher matcher = pattern.matcher(content);
			
			matcher.find();
			String data = matcher.group();
			
			String filename = "FunctionalUnitSet.xml";
			
			makeShimFile(data, filename);
		}
	}

	private void makeShimFile(String data, String filename) {
		
		data = he + data + last;
		
		FileDialog dialog = new FileDialog(getShell(), SWT.SAVE);
		
		dialog.setFileName(filename);

		path = dialog.open();

		if (path != null) {
			try {
				FileWriter fileWriter = new FileWriter(path);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write(data);
				bufferedWriter.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}	
	}

	@Override
	public void mouseDown(MouseEvent event) {
		
	}
	
	@Override
	public void mouseUp(MouseEvent event) {
		
	}
	
	@Override
	public void mouseMove(MouseEvent event) {
		int x = event.x;
		int y = event.y;
		HyperLinkRange range = getHyperLinkRange(x, y);
		if (range != null) {
			text.setCursor(text.getDisplay().getSystemCursor(SWT.CURSOR_HAND));
		} else {
			text.setCursor(text.getDisplay().getSystemCursor(SWT.CURSOR_ARROW));
		}
	}
	
	class HyperLinkRange extends StyleRange {
		String keyword;
	}

	
}
