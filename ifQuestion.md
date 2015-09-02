# Question #

Asks the user a question, and uses their response to determine if the command should be executed. Note: all strings defined in the language files can be used like variables, identified by their ID number $#nnnn.

## Syntax ##
```
If,QUESTION,<Question>,[<timeout>,<True/False>]<Command>
```

## Remarks ##
Usually the question dialog waits for the user's input. Using these optional parameters, you can cause to close it after a timeout ( and supply a default response), by adding the timeout (in seconds) and a default Value (True/False) as optional arguments before the command. If they are specified, **BOTH** the timeout value (seconds) and default value when the timeout occurs must be specified.
```
If,QUESTION,"Exit Script?",10,TRUE,Exit,"Exit selected"
```

## Example: ##
```
If,QUESTION,$#1541?,command 
```
Here, we are using an internal string to display a question (The question mark is part of the TEXT, not part of the ID!). The resulting dialog box shows in case of default language (English):
```
Save changes to disk?
```
In case of e.g. italian language:
```
Salva cambiamenti al disco?
```