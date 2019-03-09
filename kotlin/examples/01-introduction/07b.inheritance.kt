
/*

Inheritance with Parameterized Constructor

REF:  https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance

*/


open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

// If you want to use a parameterized constructor of the superclass when
// creating a subclass, provide the constructor arguments in the subclass
// declaration.

class SiberianTiger : Tiger("Siberia")                  

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}

