<h1>
u2o_Examples_WB_v082<br>
</h1>

<br>

<hr />
<h1>Intro</h1>
We will try to show real and explicit examples, with the necessary code for each action and references to their use. By this way you'll understand the use of each function (separately), as well as have the ability to modify sentences for fit what you need when you are creating your own script.<br>
<br>
<br>
<br>
<h1>Registry Handling</h1>
<h2>RegRead</h2>
<blockquote><code>References:</code> <a href='regread.md'>RegRead</a>
<b>Syntax:</b>
<pre><code>RegRead,&lt;HKEY&gt;,&lt;Section&gt;,&lt;Key&gt;,&lt;%Variable%&gt; <br>
</code></pre>
<h3>Complex Example 1: Read a Value, put Date on a textbox and refresh script interface</h3>
This is an Event <b><i>Click Button</i></b>. When you click the button, call the section: <b>pButton1</b>
<pre><code>[Interface]<br>
pButton1="Copy Your current key",1,8,414,201,121,25,pButton1,0,False,False,_pButton1_,False<br>
<br>
[pButton1]<br>
RegRead,"HKLM","SOFTWARE\Acronis\DiskDirector","enterprise","%temp_reg_data%"<br>
Set,%pTextBox2%,"%temp_reg_data%",Permanent<br>
System,REFRESHINTERFACE<br>
</code></pre>
<i><b>Note</b>: The <b>Key</b> and <b>Value</b> must exist to get the content (<b>Data</b>) of the <b>Value</b></i></blockquote>

<blockquote><code>References:</code> <a href='wbinterface_gui.md'>Graphical Interface</a> | <a href='regread.md'>RegRead</a> | <a href='set.md'>Set</a> | <a href='system#RefreshInterface.md'>System -&gt; RefreshInterface </a></blockquote>

<blockquote><code>Similar Example:</code> <a href='#Implicit_example_1:_Run_by_button.md'>Run by button</a></blockquote>

<h1>Miscellaneous Commands</h1>
<h2>Run / Exec</h2>
<blockquote><code>References:</code> <a href='run.md'>Run / Exec</a>
<b>Syntax:</b>
<pre><code>Run,%ScriptFile%,&lt;Section&gt;[,parameters]<br>
</code></pre></blockquote>

<h3>Complex Example 1: Associate an Extension (or more) with a different icon</h3>

<blockquote>Simplify the association of extensions, you can call so through a single <i>Run</i> line.</blockquote>

<b>How to use:</b>
<pre><code>Run,%scriptfile%,SectionAssocExt,&lt;P#1&gt;,&lt;P#2&gt;,&lt;P#3&gt;,&lt;P#4&gt;,&lt;P#5&gt;,&lt;P#6&gt;,&lt;P#7&gt;<br>
<br>
//P#1 = EXTENSION<br>
//P#2 = EXTENSION_LINK<br>
//P#3 = EXTENSION_DESCRIPTION<br>
//P#4 = ICON_CONTAINER<br>
//P#5 = ICON_CONTAINER_INDEX<br>
//P#6 = APP_FULL_PATH<br>
//P#7 = APP_PARAMETERS<br>
</code></pre>
<blockquote><i><b>Note</b>: All parameters are required.</i></blockquote>

<b>The code sample:</b>
<pre><code>[Interface]<br>
pCheckBox5="JPG,JPE,JPEG",1,3,30,150,100,16,True<br>
pCheckBox6=BMP,1,3,30,165,100,16,True<br>
<br>
[Variables]<br>
%ProgramTitle%=FastStone Image Viewer<br>
%ProgramFolder%=FastStone Image Viewer<br>
%ProgramEXE%=FSViewer.exe<br>
%SMProgramDir%=%pTextBox1%<br>
<br>
[Process]<br>
Echo,"Processing %ProgramTitle%..."<br>
Set,"%LinkDir%","%PE_Programs%\%ProgramFolder%"<br>
Set,"%ExeFullPath%","#$q%LinkDir%\%ProgramEXE%#$q"<br>
Set,"%ExeParameter%","#$q#$p1#$q"<br>
<br>
RegHiveLoad,"WB-Software",%RegSoftware%<br>
<br>
If,%pCheckBox5%,Equal,True,Run,%scriptfile%,SectionAssocExt,.jpe,FastStone.jpe,FastStone JPE File,%LinkDir%\FSIcons.db,4,%ExeFullPath%,%ExeParameter%<br>
If,%pCheckBox5%,Equal,True,Run,%scriptfile%,SectionAssocExt,.jpeg,FastStone.jpeg,FastStone JPEG File,%LinkDir%\FSIcons.db,4,%ExeFullPath%,%ExeParameter%<br>
If,%pCheckBox5%,Equal,True,Run,%scriptfile%,SectionAssocExt,.jpg,FastStone.jpg,FastStone JPG File,%LinkDir%\FSIcons.db,4,%ExeFullPath%,%ExeParameter%<br>
<br>
If,%pCheckBox6%,Equal,True,Run,%scriptfile%,SectionAssocExt,.bmp,FastStone.bmp,FastStone BMP File,%LinkDir%\FSIcons.db,0,%ExeFullPath%,%ExeParameter%<br>
<br>
RegHiveUnLoad,"WB-Software"<br>
<br>
[SectionAssocExt]<br>
Echo,"Registering Association for Extension: #1"<br>
RegWrite,HKLM,0x1,"WB-Software\Classes\#1","","#2"<br>
RegWrite,HKLM,0x1,"WB-Software\Classes\#2","","#3"<br>
RegWrite,HKLM,0x1,"WB-Software\Classes\#2\DefaultIcon","","#4,#5"<br>
RegWrite,HKLM,0x2,"WB-Software\Classes\#2\shell\open\command","","#6#$s#7"<br>
</code></pre>
<blockquote><code>References:</code> <a href='wbinterface_gui.md'>Graphical Interface</a> | <a href='wbscriptvariables.md'>Variables</a> | <a href='echo.md'>Echo</a> | <a href='set.md'>Set</a> | <a href='run.md'>Run / Exec</a> | <a href='reghiveload.md'>RegHiveLoad</a> | <a href='reghiveunload.md'>RegHiveUnLoad</a> | <a href='if.md'>If Clauses</a> | <a href='regwrite.md'>RegWrite</a> | <a href='wbscriptsyntax#Syntax_Rules_and_Escape_Characters.md'>Syntax Rules and Escape Characters</a></blockquote>

<blockquote><i><b>Note</b>: You can also use the following functions: <a href='add_asso.md'>CommonApi -&gt; add_asso </a>  | <a href='associate_file.md'>CommonApi -&gt; associate_file </a></i></blockquote>

<h3>Implicit example 1: Run by button</h3>
<blockquote>This is an Event <b><i>Click Button</i></b>. When you click the button, call the section: <b>MessageOne</b></blockquote>

<pre><code>[Interface]<br>
pButton1=ButtonShowThisText,1,8,189,260,25,25,MessageOne,False,False,False,_MessageOne_,False<br>
<br>
[MessageOne]<br>
Message,"You message here...#$x With new line #$c and comma.",Information<br>
</code></pre>
<blockquote><code>References:</code> <a href='wbinterface_gui.md'>Graphical Interface</a> | <a href='message.md'>Message</a> | <a href='wbscriptsyntax#Syntax_Rules_and_Escape_Characters.md'>Syntax Rules and Escape Characters</a></blockquote>

<blockquote><code>Similar Example:</code> <a href='#Complex_Example_1:_Read_a_Value,_put_Date_on_a_textbox_and_refre.md'>Read a value, put date on a textbox and refresh script interface</a></blockquote>

<h1>Network Tools</h1>
<h2>WebGet</h2>
<blockquote><code>References:</code> <a href='webget#WebGet.md'>WebGet</a>
<h3>Example 1: Download a Zip File</h3></blockquote>

<blockquote>The best way to get small size scripts, is to download the application zip package from its website. And obviously it's good, add the variables and code necessary for update the script easily.<br>
<pre><code>[Variables]<br>
%ProgramTitle%=FastStone Image Viewer<br>
%ProgramFolder%=FastStone Image Viewer<br>
%ProgramEXE%=FSViewer.exe<br>
%SMProgramDir%=%pTextBox1%<br>
// Download Config<br>
%DownloadFileBaseName%=FSViewer46<br>
%DownloadFile%=%DownloadFileBaseName%.zip<br>
%DownloadUrl%=http://www.faststonesoft.net/DN/%DownloadFile%<br>
// path where program templates are stored<br>
%ProgramTemplate%=%BaseDir%\Workbench\Common\FastStone_Image_Viewer<br>
<br>
[Process]<br>
Run,%ScriptFile%,Download<br>
<br>
[Download]<br>
Echo,"Trying download %ProgramTitle%  (%DownloadFile%)..."<br>
If,Not,ExistDir,%ProgramTemplate%,DirMake,%ProgramTemplate%<br>
// Download<br>
If,Not,ExistFile,%ProgramTemplate%\%DownloadFile%,WebGet,%DownloadUrl%,%ProgramTemplate%\%DownloadFile%<br>
If,Not,ExistFile,%ProgramTemplate%\%DownloadFile%,Echo,"File not downloaded",WARN<br>
If,Not,ExistFile,%ProgramTemplate%\%DownloadFile%,Echo,"Perhaps there is a new version of %DownloadUrl%",WARN<br>
// Unpack zip file<br>
If,ExistFile,%ProgramTemplate%\%DownloadFile%,ShellExecute,Hide,%Tools%\7z.exe,"x #$q%ProgramTemplate%\%DownloadFile%#$q -y -o#$q%ProgramTemplate%#$q"<br>
</code></pre>
<blockquote><code>References:</code> <a href='wbscriptvariables.md'>Variables</a> | <a href='echo.md'>Echo</a> | <a href='run.md'>Run / Exec</a> | <a href='if.md'>If Clauses</a> and <a href='if#Exist....md'>Exist... / NotExist...</a> | <a href='webget#WebGet.md'>WebGet</a> | <a href='shellexecute.md'>ShellExecute</a> | <a href='wbscriptsyntax#Syntax_Rules_and_Escape_Characters.md'>Syntax Rules and Escape Characters</a>