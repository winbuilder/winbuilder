# Loop #

Repeatedly execute a particular section in a script with a counter value that increments each time through the loop between the specified start and end values. Any additional parameters are passed to the script section.

## Syntax ##
```
Loop,%ScriptFile%,<Section>,<start>,<end>,<optional parameters.
```

The loop can be prematurely exited by using the following command
```
Loop,BREAK 
```

## Example: ##
This code is searching in all oem#.inf files in path C:\Windows\inf (oem0.inf up to oem100.inf) for an entry `VBoxUSB.sys` in section `[SourceDisksFiles]`. If it is found the oem.inf file name is set as result and the loop ends.
  * NOTE: oem.inf files are always beginning with ZERO (oem0.inf)

```
Set,%Result%,?
Loop,%ScriptFile%,Try-OEM,0,100,SourceDisksFiles,VBoxUSB.sys
Echo,%Result%

[Try-OEM]
Set,%file%,C:\Windows\inf\oem#c.inf
If,ExistFile,%file%,IniRead,%file%,#1,#2,%Var%
If,-%var%,NotEqual,-,Set,%Result%,%file%
If,%Result%,NotEqual,?,Loop,BREAK
```


The Loop statement can increment characters as well as numbers, e.g. drive letters. In this example the Loop statement is looking for a specific file on all drive letters from a: to z:.  If the file is found it will be executed.

```
Set,%a_searchFile%,"Program Files\IrfanView\i_view32.exe"
Loop,%ScriptFile%,Try,a,z
If,EXISTFILE,%pstart%,ShellExecute,OPEN,%pstart%

[try]
Set,%pstart%,#c:\%a_searchFile%
If,EXISTFILE,%pstart%,Loop,BREAK
```