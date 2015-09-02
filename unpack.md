# Unpack #

Extract files from inside your script, an archive, or from a URL to a program folder in your project.

## Syntax 1 ##
```
Unpack,[Section],[Archive],[Option],[Target],[ProgramFolder],[Filename]
```

## Parameters ##
|1|Section|This is the section in %ScriptFile% which contain the encoded files to extract. (default value = Folder)|
|:|:------|:-------------------------------------------------------------------------------------------------------|
|2|Archive|Use this if you want extract an archive (only archive supported by 7z.exe, even an achive in exe format)|
|3|Option |If Parameter 2 is                                                                                       |
| |       | **archive (zip,7z,rar)** - Set it to False if you don't want to delete the archive (default value = True)|
| |       | **SFX archive (exe)** - Set it to -y for silent extraction                                             |
| |       | **empty** - If you want extract only one file from section rather all files set its name here          |
|4|Target |First part to select where to extract files, generaly one of this four values :                         |
| |       | **%TargetDir%** - Root                                                                                 |
| |       | **%Target\_Prog%** - \Program Files  (default value = %Target\_Prog%)                                  |
| |       | **%Target\_Win%** - \I386 or \Windows                                                                  |
| |       | **%Target\_Sys%** - \I386\System32 or \Windows\System32                                                |
|5|ProgramFolder|Second part to select where to extract files (subfolder) (default value = %ProgramFolder%)              |
|6|Filename|This is use for test if exist %ScriptDir%\ProgramFolder\`[`Filename`]`, if true exit Unpack and copy files from there by CopyProgram command. (default value = %ProgramEXE%)|


## Syntax 2 ##
```
Unpack,[Filename],Action,[Param3],[Param4],[Param5]
```

## Parameters ##
|1|Filename|Depending on Action : FullFilename of Script, Archive or Web Link (default value = %SrciptFile%)|
|:|:-------|:-----------------------------------------------------------------------------------------------|
|2|Action  |If parameter 2 not match with one of following word syntax 1 is used                            |
| |        | **All** - Extract All Files from Script set in parameter 1                                     |
| |        | **-All** - Extract All Files but only If they Not Exist from Script set in parameter 1         |
| |        | **One** - Extract only One File ( the file set in parameter 4) from Script set in parameter 1  |
| |        | **Archive** - Extract an Archive (set in parameter 4) and delete Archive                       |
| |        | **-Archive** - Extract an Archive (set in parameter 4) but don't delete Archive                |
| |        | **SFX** - Extract a SFX Archive (set in parameter 4), execute and delete the SFX Archive       |
| |        | **UnZip** - Unzip an Archive file (from filename set in parameter 1) with 7x.exe               |
| |        | **URL** - Download and Unzip Archive file (from link set in parameter 1) and delete Archive file |
| |        | **-URL** - Download and Unzip Archive file (from link set in parameter 1) but don't delete Archive file |
|3|Param3  |If Action equal :                                                                               |
| |        | **All** or **-All** or **One** or **Archive** or **-Archive** or **SFX** then use this parameter to set the section inside the Filename set in parameter 1 which contain the encoded files to extract. (default value = Folder)|
| |        | **UnZip** - Use this parameter to set the target where you want to UnZip Files from inside the Archive set in parameter 1 (default value = %Target\_Prog%\%ProgramFolder%)|
| |        | **URL** - Use this parameter to set the target where you want Download and UnZip files from the Archive set in parameter 1 (default value = %Target\_Prog%\%ProgramFolder%)|
| |        | **-URL** - Set here the target where you want UnZip Files (from Downloaded Archive saved in parameter 4) set in parameter 1 (default value = %Target\_Prog%\%ProgramFolder%)|
|4|Param4  |If Action equal :                                                                               |
| |        | **All** or **-All** - Set here the target where you want Extract Files from Script set in parameter 1 (default value = %Target\_Prog%\%ProgramFolder%)|
| |        | **One** - Set here the filename you want extract from section set in parameter 3 from Script file set in parameter 1 (no default value , must be set)|
| |        | **Archive** or **-Archive** - Set here the Archive filename you want extract from section set in parameter 3 from Script file set in parameter 1 (no default value , must be set)|
| |        | **SFX** - Set here the SFX Archive filename you want extract from section set in parameter 3 from Script file set in parameter 1 (no default value , must be set)|
| |        | **UnZip** or **URL** - Nothing for this Action                                                 |
| |        | **-URL** - Set here the target where you want store the downloaded archive (default value = %ProjectTemp%)|
|5|Param5  |If Action equal :                                                                               |
| |        | **One** or **Archive** or **SFX** or -Archive**- Set here the target where you want Extract Files (default value = %Target\_Prog%\%ProgramFolder%)**|


## Remarks ##
The Unpack command will use the folder called "Folder" as default place to keep all files that you attached using the "Create script" tool
  * All parameters are optional, so when you wrote :
```
Unpack
```
default value for empty parameters are used if they are needed, so this command would become :
```
Unpack,Folder,,%Target_Prog%,%ProgramFolder%,%ProgramEXE%
```
since the variable %Target\_Prog% (defined in Script.project) is the "Program Files" folder, and the variables %ProgramFolder% and %!ProgramEXE% should be defined in section Variables of your script.

Only when an archive(7z,zip,rar - not for SFX archive) is set in parameter 2, the first thing that Unpack do, is look in %ScriptDir%\%ProgramFolder% if the file given in parameter 6 (default value = %ProgramExe%) exist.
If the file exist, all files in this folder are copied by CopyProgram rather extracted from %ScriptDir%.

## Tips ##
If you want Unpack files in %Target\_Sys% you can use a point (.) as parameter 5
```
Unpack,,,,%Target_Sys%,.
```
is same as
```
Unpack,,,,%Target_Win%,System32
```

## Example (Syntax 1) ##
Unpack all files from section Folder to Program Files\%ProgramFolder%
```
Unpack
```

Unpack Archive.7z from section Doc to Program Files\%ProgramFolder%\Help (unzip the archive and delete it after)
```
Unpack,Doc,Archive.7z,,,%ProgramFolder%\Help
```

Unpack Archive.7z from section Doc to Program Files\%ProgramFolder%\Help (but don't unzip the archive)
```
Unpack,Doc,,Archive.7z,,%ProgramFolder%\Help
```

Unpack an Archive SFX (`prog.exe`) from section Folder to Program Files\%ProgramFolder% ( after `prog.exe` is extracted, it is run with the parameter `-y` and then deleted)
```
Unpack,,prog.exe,-y
```

Unpack one file(myfont.ttf) from section Fonts to I386\Fonts or Windows\Fonts
```
Unpack,Fonts,,myfont.ttf,%Target_Win%,Fonts
```

==Example== (Syntax 2)
Unpack all files from %ScriptFile% from section Folder to Program Files\%ProgramFolder%
```
Unpack,,All
```

Unpack Archive.7z from %ScriptDir%\other.script from section Doc to Program Files\%ProgramFolder%\Help (unzip the archive and delete it after)
```
Unpack,%ScriptDir%\other.script,Archive,Doc,Archive.7z,%Target_Prog%\%ProgramFolder%\Help
```

Unpack Archive.7z from %ScriptFile% from section Doc to Program Files\%ProgramFolder%\Help (but don't unzip the archive)
```
Unpack,,-Archive,Doc,Archive.7z,%Target_Prog%\%ProgramFolder%\Help
```

Unpack an Archive SFX (`prog.exe`) from %ScriptFile% from section Folder to Program Files\%ProgramFolder% ( after `prog.exe` is extracted, it is run with the parameter `-y` and then deleted)
```
Unpack,,SFX,,prog.exe
```

Unpack one file(myfont.ttf) from %ScriptFile% from section Fonts to I386\Fonts or Windows\Fonts
```
Unpack,,One,Fonts,myfont.ttf,%Target_Win%\Fonts
```

UnZip an Archive from %ScriptDir%\Test.7z to Program Files\%ProgramFolder%
```
Unpack,%ScriptDir%\Test.7z,UnZip
```

Download an archive from `http://www.mysite.com/test.7z` to Program Files\%ProgramFolder% and delete test.7z after UnZip it
```
Unpack,http://www.mysite.com/test.7z,URL
```

Download an archive from `http://www.mysite.com/test.7z` to %GlobalTemplates%\Apps\%ProgramFolder%
but only if not exist test.7z in %GlobalTemplates%\Apps\%ProgramFolder%
and UnZip test.7z from %GlobalTemplates%\Apps\%ProgramFolder% to I386\System32 or Windows\System32 (test.7z is not deleted)
```
Unpack,http://www.mysite.com/test.7z,-URL,%Target_Sys%,%GlobalTemplates%\Apps\%ProgramFolder%
```