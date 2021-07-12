/*

https://www.typescriptlang.org/docs/handbook/2/basic-types.html

Strictness

Different users come to TypeScript looking for different things in a type-checker. 
Some people are looking for a more loose opt-in experience which can help validate 
only some parts of their program, and still have decent tooling. This is the default 
experience with TypeScript, where types are optional, inference takes the most lenient types, 
and there’s no checking for potentially null/undefined values. Much like how tsc emits in the 
face of errors, these defaults are put in place to stay out of your way. If you’re migrating 
existing JavaScript, that might be a desirable first step.

In contrast, a lot of users prefer to have TypeScript validate as much as it can straight away, 
and that’s why the language provides strictness settings as well. These strictness settings turn 
static type-checking from a switch (either your code is checked or not) into something closer to 
a dial. The further you turn this dial up, the more TypeScript will check for you. This can require 
a little extra work, but generally speaking it pays for itself in the long run, and enables more 
thorough checks and more accurate tooling. When possible, a new codebase should always turn these 
strictness checks on.

TypeScript has several type-checking strictness flags that can be turned on or off, 
and all of our examples will be written with all of them enabled unless otherwise stated. 
The --strict flag in the CLI, or "strict": true in a tsconfig.json toggles them all on 
simultaneously, but we can opt out of them individually. The two biggest ones you should know 
about are noImplicitAny and strictNullChecks.

noImplicitAny

Recall that in some places, TypeScript doesn’t try to infer any types for us and instead 
falls back to the most lenient type: any. This isn’t the worst thing that can happen 
- after all, falling back to any is just the plain JavaScript experience anyway.

However, using any often defeats the purpose of using TypeScript in the first place. 
The more typed your program is, the more validation and tooling you’ll get, meaning you’ll 
run into fewer bugs as you code. Turning on the noImplicitAny flag will issue an error on 
any variables whose type is implicitly inferred as any.

strictNullChecks

By default, values like null and undefined are assignable to any other type. This can make 
writing some code easier, but forgetting to handle null and undefined is the cause of 
countless bugs in the world - some consider it a billion dollar mistake! 

The strictNullChecks flag makes handling null and undefined more explicit, and spares us 
from worrying about whether we forgot to handle null and undefined.

*/

function greet(person: string, date: Date) {
  console.log(`Hello ${person}, today is ${date.toDateString()}!`);
}

//greet("Maddison", null);
greet("Maddison", new Date());


class Generic<T = string> {
  private readonly list: T[] = []

  add(t: T) {
    this.list.push(t)
  }

  log() {
    console.log(this.list)
  }

}

/*
const generic = new Generic()
generic.add('hello world') // Works
generic.add(4) // Error: Argument of type '4' is not assignable to parameter of type 'string'
generic.add({t: 33}) // Error: Argument of type '{ t: number; }' is not assignable to parameter of type 'string'
generic.log()
*/

const genericAny = new Generic<any>()
// All of the following compile successfully
genericAny.add('hello world')
genericAny.add(4)
genericAny.add({t: 33})
genericAny.log()