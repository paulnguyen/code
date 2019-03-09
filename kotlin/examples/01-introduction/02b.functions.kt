
/*

Infix Functions

Member functions and extensions with a single parameter can be turned into infix functions.

REF: https://play.kotlinlang.org/byExample/01_introduction/02_Functions

Infix notation

Functions marked with the infix keyword can also be called using the infix
notation (omitting the dot and the parentheses for the call). Infix functions
must satisfy the following requirements:

1. They must be member functions or extension functions;

2. They must have a single parameter;

3. The parameter must not accept variable number of arguments and must
   have no default value.

	infix fun Int.shl(x: Int): Int { ... }

// calling the function using the infix notation

	1 shl 2

// is the same as

	1.shl(2)

*/

fun main() {

  // Defines an infix extension function on Int.
  infix fun Int.times(str: String) = str.repeat(this)        
  println(2 times "Bye ")                                    

  // Creates a Pair by calling the infix function to from the standard library.
  val pair = "Ferrari" to "Katrina"                          
  println(pair)

  // Here's your own implementation of to creatively called onto
  infix fun String.onto(other: String) = Pair(this, other)   
  val myPair = "McLaren" onto "Lucas"
  println(myPair)

  val sophia = Person("Sophia")
  val claudia = Person("Claudia")
  sophia likes claudia  // Infix notation also works on members functions (methods).                                     
}

class Person(val name: String) {
  val likedPeople = mutableListOf<Person>()
  // The containing class becomes the first parameter.
  infix fun likes(other: Person) { likedPeople.add(other) }  
}


