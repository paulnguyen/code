
/*

Conditional Expression

There is no ternary operator condition ? then : else in Kotlin. Instead, if
may be used as an expression:

REF:  https://play.kotlinlang.org/byExample/02_control_flow/05_Conditional%20expression

*/


fun main() {

	// if is an expression here: it returns a value.
	fun max(a: Int, b: Int) = if (a > b) a else b         

	println(max(99, -42))

}