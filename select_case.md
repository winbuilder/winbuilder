# Select\_Case #

Run a statement depending on the value of an expression.

## Syntax ##
```
Select_Case,Var,ListVar1,[ListVar2],[Separator]
```

## Parameters ##
|1|Var|Variable to test|
|:|:--|:---------------|
|2|ListVar1|List of possible value that Var set in parameter 1 should be equal , separated by a "|" |
|3|ListVar2|Second list of value separated by a "|" (should have same number of variables than ListVar1 set in parameter 2)|
|4|Separator|Set this parameter to 1 if you want use a comma "," as separator rather the default separator "|"|

## Return Value ##

Always return the variable %Case% as result
  * If parameter 3 is empty %Case% return the position of Var in ListVar1 set in parameter 2 (0 if not found)
  * If parameter 3 is not empty %Case% return one variable of ListVar2, corresponding of the position of Var in ListVar1 set in parameter 2 (" " empty if not found)

## Example ##

#### One ####
```
[Process]
ReadEnv,SourceType
Select_Case,%Source_Type%,"XP|W2003|VistaCD|Win7CD","1|1|2|2"
If,%Case%,Equal,,Message,"This script is no compatible with W2000 source or WAIK source",Information
Else,Run,Section_%Case%

[Section_1]
//Code for LiveXP / NativeEx with XP/W2003 source
Echo,"%Source_Type%"

[Section_2]
//Code for Vista / Win7 with DVD source
Echo,"%Source_Type%"
```

#### Two ####
```
[Process]
ReadEnv,SourceType
Select_Case,%Source_Type%,"XP|W2003|VistaCD|Win7CD"
Run,Section_%Case%
�
[Section_0]
//Code for LiveXP / NativeEx with W2000 source and Vista / Win7 with WAIK source
Echo,"%Source_Type%"
Message,"This script is no compatible with W2000 source or WAIK source",Information
Exit,"Invalid Source"

[Section_1]
//Code for LiveXP / NativeEx with XP source
Echo,"%Source_Type%"

[Section_2]
//Code for LiveXP / NativeEx with W2003 source
Echo,"%Source_Type%"

[Section_3]
//Code for Vista with DVD source
Echo,"%Source_Type%"

[Section_4]
//Code for Win7 with DVD source
Echo,"%Source_Type%"
```

#### Three ####
```
Select_Case,%Os_Type%,"x86|amd64|ia64","http://www.nirsoft.net/utils/heapmemview.zip|http://www.nirsoft.net/utils/heapmemview-x64.zip|"
If,Not,%Case%,Equal,,Unpack,%Case%,-URL
```