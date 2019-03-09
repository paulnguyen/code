
/*

Passing Constructor Arguments to Superclass

REF:  https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance

*/


open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

// name in the Asiatic declaration is neither a var nor val: it's a
// constructor argument, whose value is passed to the name property of the
// superclass Lion.

class Asiatic(name: String) : Lion(name = name, origin = "India") 

fun main() {

	// Creates an Asiatic instance with the name Rufo. The call invokes the
	// Lion constructor with arguments Rufo and India.

    val lion: Lion = Asiatic("Rufo")      
                            
    lion.sayHello()
}

