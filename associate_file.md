# Associate\_File #

Associate a file extension with an application.

## Syntax ##
```
Associate_File,Extension,[Type],[Filename],[Option],[UseRegAddBoot]
```

## Parameters ##
|1|Extension|File extension to be associated|
|:|:--------|:------------------------------|
|2|Type     |Set the type of the association. If not specified defaults to Open.|
| |         |**Open** = Launch the associated application|
| |         |**Edit** = Launch the associated editor and opens the document for editing|
| |         |**Icon** = Associate an icon with the extension|
|3|Filename |File to be associated. May be defaulted or may be a file name or full path. If it's not specified then it defaults to:<br> <b><code>%PE_Programs%\%programFolder%\%programExe%</code></b><p>If only the file name is specified then the path is assumed to be:<br><b><code>%PE_Programs%\%programFolder%</code></b>
<tr><td>4</td><td>Option   </td><td>This is optionally used to specify the DefaultIcon index. If the icon is contained with the program exe then this can be used with Open or Edit. Otherwise the Icon type can be used to specify an external DefaultIcon.</td></tr>
<tr><td>5</td><td>UseRegAddBoot</td><td>Defaults to False. If set to True then <a href='regaddboot.md'>RegAddBoot</a> is used to create the association.</td></tr></tbody></table>

<h1>Tips</h1>
This function will mount and unmount the appropriate registry hive each time its called. If many associations are being created then its more efficient to use <a href='add_asso.md'>Add_Asso</a> instead.<br>
<br>
<h2>Example</h2>
This sets notepad.exe as the program to open files with extension ext using icon with index 153 from shell32.dll for the association.<br>
<pre><code>Associate_File,Ext,Open,%SystemRoot%\system32\notepad.exe<br>
Associate_File,Ext,Icon,%SystemRoot%\System32\Shell32.dll,-153<br>
</code></pre>
If your scripts defines the variables <code>%ProgramFolder%</code> and <code>%ProgramEXE%</code> then the above example can be replaced with:<br>
<pre><code>[Variables]<br>
%ProgramTitle%=Notepad<br>
%ProgramEXE%=Notepad.exe<br>
%ProgramFolder%=%SystemRoot%\System32<br>
<br>
[Process]<br>
Associate_File,Ext<br>
</code></pre>