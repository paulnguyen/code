clean:
	rm -f output/*

install:
	sudo npm install -g typescript
	sudo npm install -g ts-node

compile-all:
	tsc 

compile:
	tsc --outfile output/$(app).js $(app).ts

compile-2015:
	tsc --target es2015 --outfile output/$(app).js $(app).ts 

compile-strict:
	tsc --strict --noEmitOnError --outfile output/$(app).js $(app).ts

run: 
	tsc --outfile output/$(app).js $(app).ts
	node output/$(app).js
	
run1:
	node oop1.js 

run2:
	tsc --outfile output/oop2.js oop2.ts
	node output/oop2.js

hello:
	tsc --outfile output/hello.js hello.ts
	node output/hello.js

