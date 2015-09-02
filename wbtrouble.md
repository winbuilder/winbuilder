# Troubleshooting #
When a command doesn't work as expected you should follow these steps to ensure that it is a true bug and not a human error:
  * Check the source code and see if the syntax is correct
  * Add small tests to the used variables to check if the respective values are outputted correctly. (ex. echo,%myVariable%)
  * Read the special conditions under which the project has to be run (found the project page)
  * Check if there aren't any external interferences as locked files or no disk space on the target folder
  * Try whenever possible from a fresh project to avoid any chance of corrupted files or invalid project settings

If none of the above solves your issue then here's the recommended way to proceed:
  * Visit the community forums and search for similar reports of the same behavior as you notice
  * If a similar case is found you should post a reply on this topic, otherwise start a new topic in the appropriate category
  * Writing advice before posting a bug : Include a descriptive title in your message _**including your log.html**_ file and a test script so that it can be debugged and used by others.
    * **If the file is large, consider using a service such as MediaFire and post a link to where the log file may be downloaded from.**
  * Projects also follow their own script rules and these methods can change occasionally, whenever in doubt you should post your questions in each project forum discussion.
  * Check the forums - Changes in script language can be followed for each newer WinBuilder as changes to the script code are suggested and debugged by other members.

## AntiVirus Issues ##

It was occasionally reported by a few users that some AntiVirus can interfere while scripts are copying or deleting files. It's advisable to temporarily disable the anti-virus **only when debugging** the building process to check for possible causes that keep your project from being concluded as expected.

**Under normal circumstances there is no need to disable your Antivirus.**
But, please be aware that antivirus programs will scan any files being copied which may impede performance.