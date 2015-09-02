# Hive\_Unload #

Unload an external registry hive that was previously loaded into your local registry system with [hive\_load](hive_load.md).

## Syntax ##
```
Hive_Unload,Hive
```
## Parameters ##
|Hive|Name of the registry hive to unload|
|:---|:----------------------------------|
|    |**Default** - This is the current user hive ( HKCU ). Can also use **HKCU** or **User**.|
|    |**Software** - This is the software hive ( HKLM\Software ). Can also use **HKU** or **Machine**.|
|    |**System** - This is the system hive ( HKLM\System ). Can also use **HKLM**.|

## Example ##
This installs the snapman filter driver.
```
Hive_Load,System
reg_add,0x7,"%reg%\ControlSet001\Control\Class\{4D36E967-E325-11CE-BFC1-08002BE10318}","UpperFilters","PartMgr","snapman"
reg_add,0x7,"%reg%\ControlSet001\Control\Class\{71A27CDD-812A-11D0-BEC7-08002BE2092F}","UpperFilters","snapman"
reg_add,0x4,"%reg%\ControlSet001\Services\snapman","ErrorControl","1"
reg_add,0x1,"%reg%\ControlSet001\Services\snapman","ImagePath","system32\DRIVERS\snapman.sys"
reg_add,0x4,"%reg%\ControlSet001\Services\snapman","Start","0"
reg_add,0x4,"%reg%\ControlSet001\Services\snapman","Type","1"
Hive_Unload,System
```