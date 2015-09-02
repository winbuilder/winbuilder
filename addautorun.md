# AddAutoRun #

Configure a program to automatically run on startup.

## Syntax ##
```
AddAutoRun,[Title],[FileName],[Parameters],[StartMode]
```

## Parameters ##
|1|Title|Title to associate with the program to be automatically run at boot time. This defaults to `%ProgramTitle%`.|
|:|:----|:-----------------------------------------------------------------------------------------------------------|
|2|FileName|Filename and optional path of program to be run. This defaults to `%PE_Programs%\%ProgramFolder%\%ProgramExe%`.|
|3|Parameters|Command line parameters for the program being run.                                                          |
|4|StartMode|Used to specify if the program is run hidden and / or if the autorun program waits for the program to finish running.|
| |     |**1** = Wait for the program to finish running but show any window used by the program. This is the default start mode.|
| |     |**2** = Don't wait for the program to run but show any window used by the program.                          |
| |     |**3** =Run the program hidden and wait for the program to finish running.                                   |
| |     |**4** = Run the program hidden and don't wait for the program to finish running.                            |

## Remarks ##
In PE1 projects the API calls [AddShortcut,Autostart](addshortcut.md) to create the run entry in the registry.

In PE2+ projects AddAutoRun will create an entry in the autorun section in the %PE\_CFG% configuration file.

This file is processed at boot time. The only difference between this and [AddPostConfig](addpostconfig.md) is the position in the startup sequence when the entry is run. This runs before the hardware detection is run and device drivers are installed.

In current PE2+ projects the %PE\_CFG% file is processed by:
  * **nativeEx\_multiPE**: win7peldr.exe
  * **VistaPE**: vpeldr.exe
  * **Win7RescuePE**: win7peldr.exe
  * **Win7PE\_SE**: shortcuts.exe

## Example ##
This example shows how to automatically start a service at boot time. In this example the lanman service will be started. The loader program will wait for the service to start and hide the console window that otherwise would be shown.
```
AddAutoRun,"Start lanman service",net.exe,"start lanman",3
```