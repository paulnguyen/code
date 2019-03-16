
/*

GetOrElse

GgetOrElse provides safe access to elements of a collection. It takes an index
and a function that provides the default value in cases when the index is out
of bound.

REF:  https://play.kotlinlang.org/byExample/05_Collections/17_getOrElse

*/


fun main() {

	val list = listOf(0, 10, 20)

	// Prints the element at the index 1.
	println(list.getOrElse(1) { 42 })    

	// Prints 42 because the index 10 is out of bounds.
	println(list.getOrElse(10) { 42 })  

	// Prints the default value because the key "x" is not in the map.
	val map = mutableMapOf<String, Int?>()
	println(map.getOrElse("x") { 1 })       

	// Prints 3, the value for the key "x".
	map["x"] = 3
	println(map.getOrElse("x") { 1 })       

	// Prints the default value because the value for the key "x" is not defined.
	map["x"] = null
	println(map.getOrElse("x") { 1 })       

}
