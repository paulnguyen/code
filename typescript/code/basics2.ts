/*

https://www.typescriptlang.org/docs/handbook/2/basic-types.html

Non-exception Failures

So far we’ve been discussing certain things like runtime errors - cases where the JavaScript 
runtime tells us that it thinks something is nonsensical. Those cases come up because the 
ECMAScript specification has explicit instructions on how the language should behave when 
it runs into something unexpected.

For example, the specification says that trying to call something that isn’t callable should 
throw an error. Maybe that sounds like “obvious behavior”, but you could imagine that accessing 
a property that doesn’t exist on an object should throw an error too. Instead, JavaScript gives 
us different behavior and returns the value undefined:

*/

const user = {
  name: "Daniel",
  age: 26,
};

user.location; // returns undefined

/*

While sometimes that implies a trade-off in what you can express, 
the intent is to catch legitimate bugs in our programs. And TypeScript 
catches a lot of legitimate bugs.

For example: typos,

*/

const announcement = "Hello World!";

// How quickly can you spot the typos?
announcement.toLocaleLowercase();
announcement.toLocalLowerCase();

// We probably meant to write this...
announcement.toLocaleLowerCase();

