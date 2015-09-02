# Basic Script Template #
```
[main]
// Script title to be displayed in winbuilder
Title=My Program
// Short description of the program/script. This will be visible in the download center
Description=An easy example script
// The script will be selected to run
Selected=True
// Run level 5 is used for Application Scripts.
Level=5
// Script Version
Version=1
// Author of the script - That's you!
Author=Homes32
// Make sure to give credit to anyone who helped you here! :)
Credits=Thanks to all who tested and gave feedback! YOU make this script a success!
// Date you released this version of the script.
Date=02-17-12
// Contact link - Ususally set to the forum topic you will use to support the script.
Contact=http://reboot.pro/

// Pre defined variables go here
[Variables]
// Program title - Will be used for shortcut names
%ProgramTitle%=My Cool Program
// Main Program Exe. - Will be used for shortcuts
%ProgramEXE%=MyProgram.exe
// Folder where the program will live in PE
%ProgramFolder%="My Program"

[Process]
// Run from RAM will place the program files in WIM/RAMDRIVE where it will be writeable instead of on CD
If,%ScrollBox_RunFromWhere%,Equal,"Run From RAM",RunFromRAM,True
If,%ScrollBox_RunFromWhere%,Equal,"Run From CD",RunFromCD,True



Echo,"Processing %ProgramTitle%..."
// Create our Directories
If,ExistDir,"%Target_prog%\%ProgramFolder%",DirDelete,"%Target_prog%\%ProgramFolder%"
DirMake,"%Target_prog%\%ProgramFolder%"
// unpack our files from our archive we encoded into the script.
Unpack,Files,MyProgramArchive.7z,True

// Optionally we can add any files
// needed from windows such as the c runtime
// Generally you can skip this step unless your
// project does not provide the needed files.
Require_File,crtdll.dll

// Process Registry values
// I you have a large number of registry
// entries it makes it easier to run them
// from a seperate section as we are doing here
Run,%ScriptFile%,Registry

// Add_Shortcuts
If,%CB_Desktop%,Equal,True,Add_Shortcut,Desktop
If,%CB_StartMenu%,Equal,True,Add_Shortcut,StartMenu,%IN_SMFolder%,
If,%CB_QuickLaunch%,Equal,True,Add_Shortcut,QuickLaunch

// Autorun the program with the /install parameter when PE starts
AddAutoRun,"My Program","%PE_Programs%\%ProgramFolder%\%ProgramEXE%","/install"

[Registry]
// load the HKEY_USER hive and write our string value
RegHiveLoad,Tmp_Default,%RegDefault%
RegWrite,HKLM,0x1,"Tmp_Default\Software\My Program","MyKey","MyValue"
RegHiveUnLoad,Tmp_Default
RegHiveLoad,Tmp_Software,%RegSoftware%

[Interface]
CB_Desktop=Desktop,1,3,21,41,110,20,True
CB_StartMenu="Start Menu",1,3,21,81,115,20,True
CB_QuickLaunch=Quicklaunch,1,3,21,61,110,20,True
IN_SMFolder="Start menu folder:",1,0,36,121,100,20,AntiSpyware
pBevel1=pBevel1,1,12,6,11,140,145
pTextLabel1=Shortcuts,1,1,16,19,75,20,8,Bold
ScrollBox_RunFromWhere="Run from RAM",1,4,153,11,127,21,"Run Default","Run from RAM","Run from CD"

```