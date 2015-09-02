<h1> WinBuilder.ini </h1>

Certain aspects of WinBuilder's exe are stored or can be controlled using variables and values found in the WinBuilder.ini file.  These settings may appear in any order, but are grouped below based on their functionality. Unless otherwise noted, **ALL** settings are store in the `[MAIN]` section of the INI file.



## General Appearance / Information ##
|X| Stores the **_Left side_** coordinate used to create the WinBuilder window. It is updated when exiting WinBuilder|
|:|:-----------------------------------------------------------------------------------------------------------------|
|XX| Stores the **_Width_** used to create the WinBuilder window. It is updated when exiting WinBuilder               |
|Y| Stores the **_Top_** coordinates used to create the WinBuilder window. It is updated when exiting WinBuilder     |
|YY| Stores the **_Height_** used to create the WinBuilder window. It is updated when exiting WinBuilder              |
|SP| Sets the **_Width_** of the script tree pane inside the Main Window. It is updated when exiting WinBuilder       |
|InterfaceGrid| Sets the number of pixels used for the Grid inside the interface editor. Set this to **_0_** if no grid is desired|
|Last\_Project| Name of the **_last project_** used by WinBuilder. It is updated when exiting WinBuilder                         |
|Enable\_CodeBox| Set this to **_True_** to show the "CodeBox" option on the main window.  Can also be managed using the Advanced setting on the ["Tools"](wbtools#The_Tools_Tab.md) Tab|
|Enable\_RefreshButton| Set this to **_True_** to show the "Refresh" option on the main window.  Can also be managed using the Advanced setting on the ["Tools"](wbtools#The_Tools_Tab.md) Tab|
|Language| Language of the string translation file(%Tools%\Language\????.txt)   See also [Language Support](wbtools#Language_Support.md)|
|FileVersion| Contains the version of the WinBuilder.exe last used                                                             |
|RunExternal| **HAVE NO IDEA**                                                                                                 |

## Network Settings ##
The following are global network settings.
|DisableNetwork| If set to **_1_** will disable the network, which switches the download functionality generally off. When set to **_0_** or not supplied, the network is enabled|
|:-------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------|
|WebCheckDomain| Winbuilder will query this domain to determine if web access is available.                                                                                      |
|AskForDownload| Ask user before downloading any file requested by scripts via the **_WebGet_** or **_WebGetIfNotExist_** commands.                                              |
|UseTimeout    | If **_AskForDownload_** is specified continue with download after this timeout period.                                                                          |
|ValueTimeout  | Sets the **_Timeout_** value in seconds.                                                                                                                        |

The following settings are stored under the `[Proxy]` section. As the login information is encrypted you should only configure these setting from inside the winbuilder download center.
|useHTTPProxy|Use web proxy (True/False)|
|:-----------|:-------------------------|
|HTTPhost    |Host address for web proxy|
|HTTPport    |Port number of web proxy  |
|HTTPuser    |Encrypted User Name for web proxy|
|HTTPpwd     |Encrypted Password for web proxy|
|HTTPRFC2617 |Use Basic Authentication for web proxy (True/False)|
|useFTPProxy |Use FTP proxy (True/False)|
|FTPhost     |Host address for FTP proxy|
|FTPport     |Port number of FTP proxy  |
|FTPuser     |Encrypted User Name for FTP proxy|
|FTPpwd      |Encrypted Password for FTP proxy|
|FTPRFC2617  |Use Basic Authentication for FTP proxy (True/False)|
|DNS         |DNS Server                |
|PingType    |Ping Type (0=ICMP 1=HTTP - use if your firewall blocks ICMP)|

## Download Center ##
These settings control the web sites listed in the download center.  See [this page](wbtools#Download_Center.md) for more information, including how to use the included interface to manage the list of servers being used
|WebServer| A comma separated list of all the servers you may check for updates.|
|:--------|:--------------------------------------------------------------------|
|WebServer\_Selected| A list of the servers actually selected for download processing     |
The following are used to control download center preferences.
|Last\_Download\_Level| Last level used in download center (_0=minimum 1= recommended 2=complete 3=beta)_|
|DN       | Sets the **_Width_** of the script tree in Download Window          |
|Allow\_Beta| Allow use of the **_beta_** level download (i.e. level 3)           |
|AutoDownloadTree| Rebuild the download tree only when the user clicks on the green arrow (i.e. a value of **_True_** makes green arrow visible)|
|StopDownloadTree| Allows user to interupt a build of the download tree (i.e. a value of **_1_** makes the red stop square visible)|
|RenameCurrent| If set to **_True_**, WinBuilder will rename an existing (i.e. current) script file rather than overwrite it. If set to **_False_** (or not specified), WinBuilder will overwrite any existing script when downloading new content|

## General Behaviour ##
|ErrorStop| If set to **_True_**, WinBuilder will stop the build when an error occurs.|
|:--------|:--------------------------------------------------------------------------|
|ExtractWarn| During script processing, warn when extracting an attached file will overwrite an existing one|
|OneCore  | When WinBuilder runs on a multicore system, use only one core. Can also be managed using the Advanced setting on the ["Tools"](wbtools#The_Tools_Tab.md) Tab|
|ParameterCount| When processing, check script command parameter counts.                   |
|SourceIndenting| Indent source code for better readabilty                                  |
|!Autosave| Autosave edited interface / souce code (0=On 1=Off 2=Ask)                 |

## Register Extensions ##
|RegisterExtensionsWith| Register WinBuilder extentions (i.e. `*.script`) to an external editor.|
|:---------------------|:-----------------------------------------------------------------------|
|RegisterExtensionsDouble| Set the **_Double click_** syntax                                      |
|RegisterExtensionsRight| Set the **_Right click_** syntax                                       |

## Log File Options ##
|ForceWarning| Switches "Debug Log" on / off|
|:-----------|:-----------------------------|
|VerboseWarning| Shows more warnings in Debug Log|
|LastLog     | Path of active log.html      |
|LogAuto     | Show log after build, even if it is error-free|
|LogComment  | Show / suppress comments in source code|
|LogEnglish  | Generate English log file, independent of String translation language|
|LogOriginal | Add original script lines to log|
|LogStop     | Generate log.html when user clicked the blue "Stop" button|
|LogTimeStamp| Add time stamp to file name generated - otherwise, file is just named "log.html"|
|!noIconLog  | Put strings ( i.e. "`[Success]`" etc.) into logs rather than using pointers to icons|
|!noTimeOutput| Do not output time in log (This can make it easier to compare two different log files)|
|SyntaxWarn  | Produce a **_Warning_** on unresolved (misspelled) commands|
|ShowVariables| Add a list of variables to top of log - default is "True"|
|ViewLogInBrowser| Automatically show log in browser after generating log.html|

## Custom ##
These settings are stored in the `[Custom]` section of the .ini file and allow you to "Brand" Winbuilder for your project.
|Title|This text will be added to the Winbuilder title bar|
|:----|:--------------------------------------------------|
|Logo |Path to an image file (gif/jpg/bmp) that will be used in place of the Winbuilder logo on the main screen.|

## Syntax Highlighting ##
You can configure the syntax highlighting of winbuilders internal code editor to a user defined color theme. At this time only styles and colors may be changed. You can not define commands or categories to be highlighted.

You may configure the following properties:
  * Font Style (font: bold, italic, strike-through, underline)
  * Foreground (color of the text)
  * Background (color of the background)

### Formatting ###
Configuration is defined by a series of keywords seperated by the pipe `|` operator.

```
Foreground:<color>|Background:<color>|Style:<font style>
```

### Font Style ###
| **Value** | **Description** |
|:----------|:----------------|
|fsItalic   |Italics          |
|fsBold     |Bold             |
|fsUnderline|Underline        |
|fsStrikeOut|StrikeOut        |

You may specify multiple font styles by using a bracketed comma separated list.

```
Example: Style:[fsBold,fsItalic]
```

### Colors ###
Both Foreground and Background color can be configured using the following color table.

| **Value** | **Description** | | **Value** | **Description** |
|:----------|:----------------|:|:----------|:----------------|
|clAqua     |Aqua             | |clBlack    |Black            |
|clBlue     |Blue             | |clCream    |Cream            |
|clDkGray   |Dark Gray        | |clFuchsia  |Fuchsia          |
|clGray     |Gray             | |clGreen    |Green            |
|clLime     |Lime             | |clLtGray   |Light Gray       |
|clMaroon   |Maroon           | |clMedGray  |Medium Gray      |
|clMoneyGreen|Money Green      | |clNavy     |Navy             |
|clOlive    |Olive            | |clPurple   |Purple           |
|clRed      |Red              | |clSilver   |Silver           |
|clSkyBlue  |Sky Blue         | |clTeal     |Teal             |
|clWhite    |White            | |clYellow   |Yellow           |

**Example 1** - Only Define Foreground Color:
```
Foreground:clMaroon
```
**Example 2** - Define both Foreground and Background color:
```
Foreground:clMaroon|Background:clGray
```

### Syntax Groups ###
Syntax highlighting is separated into groups, with each group having its own style. The following groups are defined internally by winbuilder. Currently you can not change these groups or define new ones.
|Comment|Script comments starting with // or ##|
|:------|:-------------------------------------|
|String |Strings enclosed in quotes            |
|Variable|script Variables                      |
|Number |Numbers                               |
|CommandItems|Internal commands                     |
|IfCommandItems|Conditional commands                  |
|StrFormatItems|String Format sub commands            |
|SystemCommandItems|System commands                       |
|OtherItems|Other command items                   |
|BooleanItems|Boolean Operatiors                    |
|Params |Command parameters                    |
|Escapes| Escape characters                    |

### Defaults ###
```
[HighLighter]
Comment=Style:[fsItalic]|Foreground:clGray
String=Foreground:clRed
Variable=Foreground:clGreen
Number=ForeGround:clBlue
CommandItems=Style:[fsBold]
IfCommandItems=Foreground:clMaroon|Style:[fsBold]
StrFormatItems=Foreground:clMaroon|Style:[fsItalic]
SystemCommandItems=Foreground:clTeal|Style:[fsBold,fsItalic]
OtherItems=Foreground:clTeal
BooleanItems=Foreground:clNavy|Style:[fsBold]
Params=Foreground:clTeal
Escapes=Foreground:clTeal
```