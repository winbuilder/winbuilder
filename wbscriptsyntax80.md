<h1>Script Syntax Changes that appear in version 080</h1>


This page describes new functionalty introduced with WinBuilder 080.
Older WinBuilder versions cannot work with this functionality.

<br>
<hr />
<h1>Registry Handling</h1>

These commands are written to write and read values from the local registry on your windows machine. You can also load the hives from the projects being built at any given time.<br>
<br>
These registry operations are valid for any Windows Platform, you should however note that Vista restricts the specific operation to load/unload hives - it is necessary to disable the UAC (User Account Control) before running projects that need this support.<br>
<br>
<h2>RegWriteBin / RegWriteBinEx</h2>
<pre><code>RegWriteBin,&lt;HKEY&gt;,&lt;KeyType&gt;,&lt;Section&gt;,&lt;Keyname&gt;,&lt;Value&gt; <br>
</code></pre>
This command will create a new or overwrite an existing registry entry as specified. The command is used to write Wide Strings (e.g. Unicode) into the registry. The wide string is defined by a series of hexadecimal values, separated by comma.<br>
<br>
RegWriteBinEx has the same syntax, but writes every value of every type unchecked into the registry.<br>
It is in the responsibility of the script's author to make sure that only valid registry entries are created.<br>
<br>
HKEY is the "Hive Key" where the key is to be placed. These hives are files that are loaded by your machine when booting and compose the registry structure. By default, most scripts use HKLM as the work hive.<br>
<br>
Valid HKEY values<br>
<ul><li>HKLM<br>
</li><li>HKCU<br>
</li><li>HKCR<br>
</li><li>HKEY_USERS<br>
</li><li>HKEY_CURRENT_CONFIG</li></ul>

KeyType will specify how the data in the registry key should be interpreted. Valid key type values for RegWriteBin<br>
<ul><li>0x1 - String - writes a text value<br>
</li><li>0x2 - Expanded String - will expand any variable value contained inside %%. (e.g. %temp%)<br>
</li><li>0x7 - Writes multiple NULL separated strings<br>
Section is the complete path to the section where the key is supposed to be written</li></ul>

Keyname is the name of the name of one of the 'child keys' of a section. Value can be<br>
<ul><li>an explicitelly written list of hexadecimal values, separated by comma<br>
</li><li>a variable containing the list. Instead of the comma the variable must contain the escape #$c</li></ul>

The substrings of a 0x7 entry can be divided by ",00,00" bytes (without the quotes) or by the escape #$z.<br>
<br>
<h3>Examples:</h3>
<pre><code>RegWriteBin,HKLM,0x2,WB-Software\SOFTWARE\Classes\.bfc\ShellNew,Command,25,00,53,00,79,00,73,00,74,00,65,00,6d,00,52,00,6f,00,6f,00,00,00 <br>
Set,%Value%,25#$c00#$c53#$c00#$c79#$c00#$c73#$c00#$c74#$c00#$c65#$c00#$c6d#$c00#$c52#$c00#$c6f#$c00#$c6f#$c00#$c00#$c00<br>
RegWriteBin,HKLM,0x2,WB-Software\SOFTWARE\Classes\.bfc\ShellNew,Command,%Value%<br>
</code></pre>

<h2>RegReadBin</h2>
<pre><code>RegRead,&lt;HKEY&gt;,&lt;Section&gt;,&lt;Key&gt;,&lt;%Variable%&gt; <br>
</code></pre>
This command will read a value from the key you specify.<br>
<br>
It uses the same components as described above with the difference that it will copy the value of a key into a variable.<br>
<br>
This command will only retrieve values from the following keytypes:<br>
<ul><li>0x1 - String<br>
</li><li>0x2 - Expandable String<br>
</li><li>0x7 - Multiple String</li></ul>

<h3>Example:</h3>
<pre><code>RegReadBin,HKLM,WB-Software\SOFTWARE\Classes\.bfc\ShellNew,Command,%Value%<br>
</code></pre>
In this example the variable %Value% will store the value of the mentioned key<br>
<br>
<h2>RegMulti</h2>

These commands uses the same components as described above.<br>
<ul><li>Writes a string at the specified place. If the string already exists in the current value, a warning is written and the current value is left unchanged.<br>
<pre><code>RegMulti,&lt;HKEY&gt;,&lt;Section&gt;,&lt;Key&gt;,APPEND,&lt;String&gt;<br>
RegMulti,&lt;HKEY&gt;,&lt;Section&gt;,&lt;Key&gt;,PREPEND,&lt;String&gt;<br>
RegMulti,&lt;HKEY&gt;,&lt;Section&gt;,&lt;Key&gt;,BEFORE,&lt;SubString&gt;,&lt;String&gt;<br>
RegMulti,&lt;HKEY&gt;,&lt;Section&gt;,&lt;Key&gt;,BEHIND,&lt;SubString&gt;,&lt;String&gt;<br>
RegMulti,&lt;HKEY&gt;,&lt;Section&gt;,&lt;Key&gt;,PLACE,&lt;Index&gt;,&lt;String&gt;<br>
</code></pre>
</li><li>Removes the specified substring.<br>
<pre><code>RegMulti,&lt;HKEY&gt;,&lt;Section&gt;,&lt;Key&gt;,DELETE,&lt;SubString&gt;<br>
</code></pre>
</li><li>Queries the index of the specified string. If the substring does not exist, the returned value is 0.<br>
<pre><code>RegMulti,&lt;HKEY&gt;,&lt;Section&gt;,&lt;Key&gt;,INDEX,&lt;SubString&gt;,%Index%<br>
</code></pre>