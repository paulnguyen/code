
/*

Object Expression

Here is a basic typical usage of an object expression: a simple
object/properties structure. There is no need to do so in class declaration:
you create a single object, declare its members and access it within one
function. Objects like this are often created in Java as anonymous class
instances.


REF:  https://play.kotlinlang.org/byExample/03_special_classes/04_Object

*/


/*

In Kotlin you also have the object keyword. It is used to obtain a data type
with a single implementation.

If you are a Java user and want to understand what "single" means, you can
think of the Singleton pattern: it ensures you that only one instance of that
class is created even if 2 threads try to create it.

To achieve this in Kotlin, you only need to declare an object: no class, no
constructor, only a lazy instance. Why lazy? Because it will be created once
when the object is accessed. Otherwise, it won't even be created.

*/


// Creates a function with parameters.
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  

    // Creates an object to use when calculating the result value.
    val dayRates = object {                                                     
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    // Accesses the object's properties.
    val total = dayRates.standard + dayRates.festivity + dayRates.special       

    // Prints the result.
    println("Total price: $$total")                                               

}

fun main() {
    // Calls the function. This is when the object is actually created.
    rentPrice(10, 2, 1)                                                       
}





