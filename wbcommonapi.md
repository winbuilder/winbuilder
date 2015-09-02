<h1>WinBuilder's Scripting "API"</h1>

The WinBuilder Scripting API (a.k.a. the "common" API) is a means to extend and add functionality to a WinBuilder project and to make application (and other) scripts more compatible across multiple projects. WinBuilder also provides a means to integrate these "macros" into the internal editor help system, and make them act and "feel" just like internal WinBuilder Commands


<br>
<hr />
<blockquote><h3>The current API project is still in a bit of "flux", however most commands have been around for some time and will continue to be supported in future versions.</h3>
<h3>A process to better manage the API is also <b><i>under development.</i></b></h3>
<hr />
<br>
<h1>How It works</h1></blockquote>

The WinBuilder Scripting API is a set of macros, <i><b>nothing more nothing less.</b></i>

What makes it valuable is that the WinBuilder community has decided to use these same macro <i><b>definitions</b></i> across many projects.  This allows individual scripts, especially for Applications, to be more easily used in different projects. If you know how to create a macro in a script, than you can easily figure out how the API is used. What makes this API process different than a script file containing ordinary macros is how it is "hooked into" the WinBuilder process.<br>
<br>
<blockquote>Note: A WinBuilder projects does not <b>need</b> to use the API to be a valuable project. In fact, there are some projects that may not use ANY API, or may use the  the API process to implement their own API definition.</blockquote>

<blockquote>It is also important to note that the API just defines the Macro names and interface conventions.  Individual projects may need to use a different internal implementation of the API, <b>and that is perfectly OK - as long as the API follows the syntax and functionality defined</b>.</blockquote>


<h1>Hooking the API into your project</h1>
We will start by looking at what makes the API "turn on". If you look in <b>script.project</b> file you will see the following lines and Variables being defined.  This first variable<br>
<pre><code>//-- API File and Some Api project settings<br>
%API%=%ProjectDir%\Build\Common_Api.script<br>
</code></pre>
tells WinBuilder what file contains the API, while this variable definition<br>
<pre><code>%API_TYPE%=2<br>
</code></pre>
is used to tell the Common APIi that we are project type 2 (Vista/Win7). This is used internally in the API to make decisions about which implementation should be used when a command is called.  Here are the currently defined type values<br>
<ul><li>1 =Gena/LiveXP/NativeEx/PE1 based projects<br>
</li><li>2 =Vista/Win7 based projects<br>
</li><li>98=Windows98 based projects</li></ul>

The following line defines the name of the "section in common_api file that contains the actual definitions of the API commands. In other words, what section has the code to be run when you use any given macro (e.g. Add_shortcut etc.). We will look at that section of the Common API later.<br>
<pre><code>%APIVAR%=ApiVar<br>
</code></pre>

There are some additional lines that should be added to the <b>script.project</b> file which help WinBuilder find and display items for the magic wand (i.e. WinBuilders internal help system). This is displayed in a pull-down menu, where the variable, as an example,<br>
<pre><code>%APIDEF%=API<br>
</code></pre>
tells WinBuilder what to display for the top level API menu, and the variable<br>
<pre><code>%APISUBDEF%=_Calculate,AddAutoRun,*AddPostConfig,*AddPreConfig,*AddToPEShell,Add_Shortcut,<br>
     Add_Asso,*Add_Pin,Add_URL,Arch,Associate_File,Ask_License,CapiC,*CopyDrv,CopyProgram,<br>
     ExtractAndRunc,Others,*ReadENV,Registry,Require_File,*RequireSysFile,RunFrom,Unpack,Variable<br>
</code></pre>
tells WinBuilder what the commands are in the API that have internal templates. <b>(This would be all on one line inside the script file)</b> In addition to defining the various variables, we need one last command to activate them at run time.<br>
<pre><code>[Process]<br>
AddVariables,%API%,ApiVar,GLOBAL<br>
</code></pre>
This command loads all commands in the common_api.script from the <code>[ApiVar]</code> section we mentioned above as <code>GLOBAL</code> variables. We will get into this a bit more later, but know that this needs to happen in order for scripts to use the Common API commands.<br>
<br>
<h1>The <code>Common_API.script</code> file</h1>

Ok now on to Common_API.script. As mentioned above, we have defined several variables, and there is typically an <code>[Api_Def]</code> section in the script file.  For example:<br>
<pre><code>[Api_Def]<br>
%APIVAR%=ApiVar<br>
%APIDEF%=API<br>
%APISUBDEF%=_Calculate,AddAutoRun,*AddPostConfig,*AddPreConfig,*AddToPEShell,Add_Shortcut,<br>
     Add_Asso,*Add_Pin,Add_URL,Arch,Associate_File,Ask_License,CapiC,*CopyDrv,CopyProgram,<br>
     ExtractAndRunc,Others,*ReadENV,Registry,Require_File,*RequireSysFile,RunFrom,Unpack,Variable<br>
</code></pre>
This section doesn't do anything! It is simply a reminder that you need to set these variables in your own script.project in order to use the Common API. <b>Editing this section will not do anything!</b>

On the other hand, the <code>[!ApiVar]</code> Section is very important. This is the section we defined with the line <code>%APIVAR%=ApiVar</code> back in script.project and loaded into memory with the command<br>
<pre><code>[Process]<br>
AddVariables,%API%,ApiVar,GLOBAL<br>
</code></pre>
This is the part where the commands actually get mapped to their functions. i.e. we create the macro definitions.  For example:<br>
<br>
<pre><code>[ApiVar]<br>
%ToRoot%=<br>
%CapiArchApi%=<br>
%CapiAdd_ShortcutProcess%=<br>
%CapiSubFoldersToRoot%=Falsy<br>
%CapiNoShortcutSubfolders%=<br>
%CapiBSExplorerFix%=Nope<br>
%CapiNowarnPreserveNodebugwarn%=<br>
%reg_temp%=wb-hive<br>
%reg%=%reg_temp%<br>
%CopyMui%=Off<br>
%WarnWhenSetApi%=False<br>
%Shc_Mode%=0<br>
_Calculate=Run,%API%,Calculate<br>
Add_Asso=Run,%API%,Association%API_TYPE%<br>
Add_Shortcut=Run,%API%,AddShortcut%Capi_Shortcut_TYPE%%CapiAdd_ShortcutProcess%<br>
Add_Pin=Run,%Api%,Add_Pin_Process%API_TYPE%<br>
Add_URL=Run,%API%,Add_URL%API_TYPE%<br>
AddAutoRun=Run,%API%,Add_Auto_Run%API_TYPE%<br>
AddPostConfig=Run,%API%,Add_Post_Config%API_TYPE%<br>
----ETC ETC ETC---------<br>
<br>
</code></pre>

An easy way to think of it is that whenever WinBuilder sees the command <code>_Calculate</code> in any script it internally replaces the <code>_Calculate</code> with<br>
<br>
<pre><code>Run,%API%,_Calculate<br>
</code></pre>
which will execute the <code>[_Calculate]</code> section in <code>%API%</code> which we defined earlier in script.project as being <code>%ProjectDir%\Build\Common_Api.script</code>

<h1>Defining the menu entries (syntax templates) for the magic wand</h1>

The definitions are contained (as mentioned above) in the <code>[API]</code> Section.  Note that line doesn't actually <b>do</b> anything - its just a reminder to developers that the next sections are menu definitions and not actually functions.<br>
<br>
Following that line, you will see a bunch of sections all with names corresponding to the submenus we defined in the <code>%APISUBDEF%</code> variable in our project. this is where we actually define the commands to be displayed in the APIs magic wand menu.  For example:<br>
<pre><code>[API]<br>
[_Calculate]<br>
Full Syntax="//_Calculate,AutoIT Command(expression),ReturnVar(without %)"<br>
Note="//Always use simple quote in expression ,use `#$c` in place of the comma" and use %ReturnVar% (with %) as result in your code . See AutoIT doc"<br>
-=<br>
MsgBox="_Calculate,MsgBox(2#$c'Test Calculate'#$c'Choice:'#$c5),Choice"<br>
InputBox="_Calculate,InputBox('Question'#$c 'Where were you born?'#$c 'Planet Earth'#$c ''#$c -1#$c -1#$c -1#$c -1),Answer"<br>
<br>
[Add_URL]<br>
Default Value="Add_URL,Favorites,&lt;filename&gt;,&lt;webaddress&gt;"<br>
Full Syntax="Add_URL,[Favorites][Links]&lt;TargetPath&gt;,&lt;filename&gt;,&lt;webaddress&gt;,[UrlDll][None]&lt;url icon address&gt;,[None]&lt;IconIndex&gt;,[None]&lt;HotKey&gt;"<br>
-=<br>
Sample Favorites="Add_Url,,Google.url,http://www.google.com"<br>
Sample Links="Add_Url,Links,Google.url,http://www.google.com"<br>
-=<br>
Sample Favorites SubF="Add_Url,Favorites\My Folder,Google.url,http://www.google.com"<br>
Sample AnyFolder="Add_Url,%target_win%,Google.url,http://www.google.com"<br>
Sample Icon Url.dll="Add_Url,,Google.url,http://www.google.com,UrlDLL"<br>
Sample Icon Ico="Add_Url,,Google.url,#$psystemroot#$p\system32\blabla.ico"<br>
<br>
[*Add_Pin]<br>
Full Syntax="//Add_Pin,Type,Order(0,1,2,..,8,9), path\)FileName,Title,Work Folder,Parameters,path\)IconFile#$cIconIndex,StartMode=(1,2,3)#$cHotKey,ToolTipText"<br>
Default Value="Add_Pin,StartMenu,,%PE_Programs%\%ProgramFolder%\%ProgramExe%,%ProgramTitle%"<br>
-=<br>
Sample File="Add_Pin,Taskbar,,#$pSystemRoot#$p\calc.exe"<br>
Sample Lnk="Add_Pin,StartMenu,0,"$Desktop\My Computer.lnk""<br>
-=<br>
StartMenu="Add_Pin,StartMenu"<br>
TaskBar="Add_Pin,Taskbar"<br>
<br>
</code></pre>

When winbuilder builds the api menu it looks at %APISUBDEF% and makes the top level entries based on the contents of this variable. Next it looks for sections inside the API script file that have the matching name of the top level entries and fills the top level menus with the lines in each section.<br>
<br>
The sections are layed out like so:<br>
<ul><li>the name of command as shown in api menu = command to paste into the code editor when you select the command.<br>
</li><li><code>-=</code> makes a line/divider.<br>
and that's the quick and dirty introduction to the common api. The rest of the code inside the script file are the functions that actually doing the work.</li></ul>

<h3>NOTE: WinBuilder does not scan the sections. It only displays the contents of the section referenced by the corresponding name defined in <code>%APISUBDEF%</code></h3>
<ul><li>If it is not listed in any of the sections referenced by %APISUBDEF%, even if it has code to implament the functionality and is listed in the macro declaration, it won't have a Magic Wand entry.<br>
</li><li>The variable <code>%APISUBDEF%</code> is only used by WinBuilder itself for building the API menu entries. The actual routines/functions are added in the <code>[ApiVar]</code> section.