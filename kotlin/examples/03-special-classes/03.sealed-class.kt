
/*

Sealed Classes

Sealed classes let you restrict the use of inheritance. Once you declare a
class sealed, nobody else can create its subclasses.

REF:  https://play.kotlinlang.org/byExample/03_special_classes/03_Sealed%20Classes

*/


// Defines a sealed class.
sealed class Mammal(val name: String)                                                   

// Defines subclasses. Note that all subclasses must be in the same file.
class Cat(val catName: String) : Mammal(catName)                                        
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {

	// Uses an instance of the sealed class as an argument in a when expression.
    when (mammal) {               
    	// A smartcast is performed, casting Mammal to Human.                                                      
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    
        // A smartcast is performed, casting Mammal to Cat.
        is Cat -> return "Hello ${mammal.name}"                                           
    }                                         
    // The else-case is not necessary here since all possible subclasses of
    // the sealed class are covered. With a non-sealed superclass else would
    // be required.
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}


