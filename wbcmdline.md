# Command Line Options: #

The following command line options can be used to automate the building of one or more projects.

| **Option**| **Description**                                        |
|:----------|:-------------------------------------------------------|
| /run=     | Path to the project dir. (Ex. C:\WB\Projects\Win7PE)   |
| /title=   | Project Title                                          |
| /x=       | Window width                                           |
| /y=       | Window Height                                          |
| /target=  | Target Directory                                       |
| /ISO=     | Path to ISO that will be created                       |
| /log=     | Path to log file that will be saved                    |
| /source=  | Path to the source used for building                   |
| /showlog  | Display the log when building is finished              |
| /debug    | Display a message box with project, target, source and ISO paths|
| /beep     | Beep when building is finished                         |

# Examples: #

**Example 1**

Simple Command Line Usage to build a project.
```
Winbuilder.exe /run="C:\WB\Projects\Win7PE" /title="Win7PE" /x=10 /y=50
               /target="C:\WB\Target\Win7PE" 
               /ISO="C:\WB\ISO\Win7PE_x86.iso" 
               /log="BuildLog.html" /source="C:\Images\Win7"
```

**Example 2**

This **advanced** example uses a batch script to set some options and build the project.

```
REM ******* The next 4 lines must be defined individually
SET PrjName=nativeEx_barebone
SET BaseDir=C:\Dokumente und Einstellungen\Peter\Desktop\WB Archiv\Beta8
SET setOpt=%BaseDir%\pscProgs\setOptions\setOptions.exe
SET WB=%BaseDir%\WinBuilder071B1.exe

REM ******* The next 5 lines can remain unchanged
SET Project=%BaseDir%\Projects\%PrjName%
SET WBConst=/run="%Project%" /title="My Project" /x=10 /y=50
SET tg=%BaseDir%\Target\%PrjName%
SET iso=%BaseDir%\ISO\%PrjName%
SET log=%BaseDir%\Support\Log\%PrjName%

REM ******* If the directory for your log files does not exist, you must create it here.
REM ******* WinBuilder does not (yet) create it.
MD "%BaseDir%\Support\Log"
MD "%BaseDir%\Support\Log\%PrjName%"

REM ******* The next lines call Main with my individual OS / language combination
REM ******* Maybe four you different statements are better suited
REM ******* Last line MUST be: "GOTO :EOF"
FOR /D %%s IN (V:\BCD\cds\XPP_*SP2) DO CALL :Main %%~ns %%s
FOR /D %%s IN (V:\BCD\cds\W2003_*) DO CALL :Main %%~ns %%s
GOTO :EOF


:Main
REM ******* Here you can build different sets of your project to produce
REM ******* In the first set you have to define everything what is important
REM ******* and may be different from the actual project
REM ******* In the following sets you only need to define what is changed
REM ******* The setOpt program and this sample batch can be download from:
REM ******* http://nativeex.boot.../setOptions.zip

REM ******* index must be individual for each set and should contain a hint to OS, service pack and language

SET index=_%1_STD_R_R
REM Standard ISO, RAMDisk
"%setOpt%" "-O:!Fundamentals.script:Interface.pScrollBox1=B:" "-P:%Project%"
"%setOpt%" "-O:!Fundamentals.script:Interface.pScrollBox3=RAM Drive" "-P:%Project%"
"%setOpt%" "-O:RAMDisk.script:Main.Selected=True" "-P:%Project%"
"%setOpt%" "-O:CreateISO.script:Main.Selected=True" "-P:%Project%"
"%setOpt%" "-O:BootSDI.script:Main.Selected=False" "-P:%Project%"
"%WB%" %WBConst% /target="%tg%%index%" /ISO="%iso%%index%.iso" /log="%log%%index%.html" /source="%2"

SET index=_%1_SDI_R_R
REM BootSDI, RAMDisk, SettingsDrive = RAM Drive
"%setOpt%" "-O:!Fundamentals.script:Interface.pScrollBox3=RAM Drive" "-P:%Project%"
"%setOpt%" "-O:CreateISO.script:Main.Selected=False" "-P:%Project%"
"%setOpt%" "-O:BootSDI.script:Main.Selected=True" "-P:%Project%"
"%WB%" %WBConst% /target="%tg%%index%" /ISO="%iso%%index%.iso" /log="%log%%index%.html" /source="%2"

SET index=_%1_SDI_R_S
REM BootSDI, RAMDisk, SettingsDrive = System Drive
"%setOpt%" "-O:!Fundamentals.script:Interface.pScrollBox3=System Drive" "-P:%Project%"
"%WB%" %WBConst% /target="%tg%%index%" /ISO="%iso%%index%.iso" /log="%log%%index%.html" /source="%2"

SET index=_%1_SDI_N_N
REM BootSDI, no RAMDisk
"%setOpt%" "-O:!Fundamentals.script:Interface.pScrollBox1=--" "-P:%Project%"
"%setOpt%" "-O:RAMDisk.script:Main.Selected=False" "-P:%Project%"
"%WB%" %WBConst% /target="%tg%%index%" /ISO="%iso%%index%.iso" /log="%log%%index%.html" /source="%2"
```