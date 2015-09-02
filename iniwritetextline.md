# IniWriteTextLine #
This command will add a text line to given section inside the file you select.

## Syntax ##
```
IniWriteTextLine,<Filename>,<Section>,<StringLine>[,APPEND] 
```

By default new lines are placed on the top of the section.
To place new lines at the end of the section use the APPEND parameter.

## Example: ##
In this example a new line is added on the top of the section and all remaining lines are moved below.
```
IniWriteTextLine,C:\myFile.ini,mySection,ThisIsMyLine 
```

Optional APPEND argument so that the new line is added on the end of the section
```
IniWriteTextLine,C:\myFile.ini,mySection,ThisIsMyLine,APPEND 
```