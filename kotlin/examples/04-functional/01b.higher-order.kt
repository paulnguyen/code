
/*

Higher-Order Functions

A higher-order function is a function that takes another function as parameter
and/or returns a function.

REF:  https://play.kotlinlang.org/byExample/04_functional/01_Higher-Order%20Functions

*/


// Returning Functions

// Declares a higher-order function that returns a function.
fun operation(): (Int) -> Int {                                     
    return ::square
}

// Declares a function matching the signature.
fun square(x: Int) = x * x                                        

fun main() {

	// Invokes operation to get the result assigned to a variable. Here func
	// becomes square which is returned by operation.
    val func = operation()             

    // Invokes func. The square function is actually executed.
    println(func(2))                                                

}