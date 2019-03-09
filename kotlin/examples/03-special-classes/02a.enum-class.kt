
/*

Enum Classes

Enum classes are used to model types that represent a finite set of distinct
values, such as directions, states, modes, and so forth.

REF:  https://play.kotlinlang.org/byExample/03_special_classes/02_Enum

*/

// Defines a simple enum class with three enum instances. The number of
// instances is always finite and they are all distinct.
enum class State {
    IDLE, RUNNING, FINISHED                           
}

fun main() {
    val state = State.RUNNING                         // Accesses an enum instance via the class name.
    
	// With enums, the compiler can infer if a when-expression is exhaustive
	// so that you don't need the else-case.
    val message = when (state) {                      
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    
    println(message)
}

