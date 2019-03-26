

base=$(subst .kt, $(nullstring), $(code))
prog=$(strip $(base))

all: clean

clean: 
	find . -name "*.jar" -exec rm -rf {} \;	

compile:
	kotlinc $(prog).kt -include-runtime -d $(prog).jar

run: compile
	java -ea -jar $(prog).jar

run-arrays: 
	kotlinc arrays.kt -include-runtime -d arrays.jar
	java -cp arrays.jar:../library/kotlin-reflect.jar ArraysKt

help:
	kotlinc -help


