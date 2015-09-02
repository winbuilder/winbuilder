# Message #

Displays a simple message box with optional timeout.

## Syntax ##
```
Message,<message>,<Action>[,Timeout] 
```

## Parameters ##
|1|Message|Text to display to the user|
|:|:------|:--------------------------|
|2|Action |Defines the icon to display. It must be one of the following values|
| |       | **Information** - Displays a Information Icon|
| |       | **Confirmation** - Displays a Question Icon|
| |       | **Error** - Displays a Error Icon|
| |       | **Warning** - Displays a Warning Icon|
|3|Timeout _(Optional)_|Time in seconds before the window automatically closes.|

Icons displayed may vary depending on your operating system configuration.

## Example: ##
```
message,"Script has been completed!",Information,10 
```