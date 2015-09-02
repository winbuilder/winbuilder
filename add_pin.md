# Add\_Pin ( Win 7 Projects Only ) #

"Pin" a program to the Windows 7 taskbar or start menu.

## Syntax ##
```
Add_Pin,Type,[Order],Path,[Title],[WorkFolder],[Parameters],[Icon],[StartMode],[ToolTipText] 
```

## Parameters ##
|1|Type|Defines the type of the pin i.e. where the pin appears.|
|:|:---|:------------------------------------------------------|
| |    | **StartMenu** = Pinned item will appear in the start menu.|
| |    | **TaskBar** = Pinned item will appear on the taskbar. |
| |    | **RecentPrograms** = Pinned item (which is a link already in the start menu or on the desktop) will be "pinned" to the Start Menu's "recent programs" area. <br> <i><b>Note:</b> When Type = RecentPrograms, only parameter number three (i.e. Path) is used. Others are not applicable and should be left unspecified.</i> <p> <b><code>***</code>Added as a provisional part of the API Jan 2012.</b>
<tr><td>2</td><td>Order</td><td>Specifies the order of the icons in the specified pinning area. If a script overwrites a previously defined Type with the same Order, than you will get a warning in log. <br><i><b>Note:</b> Many Windows 7 projects use a separate script to define all the items to be pinned so this is not a problem in practice.</i> </td></tr>
<tr><td> </td><td>    </td><td><b>0-9</b> = This defines the initial order of the icons that are shown in the selected area. It can be changed at run time by drag and drop.</td></tr>
<tr><td> </td><td>    </td><td><b>Auto</b> = The first available place in the selected area is automaticaly found. This is the default action if the parameter is not specified.</td></tr>
<tr><td>3</td><td>Path</td><td>This should either be left blank or the full path to the item to be pinned should be specified. This can either be the installed path of the file or the installed path of a shortcut file ( .lnk file ) in the user profile. Logical names can be used to reference areas in the user profile i.e. <code>$Start_Menu, $Quick_Launch, $Desktop</code>. If blank it defaults to <code>%PE_Programs%\%ProgramFolder%\%ProgramEXE%</code>.<br><br>Examples:<br><code>%SystemRoot%\calc.exe</code><br><code>$Start_Menu\Programs\Network\PENetwork.lnk</code><br><code>$Quick_Launch\PENetwork.lnk&lt;br&gt;$Desktop\My Computer.lnk</code><p><i><b>Note:</b> When Type = RecentPrograms, the path must refer toan existing link in the $Start_Menu\Programs or $Desktop areas.</i></td></tr>
<tr><td>4</td><td>Title</td><td>This specifies the title to associate with the shortcut created by the pinning process. If not specified then <code>%ProgramTitle%</code> is used.</td></tr>
<tr><td>5</td><td>WorkFolder</td><td>Optional parameter defining the current directory for the pinned program (default value = same Folder as the program set in parameter 3)</td></tr>
<tr><td>6</td><td>Parameters</td><td>Optional parameter defining any command line parameters for the pinned program.</td></tr>
<tr><td>7</td><td>Icon</td><td>Optional parameter defining which icon to use on the automatically created shortcut file. (No need to give path if IconFile is in same folder as the program set in parameter 3).</td></tr>
<tr><td> </td><td>    </td><td><b>(Path\)IconFile</b> = File containing icon. Can be an ico, exe, or a dll file. First available icon in file will be associated with the shortcut file</td></tr>
<tr><td> </td><td>    </td><td><b>(Path\)IconFile#$cIndex</b> = File containing icon. Can be an ico, exe, or a dll file. Icon with specified index will be associated with the shortcut file. <br><b>Note:</b> <i>must use excaped form of the "comma" as separator</i></td></tr>
<tr><td>8</td><td>StartMode</td><td>Optional parameter specifying how the window of the launched program should be shown. <b>Note:</b> the launched program can override this. <br><br>You can also include an appended string indicating what hotkey is used to launch the program ( add the escaped form of the comma (#$c) between the start mode and the hotkey ). Hotkeys are specified using the text form of the key seperated by + e.g. CTRL+ALT+A.</td></tr>
<tr><td> </td><td>    </td><td><b>1</b> = Program is shown in normal mode. The default if the parameter is not specified.</td></tr>
<tr><td> </td><td>    </td><td><b>2</b> = Program is shown minimized.                 </td></tr>
<tr><td> </td><td>    </td><td><b>3</b> = Program is shown maximized.                 </td></tr>
<tr><td>9</td><td>ToolTipText</td><td>Text to display when cursor is on the pinned icon of the program.</td></tr></tbody></table>

<h2>Limitations</h2>
<ol><li>Not all files can be pinned<br>
</li><li>Links (.lnk) pointing to .cpl files can not be pinned<br>
</li><li>Files located on removable devices (CD UFD etc.) can not be pinned.<br>
</li><li>The name of pin is automatically set based on the .lnk name or program name.<br>
</li><li>A maximum 10 items per type can be pinned. (i.e. 10 start menu and 10 taskbar items)</li></ol>

<h2>Example</h2>
<pre><code>Add_Pin,StartMenu<br>
Add_Pin,Taskbar<br>
Add_Pin,Taskbar,,#$pSystemRoot#$p\calc.exe<br>
Add_Pin,StartMenu,,"$Desktop\My Computer.lnk"<br>
Add_Pin,StartMenu,,%PE_Programs%\%ProgramFolder%\MyTool_To_Pin.exe,"My Pinned Tool"<br>
Add_Pin,RecentPrograms,,$Start_Menu\Programs\Accessories\Notepad.lnk<br>
</code></pre>