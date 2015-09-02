# AddToPEShell ( Vista / Win7 Projects only ) #

## Syntax ##
```
AddToPeShell,Title,[Path\]FileName,[Default=True/False]
```

## Parameters ##
|1|Title|Title of shell program in PEShell shell program list. This defaults to `%ProgramTitle%`.|
|:|:----|:---------------------------------------------------------------------------------------|
|2|`[`Path\`]`FileName|File name and optional path of program to be run. This defaults to `%ProgramFolder%\%ProgramExe%`. If just the file name is supplied, the path will be set to `%ProgramFolder%\FileName`.|
|3|Default|Optional - Indicates if the title should be used as the default shell - PEShell will automatically select the default shell after the timeout period.|

## Remarks ##
This command is used to write information about a shell program to the configuration file (which is later processed, possibly at run time) so that the PE initialization process will run the right commands and start the right PE Shell ( e.g. explorer etc ).

This information is written to the `[`shells`]` section of the configuration file in a format similar to a shortcut - i.e. the title and path\filename separated by the "|" character.

If the optional parameter "Default" is passed in as "True", then the information about the program is also written as an "ini" style item in the `[`main`]` section of the config file, where the value of the title is set as the "defaultshell".

Currently this is only supported in Vista / Win7 projects.

## Example ##
This adds explorer.exe as the default shell to PEShell.
```
AddToPEShell,Explorer,explorer.exe,True
```