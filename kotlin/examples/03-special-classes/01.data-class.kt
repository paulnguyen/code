
/*

Data Classes

Data classes make it easy to create classes that are used to store values.
Such classes are automatically provided with methods for copying, getting a
string representation, and using instances in collections.

https://play.kotlinlang.org/byExample/03_special_classes/01_Data%20classes

*/

// Defines a data class with the data modifier.
data class User (val name: String, val id: Int)            

fun main() {

    val user = User("Alex", 1)

    // Method toString is auto-generated, which makes println output look
    // nice.
    println(user)  

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Auto-generated equals considers two instances equal if all their
    // properties are equal.
    println("user == secondUser: ${user == secondUser}")   
    println("user == thirdUser: ${user == thirdUser}")

    // Equal data class instances have equal hashCode().
    println(user.hashCode())                               
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())        // Auto-generated copy function makes it easy to create a new instance.

    println(user.copy("Max"))   // When copying, you can change values of certain properties. 
    							//   copy accepts arguments in the same order as the class constructor.                         // 6
    
    println(user.copy(id = 2))  // Use copy with named arguments to change the value despite of the properties order.                    
    
    // Auto-generated componentN functions let you get the values of
    // properties in the order of declaration.
    println("name = ${user.component1()}")                 
    println("id = ${user.component2()}")
}


