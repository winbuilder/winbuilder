# System,HasUAC #
This command will set the variable to true if Vista / Win 7 UAC ( User Account Control ) is enabled.
## Syntax ##
```
System,HasUAC,<%var%>
```

## Remarks ##
This is necessary, since UAC can cause problems while building some projects.

## Example: ##
```
System,HasUAC,%var%
If,%var%,Equal,True,begin
    Message,"Error: UAC is enabled. This may cause problems when building.",INFORMATION,15
    Halt,"Error: UAC is anabled. This may cause problems when building. "
End
```