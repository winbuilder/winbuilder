# IniRead #

Read the value of a key from a section inside a file that you specify.

## Syntax ##
```
IniRead,<Filename>,<Section>,<Key>,<%variable%> 
```

## Example: ##
In this example the value of the specified key will be stored inside %myVariable%
```
IniRead,C:\myFile.ini,mySection,myKey,%myVariable% 
```