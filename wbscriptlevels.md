# Script Levels #

Levels are used by WinBuilder to define when your script should run while the project is being built. This allows you to ensure that your script always runs at the correct time.

You can select values between 1 and 10, when the project starts it will begin with the scripts that have the lower level number and will increase a level after all scripts with the previous levels are processed. To further organize your scripts you can also create sub folders and in this way separate these scripts from others with the same level.

Winbuilder will process scripts in the following order:
  1. Script Level
  1. Folder Name
  1. Script Name

File and folder names are processed in alpha numeric order.  This information is used to build the "TREE" oriented view in the WinBuilder interface.  While it might appear that this is just a simple folder/script view of the project - **IT IS NOT**.

Folders may be duplicated if there are script files of different levels inside the same folder. In the example below, notice how the "`Shared_Custom`" folder is listed many times.  This is because there are scripts in (or below) that folder level on disk that are at different levels.

![http://winbuilder.googlecode.com/svn/wiki/images/levels.gif](http://winbuilder.googlecode.com/svn/wiki/images/levels.gif)

Visually, this "Tree" view gives you a graphical representation of how WinBuilder will process your scripts. Top levels are usually used to be build the structure of your project, while the last levels are the ones where your project is finished and an image is created.

By default, we use level 5 as the middle value where most scripts that are only meant to add programs (i.e. [Application Scripts](wbscriptapplication.md)) should be processed. Below is a proposed description of the build phases typically performed by each project:
  1. Preprocess info (gathering information, mounting wims, etc.)
  1. Build (basic building scripts - create folders, copy/expand, winsxs)
  1. Base (shell, shortcuts, ramdisk/FBWF options..)
  1. Settings and Drivers (all tweaks and drivers)
  1. Applications (added programs like CD-burn, editor, tools..)
  1. PostProcessing (wim creation, autoUPX, cleanup)
  1. ISO creation (mkisofs, RAM boot..)
  1. PC Emulation (Qemu, vmware, virtualPC)
  1. Burn ISO
  1. Project Tools (hive editing, target tweaking..)

Corresponding negative script levels also exist with the only difference being that scripts with negative levels are not displayed in the project tree. This can be useful for creating utility scripts containing a common set of functions shared between scripts. These scripts typically require no user interaction and usually do not contain a `[process]` section.

For a more in depth discussion on levels, see this [forum posting](http://reboot.pro/515/).