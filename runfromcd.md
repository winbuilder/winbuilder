# RunFromCD ( LiveXP / NativeEx Projects Only ) #

Force the current script program to run directly from the boot media.

## Syntax ##
```
RunFromCD,[BuildType]
```
## Parameters ##
|1|BuildType|Forces the programs from the current script to run directly from the boot media instead of from the ram drive|
|:|:--------|:------------------------------------------------------------------------------------------------------------|
| |         | **True** - Force the current script programs to run from the boot media at %ProgramFilesFolder%\%ProgramFolder%|
| |         | **FolderName** - Force the current script programs to run from the boot media at the specified folder       |

## Remarks ##
See also [RunFromRam](runfromram.md)

## Example ##
```
RunFromCD,True
```