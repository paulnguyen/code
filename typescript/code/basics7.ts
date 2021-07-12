/*

https://www.typescriptlang.org/docs/handbook/2/basic-types.html

Downleveling

One other difference from the above was that our template string was rewritten from

`Hello ${person}, today is ${date.toDateString()}!`;

to

"Hello " + person + ", today is " + date.toDateString() + "!";

Why did this happen?

Template strings are a feature from a version of ECMAScript called 
ECMAScript 2015 (a.k.a. ECMAScript 6, ES2015, ES6, etc. - don’t ask). 
TypeScript has the ability to rewrite code from newer versions of ECMAScript 
to older ones such as ECMAScript 3 or ECMAScript 5 (a.k.a. ES3 and ES5). 

This process of moving from a newer or “higher” version of ECMAScript down to an older 
or “lower” one is sometimes called downleveling.

*/

function greet(person: string, date: Date) {
  console.log(`Hello ${person}, today is ${date.toDateString()}!`);
}

greet("Maddison", new Date());


/*


By default TypeScript targets ES3, an extremely old version of ECMAScript. 
We could have chosen something a little bit more recent by using the --target flag. 
Running with --target es2015 changes TypeScript to target ECMAScript 2015, meaning 
code should be able to run wherever ECMAScript 2015 is supported. 
So running tsc --target es2015 hello.ts gives us the following output:

function greet(person, date) {
  console.log(`Hello ${person}, today is ${date.toDateString()}!`);
}
greet("Maddison", new Date());

*/