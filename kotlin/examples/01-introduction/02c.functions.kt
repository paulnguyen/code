
/*

Operator Functions

Certain functions can be "upgraded" to operators, allowing their calls with
the corresponding operator symbol.

REF:  https://play.kotlinlang.org/byExample/01_introduction/02_Functions

*/


fun main() {

	// This takes the infix function from above one step further using the operator modifier.
	operator fun Int.times(str: String) = str.repeat(this)       

	// The operator symbol for times() is * so that you can call the function using 2 * "Bye".
	println(2 * "Bye ")                                          


	// An operator function allows easy range access on strings.
	operator fun String.get(range: IntRange) = substring(range)  

	// The get() operator enables bracket-access syntax.
	val str = "Always forgive your enemies; nothing annoys them so much."
	println(str[0..14])         

}                                 


