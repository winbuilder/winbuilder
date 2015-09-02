# Exit #

Force the current script to terminate and continue processing with the next script.

## Syntax ##
```
Exit,<exit message>[,NOWARN] 
```

The "Exit message" is a small text message that is displayed on the log where you can specify the reason why Exit was called.

A warning icon is associated with the log entry but in some conditions, where the exit is intended and a warning icon would confuse the user the NOWARN parameter can be specified to associate an information icon instead.

## Example: ##
```
Exit,"File was not found" 
```