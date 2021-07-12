/*

https://www.typescriptlang.org/docs/handbook/2/basic-types.html


Erased Types

Let’s take a look at what happens when we compile the function 
greet with tsc to output JavaScript:

*/

function greet(person: string, date: Date) {
  console.log(`Hello ${person}, today is ${date.toDateString()}!`);
}

greet("Maddison", new Date());

/*

Notice two things here:

1. Our person and date parameters no longer have type annotations.

2. Our “template string” - that string that used backticks (the ` character) 
   - was converted to plain strings with concatenations (+).

More on that second point later, but let’s now focus on that first point. 
Type annotations aren’t part of JavaScript (or ECMAScript to be pedantic), 
so there really aren’t any browsers or other runtimes that can just run TypeScript 
unmodified. That’s why TypeScript needs a compiler in the first place - it needs some 
way to strip out or transform any TypeScript-specific code so that you can run it. 

Most TypeScript-specific code gets erased away, and likewise, here our type annotations 
were completely erased.

*/
