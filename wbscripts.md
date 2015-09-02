# The WinBuilder Scripting Language #

The behavior of WinBuilder is driven by it's own internal scripting language.  These "Script files" are simple text files that use the extension .script.  They are most easily edited with WinBuilder's internal editor, but you can also use your favorite text editor or a simple text notepad.

Script files use a very simple to understand language to run their commands and actions.
In general, the syntax is very simple - i.e. keywords for functions with the parameters separated by commas.  Comment lines start with two slashes, and are skipped during processing. Out of compatibility concerns two hash marks are accepted as comment marker.
> Example:
```
// This is a comment line
## This is a comment line, too
```

Settings are written in the form of Key=Value (e.g. Color=Blue) and these values are kept inside sections similar to the structure of an `*.ini` file (e.g. `[MySection]`).

You can also add additional files inside your scripts. These files are stored as attachments in a process very similar to the way email messages used to include binary files - i.e. they are "encoded" into an ASCII format. This way you can share your scripts in discussion forums with all the needed tools inside.

Script files can perform both specific and generic functions. Some scripts will be responsible for creating the base structure of the project while others will be used to add extra functionality and programs.

These scripts can also use a very specific model that only works on a single project and cannot be successfully used on another project unless it also shares the same model as the original project from where it came. The model consists of functions and variables stored in scripts.