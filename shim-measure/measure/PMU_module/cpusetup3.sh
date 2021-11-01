#!/bin/sh

cd /sys/devices/system/cpu
newSpeedTop=`awk '{print $NF}' ./cpu0/cpufreq/scaling_available_frequencies`
newSpeedLow=$newSpeedTop

for c in ./cpu[0-9]* ; do
    echo $newSpeedTop > ${c}/cpufreq/scaling_max_freq
    echo $newSpeedLow > ${c}/cpufreq/scaling_min_freq
done

env mknod -m 666 /dev/mydevice0 c `grep MyDevice /proc/devices | awk '{print $1;}'` 0

env mknod -m 666 /dev/set_pmu c `grep SetPMU /proc/devices | awk '{print $1;}'` 0
