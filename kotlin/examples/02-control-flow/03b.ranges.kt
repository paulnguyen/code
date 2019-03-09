

/*

Char ranges are also supported: 

REF:  https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges

*/


fun main() {

	// Iterates over a char range in alphabetical order.
	for (c in 'a'..'d') {        
	    print(c)
	}
	print(" ")

	// Char ranges support step and downTo as well.
	for (c in 'z' downTo 's' step 2) { 
	    print(c)
	}
	print(" ")
	
	println()
}