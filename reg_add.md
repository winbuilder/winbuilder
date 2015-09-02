# Reg\_Add #

Add a value to the registry hive loaded by Hive\_Load.

## Syntax ##
```
Reg_Add,ValueType,%reg%\KeyName,[ValueName],[Value],[PRESERVE],[NOWARN]
```
## Parameters ##
|1|ValueType|The type of the registry value|
|:|:--------|:-----------------------------|
| |         | **0x0** - Registry key with no value|
| |         | **0x1** - String Value       |
| |         | **0x2** - Expanded String - will expand any variable value contained inside %<var>%. (e.g. %temp%)<br>
<tr><td> </td><td>         </td><td> <b>0x3</b> - Binary value - Each byte is specified by groups of two hex digits separated with commas e.g. 12,0F,25.</td></tr>
<tr><td> </td><td>         </td><td> <b>0x4</b> - DWORD integer value specified by a decimal digit number i.e. 23567. </td></tr>
<tr><td> </td><td>         </td><td> <b>0x7</b> - Writes null separated strings terminated with an extra null i.e. "ab","cd","efgh".</td></tr>
<tr><td>2</td><td>KeyName  </td><td>Name of the registry key. Must be prefixed with %reg%\.</td></tr>
<tr><td>3</td><td>ValueName</td><td>Name of the registry value.   </td></tr>
<tr><td>4</td><td>Value    </td><td>Value. Format depends on the ValueType.</td></tr>
<tr><td>5</td><td>PRESERVE </td><td>If specified don't overwrite a value that already exists. A warning will be logged. Can be suppressed by specifying NOWARN.</td></tr>
<tr><td>6</td><td>NOWARN   </td><td>Suppress the warning in the log file. The optional PRESERVE / NOWARN parameters can be specified in any order. One or both can be specified.</td></tr></tbody></table>

<h2>Remarks ##
  * WB 77 RC2 or later: RegWrite gives a warning in the log, if the destination value already exists. The warning can be suppressed by specifying the NOWARN parameter.

## Tips ##
Creating an empty registry key: Write a key using keytype as 0x0 and omit the entries for ValueName and Value - this will create a new registry key at the location you specify.

## Example ##
```
reg_add,0x1,%reg%\ControlSet001\Services\dc_fsf,ImagePath,system32\drivers\dc_fsf.sys
reg_add,0x3,%reg%\ControlSet001\Services\Themes,FailureActions,\
80,51,01,00,00,00,00,00,00,00,00,00,03,00,00,00,41,00,4d,\
00,01,00,00,00,60,EA,00,00,01,00,00,00,60,EA,00,00,00,00,00,00,00,00,00,00
Reg_Add,0x4,%reg%\ControlSet001\Services\VgaSave\Device0,DefaultSettings.XResolution,1024
```