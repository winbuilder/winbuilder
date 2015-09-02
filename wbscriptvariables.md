<h1>Script Variables </h1>


# Overview #

Variables are expressions that you can use to store a value that can be changed as needed.

These variables can be used to avoid fixed settings and keep the script language as dynamic as possible. This also makes your script become portable and work under any path or quickly change script settings when needed.

We can group variable into 3 categories, Fixed, Custom, and Runtime, each one having a specific sequence which we detail over the next chapter.

## Usage ##
Variables are meant to be used inside your commands while your script is running.

They allow you to make changes at a global level. Changing the value of single variable can change the way how the whole project is built.

When a project starts to run - a list of variables is created using this specific order level
  1. Fixed variables
  1. Custom Variables
  1. Runtime variables

If needed, we can overwrite a variable with a new value, meaning for example that a fixed variable can start with a value which can later be changed if we add a variable with the same name on our script, overriding the previous fixed value.

This is only valid while this script is running and these changes will be removed when running another script.

These explanations may seem complicated now but it's simple to understand once you follow each one of the chapters below. You don't have to worry much about this information until you decide to begin coding your own scripts in a more efficient way. In either case, it will be detailed here should you need it one day.

## Scope ##

The `[variables]` section can be placed in 3 different files. Where a variable is defined will determine it's "scope" or availability.
  * System - variables defined inside WinBuilder.ini are available to all projects and scripts
  * Project - variables defined inside script.project are available to all scripts inside the current project
  * Script - variables defined inside the script that is running (also called "local variables") are valid until the script is concluded.

Variables may also be created or defined as the result of various commands that are executed, and many of them have optional parameters that may change the scope of a give variable - for example the [Set](set.md) or [AddVariables](addvariables.md) commands can add variables to the script.project file (giving them a more permanent scope, or to the internal table that is active for the remainder of the current run (something between the project and script levels defined above).

# Fixed Variables #
These variables are created by default just before a project start to run.

WinBuilder retrieves information found inside your Operating System and a few others definitions related to your project settings.

  * Date related (output present date settings)
    * %day%
    * %Month%
    * %Year%

  * User environment variables
    * %TempDir% - path to the temporary folder
    * %ProgramFilesDir% - path to localized "Program Files"
    * %!Username% - extracts current logged User name
    * %UserProfile% - contains the path to the User Profile folder
    * %WindowsDir% - path to your Windows directory
    * %WindowsSystemDir% - in most cases pointing to your windows system32 folder
    * %HostOS% - string representing the OS of the host running WinBuilder
      * if majorVersion <= 4 then HostOS = NT
      * if majorVersion = 5 and minorVersion = 0 then HostOS = W2000
      * if majorVersion = 5 and minorVersion = 1 then HostOS = XP
      * if majorVersion = 5 and minorVersion = 2 then HostOS = W2003
      * if majorVersion = 6 and minorVersion = 0 then HostOS = Vista
      * if majorVersion = 6 and minorVersion = 1 then HostOS = Win7

  * WinBuilder specific
    * %BaseDir% - folder from where WinBuilder.exe is running
    * %tools% - path where the common Tools folder can be found
    * %version% - current version of WinBuilder

  * Project specific
    * %SourceDir% - path to use as source for your project
    * %TargetDir% - work folder that will have the project build files
    * %ISOfile% - filename of the image to be created
    * %ISOdir% - path of %ISOfile%
    * %ProjectDir% - path to the respective project folder

# Custom Variables #

These are additional variables that can be added by script authors. To create them, place a section called `[variables]` into your script and write your variables in INI style. Remember that since you are creating a variable, you need to use the percent sign (%) to make sure it is identified as a variable.

## Examples ##
1. For this example we are creating two variables, available while the script is running, which can be used inside script commands.
```
[variables]
%workdir%=c:\myPath
%project_title%="My Boot Disk"
```

2. In this example, we will create one local variable, as well as a second section that when the script is run, will be added to the variables for the remainder of this run, as well as a third variable that will be added to the script.project as a project level variable for all future runs of this project.
```
[variables]
%workdir%=c:\myPath

[Global-variables]
%global_variable%="some value"

[process]
AddVariables,%ScriptFile%,Global-variables,GLOBAL
Set,%Proj-Variable%,"NewValue,PERMANENT
```

# Runtime Variables #

In addition to the variables explicitly defined, and as mentioned above, additional variables may be created while the script is running. To specifically create new variables you can use these script commands:
  * [set](set.md)
  * [addvariables](addvariables.md)

In addition to these commands, other commands also use variables to store or return the results of their processing. This means that whenever you use any command that uses a variable to store a result, a new variable may be created if it didn't exist before.

Some examples of commands that may do this are:
  * [StrFormat](strformat.md)
  * [Retrieve](retrieve.md)
  * [IniRead](iniread.md)
  * [RegRead](regread.md)

and even the [If](if.md) command (for some of it's various checks).  Mostly these variables will only be local in [scope](wbscriptvariables#Scope.md), but it is always something to watch out for when creating variables to hold temporary results.

One last detail - the run command also uses a form of runtime variables to pass parameters to another section. These variables are of a special format, and use the hash character (`#`) followed by a single digit (1-9). You should always validate the values that are being passed in each of these variables to ensure that everything works as you expect. And if you need more than nine parameters, use the available commands to [pack](packparam.md) and [access](getparam.md) the parameters.

# Macros #

Macros are also defined in the `[Variables]` section. But, unlike Variables they do not have the percent signs (%). This is how the internal processing knows that they are **not** variables.

When used inside a script file, they can only be used at the begin of a  line. They are used to substitute often used script command lines. Notice in the example below that if you are going to use any sort of parameter substitution, you would also need to create a separate section of code to be executed with the parameters being passed to that section.

For example, the code
```
[Process]
FileCopy,%source_sys%\aclui.dll,%target_sys%
FileCopy,%source_sys%\user32.dll,%target_sys%
...
FileCopy,%source_sys%\kernel.dll,%target_sys%
```
could be replaced by defining a macro to call a separate section of code that would execute the file copy command.
```
[variables]
Copy=Run,%ScriptFile%,DoCopy,%source_sys%,%target_sys%

[DoCopy]
FileCopy,#1\#3,#2

[Process]
Copy,aclui.dll
Copy,user32.dll
...
Copy,kernel.dll
```
It could also be simplified in this particular case, since we don't really need to pass in the directories.  This means we could embed them directly in the secion of code to be processed
```
[variables]
Copy=Run,%ScriptFile%,DoCopy

[DoCopy]
FileCopy,%source_sys%\#1,%target_sys%

[Process]
Copy,aclui.dll
Copy,user32.dll
...
Copy,kernel.dll
```
Both sets of code would produce the same results!

# Bugs #

There are a few known issues with variables that you should be aware of.
  * Adding too many global or project variables on the list could start decreasing performance - recommended to keep variables list on local scripts and projects as minimum as possible. **This also helps avoid unnecessary collisions in application scripts**
  * If the value of a variable A depends on the value of variable B and you decide to change the value of variable B - your variable A will not be updated and will still use the original value of variable B. If necessary, you can call [system,RebuildVars](systemRebuildVars.md).

Please let us know if this page is not complete or if you still haven't found needed information.

# FAQ (on variables) #

---

Q: I'm still a bit confused, how can I understand this better?

A: Look inside a project folder and open up the script.project file with notepad to view good examples. This also applies to WinBuilder.ini (same folder as WinBuilder.exe) and to your script files.

---

Q: I'm doing my own script - how can I know if the value of my variables is right?

A: Use commands to output show the variables on the log. Echo,%myVar% is a good example to help in this case. Another good choice is the [message](message.md) command, since it can be made to wait until you click "OK" before processing continues.

---

Q: I know that we need to use the percent sign (%) to indicate something is a a variable, so it can **not** be used as a part of the variable name. Are there any other restrictions about what I can and cannot use?

A: You should only be careful to choose titles that aren't confused with other commands or variables, try using distinct titles that identify the variable purpose or use a unique prefex to ensure a project variable doesn't clash with any other scripts variables.

---

Q: Also heard that variables can replace commands, is this true?

A: Variables can't directly replace commands but can be used to run sections either within the current script, or any other available script. This is used to implement the [API](wbcommonapi.md) functionality. Also see the section on [Macros](wbscriptvariables#Macros.md) above.

---
