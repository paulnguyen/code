
##
## make run code=01.hello.kt
##

base=$(subst .kt, $(nullstring), $(code))
prog=$(strip $(base))

all: clean

clean: 
	rm -f *.jar

compile:
	kotlinc $(prog).kt -include-runtime -d $(prog).jar

run: compile
	java -jar $(prog).jar

help:
	kotlinc -help


