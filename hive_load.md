# Hive\_Load #

This command will load an external registry hive into your local registry system.

## Syntax ##
```
Hive_Load,Hive
```

## Parameters ##
|Hive|**Name of the registry hive to load** |
|:---|:-------------------------------------|
|    |**Default** - This is the current user hive ( HKCU ). Can also use **HKCU** or **User**.|
|    |**Software** - This is the software hive ( HKLM\Software ). Can also use **HKU** or **Machine**.|
|    |**System** - This is the system hive ( HKLM\System ). Can also use **HKLM**.|

## Tips ##
  * The user should always place a [Hive\_Unload](hive_unload.md) call after all the other registry calls for this hive.
  * The user should never reference `CurrentControlSet`. Always use `ControlSet001`.

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