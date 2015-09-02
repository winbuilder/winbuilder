# RegReadBin #

Read a value from the key you specify.

## Syntax ##
```
RegRead,<HKEY>,<Section>,<Key>,<%Variable%> 
```
**This command will only retrieve values from the following keytypes:**
  * 0x1 - String - i.e. a text value
  * 0x2 - Expanded String - will expand any system variable value contained inside %%. (e.g. %temp%)
  * 0x7 - Multiple NULL separated strings

**HKEY** is the "Hive Key" where the key is to be placed. These hives are files that are loaded by your machine when booting and compose the registry structure. By default, most scripts use HKLM as the work hive.  Valid HKEY values are:
  * HKLM
  * HKCU
  * HKCR
  * HKEY\_USERS
  * HKEY\_CURRENT\_CONFIG

**Section** is the complete path to the section where the key is to be read from

**Key** is the name of the 'child key' in that section to be read.

### Example: ###
```
RegReadBin,HKLM,WB-Software\SOFTWARE\Classes\.bfc\ShellNew,Command,%Value%
```
In this example the variable %Value% will store the value of the mentioned key