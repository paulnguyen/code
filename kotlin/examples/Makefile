

all: clean

clean: 
	rm -f *.jar

compile:
	kotlinc $(app).kt -include-runtime -d $(app).jar

run: compile
	java -jar $(app).jar

help:
	kotlinc -help


