+++
date = "2017-05-26T01:07:45+02:00"
title = "utf-8"

+++

UTF-8 Convertierung gelöst.

vim file

:set fileencoding=utf-8

:wq


alternativ

iconv -f encoding -t encoding file -o file.new


Überprüfung
-----------

file -i file

