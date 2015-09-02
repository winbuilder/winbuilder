# ScriptInterface,Write #

Change an element in the script interface.

# WARNING MAY NOT BE CORRECTLY DOCUMENTED #

## Syntax ##
```
ScriptInterface,Write,NewValue,Filename,ComponentName[,Position][,Interface]
```
## Parameters ##
|1|NewValue|New value for the component|
|:|:-------|:--------------------------|
|2|FileName|Relative path to script file containing interface which is being accessed|
|3|ComponentName|Name of interface element being accessed|
|4|Position|Optional value specifying the position in the element to which the data will be written. If you do not specify this option the "value" will be written.|
|5|Interface|Optional value specifying the interface section inside the script. This option allows you to read elements from scripts having multiple interfaces.|

## Example ##
Write the value "Interface Write Test" to the pTextBox1 textbox interface element in the Hijackthis script.
```
ScriptInterface,Write,"Interface Write Test",%ProjectDir%\Apps\HijackThis!.script,pTest_TextBox1
```

Write the value "Interface Write Test" to the `pTest_TextBox1` textbox interface element in the Hijackthis script. In this case the textbox is on an interface called Interface-2 and we want to change the caption of the textbox located at position 1.
```
ScriptInterface,Write,"Interface Write Test",%ProjectDir%\Apps\HijackThis!.script,pTest_TextBox1,1,Interface-2
```