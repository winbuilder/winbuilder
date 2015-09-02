<h1> Version History </h1>

<br>
<hr />
<h1>WinBuilder Releases</h1>
<h2><code>[082]</code> stable (2011-06-15)</h2>

<ul><li>changed - comp80 default from ON to OFF<br>
</li><li>fixed - bug in interface editor with multiple selected components<br>
</li><li>fixed - bug in interface editor with weblabel in panel<br>
</li><li>fixed - lost custom title<br>
published as release preview<br>
</li><li>fixed - bug in If command, when a compare string starts with "run"<br>
</li><li>changed - removed "orphaned" System,HasDOS8_3 command<br>
</li><li>fixed - bug which in interface editor with multiple selections sometimes "forgot" single selections<br>
</li><li>fixed - bug introduced by removing of System,HasDOS8_3 command<br>
</li><li>added - when image does not contain URL, click into the image starts the default graphical editor<br>
</li><li>changed - place weblabels in front of textlabels<br>
</li><li>fixed - <code>[http://reboot.pro/14...post__p__131528 script editor bug with source code button (the light bulb)]</code>
</li><li>fixed - single run now displays script's description rather than script.project description<br>
</li><li>fixed - bug with endless loop in exiting WinBuilder, when a script has been deleted externally<br>
</li><li>fixed - When in interface editor activating "resize to fit" on an image, the corner dots of the image are not repositioned correctly until the image is clicked<br>
</li><li>changed - set "clear" button in interface editor / image to invisible<br>
</li><li>added - RefreshControl method to TInterfaceComponentManager. That hopefully avoids interface troubles with con-classic themes<br>
frozen for second release preview as 82.0.0.15 on 2011-JUL-01</li></ul>

<h2><code>[081]</code> Beta 1 (2011-01-04)</h2>

<ul><li>added - System,HasUAC and System,IsTerminal commands<br>
</li><li>fixed - bug <code>"RegMulti,HKLM,Section,Key,DELETE,SubVal bug"</code>
</li><li>fixed - bug <code>"RegWrite,HKLM,0x3,&lt;Section&gt;,&lt;Keyname&gt;,%variable%"</code>
</li><li>fixed - access violation in Set,%InterfaceVar%<br>
</li><li>fixed - bug "AddInterface does not work when used with run"<br>
</li><li>changed - "Add a new object" window in Interface Editor is sized depending on DPI<br>
</li><li>added - Please add the function to doublecklick a line the the combobox of "Add a new object window" to add the object<br>
</li><li>added - AutoSave mechanism to interface editor<br>
</li><li>added - When clicking the green 'run' arrow in source editor, it is (depending on AutoSave option) also asked for 'save' before starting<br>
</li><li>added - Interface editor now can group elements to adjust or move them all simultaneously<br>
</li><li>added - #$z to magic wand<br>
</li><li>fixed - "Coolest Bug ever!" corrupting .scr file<br>
</li><li>added - AutoSave mechanism to description editor<br>
</li><li>fixed - License window sizing issue<br>
</li><li>fixed - Comma issue in If commands<br>
</li><li>added - Deleting all selected components in interface editor<br>
</li><li>added - Equal horizontal or vertical spacing of components in interface editor<br>
</li><li>added - Horizontal or vertical centering of components in interface editor<br>
</li><li>added - optional <code>[Text]</code> output in log rather than download icons.<br>
</li><li>added - optional supressing time output in log, in order to compare easier.<br>
</li><li>added - NOWARN parameter to FileDelete command<br>
</li><li>fixed - Bug in RegMulti, which overwrote %variables%<br>
</li><li>fixed - Bug in logging error of DirCopy command (wrote " + s" rather than error description)<br>
</li><li>added - Verbose option to Debug Log<br>
</li><li>added - NOREC option to FileDelete<br>
</li><li>changed - the string <code>"#&lt;number&gt;"</code> can be passed and is not seen as parameter<br>
</li><li>fixed - Codebox in a fresh started WB was without API<br>
</li><li>fixed - Bug in logging Loop statements<br>
</li><li>changed - certification logic<br>
</li><li>added - System,HasDOS8_3 command<br>
</li><li>fixed - Bug in RegWrite,HKLM,0x1,WB-Setup\Classes\SHCmdFile\shell\open\ddeexec,,"<code>[ShellFile(""%1""#$c""%1"",%S)]</code>"<br>
</li><li>fixed - Bug in StrFormat,Rtrim<br>
</li><li>changed - %variables% as macros temporarily tolerated with log warning. In stable version this will be an error.<br>
</li><li>fixed - Parameter existing only of 2 quotes now becomes empty<br>
</li><li>fixed - Do not write surrounding quotes into variables when reading the <code>[variables]</code> section<br>
</li><li>fixed - resolve escapes to character in If command compares<br>
</li><li>fixed - (Finally) Do not write surrounding quotes into variables when reading the <code>[variables]</code> section<br>
</li><li>fixed - resolve escapes to character in If,QUESTION<br>
</li><li>fixed - several 'surrounding quotes' bugs in If command<br>
</li><li>added - menu entry in magic wand: copy complete command list to clipboard<br>
</li><li>rewrote - If command<br>
</li><li>fixed - log output for If commands<br>
</li><li>fixed - Bug in PackParam<br>
</li><li>fixed - Bug in RegWriteBin<br>
</li><li>changed - fine tuning of RegRead and RegReadBin commands<br>
</li><li>fixed - Incompatibility of GetParam, introduced by the bug fix of PackParam<br>
</li><li>addded - System,LOG,OFF / System,LOG,ON commands<br>
</li><li>fixed - Bug in StrFormat when writing result to parameter #n<br>
</li><li>fixed - Bug in log.html generation causing 'Index out of bounds' when logging a Loop command<br>
</li><li>fixed - Bug causing 'Access Violation' in interface<br>
</li><li>changed - Errors supressed by System,ERROROFF are now shown in Debug Log as 'Handled Errors'<br>
</li><li>added - icons for log.html can be optionally in %BaseDir%\Pictures, bypasses download<br>
</li><li>fixed - Bug in interface due to values with quotes<br>
</li><li>fixed - Bug in running section on CheckBox click<br>
</li><li>fixed - Bug in Interface Click event handling<br>
</li><li>fixed - Bug in If command, when comparing numerical values<br>
</li><li>changed - some cosmetics in output of log.html<br>
</li><li>fixed - Bug in OUT: parameters handling<br>
</li><li>fixed - Bug which did not allow GLOBAL changes of %Constants%<br>
</li><li>fixed - Bug with duplicating quotes in interface text labels<br>
</li><li>fixed - Bug in IniDelete<br>
</li><li>changed - variables replacement: from linear search to binary search<br>
</li><li>fixed - #$xs sometimes not resolved<br>
</li><li>improved - log output<br>
</li><li>fixed - some smaller bugs when treating multiple components in interface editor<br>
</li><li>fixed - bug in progress window when exec a script at tree end<br>
</li><li>fixed - made behaviour of interface component 'FileCheckList' logically compatible to WinBuilder 076<br>
</li><li>fixed - bug when aborting "Add component to interface"<br>
</li><li>fixed - bug: Set,%InterfaceComponent% PERMANENT sometimes corrupts interface<br>
</li><li>changed - now If,EXISTFILE accepts wild cards ?<br>
</li><li>changed - now If,EXISTDIR accepts wild cards ?<br>
</li><li>fixed - bug in positioning of RadioGroup when scrollbars used<br>
</li><li>added - System,Log command<br>
</li><li>rebuild - Compatible to 080 now by default. Can be changed by command System,Comp80,{OFF|ON}<br>
</li><li>changed - Log icons are no more downloaded. They are as resources in WinBuilder.exe and are extracted on first use.<br>
</li><li>fixed - bug in FileCopy / DirCopy command with SHOW option<br>
</li><li>fixed - bug in Visible command<br>
</li><li>fixed - made z-order of components compatible to version 80<br>
uploaded as WinBuilder_110509.zip</li></ul>

<ul><li>fixed - made z-order of components compatible to version 80 (finally ?)<br>
</li><li>fixed - Font size and bold issue with themes different from classic<br>
</li><li>fixed - "Cancel' in "Create new attachement folder"<br>
uploaded as WinBuilder_110513.zip</li></ul>

<ul><li>fixed - z-order fix sometimes broight interface display to hang<br>
uploaded as WinBuilder_110520.zip</li></ul>

<ul><li>fixed - access violation in TextFile interface component<br>
uploaded as WinBuilder_110601.zip</li></ul>

<ul><li>removed - <code>[http://reboot.pro/14648/page__view__findpost__p__130037 unnecessary SetEsc command]</code>
uploaded as WinBuilder_110602.zip</li></ul>

<ul><li>fixed - <code>[http://reboot.pro/14477/page__view__findpost__p__129661 link function did not display first level linked scripts in project tree]</code>
</li><li>fixed - link finction displays non-script files<br>
</li><li>fixed - sometimes in the interface editor changes on grouped elements are not completelly saved<br>
uploaded as WinBuilder_110607.zip</li></ul>

<ul><li>fixed - <code>[http://reboot.pro/14477/page__view__findpost__p__130523 now different link behaviours with </code><linked path><code> vs </code><linked path>\<b>.</b><code>]</code>
uploaded as WinBuilder_110610.zip</li></ul>

<ul><li>fixed - <code>[http://reboot.pro/14477/page__view__findpost__p__130616 bug in WinBuilder command line start]</code>
</li><li>added - NOWARN option to Exit command<br>
uploaded as WinBuilder_110612.zip</li></ul>

<h2><code>[080]</code> update (2010-03-03)</h2>

<ul><li>fixed - lost "search next" in source editor<br>
</li><li>fixed - nested macros now work</li></ul>

<h2><code>[080]</code> update (2010-02-23)</h2>

<ul><li>fixed - hidden components in interface editor</li></ul>

<h2><code>[080]</code> update (2010-02-20)</h2>

<ul><li>fixed - bug with missing last zero pair in REG_MULTI_SZ strings</li></ul>

<h2><code>[080]</code> (2010-01-15)</h2>

<ul><li>fixed - Bug ID #238: new scripts added to server not seen on download list<br>
</li><li>fixed - bug: command line 'If, ... ,If, ... ,Begin' causes double indent in log.html<br>
</li><li>fixed - bug: Some RegWrite errors have been logged as successfully processed<br>
</li><li>changed - RegWrite 0x1 tolerates syntax error (comma in string rather than escape)<br>
</li><li>added - If,EXISTMACRO command<br>
</li><li>added - Error when StrFormat calculates with uninitialized variables (gave accesss violation right now)<br>
</li><li>changed - Make GUI in Download Center simpler mit respect to 'Dummy User'<br>
</li><li>added - detection of Win7 to %HostOS%<br>
</li><li>changed - Set command: replace comma and space by escapes<br>
</li><li>added - AddInterface can optionally define an alternate interface<br>
</li><li>fixed - bug in RegRead multi_sz<br>
</li><li>added - StrFormat,CTRIM and StrFormat,SPLIT now can have escapes as 'single character'<br>
</li><li>added - Variable %WBExe%<br>
</li><li>fixed - bug in DirDelete,FAST left temp files in root<br>
</li><li>fixed - bug in download center: On first show tree was allways built, regardless of 'green arrow' definition<br>
</li><li>added - RegAddMulti command<br>
</li><li>changed - improved syntax check with warnings / errors in RegAddMulti command<br>
</li><li>added - RegAddMulti,HKLM,Section,Key,INDEX,SubVal,%Var%<br>
</li><li>added - If,EXISTREGMULTI,HKLM,Section,Key,SubVal,Command<br>
</li><li>added - %RegDataType% variable set on every successful RegRead operation<br>
</li><li>added - RegWriteBin command to write wide strings<br>
</li><li>added - RegReadBin command to read wide strings<br>
</li><li>fixed - bug in scriptline parameter count check<br>
</li><li>changed - improved syntax check with warnings / errors in RegWriteBin / RegReadBin command<br>
</li><li>changed - Desktop path now read from registry<br>
</li><li>fixed - untranslated #$x in script <code>[Main]</code> description<br>
</li><li>fixed - smaller bug with source editor autosave<br>
</li><li>added - error in RagHiveLoad when the hive is already mounted<br>
</li><li>changed - copy commands accept 'null' arguments instead of COPY, PRESERVE, SHOW, NOREC<br>
</li><li>changed - renamed RegAddMult command to RegMulti command (it handles also non-adding tasks)<br>
</li><li>fixed - show Options and Proxy tabs in initial download in Download Center<br>
</li><li>changed - Interface Bevel min size to 4 x 4<br>
</li><li>fixed - disabled 'Add new web server' in very fresh WinBuilder installation<br>
</li><li>added - RegWriteBinEx command to unchecked write any type from binary data<br>
</li><li>fixed - Bug ID #245: Dircopy - different behavoir under xp and vista/7<br>
</li><li>fixed - Bug ID #246: Dirdelete,FAST<br>
</li><li>fixed - Bug ID #250: endless lop defining variables<br>
</li><li>fixed - In ShellExecute,Explore distinguish between file and directory.<br>
</li><li>fixed - Bug in RegWrite empty string<br>
</li><li>fixed - Bug in RegWrite command introduced by Copy Command 'Null' argument change<br>
</li><li>added - Set command also stores macros<br>
</li><li>revised - handling of empty values in RegWrite<br>
</li><li>revised - some more changes in handling of empty values in RegWrite</li></ul>

<h2><code>[078 SP6]</code>(2010-01-03)</h2>

<ul><li>fixed - bug: Access violation on setting interface variables<br>
</li><li>fixed - bug in log.html generating. Loop,BREAK can bring "Index out of bounds" and lets WinBuilder hang<br>
</li><li>fixed - IniRead now translates comma in value to escape (troubles with TXTAddLine)</li></ul>

Release as 078 SP6 on 2010-JAN-09<br>
<br>
<h2><code>[078 SP5]</code>(2009-11-23)</h2>

<ul><li>fixed - bug: Unresolved <code>*</code>.Link brought crash with 'invalid filename'<br>
</li><li>fixed - bug: Dependencies and Excludes did not work on <code>*</code>.Link files<br>
</li><li>fixed - bug: No section shown in log, when started by button<br>
</li><li>fixed - removed senceless "Download disabled" message when file exists on "WebGetIfNotExist" command<br>
</li><li>fixed - bug in syntax check of "txtAddLine"<br>
</li><li>added - optionally run WinBuilder only in CPU / core #1<br>
</li><li>fixed - bug: changed ISOFile and TargetDir are not written to script.project</li></ul>

<h2><code>[078 SP4]</code> (2009-11-02)</h2>

<ul><li>fixed - bug: double comma when generating updates.ini<br>
</li><li>fixed - bug in download when path contained 'Updates'<br>
</li><li>fixed - bug in interpreting download levels<br>
</li><li>fixed - bug: no download tree on a fresh installation</li></ul>

Release as 078 SP4 on 2009-NOV-08<br>
<br>
<h2><code>[078 SP3]</code> (2009-09-25)</h2>

<ul><li>added - AddInterface command<br>
</li><li>fixed - Bug ID #214: Deselection by keyboard produces error<br>
</li><li>changed - New Component Dialog now in center of WB window, rather than in center of desktop<br>
</li><li>fixed - Deselecting a complete folder containing a mandatory script lets build crash<br>
</li><li>fixed - Bug ID #222: wb078 sp2 - Depend not working<br>
</li><li>added - Optional log at WinBuilder exit<br>
</li><li>changed - In download center, there is an option whether selecting an additional server rebuilds the complete tree.<br>
</li><li>fixed - bug in RegRead / RegWrite multi_sz<br>
</li><li>fixed - bug in If,Online when running from command line<br>
</li><li>fixed - Bug ID #209: User-agent - Windows Update: EmbeddedWB bug, using newer package<br>
</li><li>added - RegWrite 0x3 accepts one %Variable% as input value</li></ul>

Release as 078 SP3 on 2009-NOV-01<br>
<br>
<h2><code>[078 SP2]</code> (2009-09-06)</h2>

<ul><li>changed - sepatate TNodeData unit with 'read on demand'<br>
</li><li>added - Download center now can select by Version, MD5, Certification<br>
</li><li>fixed - RegWrite multiple strings with comma in argument<br>
</li><li>fixed - Bug ID #217: Set,%var%,NIL,PERMANENT<br>
</li><li>fixed - Smaller issue with resolving nested variables<br>
</li><li>fixed - Bug ID #216: Access Violation when trying to trim empty string<br>
</li><li>reanimated - CheckListBox<br>
</li><li>added - change event to ComboBox<br>
</li><li>added - change event to RadioGroup<br>
</li><li>fixed - terrible bug with strFormat cutting long lines. Changed all according AnsMidStr Delphi commands to length of MaxInt</li></ul>

Release as 078 SP2 on 2009-SEP-24<br>
<br>
<h2><code>[078 SP1]</code>(2009-09-02)</h2>

<ul><li>fixed - source indenting disturbed certification<br>
</li><li>fixed - CopyOrExpand of single <code>*.ca_</code> file does not work<br>
</li><li>fixed - leading and trailing spaces in variables were lost.<br>
</li><li>fixed - download issues when proxy does not allow DNS<br>
</li><li>fixed - Bug ID #211: Access violation<br>
</li><li>changed - certification issuer shown in log, when applicable<br>
</li><li>added - in Tools >> Upload tab, write certification string into updates.ini</li></ul>

Release as 078 SP1 on 2009-SEP-06<br>
<br>
<h2><code>[077 RC 3]</code>(2009-07-14)</h2>

<ul><li>added - some more syntax checks. Now e.g. comma in command parameter gives warning<br>
</li><li>added - When WB is not running as active window, ShellExecute,Open windows are not shown<br>
</li><li>changed - when there are troubles in downloading WB asks whether to continue or not<br>
</li><li>changed - removed PERMANENT option from AddVariables<br>
</li><li>fixed - bug in 'interface editor area' with non-standard WB size<br>
</li><li>fixed - Bug ID #205: StrFormat,Inc don't increment Letter<br>
</li><li>fixed - bug in concat of split lines<br>
</li><li>changed - warning mechanism on overwrite and parameter count: all is OFF by default<br>
</li><li>added - OnProcessEntry and OnProcessExit functionality<br>
</li><li>added - OUT capability for Run command parameters<br>
</li><li>added - StrFormat,LEN command<br>
</li><li>fixed - download issues with proxy<br>
</li><li>fixed - bug in OUT capability<br>
</li><li>changed - a lot of internet functions for work behind proxy<br>
</li><li>fixed - bug in OUT capability due to existing OUT variables<br>
</li><li>added - certification functionality<br>
</li><li>fixed - misfeature in IniWriteTextLine,APPEEND (empty line in section)<br>
</li><li>fixed - misfeature in IniAddSection (missing empty line)</li></ul>

<h2><code>[077 RC 2]</code> (2009-06-10)</h2>

<ul><li>fixed - In RegWrite REG_MULTI_SZ spaces are treated as separators<br>
</li><li>changed - In RegWrite REG_MULTI_SZ write empty key as hex(00 00 00 00) rather then not to create the empty key<br>
</li><li>fixed - Bug ID #196: Suggestions for improving UI (item #2 and #3)<br>
</li><li>fixed - Bug ID #197: RegGetNext - access violation<br>
</li><li>changed - consolidation of all file transfer commands.<br>
</li><li>added - RegWrite warns on overwritintg different value<br>
</li><li>fixed - Bug ID #199: Run - Failed to find section <code>[AddShortcut]</code> in file (bug in AddVariables)<br>
</li><li>fixed - Bug in Exec command which deletes GLOBAL variables<br>
</li><li>added - APPEND option to IniWriteTextLine<br>
</li><li>changed - Filecopy overwrite warning only with different MD5<br>
</li><li>added - Request Bug ID #201: Open Script Dir<br>
</li><li>added - Request Bug ID #200: Interface Editor: Component Selector<br>
</li><li>added - If,EQUALX command for case sensitive compare<br>
</li><li>fixed - Disappearing scrollbars in Editor / Attachments<br>
</li><li>added - Warnings and Errors in log.html header contain script titles<br>
</li><li>added - RegWrite 0x2 parameter accepted as hex number list<br>
</li><li>added - Option to warn before overwrite when extracting attachments manually<br>
</li><li>added - Extract of single file fom a CAB archive</li></ul>

published as WinBuilder 077 RC 2 on 2009-JUL-14<br>
<br>
<h2><code>[077 RC 1]</code> (2009-06-03)</h2>

<ul><li>fixed - loop with 'Choose source' in case of only invalid source list entries<br>
</li><li>added - StrFormat,POSX and StrFormat,REPLACEX commands for case sensitive processing<br>
</li><li>added - ToolTips to GUI<br>
</li><li>changed - System,RESCANSCRIPTS does not longer restart WinBuilder<br>
</li><li>fixed - beta 3 introduced bug in FileCopy with wildcards</li></ul>

published as WinBuilder 077 RC 1 on 2009-JUN-09<br>
<br>
<h2><code>[077 beta 3 hotfix]</code> (2009-04-26)</h2>

<ul><li>fixed - conflict between picture and 'show progress' in GUI button<br>
</li><li>fixed - 'List index out of bounds' in new Winbuilder installation with WinBuilder.exe only</li></ul>

<h2><code>[077 beta 3]</code>(2009-04-26)</h2>

<ul><li>fixed - anchored "rename current file" in download center to window buttom<br>
</li><li>fixed - Bug ID #182: v.44 / WB077 beta2<br>
</li><li>fixed - Bug ID #188: CopyOrExpand warnings<br>
</li><li>fixed - (Some remaining issues) Fresh created interface components sometimes went lost.<br>
</li><li>fixed - ExtractAndRun with parameters<br>
</li><li>fixed - CopyOrExpand: M$ Expand fature when files are compressed under a different name than expanded<br>
</li><li>changed - Log.html is now generated with W3C 4.01 compliancy<br>
</li><li>fixed - Bug in RegWrite with comma in value<br>
</li><li>fixed - Bug ID #192: <code>_Calculate,AutoIT</code> Command<br>
</li><li>fixed - Bug ID #190: System,REFRESHINTERFACE<br>
</li><li>added - BartPE convert: put syntax error original lines into log<br>
</li><li>added - BartPE convert: Optional suppress Nu2Menu shortcut generation, when XPEINIT shortcut is present<br>
</li><li>fixed - BartPE convert: Some smaller bugs with progress and log.html<br>
</li><li>changed - Smoothed FileCopy command, added NOREC and PRESERVE parameters<br>
</li><li>changed - Interface components can be set like variables<br>
</li><li>added - Visible command to dynamically hide / show interface components<br>
</li><li>changed - Smoothed ScrollBar handling in interface editor<br>
</li><li>added - In single scripts, processed sections can optionally use ProgressWindow  or not use.<br>
</li><li>added - Alternate interface section definable in <code>[Main]</code>
</li><li>fixed - Bug in RegRead of binaries: First byte was duplicated<br>
</li><li>added - 'SHOW' as last parameter to ShellExecute: progress bar animated<br>
</li><li>fixed - Bug in RegRead of <code>REG_MULTI_SZ</code> with comma in value<br>
</li><li>added - StrFormat,SHORTPATH and StrFormat,LONGPATH commands</li></ul>

<h2><code>[077 beta 2]</code>(2009-04-01)</h2>

<ul><li>added - Build progress shown in taskbar icon<br>
</li><li>fixed - Bug ID #177: Wait command <a href='https://code.google.com/p/winbuilder/issues/detail?id=77'>bug 077</a> Beta1<br>
</li><li>added - Some visible user information in taskbar icon when WinBuilder builds in background<br>
</li><li>fixed - Bug ID #176: Script Count incorrect<br>
</li><li>added - Check commands for correct number of arguments<br>
</li><li>fixed - Bug in If command when comparing floating point values<br>
</li><li>fixed - Bug in proxy settings with disappearing 'z'<br>
</li><li>added - If,FileExist command now can check HTTP URLs<br>
</li><li>changed - Rewrote 'If,ONLINE' and 'If,PING' internal handling to Indi functions<br>
</li><li>changed - Dynamical binding of psapi.dll - allows start of WinBuilder under w2k<br>
</li><li>changed - Now WinBuilder internet functionality 100% independent from IE settings<br>
</li><li>changed - Download center optionally renames current file rather than overwriting it<br>
</li><li>added - System,SPLITPARAMETERS command<br>
</li><li>fixed - Bug ID #180: MULT/DIV replaced 32 bit integer by 64 bit integer<br>
</li><li>added - Interface editor has scroll bars by default.<br>
</li><li>fixed - Fresh created interface components sometimes went lost.</li></ul>

published as WinBuilder 077 Beta 1 on 2009-APR-26<br>
<br>
<h2><code>[077 beta 1]</code> (2009-02-05)</h2>

<ul><li>fixed - dummy proxy entry in WinBuilder.ini, even there is no proxy used<br>
</li><li>fixed - ExtractAndRun did not resolve variables completelly<br>
</li><li>fixed - Bug in GUI FileBox component, setting %BaseDir% to last shown dir<br>
</li><li>fixed - Bug ID #157 'StrFormat,POS'<br>
</li><li>fixed - Bug ID #158 'StrFormat,SPLIT'<br>
</li><li>fixed - Bug in DirCopy with trailing backslash<br>
</li><li>fixed - wrong message text in IniMerge (error instead of success)<br>
</li><li>changed - System,RescanScripts in standard build does not restart WinBuilder<br>
</li><li>fixed - error 'File does not exist' which could occur on the very first start of WinBuilder in an empty directory<br>
</li><li>fixed - some unresolved variable values in IniWrite and MakeDir<br>
</li><li>added - Output Variables into log.html. Can be switched under Tools > Log Options<br>
</li><li>fixed - Bug letting download center crash on empty version number<br>
</li><li>fixed - Give the Exec command knowledge about API<br>
</li><li>fixed - Bug ID #165 'Processing scripts interface'<br>
</li><li>fixed - bug ID #164 'variable handling bug'<br>
</li><li>fixed - Bug ID #163 'Download progress bar'<br>
</li><li>fixed - Bug ID #159 'Tree view splitter bug reborn'<br>
</li><li>fixed - StrFormat,CEIL and FLOOR decimal point troubles, logically CEIL and FLOOR exchanged<br>
</li><li>added - Optional output of comment lines in log. Can be switched under Tools > Log Options<br>
</li><li>added - optional warning in log on unresolved (misspelled) commands. Can be switched under Tools > Log Options<br>
</li><li>fixed - Bug ID #167 Scrollbar markings in Interface editor have the wrong size.<br>
</li><li>fixed - Bug ID #169: WB GUI slightly to big for wondow<br>
</li><li>fixed - Bug ID #170: Options GUI to big for window yet no scrollbars<br>
</li><li>fixed - Bug ID #171: disappearing scrollbars in the treeview<br>
</li><li>added - Syntax highlighter for SynEdit with WB language<br>
</li><li>changed - Made Syntax highlighter customizable<br>
</li><li>added - Search / Replace functionality to source editor<br>
</li><li>added - Include the search / replace dialogs into 'foreign language' translation<br>
</li><li>added - parameters (#?) and escapes (#$?) to highlighter<br>
</li><li>fixed - Bug in log.html generation with 'Begin' and 'End' in comment lines<br>
</li><li>fixed - bug with escape of escape (##$p) in Set command value<br>
</li><li>fixed - Bug ID #174: Retrieve,MD5 bug<br>
</li><li>fixed - Source CDs of different projects got mixed<br>
</li><li>added - StrFormat,UCASE and StrFormat,LCase commands<br>
</li><li>fixed - Reanimated ability to hide interface component<br>
</li><li>added - script version to progress window<br>
</li><li>added - System,SaveLog command<br>
</li><li>fixed - Bug ID #175: OnBuildExit | OnScriptExit,BEEP<br>
</li><li>added - Interface component visibility controlled by CheckBox in iterface editor<br>
</li><li>changed - Set command now updates interface values immediatelly. Optional the additional PERMANENT argument to write into script<br>
</li><li>added - Interface scrollbox values now can be added<br>
</li><li>reorganized - Internal handling of Commands / subcommands from If ... To case ...<br>
</li><li>added - Syntax Highlighter gets word lists from WinBuilder source codeCommandLists.pas</li></ul>

published as WinBuilder 077 Beta 1 on 2009-APR-01<br>
<br>
<h2><code>[076]</code> hotfix (2009-02-02)</h2>

<ul><li>fixed - Maximize - bug<br>
</li><li>fixed - Proxy bug<br>
</li><li>Rebuild - Syntax highlight in editor restored<br>
</li><li>fixed - Bug (access violation) in Create Script<br>
</li><li>fixed - Bug in System,RescanScripts<br>
</li><li>fixed - Bug with <code>Enable_RefreshButton</code> in WinBuilder.ini<br>
</li><li>fixed - Bug with Autosave in WinBuilder.ini</li></ul>

<h2><code>[076]</code> (2009-02-02)</h2>
unknown<br>
<br>
<h2><code>[075]</code> beta 7 (2009-01-14)</h2>

<ul><li>changed - Dialogbox with timeout now has progressbar and seconds countdown<br>
</li><li>fixed - filebox in directory mode showed backslash at single drive letter (D:\) but no backslash at path (D:\mypath\subpath)<br>
</li><li>fixed - filebox in directory mode now shows last directory<br>
</li><li>fixed - indenting begin / end blocks confused on comment lines<br>
</li><li>added - enhanced WebGet functionality<br>
</li><li>fixed - 'No Network Support' functionality<br>
</li><li>added - GLOBAL and PERMANENT options to AddVariables command<br>
</li><li>fixed - Editor changes have been lost when switching tabs in source edit mode<br>
</li><li>changed - log by default in English, optional in user language (checkbox on Tools > Language)<br>
</li><li>added - API functions to magic wand<br>
</li><li>fixed - bug in WebGet with ftp protocol<br>
</li><li>changed - on IniWrite inifile is created if not exists<br>
</li><li>changed - Check button in source editor for begin / end indenting<br>
</li><li>fixed - script.project.sav files has been also treated as project root<br>
</li><li>changed - autosave logic: now with On, Off, On and Ask, Off and Ask (combobox on Tools > Options)<br>
</li><li>fixed - bug in indenting with 'Else,Begin'<br>
</li><li>changed - WebGet function enhanced<br>
</li><li>changed - options as first tab<br>
</li><li>removed - lblAdvLaunch to make room for additional option<br>
</li><li>removed - language entry !#1621=Launch a separate process for running projects.<br>
</li><li>removed - exit cross at the license tab to make tab look simpler<br>
</li><li>added   - checkbox to enable visibility of Code Box tab (disabled by default)<br>
</li><li>added   - language entry !#1625=Enable Code Box<br>
</li><li>changed - cosmetic improvements on Tools, now it's possible properly use all tools when window is maximized<br>
</li><li>changed - proxy tab moved to download center<br>
</li><li>changed - server tab in download center moved to frontpage<br>
</li><li>removed - buttons on server list (edit and visit webserver)<br>
</li><li>fixed - bug in evaluating RadioGroup<br>
</li><li>added - during build you cannot exit WB using the upper left 'x'. Build must be stopped before.<br>
</li><li>added - treeview to progress window, shown during project build (experimental)<br>
</li><li>added - System,GetFreeSpace command<br>
</li><li>fixed - escape of escape handling in TXTfile commands<br>
</li><li>changed - some smaller adjustements in User Interface<br>
</li><li>fixed - escape of escape handling in IniWriteTextLine command<br>
</li><li>added - some visual changes to progress window<br>
</li><li>changed - for mandatory scripts replaced red exclamation icon by locker icon<br>
</li><li>fixed - bug in Source window which let the $sourcedir% variable sometimes undefined<br>
</li><li>fixed - bug in 'launch external processs'<br>
</li><li>fixed - bug in copying directories recursive<br>
</li><li>added - in Convert BartPE, added BartPE <code>[strings]</code> section to WinBuilde <code>[Variables]</code> section<br>
</li><li>fixed - I/O error 6 when exiting WinBuilder with folder selected (after editing a script)<br>
</li><li>added - warning when WinBuilder is started w/o admin privileges<br>
</li><li>fixed - bug that comment and API lines are not indented<br>
</li><li>added - Fast DirDelete<br>
</li><li>rebuild - complete 'unattended' design</li></ul>

<h2><code>[075]</code> beta 6 (2008-09-18)</h2>

<ul><li>fixed - bug in If,EXISTREGSECTION<br>
</li><li>fixed - bug in StrFormat,CTRIM if the SingleChar was an escape like #$q<br>
</li><li>added - escape of escape. e.g. ##$p writes the three characters #$p rather than a percentage<br>
</li><li>fixed - bug in nested begin - end<br>
</li><li>fixed - space in parameters<br>
</li><li>fixed - Bug ID #19: CPU 100% When double clicking an attachement<br>
</li><li>added - optional output of original lines in log<br>
</li><li>speed - in log html build, replaced if - else sequence by case statement<br>
</li><li>fixed - RegRead no longer creates non existing key<br>
</li><li>fixed - bug in System,GETFREEDRIVE if variable was already defined<br>
</li><li>fixed - bug in nested begin - end: Run and Exec disturbed the stack<br>
</li><li>added - System,ONSCRIPTEXIT,command<br>
</li><li>added - Custom logo size encrease, <a href='https://code.google.com/p/winbuilder/issues/detail?id=89'>bug #89</a>
</li><li>added - STOP, ERROR, DONE, COMMAND as #1 to ONSCRIPTEXIT runs<br>
</li><li>added - System,ONBUILDEXIT,command<br>
</li><li>fixed - log listview now allows horizontal scolling<br>
</li><li>added - an log entry in the log listview can be copied to clipboard by pressing Ctrl+C or doubleclicking the entry<br>
</li><li>changed - internally split some objects from TScript<br>
</li><li>added - add some system exceptions to the ONBUILDEXIT functionality. shown as #1 = EXCEPTION tracked exceptions will be completed more and more<br>
</li><li>fixed - bug in ONBUILDEXIT when executing from a script button<br>
</li><li>added - codebox now with context menu 'magic wand'<br>
</li><li>fixed - bug in ONBUILDEXIT: Run in a different script was not executed<br>
</li><li>added - now the exec command also can have parameters like Run command<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=92'>bug #92</a>: dropdown list not saved<br>
</li><li>added - optional timeout for Message and If,Question<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=94'>bug #94</a>: edit of folder.project<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=98'>bug #98</a>: interface refresh issue when using XP style<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=96'>bug #96</a>: Now <code>[Main]</code>Description key may contain line breaks<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=100'>bug #100</a>: Save attachment directory<br>
</li><li>added - optionally hide 'Source' tab<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=103'>bug #103</a>: Running functions from interface editor<br>
</li><li>added - some new functionality to the 'Set' command<br>
</li><li>fixed - several bugs and misfeatures in GUI, especially when using XP-Style<br>
</li><li>fixed - bug in macro translation<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=108'>bug #108</a>: %ScriptTitel% not printed by magic wand<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=95'>bug #95</a>: <code>[process]</code> in script.project<br>
</li><li>changed - new project tree handling<br>
</li><li>fixed - several bugs introduced in beta 5 m<br>
</li><li>added - <a href='https://code.google.com/p/winbuilder/issues/detail?id=107'>bug #107</a>: language dependent interface<br>
</li><li>added - StrFormat,REPLACE and StrFormat,SPLIT<br>
</li><li>fixed - bug in If,EXISTREGKEY and If,EXISTREGSECTION: Non existing keys were created<br>
</li><li>fixed - tree navigation by key stroke<br>
</li><li>added - %WBLanguage% variable<br>
</li><li>fixed - bug in IniWrite 0x7: #$S instead of spaces<br>
</li><li>fixed - bug in language dependent interface which created new interface section<br>
</li><li>fixed - smaller bug in BartPE inf processing: WB sometimes crashed<br>
</li><li>fixed - RegDeleteKey of a single value<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=113'>bug #113</a>: key navigation in download pane<br>
</li><li>added - optional confirmation of Build STOP button click<br>
</li><li>fixed - bug in If,Online<br>
</li><li>fixed - bug with #$s in regwrite multiple strings<br>
</li><li>fixed - bug in interface editor when resizing a FileBox<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=116'>bug #116</a>: entering text by cut&paste in interface editor destroys the interface if there is a CRLF<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=117'>bug #117</a>: Return needed to add text by cut&paste<br>
</li><li>fixed - downloads are written directly to disk (first with a .tmp added) if the download succeeds it will be renamed to the final name, otherwise the tmp file is deleted<br>
</li><li>changed - escape handling in command dispatcher, hopefully providing something like <a href='https://code.google.com/p/winbuilder/issues/detail?id=119'>bug #119</a>
</li><li>fixed - bug with space in macro definition<br>
</li><li>changed - wait logic of ShellExecute<br>
</li><li>added - ShellExecuteDelete command<br>
</li><li>fixed - bug in System,RefreshInterface<br>
</li><li>added - Verbose realtime WinBuilder file-logging mechanism implemented (to enable it add "DebugLogEnabled=true" to WinBuilder.ini)<br>
</li><li>fixed - bug in interface: checkbox text unchangable or lost<br>
</li><li>added - StrFormat,CharToOem and StrFormat,OemToChar commands<br>
</li><li>added - Vista UAC warning to manifest<br>
</li><li>added - Proxy support, final version<br>
</li><li>fixed - some interface bugs introduced by internal restructuring started with beta 5 x<br>
</li><li>fixed - <a href='https://code.google.com/p/winbuilder/issues/detail?id=28'>bug 128</a>, Set command<br>
</li><li>changed - reanimated If,Ping command<br>
</li><li>added - WB size is saved in INI, and restored next start<br>
</li><li>fixed - some old WB 074 scripts in WB 075 appear with scrollbar<br>
</li><li>changed - logic of 'Size Borders' in GUI editor<br>
</li><li>changed - logic of 'Size Borders' in GUI editor: now measure scrollbar width<br>
</li><li>fixed - wrong color of GUI background<br>
</li><li>changed - some more internal structure, Interface editor<br>
</li><li>added - '<code>*</code>.inf' can contain WinBuilder sections. <code>[Process]</code> is processed, <code>[Interface]</code> is used for building GUI, <code>[Variables]</code> are evaluated<br>
</li><li>changed - Source tab implementation<br>
</li><li>changed - Script editor form separated from WinBuilder's main form - re-implemented large parts<br>
</li><li>changed - default language now available as independent in-exe-resource (editable via resource editor after UPX decompressing WinBuilder.exe)<br>
</li><li>changed - script interface gui can now be aligned exactly with the beveled banner above (use "pBevel1,1,12,-1,0,557,318")<br>
</li><li>recreated - escape of escape. e.g. ##$p writes the three characters #$p rather than a percentage (lost by introducing the VariablesManager class)<br>
</li><li>recreated - lost colored background in interface editor, when using non-classic style<br>
</li><li>fixed - Fixed second editor (access violation, missing language, etc.)<br>
</li><li>added - 'escape of escape' functionality to 'Set,...,PERMANENT' command<br>
</li><li>added - Variables %ProcessorType% and %Wow64% to let scripts handle 64 bit specials<br>
</li><li>recreated - Magic Wand works in CodeBox<br>
</li><li>fixed - Variables %ProcessorType% and %Wow64% to let scripts handle 64 bit specials<br>
</li><li>added - Variable %Wow64Dir% to let scripts handle 64 bit specials<br>
</li><li>changed - truncate debug log file (WinBuilder.log) on start of WinBuilder<br>
</li><li>fixed - bug in Convert BartPE, introduced by inserting apostrophes to the title<br>
</li><li>changed - Click on picture in GUI now may be some more Wow64 friendly<br>
</li><li>added - StrFormat,POS<br>
</li><li>added - New variable %HostOS%<br>
</li><li>fixed - Label font size bug with resolutions different from 96 DPI<br>
</li><li>fixed - bug in System,GETFREEDRIVE: a 'not connected network drive' was assumed to be free<br>
</li><li>added - System,REGREDIRECT<br>
</li><li>added - System,FILEREDIRECT<br>
</li><li>fixed - reanimated fixed folder view<br>
</li><li>rebuilt - old ShellExecute functionality<br>
</li><li>fixed - Access violation when there is no project<br>
</li><li>fixed - bug with lost file level on GUI edit<br>
</li><li>fixed - bug with labeled edit box on GUI edit<br>
</li><li>added - BartPE inf is skipped when <code>[PEBuilder]</code> contains WinBuilder=0<br>
</li><li>fixed - new bug with nested If commands<br>
</li><li>added - Indents in Begin ... End blocks<br>
</li><li>recreated - ShowSourceTab functionality which was lost in server transfer<br>
</li><li>fixed - bug with appearing 'Description' tab on script errors<br>
</li><li>added - small grid facilities in interface editor<br>
</li><li>changed - Wait command with process messages<br>
</li><li>added - If,RUNS command<br>
</li><li>recreated - lost language dependent interface<br>
</li><li>fixed - some new issues with refresh interface on xp-style<br>
</li><li>fixed - autosave of script source on program exit<br>
</li><li>fixed - bug in WebGet: If a file exists and WebGet of the same file failed with MD5 error, the existing file was deleted<br>
</li><li>added - <code>On_Exit</code> and <code>On_Enter</code> events to scripts<br>
</li><li>fixed - lost redirection in http download<br>
</li><li>added - System,GetFileSystem command<br>
</li><li>fixed - bug in magic wand: did not work in codebox after script edit has been used<br>
</li><li>fixed - correct WB startup coordinates when winbuilder.ini points outside desktop<br>
</li><li>fixed - Several lost download functionality<br>
</li><li>fixed - bug in magic wand: still did not work in codebox after source editor has been used<br>
</li><li>fixed - some new interface issues when working under xp-style<br>
</li><li>fixed - script was truncated when in attachement modus winbuilder has been exited<br>
</li><li>fixed - attachement 'delete folder' did not delete files, too<br>
</li><li>fixed - access violation after use of file box<br>
</li><li>added - System,IsAdmin command<br>
</li><li>added - System,GetEnv command<br>
</li><li>reanimated - If,License command</li></ul>

<h2><code>[075]</code> beta 5 (2008-07-07)</h2>

<ul><li>fixed - double 'beta' in form caption<br>
</li><li>fixed - unsaved change of download server constellation<br>
</li><li>fixed - default.txt is missing<br>
</li><li>fixed - 'Index out of bounds' when last download server is deleted<br>
</li><li>fixed - 'feature' how to remove custom program logo<br>
</li><li>fixed - some smaller issues with download servers<br>
</li><li>fixed - ExtractAndRun bug<br>
</li><li>fixed - internal variables like %scriptDir% can contain commas<br>
</li><li>added - 'Stop Build on Error' option<br>
</li><li>fixed - senceless 'v.' in progress window<br>
</li><li>fixed - sort order bug with mapped folders<br>
</li><li>fixed - ShellExecuteEx bug when opening documents by associated app<br>
</li><li>added - Option to name log.html with additional time stamp<br>
</li><li>added - Option to build log.html immediatelly after build w/o user interaction<br>
</li><li>fixed - Bug with If,(NOT)EXISTFILE/DIR checking empty floppy drive<br>
</li><li>added - Loop statement can run between characters, e.g. drive letters<br>
</li><li>added - Strformat,INC and Strformat,DEC also work on characters<br>
</li><li>modified - nicer output in log.html<br>
</li><li>fixed - bug with file type associations<br>
</li><li>fixed - Convert tool - wrong popup menu<br>
</li><li>added - Convert tool - remove file from list<br>
</li><li>added - suggestion how to have certain scripts be selected mandatory<br>
</li><li>added - RegDelete of values<br>
</li><li>added - 'Not' option to If command<br>
</li><li>added - StrFormat can extract path, filename and extentions from URLs<br>
</li><li>fixed - bug in 'Exit on Error' when extracting files<br>
</li><li>fixed - Minor code changes and corrections to clean the hint & warnings reported on compile time<br>
</li><li>fixed - bug 'system error occurs' in clicking log treeview<br>
</li><li>fixed - newly added web servers for download are not tracked in WinBuilder.ini<br>
</li><li>fixed - bug when running script from source editor<br>
</li><li>fixed - delete temporary files after extracting an attachement<br>
</li><li>added - optional automatic log after clicking the STOP button<br>
</li><li>fixed - wrong parent's node check marks when selecting with space bar<br>
</li><li>changed - RegDelete syntax<br>
</li><li>changed - starting to clean up language support<br>
</li><li>changed - remove 'charset' from log.html meta content tag<br>
</li><li>fixed - finally(?) wrong parent's node check marks when selecting with space bar<br>
</li><li>some consolidation with respect to next beta release<br>
</li><li>removed - 'STOP' in interface editor when using themes other than XDP-classic<br>
</li><li>removed - 'protected' functionality<br>
</li><li>added - about 30 items to language translation<br>
</li><li>removed - new RegDelete syntax, temporarily use old syntax (see magic wand)<br>
</li><li>changed - new RegDelete syntax again<br>
</li><li>fixed - some smaller GUI adjustements<br>
</li><li>added - some more items to language translation<br>
</li><li>added - System,ERROROFF can get number of lines as optional argument<br>
</li><li>added - files to be converted can be Drag&Drop-ed from explorer<br>
</li><li>added - files to be attached can be Drag&Drop-ed from explorer<br>
</li><li>added - If,ExistRegSection and If,ExistRegKey<br>
</li><li>added - proxy support<br>
</li><li>added - 'mandatory scripts' functionality (replaces removed Protect functionality)<br>
</li><li>cleaned - internal If command logic<br>
</li><li>changed - WinBuilder always runs in CPU #0 only, also on multiprocessor and multicore systems<br>
</li><li>added - internal variables %ProjectTitle% and %ScriptTitle%<br>
</li><li>added - basic raw registry editor support<br>
</li><li>fixed - script was not shown if there was a folder with a name equal to the script's title<br>
</li><li>fixed - enable RegRead of expandable strings 0x2<br>
</li><li>fixed - decode macro names only as first argument<br>
</li><li>fixed - store changed text in a filebox<br>
</li><li>added - Show Progress Window also when processing codebox ot buttons.<br>
</li><li>added - several smaller adjustements<br>
</li><li>added - autosave option for source code editor<br>
</li><li>fixed - Changing source folder to a folder already on list<br>
</li><li>changed - parameter stack added for 'Run' and 'Loop' statements<br>
</li><li>fixed - bug occurring when a line contained a non-variable '%'<br>
</li><li>fixed - bug in If,QUESTION with space inside question<br>
</li><li>fixed - 'Use Path Rule' now unchecked by default<br>
</li><li>changed - some smaller corrections<br>
</li><li>changed - now nested 'begin' - 'end' is possible. 'begin' stack added<br>
</li><li>changed - no flushing window on missing source<br>
</li><li>changed - dont show scripts of 0 bytes size<br>
</li><li>fixed - bug in System,GETFREEDRIVE<br>
</li><li>fixed - bug in previous / next selected: Changes were lost</li></ul>

<h2><code>[075]</code> beta 4 (2008-06-10)</h2>

<ul><li>modified - log button will always be displayed when using codebox<br>
</li><li>fixed - Else,Set,%var%,xxx bug<br>
</li><li>added - output of localized strings<br>
</li><li>added - StrFormat,Ceil and StrFormat,Floor<br>
</li><li>fixed - Some (WB 75 new) issues fixed with spaces in the %BaseDir% name<br>
</li><li>added - folder linking (link to script folder trees of a different project)<br>
</li><li>added - Retrieve,FileVersion command<br>
</li><li>fixed - bug in FileByteExtract (popup error if sequence not found)<br>
</li><li>fixed - project tree bug with deselect on collapsing<br>
</li><li>added - WBZip by booty#1 as standard de/encoding<br>
</li><li>added - System,GetFreeDrive command<br>
</li><li>fixed - RegImport bug<br>
</li><li>fixed - interface bug with unshown labels<br>
</li><li>added - System,ErrorOff command<br>
</li><li>added - Webget of FTP:// URLs</li></ul>

<h2><code>[075 beta 3]</code> (2008-06-09)</h2>

<ul><li>added - begin/end for If and Else commands<br>
</li><li>fixed - attachement context menu<br>
</li><li>fixed - multiple anchors in log<br>
</li><li>added - stepping through selected scripts<br>
</li><li>fixed - WebGet bug with redirection</li></ul>

<h2><code>[075 beta 2]</code> (2008-05-13)</h2>

<ul><li>added - 'variable names can contain variables'<br>
</li><li>added - Multiple 'Else,If' possible<br>
</li><li>added - 'Loop' statement<br>
</li><li>added - %ExitCode% for ShellExecute<br>
</li><li>added - System,Cursor,Wait / Normal<br>
</li><li>added - Expand Echo,Message to optional Echo,Message<code>[,Warn]</code>
</li><li>added - button to open Download Center from main window<br>
</li><li>added - updates.ini can will open a custom website if specific info is found (<code>[info]</code> -> Website=<a href='http://myexample.com'>http://myexample.com</a>)<br>
</li><li>fixed - greyed scrollbars area<br>
</li><li>fixed - bug with disappearing or moving components<br>
</li><li>fixed - bug with overwritten component, if wrong order<br>
</li><li>fixed - bug in RegGetNext<br>
</li><li>fixed - bug in script macro resolving<br>
</li><li>fixed - CopyOrExpand now works in W2000 host<br>
</li><li>fixed - Main treeview has a stable behavior<br>
</li><li>modified - Some cosmetics in log.html generation<br>
</li><li>modified - GUI editor fixes<br>
</li><li>modified - Log tab is only visible whenever it is not empty<br>
</li><li>modified - wb License is now visible by default under the Tools menu<br>
</li><li>removed - If,License and If,NotLicense commands<br>
</li><li>removed - IE dependency to allow wb work on Windows 2000 (no proxy support based on IE settings)<br>
</li><li>removed - Web and Help tab were removed to keep GUI simpler and quickier to load<br>
</li><li>removed - All built-in FTP upload functions were removed since most developer prefer to use own FTP clients<br>
</li><li>removed - Backup Tool was removed since it was rarely used</li></ul>

<h2><code>[075]</code> (2007-12-18)</h2>

<ul><li>added - Version number next to script description<br>
</li><li>Fix <a href='https://code.google.com/p/winbuilder/issues/detail?id=32'>bug #32</a> (Retreive cmd)<br>
</li><li>Fix bug with RegRead <code>MULTI_SZ</code>
</li><li>Implementation of <code>REG_NONE</code>
</li><li>Log generation accelerated; Fix of 'truncated log lines'<br>
</li><li>Add Generation of API format lines to 'Convert from BartPE'<br>
</li><li>Separate unit 'ConvertBart'<br>
</li><li>ConvertBart now can handle most 'standard' app scripts including a start menu entry extracted from nu2menu???.xml<br>
</li><li>New unit nu2menu<br>
</li><li>Fix <a href='https://code.google.com/p/winbuilder/issues/detail?id=7'>bug #7</a> with Access violation on double click<br>
</li><li>Fix bug in StrFormat: Now last parameter can be %variable%<br>
</li><li>Add string functions RTrim, LTrim, CTRim, Left, Mid, Right to StrFormat<br>
</li><li>Fix bug in If,ExistSection and If,NotExistSection<br>
</li><li>New enhanced variables handling<br>
</li><li>Add If,ExistVar and If,NotExistVar<br>
</li><li>Add Else command<br>
</li><li>RegWrite,0x4 now accepts four binary hex bytes in addition to DWORD<br>
</li><li>Unload open hive after clicking the stop button<br>
</li><li>Add ProcessMessages in RunLite loop<br>
</li><li>STOP button now works also during Exec command<br>
</li><li>Fix bug in RegRead 0x3<br>
</li><li>Accelerated creation of log HTMLs</li></ul>

<h2><code>[073]</code> (2007-10-14)</h2>

beta 1<br>
<br>
<ul><li>Modified UI to keep tabs well separated and enlarge the size of the work window.<br>
</li><li>Web tab now defaults to <a href='http://boot-land.net/forums'>http://boot-land.net/forums</a> instead of <a href='http://boot-land.net/forums/wb.php'>http://boot-land.net/forums/wb.php</a> to give direct access to the forums<br>
</li><li>fixed bug on web tab which kept the progress whell rotating even after the page concluded loading<br>
</li><li>Added right-click menu to add commands on the New Script tool<br>
</li><li>Added right-click copy/paste/cut function to codebox and New Script Tool<br>
</li><li>Fixed the CheckList component on the interface section<br>
</li><li>Added standalone editor mode for editing script - use winbuilder /open="mydir\myWork.script"</li></ul>

beta 2<br>
<br>
<ul><li>Added NativeEx server on the download list<br>
</li><li>Corrected error messages that ocurred when editing the script's description in standalone editor mode<br>
</li><li>Added option on standalone editor to run buttons and checkboxes<br>
</li><li>Running a single script in unattended is much simpler, new syntax: Winbuilder.exe /run="c:\test\apps\myApp.script"<br>
This mode will automatically try to find it's respective project file and read all default values from there if none is specified on command line<br>
</li><li>Unattended mode can run files with any .project filename (example: winbuilder.exe %basedir%\Projects\LiveXP\LiveXP.project)<br>
</li><li>Added stop button when running in unattended mode<br>
</li><li>Added confirmation box when deleting attached files.<br>
</li><li>Added button to run script inside the source code editor<br>
</li><li>Added auto-save option inside source code editor<br>
</li><li>Server list is directly updated from the internet instead of using built-in server addresses.<br>
</li><li>Added button on the download tab to refresh list of available servers on the web</li></ul>

<code>[beta 3]</code>

<ul><li>Added support for reading the default webpage from each web server when selected<br>
</li><li>Changed icon for download button inside the download center<br>
</li><li>Reverted back to default internal project processing<br>
</li><li>Web server list is now available as a tab to keep things tidy<br>
</li><li>Added two new commands to the IF function - question and notquestion. Example syntax: if,question,"Continue?",echo,"Hello world!"</li></ul>

<code>[beta 4]</code>

<ul><li>Removed - message that appeared after saving a script in the source editor - save button automatically detects when script is modified.<br>
</li><li>fixed - bug that erased the contents of the script whenever using a spinedit object on the interface<br>
</li><li>fixed - bug that prevented loading any .script file outside the projects folder<br>
</li><li>fixed - Bug which appeared when selecting an error on the log window after running a script "Cannot focus disabled window"<br>
</li><li>fixed - bug that prevented loading .script files in editor mode using command line parameters<br>
</li><li>added - IniDeleteSection - support for unicode files<br>
</li><li>added - IniAddTextLine - support for unicode files<br>
</li><li>added - button to edit listed web servers inside the web server list.<br>
</li><li>added - missing <code>&lt;If,Question,"My Question?",Command&gt;</code> option on the right click menu of the source code editor<br>
</li><li>added - option to launch external editor in source code editor<br>
</li><li>Corrected - FileCopy command with progress bar - it was only outputing the name of the filename being copied after completing the copy<br>
</li><li>Corrected - After clicking on button inside UI - big play button is disabled<br>
</li><li>Corrected - System,RefreshInterface is not working after pressing button on script UI<br>
</li><li>Corrected - edit with right-click button on explorer erased everything except interface<br>
</li><li>Corrected - Text box won't remember changes made on UI editor<br>
</li><li>Corrected - Play button inside source code editor was not saving latest changes<br>
</li><li>Replaced - old inimerge code was replaced with newer version (please test)<br>
</li><li>Replaced - logo icon for source code editor tab<br>
</li><li>Replaced - navigation icons on main window</li></ul>

beta 5<br>
<br>
<ul><li>Disabled - SystemRefreshInterface is not executed when called from script UI buttons<br>
</li><li>Corrected - FileCopy was not allowing to copy a file from one location to another using a different filename<br>
</li><li>Corrected - Replaced all "wich" typo keywords by "which"<br>
</li><li>Corrected - IniDeleteSection was not working with UNICODE files<br>
</li><li>Solved - bug when encoding files using beta 4 - incompatibilities between unicode vs ansi<br>
</li><li>added - Main script treeview is locked when changing selected status to avoid flickers.<br>
</li><li>added - Switch to TxtAddLine - using "unicode" as last parameter on the append line operations will write with unicode support</li></ul>

<code>[beta 6]</code>

<ul><li>fixed - bug that appeared when running the script inside the source code editor window<br>
</li><li>Modified - Single script upload button was moved to the "Options" tab inside the script editor<br>
</li><li>Enabled - MD5 tool to calculate MD5 checksum was readded on the "Options" tab<br>
</li><li>fixed - bug that "forgot" adding last folder on the "Create New script" tab</li></ul>

<h2><code>[071]</code> (2007-05-14)</h2>

beta 1<br>
<br>
<ul><li>Removed MD5 box on the options tab inside script editor (download center always checks md5 automatically)<br>
</li><li>Added support for running projects in unnatended mode</li></ul>

beta 2<br>
<br>
<ul><li>Added /runsingle= switch which allows to run a single script</li></ul>

beta 3<br>
<br>
<ul><li>Scripts can be displayed without state button - useful for scripts not meant to be run (use Selected=None) on <code>[Main]</code> section.<br>
</li><li>If all scripts on a folder have no state seletect (Selected = None) then the respective folder also omits any state<br>
</li><li>Removed right-click menu from main window (became obsolete)<br>
</li><li>Removed MD5 calculate tool from Script Edit --> Options --> Calculate MD5 checksum<br>
</li><li>Removed language entries: !#1519,!#1520,!#1521,!#1522 related to MD5 calculate tool inside Script Edit --> Options tab.<br>
</li><li>Added option to use wb without Download Center, Upload and Web tab for use under restricted network conditions<br>
- Tools tab was made a bit bigger hiding the tab title<br>
</li><li>Script Edit tab title was also hidden along with script treeview to give more room to editor<br>
</li><li>Corrected bug which allowed to erroneously select more than one script on main window<br>
</li><li>Corrected minimum allowed width and height for interface checkboxes<br>
</li><li>Moved Paths and Log tab to the scripts tab<br>
</li><li>Added a Help tab which will hold help contents about wb, it will use a html file from %basedir%\Projects\Tools\Help\index.html<br>
</li><li>Corrected the back colors for some objects under some XP themes.<br>
</li><li>Recoded the Create Script tab to become more functional<br>
</li><li>Added CopyExpand command using setupapi.dll (thanks to Peter and Smiley)<br>
</li><li>Modified ShellExecute and ShellExecuteEx to support work directories as the 4th parameter<br>
</li><li>Modifed ShellExecute and ShellExecuteEx to work without adding parameters, ex: ShellExecute,Open,cmd.exe<br>
</li><li>Removed "Enter" from the keyboard shortcut list (it was being trigered after exiting windows screensaver protection )<br>
</li><li>Corrected a bug which occured when trying to echo a section with brackets</li></ul>

beta 4<br>
<br>
<ul><li>Recoded script engine to improve performance<br>
</li><li>Removed words !#2057 and !#2060<br>
</li><li>Fixed Refresh button - wasn't updating correctly the Paths Tab<br>
</li><li>FileDelete is now based on Win32API for code efficiency<br>
</li><li>ShellExecute was improved to be (much) less CPU intensive while waiting for launched program to finish<br>
</li><li>Added an error handler on the script engine - now it won't abort when invalid syntax is found.</li></ul>

beta 5<br>
<br>
<ul><li>Removed property on text labels that wouldn't allow using & chars<br>
</li><li>Corrected a bug on regwrite introduced on beta 4</li></ul>

beta 6<br>
<br>
<ul><li>Removed an unneeded setting which always wrote a locked=true value on the <code>[main]</code> section<br>
</li><li>Recoded interface, file search/filter and settings to load much faster.<br>
</li><li>Bugfixed error message when selecting to show log after running a project.</li></ul>

<ul><li>Replaced external download functions with internal IE download function<br>
</li><li>Bugfixed open handles when scanning directories</li></ul>

beta 7<br>
<br>
<ul><li>Run command can support up to 9 parameters<br>
</li><li>Added a code box window to test new commands under a specific project</li></ul>

beta 8<br>
<br>
<ul><li>Added the option to print the currently viewed page on the Help Manual<br>
</li><li>Moved Create Script tab to be the first visible tool<br>
</li><li>Removed the option to lock the interface - become obsolete</li></ul>

beta 9<br>
<br>
<ul><li>Changed tab titles to be larger on script editor<br>
</li><li>Small bugfixes<br>
</li><li>Added a better web server manager<br>
</li><li>Added missing translation texts</li></ul>

beta 10<br>
<br>
<ul><li>More bugfixes and small improvements<br>
</li><li>Limited treeview on main window to avoid excessive width<br>
</li><li>Added more informations when using webget<br>
</li><li>Changed default logo image for scripts without logo<br>
</li><li>Added new parameter on FileCopy - using "show" as last parameter will display the advance of the file copy operation.<br>
</li><li>Fixed ExtractAndRun - wasn't working correctly.</li></ul>

beta 11<br>
<br>
<ul><li>Syntax errors are added on log along with the full syntax used<br>
</li><li>Some bugfixings of previously added features.<br>
</li><li>Added quick navigation buttons to allow pressing forward and backward while browsing scripts<br>
</li><li>Modified the unattended box for running projects - also added /debug switch to help evaluate used parameters<br>
</li><li>Main window will automatically remember and open the last selected project in winbuilder.ini<br>
</li><li>Modified the Interface handling when scripts are executed - it was buggy under some conditions</li></ul>

beta 12<br>
<br>
<ul><li>Corrected webgetifnotexist - wasn't checking correctly if a file existed on disk or not<br>
</li><li>Corrected log window - it wasn't opening the log in explorer after setting this option</li></ul>

<h2><code>[069]</code> (release date unknown)</h2>

beta 1<br>
<br>
<ul><li>Converted ANSI_CHARSET to DEFAULT_CHARSET on all text labels to complete language translation<br>
</li><li>Added a Beta Logo on the main window to allow clicking and acess the respective discussion topic</li></ul>

beta 2<br>
<br>
<ul><li>Program will display window on top of other applications when starting up<br>
</li><li>Removed edit button from interface to make UI less cluttered<br>
</li><li>Removed fixed variables related to XP/2003 based PE projects (%targetsys32%, %targetwin%, %pedrive%, %pewin%, %pesys32%, %peprograms%, %tag%)<br>
</li><li>When WinBuilder.exe starts up for the first time it will display the Quick Start page</li></ul>

beta 3<br>
<br>
<ul><li>Added a small box on the Paths tab to list available projects<br>
</li><li>When wb starts with no available projects it will hide unneeded tabs like "Scripts, Paths, Log"<br>
</li><li>Fixed error window wich appeared when user pressed the refresh button on the web tab without being online.<br>
</li><li>Removed references to obsolete PE drives on the right click menu of the source code editor<br>
</li><li>Added a small correction when people used the download center with wb on a maximized window and would not be able to control it after refreshing the scripts<br>
</li><li>Added support for levels inside project files<br>
</li><li>Improved overall speed when creating updates.ini and index.html<br>
</li><li>Added support for title on web server<br>
</li><li>Re-Added text labels below the quick start buttons (Play, Tools, Refresh)<br>
</li><li>Moved WebServer box to the lower right corner<br>
</li><li>Added support for download profiles (Minimum, Recommended, Complete)<br>
</li><li>Added support for displaying multiple web servers (good for quick browsing changes)<br>
</li><li>Image on description tab will display a tool tip saying "85x90 pixels" to help users know the correct image size to use as script logo<br>
</li><li>Added internal welcome web page wich is displayed whenever wb is started with no projects and unable to contact wb's homepage.<br>
</li><li>Added new language terms to be translated for newly added functions</li></ul>

beta 3a<br>
<br>
<ul><li>Completed support for multiple servers when downloading<br>
</li><li>Fixed bug wich didn't terminated the download process when user closed the application - giving sucessive error boxes per each failed download<br>
</li><li>Added keyboard navigation on the project treeview on the Paths tab</li></ul>

beta 4<br>
<br>
<ul><li>Box to select download profile no longer requires re-downloading webserver lists to re-order new selection<br>
</li><li>Removed the butttons that restore a value with predefined settings on the paths tab<br>
</li><li>Added a small project description on the same box where projects are presented on the paths tab<br>
</li><li>Removed the "Save interface" button from script interface - re-added the edit button with a new icon.<br>
</li><li>Added an "Options" tab on the download center<br>
</li><li>Moved web server box into Options tab inside the download center<br>
</li><li>Added proxy support for download center<br>
</li><li>Replaced the edit box for inputing a source folder with a combo box - now it is possible to select a source from a list.<br>
</li><li>Added a new download level called "Beta" - this allows for scripts to be uploaded and only selected automatically if user wishes to use beta scripts.<br>
</li><li>Added a warning box when user first selects the Beta download level<br>
</li><li>Added the option to upload scripts to <a href='http://beta.boot-land.net'>http://beta.boot-land.net</a> whenever no webserver is available - used as generic upload place for beta testings.</li></ul>

beta 5<br>
<br>
<ul><li>Download Level box will remember the last selected level<br>
</li><li>Each web server will have the title of the web path if no title is available<br>
</li><li>Support for Proxy SOCKS was added<br>
</li><li>Modified word !#1486 from "Download Type" to "Profile"<br>
</li><li>Removed words !#1216 (Projects), !#1217 (Target), !#1218 (ISO) to keep them as fixed values on all languages (They represent common folders)<br>
</li><li>Added FindClose on each function which used FindFirst to avoid open handle issues noticed when using the backup tab and some file search routines.<br>
</li><li>Fixed bug which prevented to download last placed webservers if there was not selected script on the first webserver</li></ul>

beta 6<br>
<br>
<ul><li>Added mobileos.boot-land.net<br>
</li><li>Readded refreshing code to make interface display correctly objects<br>
</li><li>Fixed bug which made Add object window stay behind main form, also fixed the attachements add files wizard.<br>
</li><li>Copy & Paste from source code editor will remember the last copy operation before adding a new command</li></ul>

beta 7<br>
<br>
<ul><li>Fixed small bug which didn't added paths with spaces on source folders when using the Source wizard.<br>
</li><li>Boxes to add description on folders are a bit bigger<br>
</li><li>When writing folder.project files, a download_level=0 is also added to ensure the file is downloaded by default on the download center</li></ul>

<h2><code>[068]</code> (2007-01-30)</h2>

<ul><li>Renamed Download Center to Updates Center to add the upload service<br>
</li><li>Modified the links menu on the options tab to include a link to VistaPE and Winimize<br>
</li><li>Corrected the ExtractAndRun template from the right-click menu on the source editor<br>
</li><li>Clicking on folders from treeview will display sub folders and files inside it<br>
</li><li>Added an ftp client on the tool box<br>
</li><li>Filecopy command will create a new directory if the target dir doesn't exist already</li></ul>

beta 2<br>
<br>
<ul><li>Pressing enter when typing the web server adress on the options tab will act as pressing the save button<br>
</li><li>Download method rewritten and improved - now it won't seem to be hanged when moving the window around<br>
</li><li>Removed the "Open" button since it wasn't very used - now wb will look on inside the first folder on the projects folder for script.project and add them as projects automatically<br>
</li><li>Section <code>[projects]</code> inside winbuilder.ini has become obsolete</li></ul>

beta 3<br>
<br>
<ul><li>"Create new updates.ini" tab was renamed to "Upload Config", allowing to create updates.ini/index.html files and add needed values for uploading scripts using the file tranfer protocol<br>
</li><li>A few more bugfixes on the download method, safer behavior.<br>
</li><li>In the middle of the download process it is already possible to close the application, aborting safely the download.<br>
</li><li>updates.ini and index.html are completely independent from fixed web paths using using relative web links - meaning that it can be placed/moved to anywhere as long as the project/script found on subfolders are moved as well.<br>
</li><li>updates.ini and index.html are now created and placed inside the projects folder - making it easier to just drap and drop everything on the new web location<br>
</li><li>it is possible to preview how index.html will look when uploaded - just open/doubleclick it from disk to see the result<br>
</li><li>Added WinBuilder's License Agreement inside WinBuilder.exe and a button to view it on the Options tab - no more extra files needed to distribute, wb can now be distributed as standalone exe.<br>
</li><li>Backup tool - create button will warn whenever the projects folder is not removed as specified by the option to remove this folder after creating a backup<br>
</li><li>Removed the right-click option to remove projects from the main window<br>
</li><li>When pressing the Play button without selecting a valid source - the Source path edit box will flash a few times as a reminder of the need to input a value<br>
</li><li>Added right-click option on the main window to upload scripts straight into the web server.</li></ul>

beta 4<br>
<br>
<ul><li>Moved the web path box to the update center<br>
</li><li>Added files remaining to download while downloading<br>
</li><li>Source folder input box will "flash" a few times if source is empty and user presses "Play"</li></ul>

beta 5<br>
<br>
<ul><li>Added support for multiple servers and predefined server list when no updates.ini is available<br>
</li><li>Added option to skip the FTP upload test when typing new ftp locations<br>
</li><li>Improved significantly the readbility of index.html using CSS  - Also reduced overall code size<br>
</li><li>Added support for automatically creating new webservers along with upload<br>
</li><li>Added new button on the interface to quickly upload script</li></ul>

beta 6<br>
<br>
<ul><li>Small bugfix on the webservers available when no updates.ini was available</li></ul>

beta 7<br>
<br>
<ul><li>File sorting is no longer dependable on NTFS, meaning that it is compatible with other compatible file systems like fat32<br>
</li><li>Fixed a bug that prevented files (not scripts) to be downloaded<br>
</li><li>Added the quantity of downloaded bytes while downloading files<br>
</li><li>Fixed the progress bar that follows the download of the current file<br>
</li><li>Added a small animated image on the download center<br>
</li><li>Added "IniMerge" INI command to merge the differences from one inifile into another, syntax: IniMerge,"UpdatedIniFile","InifileToUpdate"<br>
</li><li>Main window position has been changed to default windows position</li></ul>

beta 8<br>
<br>
<ul><li>Added a web browser based on IE engine<br>
</li><li>Created a wb homepage on boot.land.net with contents to help new users<br>
</li><li>Modified behavior to start the web tab instead of the download tab when no scripts are found<br>
</li><li>Modified FileCopy/DirCopy to ensure that the target dir is created if not already existent<br>
</li><li>Started implementing an external page for members to login and quickly view new topics/replies amongst other posting on boot-land.net - good to make it easier to keep up to date with news.<br>
</li><li>Added support for %projectDir% and %script%</li></ul>

beta 9<br>
<br>
<ul><li>Added a "nudge" when user presses "Play" with an empty source dir.<br>
</li><li>Added option to choose if log.html was opened by browser after being created<br>
</li><li>Modified icon for Download Center<br>
</li><li>Added wbChat - a small tool to chat around with other wb users<br>
</li><li>Modified Play, Tools and Refresh button from main window<br>
</li><li>Added "Stop" button on web browser<br>
</li><li>Modified FIleCopy to ensure that only a folder name is provided as target path</li></ul>

beta 10<br>
<br>
<ul><li>Added support for Enter key inside web browser, theme style and automatic form filling.<br>
</li><li>Added display of author name while downloading<br>
</li><li>Added safety check wthen downloading files from the download center - first it's downloaded to extension .web then it is renamed as original file if passes MD5 integrity check<br>
</li><li>Improved the safety check when trying to upload a single script without valid configuration or not connected to the ftp account<br>
</li><li>Added the individual file upload progress bar when uploading a new web server<br>
</li><li>Removed the previously added wbChat from beta 9 - wb's homepage chat is a good replacement for the moment<br>
</li><li>Added "Stop" button for individual file uploads, also fixed the respective progress bar<br>
</li><li>Added the option to remember last position of the main window - this option will be ignore if no winbuilder.ini file is found (to keep the root folder clean)</li></ul>

beta 11<br>
<br>
<ul><li>Added safety ping check to homepage adress to handle situations when wb is not online<br>
</li><li>Added the same safety check to the download center<br>
</li><li>Added a "Source Wizard" - safety check and validation that ensures that specific files are found inside the source before continuing the project build.<br>
</li><li>Moved the Options tab to the tools section<br>
</li><li>Moved the Paths to the last tab position</li></ul>

beta 12<br>
<br>
<ul><li>Tool section button can show/hide respective tools tab<br>
</li><li>Added an icon next to the source description on the source wizard<br>
</li><li>Modified progress tab - added the name of the script author and a few small UI changes<br>
</li><li>Modified error icon displayed on logs to a red X to make them easily identifiable<br>
</li><li>Added UI language support - an editor was also placed on the tools tab and will write text files to projects\tools\languages</li></ul>

beta 13<br>
<br>
<ul><li>Added more support to allow internal program messages to also be translated<br>
</li><li>Fixed bug that forced lower case on variables like %projectdir% (should also fix the ftp folder create in lower cases)<br>
</li><li>Modified the "simple" function to find files to support vista and ignore system and hidden files wich are protected.<br>
</li><li>Added spaces on some labels to ensure that they are displayed correctly under vista<br>
</li><li>Reverted the load hive procedures to use a shell wrapper around reg.exe - to ensure that hives are loaded correctly under vista with administrative permissions<br>
</li><li>Added vistape.boot-land.net/project to the list of available servers<br>
</li><li>Fixed the ping command, the previous method was not working under some conditions<br>
</li><li>Merged FTP client tab with the upload tab, creating a set of 3 tabs to allow using common definitions when uploading files<br>
</li><li>Modified fonts to support other languages<br>
</li><li>Increased the size of tab titles to make them more easier to navigate<br>
</li><li>Fixed the blank tab on the web tab when first acessing the page (delay was cause by a ping to the host to see if it is available before navigating)</li></ul>

beta 14<br>
<br>
<ul><li>Fixed bug on right-click source code menu - selecting DirMove would place a DirCopy command<br>
</li><li>Further improvements on the FTP section<br>
</li><li>Some more UI language bugs fixed<br>
</li><li>Modified FTP section - the only place to set user settings is on the respective settings tab - all FTP connections share the same settings (individual script upload, ftp client, new webserver tab)<br>
</li><li>Fixed a bug wich prevented script.project files of displaying the correct version, author, contact and credits<br>
</li><li>Credits box won't accept enter key to prevent unwanted end of line.<br>
</li><li>Removed entry !#1274 from language list<br>
</li><li>Fixed a language bug on setvar<br>
</li><li>Fixed a bug when pressing the right-click button on the main window<br>
</li><li>Fixed language tool tip bug on script editor - instead of show "Remove logo" displayed "Visit this page" ;)<br>
</li><li>Added a \ on the path when uploading single scripts<br>
</li><li>Removed the right-click option to upload a script to avoid conflicts with the option available from the script interface.<br>
</li><li>Fixed a bug wich kept the upload progress bar on the script interface visible when the upload was aborted by errors<br>
</li><li>Users can now download files from the download center, use the web tab and then return to the download center withouth reseting the connection</li></ul>

beta 15<br>
<br>
<ul><li>When a user saves ftp settings with an empty path - the program will add at least the root folder as start location ( / )<br>
</li><li>IniRead has been modified - If an INI key is not found on a file then it will output an empty variable instead of an error message<br>
</li><li>Fixed the function to upload and create web servers - two errors debugged, first was the lack on correct details when logging in, the second was time-out too short (wasn't working on slow dial up modems)<br>
</li><li>Bug fixed the extra \ that appeared on section name when uploading individual scripts, causing them to not be displayed as available on the download center</li></ul>

<h2><code>[067]</code> (2007-01-28)</h2>

<ul><li>Fixed a bug on Exec command wich outputed wrong result messages.<br>
</li><li>Added the hability to run section <code>[process]</code> inside the project file (script.project)<br>
</li><li>Corrected the System,RefreshInterface message to: "System - Refreshing interface after finishing processing"<br>
</li><li>Wizard window for encoding files was not centered when using desktop with two displays - Fixed<br>
</li><li>SetVars now support automatic update of all variables with new value<br>
</li><li>Encoding tab presents filesizes in Kb and Mb (files inside scripts need to be re-encoded to reflect these changes)<br>
</li><li>Links in the support tab have been updated<br>
</li><li>Added quick-close, whenever the Escape key is pressed on the main window will quickly exit the program.<br>
</li><li>Added a backup tool to make safe copies of Projects, Archive, Tools and ISO folders<br>
</li><li>Added right-click menu options for expanding and colapsing sub-items on main window.<br>
</li><li>Added a download tool for browsing files available on servers.<br>
</li><li>Fixed a typo on webget wich made the secondary progress get invisible instead of showing the download progressing<br>
</li><li>Corrected some GUI elements<br>
</li><li>Download tool can now browse subfolders<br>
</li><li>Changed designation of encoded files to attachments<br>
</li><li>OVerall GUI changes in icons, logo, button position on Attachments tab.<br>
</li><li>Added a button on description tab to visit website link<br>
</li><li>Fixed the script and link filtering wich prevented the scripts to be mixed along with linked scripts on normal view<br>
</li><li>Different icons added for either scripts or links.<br>
</li><li>Regwrite now supports the creation of single keys with no data<br>
</li><li>Removed the option to update winbuilder.exe because it was obsolete.<br>
</li><li>Removed the option to update individual scripts until a new handling method is added.<br>
</li><li>overall logical speed optimization in .script engine<br>
</li><li>Cabexpand is using cabinet.dll to extract files instead of wrapper to expand.exe (faster)<br>
</li><li>program's process priority is changed to HIGH when processing scripts, the same applies to child process launched by shellexecute.<br>
</li><li>webget and webgetIfnotExist support MD5 checksum check to ensure 100% correct downloads<br>
</li><li>Added command "regimport" to allow importing a .reg file straight into the local registry<br>
</li><li>bugfixed the internal inf2script tool to correctly add "" on each converted value on registry keys of type 0x3 and 0x7<br>
</li><li>DirMove has also been improved to allow moving files and folders silently - allowing to use <code>*.*</code> to only move files and subdirectories from a folder<br>
</li><li>Echo command was also bug - fixed - was not translating variables<br>
</li><li>Clicking to disable or enable a folder will also reflect this value on all scripts inside<br>
</li><li>Added a new tab named "Tools" where "Backup", "Create new script" and "Create updates.ini" tools where placed<br>
</li><li>Added webupdate, allowing users to view and download the latest scripts and projects<br>
</li><li>Added a new command to refresh the variable list as an option of the system command - available on right-click menu on source code<br>
</li><li>Projects no longer accept empty %sourcedirs% - displaying a message box for users to select a valid source folder<br>
</li><li>Tools were moved to a sub-folder of archives to take advantage of webupdates, %tools% variable was also updated to reflect changes<br>
</li><li>Replace the individual script update button with the option to run the selected script<br>
</li><li>Added a global webserver edit option for using updates from alternative webservers<br>
</li><li>Cabexpand was reverted back to the previous expand.exe wrapper until a more stable code can be used instead.<br>
</li><li>bugfixed webdownload - was not decoding filenames properly and wouldn't download filenames with spaces<br>
</li><li>when winbuilder.exe is started for the first time without any project available will jump straight to the download center tab<br>
</li><li>bugfixed regwrite - wasn't supporting empty 0x1 entries wich created registry section keys<br>
</li><li>bugfixed regwrite - 0x3 keys were also not being correctly handled<br>
</li><li>bugfixed open handles when looking for files - no more locked directories<br>
</li><li>Methods for searching, filtering and categorizing files were improved - program starts significantly faster<br>
</li><li>Disabled the old method of sorting scripts under the options menu to avoid conflicts with new method<br>
</li><li>Refresh button will also reset the script window, whenever possible it will also try to re-select the previously selected script<br>
</li><li>Edited the description on the Paths tab to warn first time users that each project holds independent values<br>
</li><li>Re-added dependencies with the difference that now it is needed to add the path to the needed files or scripts - please use %basedir% to avoid to fixed paths (check explorer.script as an example)<br>
</li><li>Added the option to add scripts wich are incompatible when one script is selected (example: ramdisk vs fbwf), also valid to any sort of file if found.<br>
</li><li>Created a new section in tools where it is possible to convert files into native .script language, removing the respective buttons inside the source editor. BartPE plugin conversion is still incompleted - it's preferable to use external tool to retrieve accurate translations in the meanwhile.<br>
</li><li>bugfix on filesearch - search is not case sensitive anymore<br>
</li><li>Removed the Archive folder and moved all static references to the Projects folder<br>
</li><li>when clicking on folder, paths tab is now updated with directory values from respective project<br>
</li><li>Fixed error wich caused "abstract error" when trying to use interface buttons<br>
</li><li>Fixed error wich caused "Read error" when trying to use the "System,reScanScripts" command - occured when pressing button "Restore Options" on myOptions script from NativeEx<br>
</li><li>Derivated from the above fix, a command line parameter was added to allow select a script from startup, syntax: winbuilder.exe restore level gender "ProjectFilename" "ScriptFilename"<br>
</li><li>.project files are treated as .script on download center<br>
</li><li>Read feedback button was fixed<br>
</li><li>Added progress bar to track the overall progress of the download process<br>
</li><li>folders wich contain script.project files will use these files as description - usefull for describing projects just by clicking on the respective folder<br>
</li><li>when a script on local host has a bigger version than the one available to download from the web server - it's not marked for update.<br>
</li><li>Added support for using localhost even when not connected to the internet (or any network connection at all) - and use a download server from a local http server (localhost) - great to speed download testings, e.g.: <a href='http://localhost/winbuilder'>http://localhost/winbuilder</a>
</li><li>Added a button to stop the download process<br>
</li><li>When running a single script - script.project variables are also loaded<br>
</li><li>Readded command "ShellExecuteEx" - similar to ShellExecute, but will launch the the program and continue to run the script<br>
</li><li>Fixed a bug that prevented the last file available on updates.ini to be downloaded<br>
</li><li>when typing a new download server bug occured under some circunstances - the autosave was replaced by a button next to the text box to avoid any issues<br>
</li><li>Fixed Open Handles that locked folders which occured creating a new updates.ini from the tools tab<br>
</li><li>Added filesize on .script .project on updates.ini description<br>
</li><li>Added a text label indicating the number of selected files and respective size in the download center<br>
</li><li>Removed list of processed sections in log.html<br>
</li><li>log.html was redesigned from scratch, using tables, colors and graphics to make it more readable<br>
</li><li>Removed splascscreen to make startup faster and reduce overall size of exe file<br>
</li><li>when the user tries to start a project with an empty source dir - a message box will ask for the user to input a source folder - now it will also open the Paths tab<br>
</li><li>Removed hard links from updates.ini - now all script downloads are based on the web path to updates.ini, meaning that it is now possible to move all files including updates.ini to another folder and keep downloading it.<br>
</li><li>Added some code to automatically generate an index.html file based on updates.ini - usefull to also upload to the folder and allow an easier navigation, also created with updates.ini from the tools box<br>
</li><li>Added the option to select negative levels for scripts - this keeps them hidden from the main window</li></ul>

<h2><code>[052]</code> (2006-10-07)</h2>

beta 1<br>
<br>
<ul><li>Corrected the text label "Stop" on the progress window<br>
</li><li>Removed a TScrollbox component from the main window - less flickering and faster interface GUI loading<br>
</li><li>Corrected the image on the "Open" button on the main window - image didn't look good on windows classic theme<br>
</li><li>Added Logo Image support for JPG, GIF, ICO, WMF and EMF files. Animated and transparent GIF's can be used.<br>
</li><li>New mode of browsing scripts has been added<br>
</li><li>Script explorer is now working with autoexpand feature. (much easier to navigate through scripts)<br>
</li><li>Support for bmp images</li></ul>

beta 2<br>
<br>
<ul><li>Fixed the Script Reload button on the source code editor<br>
</li><li>Removed auto-load script from disk whenever editing the script in the source code editor<br>
</li><li>Changed default script (de)selected icon<br>
</li><li>Added option to select script brownsing mode</li></ul>

beta 3<br>
<br>
<ul><li>RegRead has been corrected - now %vars% are working as supposed<br>
</li><li>StrFormat now supports the options "path", "filename", "ext" and "hex" (check menu on source code edit window to see syntax examples)<br>
</li><li>Progress window had a few cosmetic changes, new stop icon, frame titles in bold<br>
</li><li>A new license mode is available inside scripts - allow users to accept a license before using a determined software.</li></ul>

beta 4<br>
<br>
<ul><li>Fixed interface bug wich prevented from saving interface options<br>
</li><li>Interface drawing is done faster (bug when maximizing makes a few labels disapear temporarily)<br>
</li><li>Added "Open with.." button on encoded folder tab<br>
</li><li>Added option for registering filetypes on startup<br>
</li><li>Removed line numbers from log.html</li></ul>

beta 5<br>
<br>
<ul><li>Fixed the new script tool - now converts %BaseDir% without issues<br>
</li><li>Added quotes on echo statements derivated from the bartPE plugin convert tool - should avoid hangs<br>
</li><li>Added safety checks when switching scripts (to avoid interface overwrites as noticed by smiley)</li></ul>

beta 6<br>
<br>
<ul><li>title bar displays full version information<br>
</li><li>text file component on interface supports rich text format (<code>*</code>.rtf), allowing to use text colors and formatting<br>
</li><li>images in interface are supporting more formats (<code>*</code>.jpg;animated .gif;<code>*</code>.bmp;<code>*</code>.ico;<code>*</code>.emf;<code>*</code>.wmf)<br>
</li><li>buttons support custom images (<code>*</code>.bmp)<br>
</li><li>Some redundant code removed, UPX'ed winbuilder.exe has reduced 140kb from 780Kb to 640Kb<br>
</li><li>Main window can be resized without text labels on interface disapear<br>
</li><li>Process window no longer appears when processing a section called from a interface button</li></ul>

beta 7<br>
<br>
<ul><li>Scripts without <code>[interface]</code> section won't output an error<br>
</li><li>Added If,NoLicense option to handle cases where the user license is not accepted<br>
</li><li>Added "Halt" command to terminate the current process. syntax: "Halt,message"<br>
</li><li>Process window resets all values after processing - will give a "cleaner" look when processing again on startup<br>
</li><li>Updated UPX to version 2.02<br>
</li><li>Not updated AutoIt to v3.2.0.1 - autoIt.exe weights +400Kb while previous version is 122Kb, added autoIt help file for license support<br>
</li><li>FileCreateBlank will no longer overwrite an inexistent file - will output an error and continue processing</li></ul>

beta 8<br>
<br>
<ul><li>Improved refresh repaint on interface - labels won't disapear when selecting another tab (still needs some fixing)<br>
</li><li>Filebox was only allowing to select images instead of wildcards (<b>.</b>)<br>
</li><li>FileCreateBlank will behave as build 051 (erase existent file and then create a blank file)<br>
</li><li>CAB expand command (wrapper to expand.exe) fully supports non-ascii characters<br>
</li><li>IniWriteTextLine will write correctly lines on sections, always adding on the first line<br>
</li><li>External script editor button has been disabled<br>
</li><li>"Apply same path to all projects" option has also been disabled</li></ul>

beta 9<br>
<br>
<ul><li>Added option to auto expand items on navigation window<br>
</li><li>Fixed error when enabling .script files in advanced view mode<br>
</li><li>Fixed a bug wich prevented projects from reading their descriptions</li></ul>

beta 10<br>
<br>
<ul><li>Script checkboxes will wordwrap on their titles<br>
</li><li>Charset has been changed to default wich allows the use of different codepages<br>
</li><li>Checkboxes can process sections whenever they are clicked.</li></ul>

beta 11<br>
<br>
<ul><li>when running (double-click) encoded files from WB the main application won't freeze as in previous versions.</li></ul>

<h2><code>[051]</code> (2006-09-22)</h2>

beta 1<br>
<ul><li>Fixed the IF command option that checked if an Ini file section existed or not.<br>
</li><li>Disabled popup after pressing the save script button<br>
</li><li>Increased the editing window on the source code editor tab<br>
</li><li>Added the option to use an external editor on the source code editor<br>
</li><li>Added Call - a command similar to RUN, executing a script using the script variables (including interface vars)<br>
</li><li>Fixed bug in bart plugin convert tool - comments and empty lines are now supported</li></ul>

beta 2<br>
<ul><li>Stop button no longer freezes whenever shellexecute command halts, terminating the launched application<br>
</li><li>beta "Call" command was renamed to "Exec"<br>
</li><li>Added a menu for creating new script files.<br>
</li><li>Added "Options" tab.<br>
</li><li>Added option to disable splash screen<br>
</li><li>Winbuilder will no longer crash whenever WinBuilder.ini is not found, and will use default values</li></ul>

beta 3<br>
<ul><li>Added dependencies on script files (much improved on beta 4)</li></ul>

beta 4<br>
<ul><li>Added dependencies on script files<br>
</li><li>Added command "encode" wich can be used to encode files inside script or text files (supports wildcards)<br>
</li><li>Added command "system" wich allows specific actions outside the script engine - like the hability to refresh the script interface or rescanning all scripts again<br>
</li><li>FileCreateBlank will now create new directories and a new file if none exist (and if the path is not read-only)<br>
</li><li>HTML Log as been improved to add more details in builds like version, %basedir% value and a few more system messages<br>
</li><li>Corrected "View Last log" button<br>
</li><li>Rearranged a few GUI elements on the progress tab<br>
</li><li>Added checkbox to use the same source directory for all available projects<br>
</li><li>Added hint for images in script interface saying "Click on image to view in full size"<br>
</li><li>Added keyboard support for navigation on the script window. Space=disable/enable, Enter=Run project, Up/Down=change script<br>
</li><li>Added keyboard support for navigation on the log window. Up/Down=browse log messages<br>
</li><li>Form resizing was disabled to avoid GUI problems under 120dpi</li></ul>

<h2><code>[050]</code> (2006-08-21)</h2>

<ul><li>Generated log.txt files now support a results filter to ease diagnostics<br>
</li><li>Log files are generated in html format<br>
</li><li>Splash screens and quotes were replace by single logo designed by TheHive<br>
</li><li>When pressing the update button on a project it will search and update all scripts within<br>
</li><li>Added multiply and division operators to StrFormat<br>
</li><li>Section <code>[Variables]</code> inside winbuilder.ini will be applied as variables for all projects.<br>
</li><li>Overall component drawing speed was improved</li></ul>

<h2><code>[049]</code> (2006-08-17)</h2>

<ul><li>Fixed a few invalid entries on the right-click menu on the source editor<br>
</li><li>Changed the default process level when file blank from 3 to 4<br>
</li><li>Added MD5click to ensure the integrity of downloaded files<br>
</li><li>Added net update support for .link files<br>
</li><li>Added AddVariables - a command that allows to load variables from a section in an ini file<br>
</li><li>Added special character #$p - that will be decoded to % (usefull to use in batch commands)<br>
</li><li>Section <code>[Variables]</code> on script.project files now holds global variables that will extend to each script<br>
</li><li>Added a global routine to handle exception errors (still needs to be improved)<br>
</li><li>Added a secondary progress bar on the progress window to follow the execution of sub scripts when using the Run command<br>
</li><li>Removed some unneeded components making the application lighter<br>
</li><li>Increased the size of the code edit window text font - now it's on standard size<br>
</li><li>Added parameters to the RUN command, they are available as #1, #2, #3, #4<br>
</li><li>SetVars has been improved<br>
</li><li>Improved the rigth click menu on the source code editor<br>
</li><li>The currently edited script interface is saved whenever someone tries to run it.<br>
</li><li>ScrollBox can be resized to smaller sizes</li></ul>

<h1>OpenBuilder Releases</h1>

<h2><code>[048]</code> (2006-07-27)</h2>

<ul><li>Fixed misplaced image when processing scripts in maximized mode<br>
</li><li>Processing image is now rescaled and proportional to fit a smaller frame<br>
</li><li>Fixed plugin support: the registry hives were not being loaded as supposed<br>
</li><li>Exchanged the position of sources tab with options tab in the script windows<br>
</li><li>Fixed ExtractAllFilesIfNotExist, it wasn't working.<br>
</li><li>Interface web links are using Verdana as the default font<br>
</li><li>processing sections from interface buttons will no longer push automatically the view for the log window<br>
</li><li>Added %username% to reflect the current name of the user logged in<br>
</li><li>Added %userprofile% where all files and settings from the current user are located<br>
</li><li>Added %tag% on the right click menu on source editor<br>
</li><li>Added %day% %month% %year% to support date handling<br>
</li><li>New interface component: FileBox, wich allows to select a file<br>
</li><li>Exit command will only force exit from current script and will continue to process other scripts<br>
</li><li>Added %version% to display the version of openbuilder<br>
</li><li>Added a new interface component: Filebox, wich allows to select files or folders from the interface.<br>
</li><li>Fixed right-click menu options "Uncheck selected" and "Check selected" they weren't working properly<br>
</li><li>Added new command StrFormat, with four functions: date - to format a string into a date, and bytes - to convert a value in bytes to easier to understand values like Kb, Mb, Gb.., inc and dec to respectively increase or decrease the value of a variable<br>
</li><li>Fixed a problem when trying to change the process level on links<br>
</li><li>OpenBuilder window no longer freezes whenever it's running scripts</li></ul>

<h2><code>[047]</code> (2006-07-18)</h2>

<ul><li>Removed the wiki folder, since this feature is now hosted online ( <a href='http://www.boot-land.net/wiki'>http://www.boot-land.net/wiki</a> )<br>
</li><li>Fixed a bug that caused the application to crash when wiki folder was not found<br>
</li><li>Created an Archive folder to store common scripts<br>
</li><li>Added the .link file feature, wich allows to use text files with extension .link that point to the real script file - a good way to avoid double files, and all changes made on a link file will immediately be reflected on the linked file itself - except for the status of enable/disabled switch, that allowing to have several different profiles using the same script.<br>
It will preferably use %basedir%\Archive folder to avoid static path problems.<br>
</li><li>Images in description are no longer automatically streched or proportional - causing images to be more vivid and look better<br>
</li><li>Added an Archive project - not meant to be used as project, but rather as a resource to edit available scripts inside it.<br>
</li><li>Added an option to erase the target folder (placed in the makedirs script) as suggested by Olri<br>
</li><li>Added the hive, explorer and ramdisk scripts sent by Ovi<br>
</li><li>Added projectInfo script by psc<br>
</li><li>Fixed the result output on IniDeleteSection<br>
</li><li>Right-click option on retrieve command was not working for the file and dir options - Fixed<br>
</li><li>Added the update service for scripts (server by default is <a href='http://www.boot-land.net/updates'>http://www.boot-land.net/updates</a>)<br>
</li><li>Added a new tab on the script windows, called "Options"<br>
</li><li>Added an option to use custom update servers for specific scripts<br>
</li><li>Added MD5 digital signature checks - stronger algorithims will probably be implemented soon.<br>
</li><li>Updates can choose to wether or not include MD5 protection (recommended to ensure reliable downloads)</li></ul>

<h2><code>[046]</code> (2006-07-15)</h2>

<ul><li>Replaced old icon and logo by new ones designed by TheHive (thanks!!)<br>
</li><li>Corrected all links to point back to the new forums location<br>
</li><li>Corrected the location for updates on openbuilder.ini file</li></ul>

<h2><code>[045]</code> (2006-07-11)</h2>

<ul><li>Added %tag% - a random variable number from 0 to 99999<br>
</li><li>Fixed a bug regarding the message command<br>
</li><li>Plugin support - replaced \" by " on filecopy commands<br>
</li><li>Plugin support  - Added the missing quotes<br>
</li><li>Copy and Expand script has been rewritten by psc using new method (available on develop folder)<br>
</li><li>Explorer and Ramdisk script by Ovidiu are also available on the develop folder<br>
</li><li>New command: retrieve,file,target,%var%  - opens a dialog box to select a file based on target<br>
</li><li>New command: retrieve,dir,target,%var%  - opens a dialog box to select a dir based on target<br>
</li><li>Load and Unload hive no longer requires reg.exe, openbuilder <b>should</b> be<br>
able to run from win2000 and above, I hope it fixes DirkGently42 issue,but it's<br>
still missing to add native support for importing .reg files into registry - this might pose a problem.<br>
I intend to add full .reg support soon, but REG.exe is still used to provide<br>
this feature on the hives script.<br>
</li><li>Replaced tool 7za.exe by 7z.exe (provides .cab support and is sized in 52Kb)</li></ul>

<h2><code>[044]</code> (2006-07-08)</h2>

<ul><li>Added more lines to the starting quotes<br>
</li><li>Added a 2 second delay before showing the main window<br>
</li><li>Corrected the standard and nanoXP copy and expand scripts<br>
</li><li>Corrected the hives script interface<br>
</li><li>Added a license for openbuilder.exe<br>
</li><li>Removed comctrl32 from the UPX script (thanks for noticing psc..)<br>
</li><li>Fixed a bug when switching throught scripts with locked edit mode<br>
</li><li>Reordered the scripts to keep distinct actions more separated<br>
</li><li>Corrected the check for using a proper source path on each project.<br>
</li><li>Added routines to handle mouclass.sys issue<br>
</li><li>nanoXP can now support win2003 (ISO bigger but works) - thanks again psc</li></ul>

<h2><code>[043]</code> (2006-07-04)</h2>

<ul><li>Updated UPX to version 2.01<br>
</li><li>Some minor GUI improvements<br>
</li><li>Renamed scripts on the standard boot folder<br>
</li><li>Added the nanoXP project<br>
</li><li>Added 10 priority levels<br>
</li><li>Added the wiki method<br>
</li><li>Updated icons on the New script window<br>
</li><li>Added some of the wiki content<br>
</li><li>Fixed progress window (description in maximized mode)<br>
</li><li>Fixed Source Edit - mouse was always on edit selected mode<br>
</li><li>Changed order in paths and log tab<br>
</li><li>Press save button and return to source editor was fixed<br>
</li><li>Added a message box when pressed the save button on the source editor<br>
</li><li>Added licenses for most of the external software included in the distribution<br>
still missing to add some licenses.<br>
</li><li>Fixed the description issue on multiple projects (it wasn't handled properly)<br>
</li><li>Added an image related to the processed script when it's being executed<br>
</li><li>Downgraded qemu back to 0.8.0 for compatibility reasons<br>
</li><li>Hidden the new script wizard - will be completely rewritten in future builds<br>
</li><li>Remove the added line when inserting commands from the rigth click menu<br>
</li><li>Hidden the %pedrive% menu until it is implemented properly<br>
</li><li>Added FileByteExtract - a command that will search for a byte signature on files and extract a byte portion to another files when found<br>
</li><li>Readded the RAMBoot script to allow win2003 builds run in RAM<br>
</li><li>Fixed the file list window on encoded file's window<br>
</li><li>Added a message when trying to switch from edit mode to user interface without unlocking first.<br>
</li><li>Added an english software reg file (to replace portuguese version)<br>
</li><li>Updated extensions.rc file in xoblite to avoid the "check for updates" dialog box</li></ul>

<h2><code>[042]</code> (2006-06-26)</h2>

<ul><li>Added the option to (de)select all files within a project to the right-click menu<br>
</li><li>Some minor GUI fixes<br>
</li><li>Added 7Za.exe to the tools folder<br>
</li><li>Updated QEMU to version 0.8.1<br>
</li><li>UPX'ed qemu dll's and qemu.exe to save disk space<br>
</li><li>Removed txtsetup.sif from the hives script (not necessary anymore)<br>
</li><li>Added a script description window on the progress tab<br>
</li><li>Fixed the net update function<br>
</li><li>Readded the auto-update function<br>
</li><li>Rearranged the visual elements on the paths box<br>
</li><li>Added the UPX script, wich will gain around 3Mb from compressing some system32 files<br>
</li><li>Script engine is more efficient - takes less time to process each command<br>
</li><li>Added the lines related to Hal<b>.</b> on txtsetup.sif to prevent BSOD on VMWAre and Virtual PC emulators<br>
</li><li>Added small text file for description on each folder to better explain their purpose<br>
</li><li>Fixed the process level selection box on the script description<br>
</li><li>FileCopy no longer requires an "\" on the end of the second parameter (dir) - it can be ommited</li></ul>

<h2><code>[041]</code> (2006-06-23)</h2>

<ul><li>Fixed some shortcuts on the source code editor wizard - some %variables% were not correctly linked<br>
</li><li>%PEdrive% variable was not being processed - Fixed<br>
</li><li>Rewrote some code on the standard scripts to use the <code>[%BaseDir%\Tools]</code> Folder<br>
</li><li>Added the ISO path creation - as sugested by psc<br>
</li><li>Added a %Tools% variable that refers to a <code>[%BaseDir%\Tools]</code> folder<br>
this is where most GNU tools will be placed in order to save space on multiple projects (avoid the need to double binaries)<br>
</li><li>Added support for multiple extraction of files on the encoded tab - still some more feature needing to be added in the future..<br>
</li><li>Added UPX 2.00 and expand (from ReactOS) to the tools dir<br>
</li><li>QEmu and mkisofs were also placed in the tools dir</li></ul>

<h2><code>[040]</code> (2006-06-22)</h2>

<ul><li>Added basic support for bartPE plugins<br>
</li><li>0x0 entries are ignored, at this point it can safely be used on simple plugins<br>
</li><li>Addline entries in plugins will be ignored. (next release will probably include them)<br>
</li><li>Added a convert Plugin to script syntax button on the source editor<br>
</li><li>Some GUI improvements<br>
</li><li>DirMake is now forcing to create dirs and subdirs if they don't exist<br>
</li><li>Changed the delay to the project switch in the navigation window<br>
</li><li>FileCopy has changed: No longer is needed to add the target filename - only the target dir is needed.<br>
<blockquote>Old syntax: <code>[FileCopy,c:\text.txt,%targetdir%\text.txt]</code> is now: <code>[FileCopy,c:\text.txt,%targetdir%\]</code>
This change was forced by the use of the win32 API native copy functions - to allow compatibility with plugins<br>
</blockquote></li><li>DirCopy is also using Win32API functions - this allows a much more stable behavior<br>
</li><li>Added %ISOfilename% - it will output only the filename of the ISO file<br>
</li><li>The source editor saves and loads the respective file each time it is used - to avoid manually save or load from disk<br>
</li><li>Added line count in the standard code edit window<br>
</li><li>Reduced the font size on the source editor to better view the commands<br>
</li><li>Fixed the window title wich kept repeating the build number<br>
</li><li>Fixed the bug that eliminated from the main window the last item on the list<br>
</li><li>Fixed the bug that kept writing the locked state of components on the file (only written when true)</li></ul>

<h2><code>[039]</code> (2006-06-18)</h2>

<ul><li>Removed ShellExecuteEx - it caused problems with the multithreading feature (yet to be added)<br>
</li><li>Removed the option to delete scripts from the main window.<br>
</li><li>Added the echo's back on the messages window - they now output all process progress<br>
</li><li>Added support for the AddLine and DelLine sections in bartPE plugins<br>
</li><li>GUI has been improved on the script progress window</li></ul>


<h2><code>[038]</code> (2006-06-18)</h2>

<ul><li>Fixed another bug on extractfile - it wasn't supporting paths with spaces<br>
</li><li>hidden the option to search for updates on start, it was a bit unstable as it would prevent the program from starting in case an error occured in the network connection</li></ul>

<h2><code>[037]</code> (2006-06-16)</h2>

<ul><li>Fixed extractfile - it wasn't working properly - syntax is: ExtractFile,%scriptfile%,folder,filename,folderToExtract<br>
</li><li>Added a separate script to handle txtsetup.sif<br>
</li><li>Corrected the right-click menu ScriptFile option wich should output %ScriptFile%<br>
</li><li>Fixed the extract command - it's working fine for single files<br>
</li><li>Corrected the right-click menu on the main window<br>
</li><li>Most scripts were revised and cleaned from unnecessary files</li></ul>


<h2><code>[036]</code> (2006-06-07)</h2>

<ul><li>Fixed some registry problems when writing keys<br>
</li><li>Fixed a fail when a project dir was listed but not found<br>
</li><li>polished some icons<br>
</li><li>Added the keyboard script to the standard distro<br>
</li><li>Fixed the refresh button (to properly search all scripts in folders)<br>
</li><li>Fixed the lock edit mode button in the source window