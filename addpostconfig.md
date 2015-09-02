# AddPostConfig ( Vista / Win7 projects only ) #

Configure a program to automatically run at startup after drivers are installed.

## Syntax ##
```
AddPostConfig,[Title],[FileName],[Parameters],[StartMode]
```

## Parameters ##
|1|Title|Title to associate with the program to be automatically run at boot time. This defaults to `%ProgramTitle%`.|
|:|:----|:-----------------------------------------------------------------------------------------------------------|
|2|FileName|Filename and optional path of program to be run. This defaults to `%PE_Programs%\%ProgramFolder%\%ProgramExe%`.|
|3|Parameters|Command line parameters for the program being run.                                                          |
|4|StartMode|Used to specify if the program is run hidden and / or if the autorun program waits for the program to finish running.|
| |     |**1** = Wait for the program to finish running but show any window used by the program. This is the default start mode.|
| |     |**2** = Don't wait for the program to run but show any window used by the program                           |
| |     |**3** = Run the program hidden and wait for the program to finish running.                                  |
| |     |**4** = Run the program hidden and don't wait for the program to finish running.                            |

## Remarks ##
This adds an entry to the postconfig section in the %PE\_CFG% configuration file. This file is processed at boot time by the vpeldr / win7peldr programs. The only difference between this and [AddAutoRun](addautorun.md) is the position in the startup sequence when the entry is run. This runs after the hardware detection is run and device drivers are installed.

## Example ##
This example shows how to automatically start a service at boot time. In this example the lanman service will be started. The loader program will wait for the service to start and hide the console window that otherwise would be shown.
```
AddPostConfig,"Start lanman service",net.exe,"start lanman",3
```