# Link Files #

The WinBuilder scripting environment provides two mechanisms to add "links" which allow it to reference external script files as a part of more than one project.

## At the Project File Level - a.k.a. `folder.project` ##
The first allows a link to an external folder to be specified. This is done by creating a file named folder.project in a projects folder. This file should contain a links section which specifies the external folder name containing the scripts to be imported.

All scripts in the specified folder and any sub-folders will be added to the folder containing the folder.project file. If any linked scripts are disabled then the script will also be disabled in the source project.

An example folder.project is:
```
[Links]
Projects\Gena-Complete\*.* 
```

This links to another folder in the same projects directory (i.e. is is not an absolute path, but is relative the the WinBuilder %BaseDir%.  On the other hand, this example links to a completely specified path (which may be on another drive).
```
[Links]
D:\MyScripts\*.* 
```

## At the Script File Level - a.k.a. `<script>.link` ##
The second mechanism uses a file with an extension of `.link` to link to a particular script file. If the script is disabled in the link file then this only affects the project containing the link file. In other words, the link file and the original script are independently able to be selected.

In other words, the original source script is left unchanged. The other settings are always stored in the original script, so if the settings are changed, it affects both the original and the linked project.

An example link file is:
```
[Main]
link=Projects\Addons\AccessGainDrivers.script
Selected=True
```

This links to another script in the same projects directory (i.e. is is not an absolute path, but is relative the the WinBuilder %BaseDir%.  On the other hand, this example file links to a completely specified path (which may be on another drive).

```
[Main]
link=C:\MyScripts\Addons\AccessGainDrivers.script
Selected=True
```