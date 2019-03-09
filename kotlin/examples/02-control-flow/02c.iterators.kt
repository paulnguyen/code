

/*

Iterators

You can define your own iterators in your classes by implementing the iterator
operator in them.

REF:  https://play.kotlinlang.org/byExample/02_control_flow/02_Loops

*/


class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

	// Defines an iterator in a class. It must be named iterator and have the
	// operator modifier.

    operator fun iterator(): Iterator<Animal> {       

        return animals.iterator()    // Returns the iterator that meets 
        							 // the following method requirements:
    								 //  next(): Animal
    								//   hasNext(): Boolean
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    // Loops through animals in the zoo with the user-defined iterator.
    // he iterator can be declared in the type or as an extension function.
    
    for (animal in zoo) {                                   
        println("Watch out, it's a ${animal.name}")
    }

}


