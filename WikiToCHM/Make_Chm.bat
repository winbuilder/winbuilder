@echo off
Rem - extract winbuilder wiki files for html help

google-code-wiki-to-html.exe  winbuilder Win-Help "js|css|jpg|jpeg|gif|png|bmp" "content"

Copy .\templates\*.* .\win-help

cd win-help
call Winbuilder_fixHelp
cd ..
.\Win-Help\hhc .\Win-Help\winbuilder.hhp

Rem - works for English times ONLY, where date is ddd_DDMMYYY

set _d=%date:/=%
7z a WinBuilderCHM_%_d:~8,4%_%_d:~4,2%_%_d:~6,2%.zip winbuilder.chm
set _d=

PAUSE

RMDIR /S/Q  Win-Help
