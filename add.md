<h1>Add</h1>


<br>

<hr />
<br>
<h1>Add,DesktopIni</h1>

Create a desktop.ini file in the selected folder allowing you to specify how a file system folder is viewed.<br>
<br>
<h2>Syntax</h2>
<pre><code>Add,DesktopIni,Type,[Folder],[Section],Value,Data<br>
</code></pre>

<h2>Parameters</h2>
<table><thead><th>1</th><th>Url</th><th>Selects common API function to execute. In this case its Add_DesktopIni. Its a mystery why Add_DesktopIni was not added to the common API.</th></thead><tbody>
<tr><td>2</td><td>Type</td><td>Specifies the target directory where the desktop.ini file will be created.                                                                </td></tr>
<tr><td> </td><td>   </td><td> <b>Desktop</b> - Desktop.ini will be created in the desktop folder.                                                                      </td></tr>
<tr><td> </td><td>   </td><td> <b>StartMenu</b> - Desktop.ini will be created in the Start Menu folder.                                                                 </td></tr>
<tr><td> </td><td>   </td><td> <b>StartMenuRoot</b> -Desktop.ini will be created in the root of the Start Menu folder.                                                  </td></tr>
<tr><td> </td><td>   </td><td> <b>Accessories</b> - Desktop.ini will be created in the Accessories folder.                                                              </td></tr>
<tr><td> </td><td>   </td><td> <b>QuickLaunch</b> - Desktop.ini will be created in the Quick Launch folder.                                                             </td></tr>
<tr><td> </td><td>   </td><td> <b>SendTo</b> - Desktop.ini will be created in the Send To folder.                                                                       </td></tr>
<tr><td> </td><td>   </td><td> <b>Path</b> - Desktop.ini will be created in the path specified in the Folder parameter.                                                 </td></tr>
<tr><td>3</td><td>Folder</td><td>If Type is Path then this specifies the folder in which desktop.ini will be created.                                                      </td></tr>
<tr><td>4</td><td>!Section</td><td>Optional parameter that specifies the section in desktop.ini to be updated. If specified it must be. ShellClassInfo as that is the only section supported by windows.</td></tr>
<tr><td>5</td><td>Value</td><td>Value name to be updated in the selected desktop.ini file.                                                                                </td></tr>
<tr><td> </td><td>   </td><td> <b>ConfirmFileOp</b> - Set this entry to 0 to avoid a "You Are Deleting a System Folder" warning when deleting or moving the folder.     </td></tr>
<tr><td> </td><td>   </td><td> <b>NoSharing</b> - Not supported under Windows Vista or later. Set this entry to 1 to prevent the folder from being shared.              </td></tr>
<tr><td> </td><td>   </td><td> <b>IconFile</b> - If you want to specify a custom icon for the folder, set this entry to the icon's file name. The .ico file name extension is preferred, but it is also possible to specify .bmp files, or .exe and .dll files that contain icons. If you use a relative path, the icon is available to people who view the folder over the network. You must also set the IconIndex entry.</td></tr>
<tr><td> </td><td>   </td><td> <b>IconIndex</b> - Set this entry to specify the index for a custom icon. If the file assigned to IconFile only contains a single icon, set IconIndex to 0.</td></tr>
<tr><td> </td><td>   </td><td> <b>InfoTip</b> - Set this entry to an informational text string. It is displayed as an infotip when the cursor hovers over the folder. If the user clicks the folder, the information text is displayed in the folder's information block, below the standard information.</td></tr>
<tr><td>6</td><td>Data</td><td>The value data.                                                                                                                           </td></tr></tbody></table>

<h2>Remarks</h2>
The Desktop.ini file is a text file that allows you to specify how a file system folder is viewed. The ShellClassInfo section, allows you to customize the folder's view by assigning values to the appropriate entries.<br>
<br>
File system folders are commonly displayed with a standard icon and set of properties, which specify, for instance, whether or not the folder is shared. You can customize the appearance and behavior of an individual folder by creating a Desktop.ini file for that folder.<br>
<br>
Will only work for Windows 7 if the desktop.ini file is the only file in the folder. This basically makes the feature useless as what is the point of having a custom icon for an empty folder.<br>
<br>
<h2>Example</h2>
<pre><code>Add,DesktopIni,StartMenu,,,WordPad.lnk,shell32.dll#$c-22069<br>
Add,DesktopIni,Path,%Target_PE%\AFolder,.ShellClassInfo,LocalizedResourceName,@shell32.dll#$c-28996<br>
Add,DesktopIni,Path,%Target_PE%\AFolder,.ShellClassInfo,IconFile,#$pSystemRoot#$p\system32\SHELL32.dll<br>
Add,DesktopIni,Path,%Target_PE%\AFolder,.ShellClassInfo,IconIndex,25<br>
</code></pre>

<br>
<hr />
<br>
<h1>Add,Shortcut</h1>
<blockquote><h2>See <a href='add_shortcut.md'>Add_Shortcut</a> for documentation, since they are just two different ways to call the same AP functionality</h2>
<hr />
<br>
<h1>Add,URL</h1></blockquote>

Creates URL file links for default browser.<br>
<br>
<h2>Syntax</h2>
<pre><code>Add,Url,[Type],&lt;FileName&gt;,&lt;WebAddress&gt;,[IconFile],[IconIndex],[HotKey]<br>
</code></pre>

<h2>Parameters</h2>
<table><thead><th>1</th><th>Url</th><th>Selects common API function to execute. In this case its Add_URL. Its a mystery why Add_URL was not added to the common API.</th></thead><tbody>
<tr><td>2</td><td>Type</td><td>Optional parameter specifying target directory where the URL file link will be created. Assuming favorites is chosen as the target directory then the links will automatically appear in the IE favorites menu. There is no current mechanism to create links that will appear in other browser's bookmarks menu.</td></tr>
<tr><td> </td><td>   </td><td> <b>Favorites</b> - URL link will be created in the IE favorites folder.                                                    </td></tr>
<tr><td> </td><td>   </td><td> <b>Links</b> - URL link will be created in the IE Links folder.                                                            </td></tr>
<tr><td> </td><td>   </td><td> <b>StartMenu</b> - URL link will be created in the StartMenu folder.                                                       </td></tr>
<tr><td> </td><td>   </td><td> <b>StartMenuRoot</b> - URL link will be created in the root of the Start Menu.                                             </td></tr>
<tr><td> </td><td>   </td><td> <b>Desktop</b> - URL link will be created on the desktop.                                                                  </td></tr>
<tr><td> </td><td>   </td><td> <b>Path</b> - URL link will be created in the path specified in the path part of the FileName parameter.                   </td></tr>
<tr><td>3</td><td>FileName</td><td>File name of the URL link file that will be created.                                                                        </td></tr>
<tr><td>4</td><td>WebAddress</td><td>Web Address associated with the URL link.                                                                                   </td></tr>
<tr><td>5</td><td>IconFile</td><td>Optional parameter specifying full path of icon file to be associated with the URL link file. Can be specified as UrlDLL to reference the url.dll system file.</td></tr>
<tr><td>6</td><td>IconIndex</td><td>Optional parameter specifying the icon index from the IconFile. If not specified then the first icon in the specified file will be used.</td></tr>
<tr><td>7</td><td>HotKey</td><td>Optional parameter specifying the hotkey used to launch the URL by the default browser. !Hotkeys are specified using the text form of the key separated by + e.g. CTRL+ALT+A.</td></tr></tbody></table>

<h2>Examples</h2>
<ul><li>Create in Favorites Folder:<br>
<pre><code>Add,Url,,Google.url,http://www.google.com<br>
Add,Url,Favorites,"My Folder\Google.url",http://www.google.com<br>
Add,Url,,Google.url,http://www.google.com,UrlDLL<br>
Add,Url,,Google.url,http://www.google.com,#$psystemroot#$p\system32\blabla.ico<br>
</code></pre>
</li><li>Create in Links Folder<br>
<pre><code>Add,Url,Links,Google.url,http://www.google.com<br>
</code></pre></li></ul>

<ul><li>Create in Start Menu<br>
<pre><code>Add,Url,StartMenu,Google.url,http://www.google.com<br>
</code></pre></li></ul>

<ul><li>Create in Start Menu root folder:<br>
<pre><code>Add,Url,StartMenuRoot,Google.url,http://www.google.com<br>
</code></pre></li></ul>

<ul><li>Create on Desktop:<br>
<pre><code>Add,Url,Desktop,Google.url,http://www.google.com<br>
</code></pre></li></ul>

<ul><li>Create in specified folder:<br>
<pre><code>Add,Url,Path,%target_win%\Google.url,http://www.google.com<br>
</code></pre>