<h1>
Application Scripts<br>
</h1>

# Overview #

Application Scripts is  how projects that use this method are able to create application scripts that are to be shared and used with different projects. These scripts are specifically designed to add programs to your projects.

## Advantages ##
  * Quickly allow you to write a new script that adds a program to a project with very few lines of code.
  * Easy to learn with very intuitive functions
  * Creates scripts compatible across different projects
  * Long lasting scripts that don't need to be rewritten to work on newer projects that support this method
  * Available on the Create Script tab - only need to add your files and change the title, description and folder name


## Disadvantages ##
  * Very limited scope of functions, only basic functions are supported.
  * Targeted to smaller programs that need few files and settings.
  * The target program needs to be freeware in most cases to be distributed with the script
  * Still in development

<br>
<hr />
<h1>Usage</h1>

An application script isn't much different from "regular" scripts but it will take for granted that you follow a few definitions and rules and this way have enough conditions that are used by all compatible projects<br>
<br>
Let's study a script example right now and start explaining how it works.<br>
<pre><code>[main]<br>
Title=Sudoku<br>
Description=The popular number game<br>
Level=5<br>
<br>
[variables]<br>
%ProgramTitle%=Sudoku<br>
%ProgramEXE%=sudoku.exe<br>
%ProgramFolder%=Sudoku<br>
<br>
[process]<br>
Add_Shortcut,Desktop<br>
Add_Shortcut,AutoStart<br>
Add_Shortcut,StartMenu,Games and Fun<br>
unpack<br>
</code></pre>

As you may notice - very few lines are needed, also note that this script is composed by 3 script sections:<br>
<b>Main<br></b> Variables<br>
<b>Process</b>

<h2>Settings on the <code>[Main]</code> section</h2>

<b>More settings in this section can be added but only Title, Description and Level are needed as a minimum.<br></b> Since this script is meant to add programs you need to use Level=5 value to group it with other similar scripts<br>
<br>
<h2>Settings in the <code>[variables]</code> section</h2>

<ul><li>%ProgramTitle% - Used as title for the created shortcuts. We can use any description as desired, no need to be directly related to the exe or folder.<br>
</li><li>%ProgramEXE% - Program Executable used as the target application that is launched when clicking on the respective shortcut (if created), it can also be used to launch any other files besides executables like text files, html pages, bat files, etc.<br>
</li><li>%ProgramFolder% - The folder name where all files inside the script will be placed. You only need to add the folder name you wish to use, there's no need to add the full path.</li></ul>

<h2>Settings in the <code>[process</code>] section</h2>
This is the section that is executed when running the script so it's where we should place our functions.<br>
<br>
Let's list and explain each one of the command functions used in the <code>[process]</code> section:<br>
<ol><li><code>Add_Shortcut,Desktop</code> - This function will add a shortcut on the desktop<br>
</li><li><code>Add_Shortcut,AutoStart</code> - Mark your program to be included on the group of programs that runs on start up.<br>
</li><li><code>Add_Shortcut,StartMenu,Games and Fun</code> - In this example, we are adding a shortcut on the start menu. Notice that applying the additional parameter as "Games and Fun" will place your shortcut inside a folder on the start menu with this name.<br>
</li><li><code>unpack</code> - A very important function because it will do most of the hard work of adding the needed files to your project.  For more details, see the <a href='unpack.md'>Common API command command reference page for the unpack command</a>.</li></ol>

<br>

<h1>Frequently Asked Questions</h1>
<hr />
<h3>Q: How is this script used after all?</h3>
<blockquote>A: It is used to add simple programs and tools on your project in a quick and simple manner.<br>
<hr />
<h3>Q: What can be considered as "simple programs"?</h3>
A: In this category should be considered programs labeled as "standalone" and "portable" - which use very few files and registry settings. Also note that any program under this category should also be prepared to work under all available projects that support this method.<br>
<hr />
<h3>Q: Well, I need a special icon different than the one used by the script - how can I do it?</h3>
A: Don't use this generic script for these cases, read the chapter about exceptions and how to handle them in your scripts<br>
<hr />
<h3>Q: I want to use a script to add notepad on the windows directory instead of the programs folder, why can't these functions support this?</h3>
A: This is a specific feature that should be handled as an exception, you shouldn't use this method for these cases.<br>
<hr />
<h3>Q: How can we add more functions to the application scripts?</h3>
A: You will need to suggest and discuss them on the respective discussion topic, in most cases do remember to ask functions that can also provided by other projects to make them globally available<br>
<hr />
<h3>Q: Can I use this method and the project specific way to create these scripts together?</h3>
A: Yes you can, but it is not adviced. Both methods can work well together but should be kept in separate scripts. A script that was written with this common method should avoid using methods specific to a particular type of project.<br>
<hr />
<h3>Q: Where can these scripts be found or identified?</h3>
A: They can be included either inside your projects mixed with other scripts or you can find them in the download section of the community forums under the Application scripts category. We are also discussing a common folder where all these generic scripts could be placed but it's still in development.<br>
<hr />
<h3>Q: Is this method perfect?</h3>
A: No way! But we hope that this is a good method to create scripts that can work on most projects available at this moment and even on the ones to come in the future. This way we ensure that your favourite project can use as many available scripts as possible within the next years without having to rewrite or edit anything - making it easier for you to find more available programs.<br>
<hr />
<br></blockquote>

<h1>Bugs and Exceptions</h1>

You should look on the discussion forums for assistance in case you find a script that doesn't work as you expected so that the community can properly view it and suggest other alternative ways to solve exceptions.