# RegHiveLoad #

Load an external registry hive onto your local registry system.

## Syntax ##
```
RegHiveLoad,<SectionName>,<HiveFilename> 
```

## Remarks ##
This command is based on Windows 32bit API and works under any Windows platform - under Vista/Windows7 it is necessary to disable the UAC (User Account Control) or Run as Administrator.

## Example: ##
In this example we will load the setupreg.hiv hive file from our work folder and place it under a registry section called Build
```
RegHiveLoad,Build,%targetdir%\I386\system32\setupreg.hiv 
```