# System,RegRedirect #

Redirect some of the OS call related to registry manipulation to avoid possible conflicts.

## Syntax ##
```
System,REGREDIRECT,{64|32|OFF}
```

## Parameters ##
  * 64 causes next accesses to the 64 bit entries.
  * 32 causes next accesses to the 32 bit node.
  * OFF causes Host OS to make the decision

## Remarks ##
  * Maybe necessary when WinBuilder is running on a 64bit system.
  * Once set, the definition is valid for the rest of the projects processing.
  * Using this command on a 32bit system has no effect.

### Example: ###
```
System,REGREDIRECT,64
RegRead,HKLM,SOFTWARE\Sun\xVM VirtualBox",InstallDir,%VBPath%
System,REGREDIRECT,OFF
```