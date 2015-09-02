# This command has been superseded by [Associate\_File](associate_file.md) #

# Add\_Asso #

This function is called to associate a file extension with an application.

## Syntax ##
```
Add_Asso,Extension,[Type],[Title],[Filename],[Option],[UseRegAddBoot]
```

## Parameters ##

|1| Extension |File extension to be associated |
|:|:----------|:-------------------------------|
|2| Type      |Set the type of the association. If not specified defaults to Open.|
| |           |Open - Launch the associated application|
| |           |Edit - Launch the associated editor and opens the document for editing|
| |           |Icon - Associate an icon with the extension|
|3|Title      |Title to be associated with the extension|
|4|Filename   |File to be associated. May be defaulted or may be a file name or full path. If it's not specified then it defaults to: `%PE_Programs%\%programFolder%\%programExe%` If only the file name is specified then the path is assumed to be: `%PE_Programs%\%programFolder%`|
|5|Option     |This is optionally used to specify the DefaultIcon index. If the icon is contained with the program exe then this can be used with Open or Edit. Otherwise the Icon type can be used to specify an external DefaultIcon.|
|6|UseRegAddBoot|Defaults to False. If set to True then RegAddBoot is used to create the association.|

## Tips ##
This function assumes the appropriate registry hive is loaded before the function is called. This is more efficient than [Associate\_File](associate_file.md) if many associations are being created.

## Example ##
This sets XnView.exe as the program to open files with extension Xnview.bmp using icon with index 2 from XnView.exe for the association. Title for the association is set to BMP Image.
```
[Process]
Hive_Load,HKU
Add_Asso,Ext,Open,BMP Image,%PE_Programs%\XnView\XnView.exe,,2
Hive_Unload,HKU
```

If your scripts defines the variables %ProgramFolder% and %ProgramEXE% then the above example can be replaced with:
```
[Variables]
%ProgramEXE%=XnView.exe
%ProgramFolder%=XnView

[Process]
Hive_Load,HKU
Add_Asso,XnView.bmp,,BMP Image,,2
Add_Asso,XnView.emf,,EMF Image,,11
Add_Asso,XnView.gif,,GIF Image,,3
Hive_Unload,HKU
```

which would generate this:
```
[Process]
Hive_Load,HKU
reg_add,0x1,"%reg%\Classes\XnView.bmp","","BMP Image"
reg_add,0x2,"%reg%\Classes\XnView.bmp\DefaultIcon","","%PE_Programs%\%ProgramFolder%\XnView.exe#$c2"
reg_add,0x2,"%reg%\Classes\XnView.bmp\shell\open\command","","#$q%PE_Programs%\%ProgramFolder%\XnView.exe#$q#$s#$q#$p1#$q"
reg_add,0x1,"%reg%\Classes\XnView.emf","","EMF Image"
reg_add,0x2,"%reg%\Classes\XnView.emf\DefaultIcon","","%PE_Programs%\%ProgramFolder%\XnView.exe#$c11"
reg_add,0x2,"%reg%\Classes\XnView.emf\shell\open\command","","#$q%PE_Programs%\%ProgramFolder%\XnView.exe#$q#$s#$q#$p1#$q"
reg_add,0x1,"%reg%\Classes\XnView.gif","","GIF Image"
reg_add,0x2,"%reg%\Classes\XnView.gif\DefaultIcon","","%PE_Programs%\%ProgramFolder%\XnView.exe#$c3"
reg_add,0x2,"%reg%\Classes\XnView.gif\shell\open\command","","#$q%PE_Programs%\%ProgramFolder%\XnView.exe#$q#$s#$q#$p1#$q"
Hive_Unload,HKU
```