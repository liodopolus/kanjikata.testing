#!/bin/bash
# get and set charset


# directory where to search
DIR="kanjikata.testing"

# files with .end to search
ARG="md toml html scss"

# vim-script
#VIM=$(
#cat <<EOF 
#set fileencoding=utf-8
#wq
#EOF
#)

for a in $ARG ; do
	# find files type ARG
	FILES=$(find $DIR -type f -iname "*.$a" -print)
	
	# prozess files
	for FILE in $FILES ; do 

		# get charset
		CHARS=$(file -i $FILE | rev | cut -d = -f 1 | rev)
		echo "$FILE --> $CHARS"

		# convert charset
		#iconv -f us-ascii -t utf-16 $FILE -o $FILE
		#iconv -f utf-16le -t utf-8 $FILE -o $FILE

		#CHARS=$(file -i $FILE | rev | cut -d = -f 1 | rev)
		#echo "$FILE --> $CHARS --converted"

		# do it with vim, it doesn't work! 
		#vim -S $VIM $FILE
	done

done 
