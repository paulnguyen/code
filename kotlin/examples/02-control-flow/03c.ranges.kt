

/*

Ranges are also useful in if statements:

REF:  https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges

*/


fun main() {

	val x = 2
	if (x in 1..10) {  // Checks if a value is in the range.
	    print(x)
	}
	print(" ")

	if (x !in 1..4) { // !in is the opposite of in.
	    print(x)
	}

	println()

}