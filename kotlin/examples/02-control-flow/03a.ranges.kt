
/*

Ranges

There is a set of tools for defining ranges in Kotlin. Let's have a brief look
at them.

REF:  https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges

*/


fun main() {

	// Iterates over a range starting from 0 up to 3 (inclusive).
	for(i in 0..3) {             
	    print(i)
	}
	print(" ")

	// Iterates over a range with a custom increment step for consecutive
	// elements.
	for(i in 2..8 step 2) {      
	    print(i)
	}
	print(" ")

	// Iterates over a range in reverse order.
	for (i in 3 downTo 0) {      
	    print(i)
	}
	print(" ")
	println()

}