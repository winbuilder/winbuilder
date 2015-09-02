# ScriptInterface,Read #

Read the value of an interface element from a different script than the currently executing one.

# WARNING! May not be correctly documented #

## Syntax ##
```
ScriptInterface,Read,%VarResult%,Filename,ComponentName,[Position][,Interface]
```

## Parameters ##
|1|%VarResult%|Variable used to receive the value of the interface element|
|:|:----------|:----------------------------------------------------------|
|2|FileName   |Relative path to script file containing interface which is being accessed|
|3|ComponentName|Name of interface element being accessed                   |
|4|Position   |Optional value specifying the position in the element from which the data will be accessed. It you do not specify this option the "value" of the element will be read.|
|5|Interface  |Optional value specifying the interface section inside the script. This option allows you to read elements from scripts having multiple interfaces.|

## Example ##
Read the value of the pTextBox1 textbox from the Hijackthis script to a variable named %Result%
```
ScriptInterface,Read,%Result%,%ProjectDir%\Apps\HijackThis!.script,pTextBox1
```

Read the value of the pTest\_TextBox1 textbox from the Hijackthis script to a variable named %Result%. In this case the textbox is on an interface called Interface-2 and we want to read if the textbox is visible. We check by reading position 2.
```
ScriptInterface,Read,%Result%,%ProjectDir%\Apps\HijackThis!.script,pTest_TextBox1,2,Interface-2
```