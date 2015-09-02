# RegDelete #

Deletes a key or value from the registry.

## Syntax ##
```
RegDelete,<HKEY>,<Key>[,Value] 
```

## Example 1: ##
Delete a registry value
```
RegDelete,HKLM,Build\ControlSet001\Services\VgaSave\Device0,DefaultSettings.XResolution 
```

## Example 2: ##
Delete a key from the registry.
```
RegDelete,HKLM,Build\ControlSet001\Services\VgaSave\Device0
```