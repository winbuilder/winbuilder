# IniWrite #
## Syntax ##
```
IniWrite,<Filename>,<Section>,<Key>,<Value> 
```
This command will write the key and value on the section inside the file you specify.

## Example: ##
In this example the specified myKey and respective myValue will be written in the section mySection in C:\myFile.ini
```
IniWrite,C:\myFile.ini,mySection,myKey,myValue 
```