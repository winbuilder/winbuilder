# [WinBuilder Projects](http://reboot.pro/forum/22/) #

A WinBuilder project is a collection of [scripts](wbscripts.md) that are typically used to build a specific boot disk. Specific instructions and/or details are normally included to help you specify a compatible source and how to debug some common issues that might sometimes appear.

> ### You should always read the information page of each project you intend to use before you start building a project. ###

If you still have any doubts about how to proceed that are not covered here, you're invited to ask for help.
For more on the currently supported projects, visit the **[WinBuilder Project Forum](http://reboot.pro/forum/22/)** area.

## Special project settings ##

Please note that some projects may require specific conditions to be properly executed such as VistaPE which requires being used exclusively on NTFS partitions to properly handle WIM images. Please read the specific project page to view more details.

## Running your first project ##

Click on the root item of each project to view how it should be used.
In most projects you just need to click the Play button (blue triangle) and a wizard will ask you for the project source files location and continue the project build. Whenever you need to change this default location, you can click on the "Paths" tab and modify as needed.

Also, check to see if there are any [tutorials](http://reboot.pro/forum/112/) for your chosen project by looking in the forums.

## Creating a new project ##
You can create your own personal project as well by following these simple steps.

  1. Create a folder for your project in the Winbuilder\Projects directory.
```
  Example: C:\Winbuilder\Projects\MyProject
```
  1. Create an empty file called `script.project` in this new directory.
  1. Place the following code in the `script.project` file you just created.
```
[Main]
Title=My Project
Type=script
Author=Myself
Description=My New Project
Credits=
Version=1
Download_Level=0
Level=1
Contact=
Date=
Depend=
TargetDir=C:\Winbuilder\Target\MyProject
ISOfile=C:\Winbuilder\ISO\MyProject.iso
SourceDir=
```
  1. Refresh your build tree by clicking the "Refresh" button or restarting Winbuilder.

Congratulations! You now have a skeleton project that you can start adding scripts to!