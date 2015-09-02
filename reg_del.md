# Reg\_Del #

Delete a registry key or value from the registry hive loaded by Hive\_Load.

## Syntax ##
```
Reg_Del,KeyName,[ValueName]
```

## Parameters ##
|1|KeyName|Key name to delete. Must be prefixed with %reg%\.|
|:|:------|:------------------------------------------------|
|2|ValueName|Optional value name to delete. If not specified then the key and its contents will be deleted.|

## Example ##
```
Reg_Del,%reg%\ControlSet001\Services\VgaSave\Device0,DefaultSettings.XResolution
Reg_Del,%reg%\ControlSet001\Services\VgaSave\Device0
```