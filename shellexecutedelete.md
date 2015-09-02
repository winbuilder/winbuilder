# ShellExecuteDelete #

## Syntax ##
```
ShellExecuteDelete,<Action>,<Filename>[,Parameters][,StartDir],[%ExitCode%]
```

This function will launch a file using the settings you specify. WinBuilder will wait (pause) for the launched file or application to be closed before continuing to process the remaining commands. After it has been finished, WinBuilder will delete the application .

  * **Action** is the specific method you wish to use to start the external file. If not specified, the default "Open" Will be used. Possible action values are:
    * **Open** - will open the file using the default associated application. This means that if it is an executable, the program will be started, and possibly open a console window to display it's output.
    * **Hide** - will also open the file, but it will be launched in hidden mode (i.e. any console output will not be viewable)
    * **Print** - print a file using the default printer
    * **Explore** - open an explorer window (used to display the contents of folders)

  * **Filename** is the complete filename to where the file can be found, you can omit the dir part if this file can be found on the system paths.

  * **Parameters** (optional) are the set of switches that you can pass along as command line parameters when executing the file.

  * **StartDir** (optional) is the location that you wish to specify as your default work directory.

  * **%ExitCode%** (optional) is the name of the variable that will be updated with the exit value returned by any executable started.  This can be useful to validate the exit code value returned by the program. This variable must already exist, or a warning will be given, and WinBuilder will **not** be able to capture the return code.


## Example: ##
In this example we run a hidden executable, and delete it after it completes
```
ShellExecuteDelete,hide,foo.exe 
```

## See Also ##
  * [ShellExecute](shellexecute.md) - has a similar behavior but does not delete the executable