# ScriptInterface,State #

Show or hide a component in the interface of either the current script or a specified script.

# WARNING!  May not be correctly documented #

## Syntax ##
```
ScriptInterface,State,ComponentName[,State][,Filename][,RefreshInterface][,Interface]
```
## Parameters ##
|1|ComponentName|Name of interface component to show/hide|
|:|:------------|:---------------------------------------|
|2|State        |Optional parameter indicating if the interface component should be hidden ( 0) or shown ( 1 ). If the parameter is not specified then 1 ( show ) is assumed.|
|3|FileName     |File name of the script containing the interface element to hide or show.|
|4|RefreshInterface|Optional parameter indicating if the interface should be refreshed. If True then the interface is refreshed. If False or not specified then the interface is not refreshed.|
|5|Interface    |Optional value specifying the interface section inside the script. This option allows you to read elements from scripts having multiple interfaces.|

## Example ##
Show pTextFile1 in the current script.
```
ScriptInterface,State,pTextFile1,1,,True
```