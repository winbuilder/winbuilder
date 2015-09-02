# RegWriteBin / RegWriteBinEx #

Write Wide Strings (e.g. Unicode) into the registry. The wide string is defined by a series of hexadecimal values, separated by comma.

## Syntax ##
```
RegWriteBin,<HKEY>,<KeyType>,<Section>,<Keyname>,<Value> 
```

## Parameters ##
|1|HKEY|The "Hive Key" where the key is to be placed.|
|:|:---|:--------------------------------------------|
|2|KeyType|Specify how the data should be interpreted   |
| |    |0x1 - String - writes a text value           |
| |    |0x2 - Expanded String - will expand any variable value contained inside %%. (e.g. %temp%)|
| |    |0x7 - Writes multiple NULL separated strings |
|3|Section|The complete path to the section where the key is supposed to be written|
|4|Key Name|The name of the name of one of the 'child keys' of a section. Value can be explicitly written list of hexadecimal values, separated by comma or a variable containing the list. Instead of the comma the variable must contain the escape #$c|
|5|Value|Data to write                                |

RegWriteBinEx has the same syntax, but writes every value of every type unchecked into the registry.
It is in the responsibility of the script's author to make sure that only valid registry entries are created.

## Remarks ##
The substrings of a 0x7 entry can be divided by ",00,00" bytes (without the quotes) or by the [special character escape string #$z.](wbscriptsyntax.md)

### Examples: ###
RegWriteBin using a comma seperated list of hex values
```
RegWriteBin,HKLM,0x2,WB-Software\SOFTWARE\Classes\.bfc\ShellNew,Command,25,00,53,00,79,00,73,00,74,00,65,00,6d,00,52,00,6f,00,6f,00,00,00 
```

RegWriteBin using a vairable containing a list of hex values
```
Set,%Value%,25#$c00#$c53#$c00#$c79#$c00#$c73#$c00#$c74#$c00#$c65#$c00#$c6d#$c00#$c52#$c00#$c6f#$c00#$c6f#$c00#$c00#$c00
RegWriteBin,HKLM,0x2,WB-Software\SOFTWARE\Classes\.bfc\ShellNew,Command,%Value%
```