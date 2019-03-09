
/*

Variables 

Kotlin has powerful type inference. While you can explicitly declare
the type of a variable, you'll usually let the compiler do the work by
inferring it. Kotlin does not enforce immutability, though it is recommended.
In essence use val over var.

REF:  https://play.kotlinlang.org/byExample/01_introduction/03_Variables

*/

// Declares a mutable variable and initializing it.
var a: String = "initial"  

// Declares an immutable variable and initializing it.
val b: Int = 1             

// Declares an immutable variable and initializing it without specifying the
// type. The compiler infers the type Int.
val c = 3        

// Declares a variable without initialization.
// var e: Int  

fun main () {

	println(a)
          
    // An attempt to use the variable causes a compiler error: Variable 'e'
    // must be initialized.
    // println(e)

    // You're free to choose when you initialize a variable, however, it must
    // be initialized before the first read.
    fun okay() {

    	val d: Int  // Declares a variable without initialization.

    	// Initializes the variable with different values depending on some condition.
		if (1==1) {
		    d = 1   
		} else {
		    d = 2   
		}

		// Reading the variable is possible because it's already been initialized
		println(d) 
    }

    okay()

}