Rem - extract winbuilder wiki files for html help

set JAVA_HOME="C:\Program Files\Java\jdk1.6.0_26"
echo ----------------------
echo JAVA_HOME=%JAVA_HOME%
echo ----------------------

CD google-code-wiki-to-html

%JAVA_HOME%\bin\java -server -cp lib\*;.;src;bin cn.org.rapid_framework.tools.google_wiki_to_html.GoogleWikiDownloaderMain  winbuilder ..\Win-Help "js|css|jpg|jpeg|gif|png|bmp" "content"

CD ..

Pause