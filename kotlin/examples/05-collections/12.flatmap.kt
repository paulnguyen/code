
/*

FlatMap

FlatMap transforms each element of a collection into an iterable object and
builds a single list of the transformation results. The transformation is
user-defined.

REF:  https://play.kotlinlang.org/byExample/05_Collections/12_flatMap

*/


fun main() {

	// Defines a collection of numbers.
	val numbers = listOf(1, 2, 3)                        

	// Builds a list in which every collection element is repeated three
	// times. Important thing is that it's not a list of lists; it's a list of
	// integers with nine elements.
	val tripled = numbers.flatMap { listOf(it, it, it) } 

	println( "numbers: $numbers")                        
	println( "tripled: $tripled") 
}