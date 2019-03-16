
/*

String Templates

String templates allow you to include variable references and expressions into
strings. When the value of a string is requested (for example, by println),
all references and expressions are substituted with actual values.

REF:  https://play.kotlinlang.org/byExample/08_productivity_boosters/02_String%20Templates

*/


fun main() {

	val greeting = "Kotliner"

	println("Hello $greeting")                  // 1 
	println("Hello ${greeting.toUpperCase()}")  // 2

}

