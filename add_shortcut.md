# Add\_Shortcut #

Create shortcuts on the desktop, quicklaunch bar or start menu.

## Syntax ##
```
Add_Shortcut,[Type],[StartMenuFolder],[FullFileName],[Title],[Work Folder],
     [Parameters],[IconFile],[StartMode],[ToolTipText]
```

## Parameters ( `*` not supported by Vista / Win7 ) ##
|1|Type|Define the type of shortcut|
|:|:---|:--------------------------|
| |    | **Desktop** - Place an icon on the desktop|
| |    | **StartMenu** - Place an icon in the `StartMenu\Programs` (default value)|
| |    | **QuickLaunch** - Add an icon to the Quick Launch bar|
| |    | **SendTo`*`**- Add an icon on the right-click menu "Send To"|
| |    | **AutoStart or AutoRun** - Place an icon in the `StartMenu\Programs\AutoStart`|
| |    | **EditWith** - Add an icon on the right-click menu "Edit With %ProgramExe%"|
| |    | **Accessories`*`** - Place an icon in the `StartMenu\Programs\Accessories`|
| |    | **AdministrativeTools`*`** - Place an icon in the `StartMenu\Programs\Administrative Tools`|
| |    | **SystemTools`*`** - Place an icon in the `StartMenu\Programs\Accessories\System Tools`|
| |    | **StartMenuRoot** - Place an icon in the `StartMenu` Root|
|2|StartMenuFolder|Fill this value if you want to force the shortcut to be placed on a specific folder (let it empty for use the script foldername)|
|3|FullFileName|This switch is used if you want to create a shortcut different of %ProgramExe% (No need to give path if File is in same folder as %ProgramExe%)<br> (default value = %Pe_Programs%\%ProgramFolder%\%ProgramExe%)<br>
<tr><td>4</td><td>Title</td><td>Set your own title for this shortcut (default value = %ProgramTitle%)</td></tr>
<tr><td>5</td><td>Work Folder<code>*</code></td><td>Decide in which folder should start the program (default value = same Folder as the program set in parameter 3)</td></tr>
<tr><td>6</td><td>Parameters</td><td>If you want to launch the program with command line parameters, write them here</td></tr>
<tr><td>7</td><td>IconFile</td><td>Specify which icon to use on the shortcut. (No need to give path if IconFile is in same folder as the program set in parameter 3)</td></tr>
<tr><td> </td><td>    </td><td> <b>(Path\) IconFile</b> - for icon type .ico or .exe</td></tr>
<tr><td> </td><td>    </td><td> <b>(Path\) IconFile#$cIndex<code>*</code></b> - for icon type .dll or .exe (simply add #$c between IconFile and Index)</td></tr>
<tr><td>8</td><td>StartMode</td><td>Optional value to set how the window of the launched program should be. </td></tr>
<tr><td> </td><td>    </td><td> <b>1</b> - Show           </td></tr>
<tr><td> </td><td>    </td><td> <b>2</b> - Show_Minimized (program will start minimized)</td></tr>
<tr><td> </td><td>    </td><td> <b>3</b> - Show_Maximized (program will start maximized)</td></tr>
<tr><td>9</td><td>ToolTipText<code>*</code></td><td>Text to display when cursor is on the icon of the program</td></tr></tbody></table>

<h2>Remarks ##
  * Add\_Shortcut is a generic command that will create a shortcut. On most projects, by leaving empty parameter 2, it will create this shortcut inside the Start Menu and will place it inside a subfolder that has the same name as the folder where the respective script is placed.
  * You don't need to worry where the shortcut will be placed because each project will create them in the best possible way.
  * This seems that it was coded exclusively to work with the explorer shell but it wasn't. If the user prefers (for example) to use xoblite, then the Add\_Shortcut will either use the equivalent shortcut or simply ignore the request if it is not possible to execute.

## Tips ##
If you want place an icon in `StartMenu\Programs` without subfolder use a point (.) as parameter 2
```
Add_Shortcut,StartMenu,.
Add_Shortcut,StartMenu,..
```
is same as
```
Add_Shortcut,StartMenuRoot
```

## Example ##
For a script called Test.script, located in folder `Apps\CD\ProgTest\` like this :
```
[Variables]
%ProgramTitle%=Test
%ProgramEXE%=Prog.exe
%ProgramFolder%=AppTest

[Process]
...
```

you can add a shortcut called `Test` in `StartMenu\Programs\CD\ProgTest` for the executable `Program Files\AppTest\Prog.exe` by using:
```
Add_Shortcut
```
or
```
Add_Shortcut,StartMenu
```

To use icon `Icon.ico` from same folder as the %ProgramExe%, use
```
Add_Shortcut,StartMenu,,,,,,Icon.ico
```
or to use icon from `I386\sytem32\shell32.dll` with index 27, use
```
Add_Shortcut,Desktop,,,,,,#$pSystemRoot#$p\system32\shell32.dll#$c27
```