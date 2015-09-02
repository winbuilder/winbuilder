# System,SaveLog #

Save the current accumulated log file

## Syntax ##
```
System,SAVELOG,<OutputFile>
```

Saves the actual accumulated log to `<OutputFile>`. `<OutputFile>` should have the extention '.html' (since !Winbuilder writes out the log in html syntax for easy viewing in a web browser - i.e. uses color coding as well as internal page links to provide navigation.

Usefull for debugging purposes - i.e. When a build creates a reproducible hang in a certain script, you can save the log before or in the beginning of this script.