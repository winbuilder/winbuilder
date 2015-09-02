# Exist... #

You can use these tests to determine if a file, directory, script section, or variable does or does not exist. If this test is true, then a Command is executed.
Based on the specific test selected, one or more additional arguments may be needed. Avaialable tests include:
| ExistFile | Not,ExistFile | Check to see if a file does/doesn't exist **<sup>1</sup>**|
|:----------|:--------------|:----------------------------------------------------------|
| ExistDir  | Not,ExistDir  | Check to see if a directory does/doesn't exist **<sup>1</sup>**|
| ExistSection | Not,ExistSection | Check to see if a given section does/doesn't exist inside the specified file|
| ExistRegSection | Not,ExistRegSection | Check to see if a given section does/doesn't exist in the specified registry|
| ExistRegKey| Not,ExistRegKey | Check to see if a specific key does/doesn't exist inside the specified registry|
| ExistVar  | Not,ExistVar  | Check to see if a specific variable does/doesn't exist - i.e. has it been defined|

  1. Wildcards may **_only_** be used in the File and Directory existence checks. _BUT_, they may not give expected results. For example, checking to see if `*.*` exists **_will ALWAYS return TRUE_** because of the "dot" and "dot-dot" entries returned by the internal API used.

## Syntax ##
```
If,EXISTFILE,TestFile,Command
If,EXISTDIR,Directory,Command
If,Not,EXISTSECTION,TestFile,Section,Command
If,EXISTVAR,%Var%,Command
```

## Example: ##
In the example below we are testing if `c:\myFile.txt` does not exist. If this condition is true, then `FileCreateBlank,c:\myFile.txt` will be executed
```
If,Not,ExistFile,c:\myFile.txt,FileCreateBlank,c:\myFile.txt
```
The following command will read the value of `HKLM\SOFTWARE\Classes\xyz,Language`, if `RegSection HKLM\SOFTWARE\Classes\xyz`  does exist.
```
If,ExistRegSection,HKLM,SOFTWARE\Classes\xyz,RegRead,HKLM,SOFTWARE\Classes\xyz,Language,%var%
```
This command will read the value of `HKLM\SOFTWARE\Classes\xyz,Language`, but only if the registry key `HKLM\SOFTWARE\Classes\xyz,Language`  exists.
```
If,ExistRegKey,HKLM,SOFTWARE\Classes\xyz,Language,RegRead,HKLM,SOFTWARE\Classes\xyz,Language,%var%
```
In this final example we will check if the program path `C:\Program Files\IrfanView` exists. If it does, then the value of %Var% will be set to 1. Then we will check to see if %Var% exists. If it is true (i.e. was created above or even earlier in the script or project) a message windows with the text "1 does exist" appears.
```
Set,%var%,NIL
If,ExistDir,C:\Program Files\IrfanView,Set,%Var%,1
If,ExistVar,%var%,Message,"'%var%' does exist",Information 
```