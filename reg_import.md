# Reg\_Import #

Import a .reg file

## Syntax ##
```
Reg_Import,RegFile
```
## Parameters ##
|1|RegFile|Name of reg file to import.|
|:|:------|:--------------------------|

This will download the latest version of reg2wbsprg.exe if not already downloaded and use it to convert the reg file to a script file using the -h -e -a parameters.

These cause the exe to add hive load / unload around the reg\_add commands, replace environment variables with variable names and use the common api.

It will then execute the Process section in the generated script to apply the registry commands to the appropriate registry hive.

As a script file is being generated and executed then obviously the reg file must only contain registry values of the types supported by winbuilder.

## Example ##
```
Reg_Import,temp.reg
```

> If the reg file contains the following:
```
Windows Registry Editor Version 5.00

[HKEY_LOCAL_MACHINE\SOFTWARE\NVIDIA Corporation\Global\Hybrid]
"AddDeviceSequence"=dword:0000000

[HKEY_LOCAL_MACHINE\SOFTWARE\NVIDIA Corporation\Global\Hybrid\Current]
"Mode"=hex:03,00,00,00,00,00,00,00

[HKEY_LOCAL_MACHINE\SOFTWARE\NVIDIA Corporation\Global\NvCplApi\Policies]
"ContextUIPolicy"=dword:00000002
"CplGroupUIPolicy"=dword:00000002
"TaskbarUIPolicy"=dword:00000002

[HKEY_LOCAL_MACHINE\SOFTWARE\NVIDIA Corporation\Global\NvSvc]
"DrvUpdCtrlCode"=dword:00000081
```
> then the following will be generated and imported into the software hive:
```
[main]
Title=temp
Selected=False
Level=10
Author=PSC Program 'reg2WBS'
Version=000
Date=23-Aug-2009

[Process]
IniRead,%API%,Main,Version,%apiVersion%
If,%apiVersion%,SMALLER,14,Halt,"API version 14 or higher needed!"
Hive_Load,Machine
reg_add,0x0,"%reg%\NVIDIA Corporation"
reg_add,0x0,"%reg%\NVIDIA Corporation\Global"
reg_add,0x4,"%reg%\NVIDIA Corporation\Global\Hybrid","AddDeviceSequence","1"
reg_add,0x3,"%reg%\NVIDIA Corporation\Global\Hybrid\Current","Mode","03","00","00","00","00","00","00","00"
reg_add,0x0,"%reg%\NVIDIA Corporation\Global\NvCplApi"
reg_add,0x4,"%reg%\NVIDIA Corporation\Global\NvCplApi\Policies","ContextUIPolicy","2"
reg_add,0x4,"%reg%\NVIDIA Corporation\Global\NvCplApi\Policies","CplGroupUIPolicy","2"
reg_add,0x4,"%reg%\NVIDIA Corporation\Global\NvCplApi\Policies","TaskbarUIPolicy","2"
reg_add,0x4,"%reg%\NVIDIA Corporation\Global\NvSvc","DrvUpdCtrlCode","129"
Hive_Unload,Machine
```