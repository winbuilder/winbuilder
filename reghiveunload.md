# RegHiveUnload #

Unload an external registry hive from your local registry system that was previously loaded with the [RegHiveLoad](reghiveload.md) command or with another application capable of handling external hives.

## Syntax ##
```
RegHiveUnload,<SectionName> 
```

## Remarks ##
This command is based on Windows 32bit API and works under any Windows platform - under Vista/Windows 7 it is necessary to disable the UAC (User Account Control) or run as Administrator.

## Example: ##
```
RegHiveUnload,Build 
```