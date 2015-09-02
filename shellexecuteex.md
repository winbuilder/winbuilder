# ShellExecuteEx #

## Syntax ##
```
ShellExecuteEx,<Action>,<Filename>[,Parameters][,StartDir]
```

This function will launch a file using the settings you specify.
  * **Action** is the specific method you wish to use to start the external file. If not specified, the default "Open" Will be used. Possible action values are:
    * **Open** - will open the file using the default associated application
    * **Hide** - will also open the file, but it will be launched in hidden mode (not user viewable)
    * **Print** - print a file using the default printer
    * **Explore** - open an explorer window (used to display the contents of folders)

  * **Filename** is the complete filename to where the file can be found, you can omit the dir part if this file can be found on the system paths.

  * **Parameters** (optional) are the set of switches that you can pass along as command line parameters when executing the file.

  * **StartDir** (optional) is the location that you wish to specify as your default work directory.

The script will **_NOT_** wait (pause) for the launched file or application to be closed before continuing to process the remaining commands.

## Example: ##
In this example we can open an exporer window and pass in the name of the folder to open and do not wait for the executable to finish.
```
ShellExecuteEx,Open,explorer.exe,/e#$c#$q%OpenFolder%#$q,%OpenFolder%
```

## See Also ##

  * [ShellExecute](shellexecute.md) - has a similar behavior but will wait for the application to be finished **before** it will continue with the script processing.