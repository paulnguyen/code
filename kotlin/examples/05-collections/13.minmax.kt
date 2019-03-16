
/*

Min, Max

Min and Max functions return the smallest and the largest element of a
collection. If the collection is empty, they return null.

REF:  https://play.kotlinlang.org/byExample/05_Collections/13_max

*/


fun main() {

	val numbers = listOf(1, 2, 3)
	val empty = emptyList<Int>()

	// For non-empty collection functions return the smallest and the largest
	// element.
	println("Numbers: $numbers, min = ${numbers.min()} max = ${numbers.max()}") 

	// For empty collections both functions return null.
	println("Empty: $empty, min = ${empty.min()}, max = ${empty.max()}")        


}