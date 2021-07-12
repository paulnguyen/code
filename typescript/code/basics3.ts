
/*

https://www.typescriptlang.org/docs/handbook/2/basic-types.html

Static type-checking

Think back to that TypeError we got earlier from trying to call a string as a function. 
Most people don’t like to get any sorts of errors when running their code - those are 
considered bugs! And when we write new code, we try our best to avoid introducing new bugs.

If we add just a bit of code, save our file, re-run the code, and immediately see the error, 
we might be able to isolate the problem quickly; but that’s not always the case. We might 
not have tested the feature thoroughly enough, so we might never actually run into a potential 
error that would be thrown! Or if we were lucky enough to witness the error, we might have 
ended up doing large refactorings and adding a lot of different code that we’re forced to dig 
through.

Ideally, we could have a tool that helps us find these bugs before our code runs. 
That’s what a static type-checker like TypeScript does. Static types systems describe 
the shapes and behaviors of what our values will be when we run our programs. 
A type-checker like TypeScript uses that information and tells us when things might 
be going off the rails.

*/

const message = "Hello World!";

// Accessing the property 'toLowerCase'
// on 'message' and then calling it
message.toLowerCase();

// Calling 'message'
message();

