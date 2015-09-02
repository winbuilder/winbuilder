# WinBuilder and Script FAQ #

## Where do I place my scripts? ##
> You can place your scripts inside the same folder where the project you want to create is placed.  Using LiveXP as example, you can place your scripts inside the `%BaseDir%\Projects\LiveXP` folder, where `%BaseDir%` is a variable used by WinBuilder to indicate the same path where `WinBuilder.exe` is found.

> Placing your script inside this folder is more than enough to make it available from the the main window when browsing your project.  Also worth noting that some projects also have a specific folder where related scripts are grouped. Using the same LiveXP example, you should place your scripts that deal with "Applications" inside the `%BaseDir%\Projects\LiveXP\Apps` folder.

## Why is it that some scripts only work with some projects? ##
> Even thought all scripts are created equal and use the same scripting language - different projects can use very different ways to add programs and functions.

> In most cases you should understand which projects are compatible with your script before trying to use it. There is also an ongoing effort to make scripts work in a wider variety of projects, read here for more details.

> If you are using the Download Center as source to get your scripts from the internet, then you won't need to worry about this since each server only contains scripts that are always correctly placed inside compatible projects.

> If a script is growing outdated, you can try to adapt it yourself. Pick a similar script that works the way you need and use it as example, adapting things as needed.

> You can also post all your inquiries about .script file coding in our community where others can tell you which specific steps may be needed or even teach how to update your script.

## How do I easily edit or create a script? ##
> It's recommended to use WinBuilder's internal editor to let help you customize the script and highlight the source code syntax while scripting.

> You can use WinBuilder's internal editor by selecting a script and clicking on the Edit button.

> When running WinBuilder, click on the `Tools` button where you can also find a small utility to help you creating your scripts from available templates.

#### Note: ####
  * The learning curve to make your own script is very simple and acessible.
  * You can use other scripts as example to create your own scripts and then share them in the forums to help others if you wish - also a good place to ask for scripts that support the programs you like.

## How can I use WinBuilder from the command line? (for example to automate a build) ##
In addition to the [existing documentation on the command line options](wbcmdline.md), see this posting over in the forums: **[How To use WinBuilder command line](http://reboot.pro/2200/)**