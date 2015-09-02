# ExtractAndRun #

Extract a file that is attached (encoded) inside a script to a temporary location, run the file, and then delete it.

## Syntax ##
```
ExtractAndRun,<%ScriptFile%>,<Folder>,<Filename>[,<parameters>] 
```

Optional run parameters can be defined. They must not contain spaces, quotes or commas. Use the escaped form of these characters (i.e. ` #$s, #$q, #$c` ) instead. It is useful when you only wish to run a file for a very specific purpose and this way avoid having to add extra commands to
  1. extract the file
  1. execute the file extracted
  1. clean up (i.e. delete the extracted file)


## Example: ##

Using this syntax we will extract myApp.exe to a temporary location and then delete this file when it has finished running.
```
ExtractAndRun,C:\myFile.script,Folder,myApp.exe 
```