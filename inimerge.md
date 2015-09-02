# IniMerge #

Update all values from a INI file based on the contents from another INI file.

## Syntax ##
```
IniMerge,<UpdatedINIfile>,<INIfileToUpdate> 
```

All Sections are compared inside both files and newer keys or items with different values are added to INIfileToUpdate

## Example: ##
In this example the command will read all keys found inside myNewValues.ini and if they aren't present, ThisIsMyBaseFile.ini will be added, overwriting older values if necessary.
```
IniMerge,C:\myNewValues.ini,mySection,ThisIsMyBaseFile.ini 
```