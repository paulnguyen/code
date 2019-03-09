
/*

Object Keyword

Classes and objects in Kotlin work the same way as in most object-oriented
languages: a class is a blueprint, and an object is an instance of a class.
Usually, you define a class and then create multiple instances of that class:

REF:  https://play.kotlinlang.org/byExample/03_special_classes/04_Object

*/


import java.util.Random

// Defines a blueprint.
class LuckDispatcher {     
	// Defines a method.              
    fun getNumber() {                     
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {

	// Creates instances.
    val d1 = LuckDispatcher()             
    val d2 = LuckDispatcher()
    
    // Calls the method on instances.
    d1.getNumber()                        
    d2.getNumber()

}



