REM Adjust for path to java compiler and 7z if needed

"C:\Program Files\Java\jdk1.6.0_26\bin\javac" -classpath lib/google-code-wiki-to-html.jar -sourcepath src src\cn\org\rapid_framework\tools\google_wiki_to_html\*.java

Rem - check compilation
pause
cd src

"C:\Program Files\7-Zip\7z" a ..\lib\google-code-wiki-to-html.jar 

del /q cn\org\rapid_framework\tools\google_wiki_to_html\*.class
