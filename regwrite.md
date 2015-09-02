# RegWrite #

## Syntax ##
```
RegWrite,<HKEY>,<KeyType>,<Section>,<Keyname>,<Value> 
```
This command will create a new registry entry as specified.

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
    * 0x7 - Writes multiple NULL separated strings
      * **Note:  See below for other types**

  * Section is the complete path to the section where the key is supposed to be written

  * Keyname and value are similar to the method for INI files, please ensure that the value you use is compatible with the key type.

## Tips ##
To create an empty section: Write a key using keytype as 0x0 and omit the entries for key and value - this will create a new section at the location you specify.


## Example: ##
```
RegWrite,HKLM,0x4,Build\ControlSet001\Services\VgaSave\Device0,DefaultSettings.XResolution,1024 
```

## WB078 added: ##
  * RegWrite gives a warning in the log, if the destination value already exists.
  * If there is a parameter PRESERVE added, RegWrite does not overwrite an existing value. A warning is still given
  * The warning can be suppressed by an additional parameterNOWARN
  * The parameters PRESERVE, and NOWARN can be used simultaniously. The order does not matter.

## Note: ##
This function can also take a decimal value for the registry type.  This can be used to write newer types by translating the normal "hex" value to a decimal number.  See [this posting](http://reboot.pro/16333/). As an example, there are double dword (aka "qword") registry values, designated type 0xb, as seen in the following exported value.
```
[HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\HotStart]
"LastTimeStamp"=hex(b ) :00,00,00,00,00,00,00,00
```
Values like this can can be written to the registry using a decimal value of "11" instead of the equivalent hex value of "0xb", as shown in the following example.
```
RegHiveLoad,WB-Software,"%target_sys%\config\software"
//transalate 0xb to integer 11
RegWriteBinEx,HKLM,11,WB-Software,MyKey,53,00,55,00,01,08,a1,cc
RegHiveUnLoad,WB-Software
```