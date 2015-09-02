# System,ErrorOff #

This command allows a script processing error to not be marked as an error and therefore !Winbuilder will continue to process the scripts. By default this functionality is **only** valid for the next script line. That can be changed by defining the optional number of lines.
## Syntax ##
```
System,ERROROFF[,lines] 
```
## Example: ##
```
System,ERROROFF
RegRead,HKLM,"CurrentControlSet\Services\Eventlog\Application\VMware Virtual Mount Service Extended",EventMessageFile,%VMtmp%
If,NOT,EXISTVAR,%VMtmp%,Begin
System,ERROROFF,2
RegRead,HKCR,Wow6432Node\Applications\vmware-mount.exe\shell\Mount\command,,%VMtmp%
If,NOT,EXISTVAR,%VMtmp%,RegRead,HKCR,Applications\vmware-mount.exe\shell\Mount\command,,%VMtmp% 
```