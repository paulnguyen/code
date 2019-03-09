
/*

Enum Classes

Enum classes are used to model types that represent a finite set of distinct
values, such as directions, states, modes, and so forth.

REF:  https://play.kotlinlang.org/byExample/03_special_classes/02_Enum

*/


// Enums may contain properties and methods like other classes, separated from
// the list of instances by a semicolon.

// Defines an enum class with a property and a method.
enum class Color(val rgb: Int) {     
	
	// Each instance must pass an argument for the constructor parameter.                 
    RED(0xFF0000),                                    
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);  // Enum class members are separated from the instance definitions by a semicolon.

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  
}

fun main() {
    val red = Color.RED

    // The default toString returns the name of the instance, here "RED".
    println(red)    

    // Calls a method on a enum instance.
    println(red.containsRed())                        

    // Calls a method via enum class name.
    println(Color.BLUE.containsRed())                 
}



