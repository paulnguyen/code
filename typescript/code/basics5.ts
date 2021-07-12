/*

https://www.typescriptlang.org/docs/handbook/2/basic-types.html


Explicit Types

Up until now, we haven’t told TypeScript what person or date are. 
Let’s edit the code to tell TypeScript that person is a string, 
and that date should be a Date object. We’ll also use the 
toDateString() method on date.

*/

// This is an industrial-grade general-purpose greeter function:

function greet(person: string, date: Date) {
  console.log(`Hello ${person}, today is ${date.toDateString()}!`);
}

greet("Maddison", Date());

/*

Huh? TypeScript reported an error on our second argument, but why?

Perhaps surprisingly, calling Date() in JavaScript returns a string. 
On the other hand, constructing a Date with new Date() actually 
gives us what we were expecting.

Keep in mind, we don’t always have to write explicit type annotations. 
In many cases, TypeScript can even just infer (or “figure out”) the types 
for us even if we omit them.

let msg = "hello there!";

*/

let msg = "hello there!";
console.log(typeof msg)