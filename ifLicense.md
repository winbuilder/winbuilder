# License #

This command was added to be used as tool to accept a license agreement whenever needed. It will open a special tab where the user has the option to read the terms of the license and then press a button corresponding to his decision to agree or not with the displayed terms.

## Syntax ##
```
If,License,<textfilename>,<Command> 
```

> Here, `TextFilename` is the text file that will be displayed on the license window.

The use of `License` runs the command when the user agrees with the license conditions and `Not,License` will cause the command to run if the user doesn't agree.

## Example: ##
This example will present the contents of myEula.txt - in case the user doesn't agree with this license the project build will be aborted.
```
If,Not,License,c:\myEULA.txt,halt,"User doesn't agree with license."
```