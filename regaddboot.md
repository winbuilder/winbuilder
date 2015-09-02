# RegAddBoot #

Write to the registry at boot time.

## Syntax ##
```
RegAddBoot,Hive,ValueType,KeyName,ValueName,Value
```

## Parameters ##
|1|Hive|Hive to be updated at boot time|
|:|:---|:------------------------------|
| |    |**HKLM** = The HKEY\_LOCAL\_MACHINE hive.|
| |    |**HKCU** = The HKEY\_CURRENT\_UER hive.|
|2|ValueType|The type of the registry value |
| |    |**0x0** = Registry key with no value|
| |    |**0x1** = String Value         |
| |    |**0x2** = Expanded String - will expand any variable value contained inside `%<var>%`. (e.g. `%temp%`)|
| |    |**0x3** = Binary value - Each byte is specified by groups of two hex digits separated with commas e.g. 12,0F,25.|
| |    |**0x4** = DWORD integer value specified by a decimal digit number i.e. 23567. |
| |    |**0x7** = Writes null separated strings terminated with an extra null i.e. "ab","cd","efgh".|
|3|KeyName|Name of the registry key.      |
|4|ValueName|Name of the registry value.    |
|5|Value|Value. Format depends on the ValueType.|

## Remarks ##
Some programs don't correctly support expanding of environment variables in registry values. For those cases the registry updates can  be delayed till PE boot time when the value of the variable is known. This allows the fully expanded value to be written to the registry instead of the %variable%.

## Example ##
```
RegAddboot,HKLM,0x1,"Software\Acronis\CommonComponents", "fcalloc.dll", "%PE_Programs%\TrueImageHome\fcalloc.dll"
RegAddBoot,HKLM,0x2,"System\ControlSet001\Services\AntiVirScheduler","ImagePath","%PE_Programs%\Avira\sched.exe"
```