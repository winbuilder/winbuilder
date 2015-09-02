# RegRead #

Reads a value from the registry.

## Syntax ##
```
RegRead,<HKEY>,<Section>,<Key>,<%Variable%> 
```

  * HKEY is the "Hive Key" where the key is to be placed. These hives are files that are loaded by your machine when booting and compose the registry structure. By default, most scripts use HKLM as the work hive.

> Valid HKEY values
    * HKLM
    * HKCU
    * HKCR
    * HKEY\_USERS
    * HKEY\_CURRENT\_CONFIG

> Details on the functions of each hive can be found at the Microsoft Site.

  * Keytype will specify how the data in the registry key should be interpreted.

> Valid key type values
    * 0x0 - Empty key
    * 0x1 - String - writes a text value
    * 0x2 - Expanded String - will expand any variable value contained inside %%. (e.g. %temp%)
    * 0x3 - Binary data - adds data in binary format. Each byte is specified by groups of two digits splitting each value with commas
    * 0x4 - Dword - writes a numeric value
    * 0x7 - Multiple NULL separated strings

  * Section is the complete path to the section where the key is supposed to be read.

  * Keyname and value are similar to the method for INI files, please ensure that the value you use is compatible with the key type.

## Example: ##
```
RegRead,HKLM,Build\ControlSet001\Services\VgaSave\Device0,DefaultSettings.XResolution,%myXresolution% 
```
In this example the variable %myXresolution% will store the value of the mentioned key