Rem - Fix things for WinHelp compiler...

REM First, make the TOC we are going to use from the wbindex file used for sidebar navigation on the wiki.
REM WinHelp uses a similar "list" structure, but uses different OBJECT tagging.
REM 
REM Copy the HTML index file so we can have something to work on

copy wbindex.html .\winbuilder.hhc

REM We are going to use a general search/replace tool ( http://gnuwin32.sourceforge.net/packages/gsar.htm)
REM to replace and reformat the html created to turn it into a WinHelp TOC
REM
REM these first three things do the real work of changing the for4mat of the lists in the wbindex 
REM into the form needed for the chm file TOC. 
 
gsar -s":x3ca:x20href=:x22" -r":x3cOBJECT:x20type=:x22text/sitemap:x22:x3e:x3cparam:x20name=:x22Local:x22:x20value=:x22" -o winbuilder.hhc
gsar -s":x3c/a:x3e"         -r":x22:x3e:x3c/OBJECT:x3e:013"                                                           -o winbuilder.hhc
gsar -s":x2ehtml:x22:x3e"   -r":x2ehtml:x22:x3e:x3cparam:x20name=:x22Name:x22:x20value=:x22"                          -o winbuilder.hhc

REM Now we just have to strip off the rest of the original "header stuff...Yes,This is brute force, but will have to do for now...

gsar -s":x3chtml:x3e" 								-r" "  -o winbuilder.hhc
gsar -s":x3cbody:x3e" 								-r" "  -o winbuilder.hhc
gsar -s":x3chead:x3e"  								-r" " -o winbuilder.hhc
gsar -s":x3ctitle:x3ewbindex:x3c/title:x3e" 					-r" "  -o winbuilder.hhc
gsar -s":x3c/head:x3e" 								-r" " -o winbuilder.hhc
gsar -s":x3ctable:x3e"  							-r" " -o winbuilder.hhc
gsar -s":x3c/table:x3e"  							-r" " -o winbuilder.hhc
gsar -s":x3ctr:x3e"  								-r" " -o winbuilder.hhc
gsar -s":x3ctd style=:x22vertical-align::top; padding-left::5px:x22:x3e"  	-r" " -o winbuilder.hhc
gsar -s":x3c/td:x3e"  								-r" " -o winbuilder.hhc
gsar -s":x3c/div:x3e"  								-r" " -o winbuilder.hhc
gsar -s":x3cdiv:x20id=:x22wikicontent:x22:x3e" 					-r" "  -o winbuilder.hhc
gsar -s":x3cdiv:x20class=:x22vt:x22 id=:x22wikimaincol:x22:x3e"  		-r" " -o winbuilder.hhc
gsar -s":x3cdiv:x20id=:x22wikipage:x22:x3e"  					-r" " -o winbuilder.hhc
gsar -s":x3c/html:x3e" 								-r" "  -o winbuilder.hhc
gsar -s":x3c/body:x3e" 								-r" "  -o winbuilder.hhc


REM, now that the file has just the list entries, concatenate on the header to make it a TOC.

Copy TOC_header.hhc + winbuilder.hhc winbuilder_TMP.hhc
Copy WinBuilder_TMP.hhc + TOC_Footer.hhc winbuilder_TOC.hhc

>>winbuilder.hhp Echo.[files]
>>winbuilder.hhp DIR/B *.html

REM Now all the files are ready for the help compiler...
