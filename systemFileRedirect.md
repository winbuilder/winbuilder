# System,FileRedirect #
Redirect some of the OS directory calls to avoid possible conflicts.
## Syntax ##
```
System,FILEREDIRECT,{ON|OFF}
```
## Remarks ##
Only necessary when WinBuilder is running on a 64bit system.  On a 32bit system, this command has no effect.

### Example: ###
```
System,FILEREDIRECT,OFF
ShellExecute,Hide,"cmd.exe","/c imdisk -d -m %FreeLetter%"
System,FILEREDIRECT,ON 
```