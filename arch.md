# Arch #

Specify the source architecture supported by the script.

## Syntax ##
```
Arch,SourceType
```

## Parameters ##
|1|Source Type|Source Type supported by the script|
|:|:----------|:----------------------------------|
| |           |**x86** = Script only supports the x86 architecture.|
| |           |**x64** = Script only supports the x64 architecture.|
| |           |**x86|x64** = Script supports either the x86 or x64 architecture.|

## Remarks ##
This function should be the first function called by a script in the process section.

## Tips ##
If the source type is x86 then the only source architecture that is supported is x86. If the source type is x64 then, depending on if wow64 support is available, then the source architecture may be x86 or x64. If wow64 support is not available when using x64 source then only x64 source architecture will be supported.

For a project to support this command two project variables must be defined:

> %SourceArch% - architecture type of the source

> %TargetWOW64% - this by default is the same as %SourceArch%. If the project contains support for wow64 then it will be set by the wow64 script to x86.

If a script contains both x64 and x86 executables and / or dlls embedded in the script then its recommended that they be embedded in a folder named x86 or x64 so that a command like the following can be used:

> `unpack,%SourceArch%,,True,%target_win%,system32,%ProgramEXE%`

## Example ##
Script only supports the x86 architecture
```
Arch,x86
```

Script supports both x86 and x64 architectures
```
Arch,x86|x64
```