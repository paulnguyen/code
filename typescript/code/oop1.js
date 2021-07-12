// JavaScript is "Object Centric" and "Not Class Centric"

var obj1 = new Object();
var obj2 = {};

console.log( obj1 ) ;
console.log( obj2 ) ;

var obj3 = {
  name: 'Carrot',
  customer: 'Max', 
  details: {
    color: 'orange',
    size: 12
  }
};

console.log( obj3.details.color ) ; // orange
console.log( obj3['details']['size'] ) ; // 12

// Define an object 

function Person(name, age) {
  this.name = name;
  this.age = age;
}
var you = new Person('You', 24); 
console.log( you )

var obj = {}

// dot notation
obj.name = 'Simon';
var name = you.name;

// bracket notation

obj['name'] = 'Simon';
var name = obj['name'];

// add new method at runtime
obj.hello = function() {
  console.log( "Hello!  I'm " + name ) ;
} 

obj.hello() ;
console.log( obj ) ;
