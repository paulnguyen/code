
/*

When Statement

Instead of the widely used switch statement, Kotlin provides the more flexible
and clear when construction. It can be used either as a statement or as an
expression.

REF:  https://play.kotlinlang.org/byExample/02_control_flow/01_When

*/


fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {           

	// This is a when statement. Note that all branch conditions are checked
	// sequentially until one of them is satisfied. So, only the first
	// suitable branch will be executed.
	
    when (obj) {
        1 -> println("One")                          // Checks whether obj equals to one.
        "Hello" -> println("Greeting")               // Checks whether obj equals to Hello.
        is Long -> println("Long")                   // Performs type checking.
        !is String -> println("Not a string")        // Performs inverse type checking.
        else -> println("Unknown")                   // Default statement (might be omitted).
    }   
}

class MyClass