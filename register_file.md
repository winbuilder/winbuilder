# Register\_File ( LiveXP / NativeEx Projects Only ) #

Registers a COM or ActiveX object.

## Syntax ##
```
Register_File,FileName,RegType
```

## Parameters ##
|1|FileName|File to register|
|:|:-------|:---------------|
|2|RegType |Type of registration to perform|
| |        | **Install** - Register the file using the DllInstall entry point ( /i on regsvr32 )|
| |        | **Register** - Register the file using the DllRegisterServer entry point|

## Remarks ##
This uses one of two methods to perform the registration:
  * If %dllregmethod% project variable exists and is equal to Build-Time it will use the `RegRedirect` program to perform the registration. This program as its name suggests captures the registry updates and redirects them to the current software registry hive loaded by winbuilder.
  * If %dllregmethod% project variable exists and is any other value or if the %dllregmethod% project variable does not exist it will write an entry in the software registry hive to perform a regsvr32 on the file at boot time. It will use an entry in `Microsoft\Windows\CurrentVersion\RunOnceEx\550` to perform this registration.


## Tips ##
  1. If the file is to be registered at build then the file name should include path information to locate the file in the source or in the script directories.
  1. If the file is to be registered at boot time then the file name should include run time path information or it should be locatable via the current path environment variable.

## Example ##
```
Register_File,%SystemRoot%\system32\shell32.dll,Install
```