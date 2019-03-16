
/*

Filter

Filter function enables you to filter collections. It takes a filter predicate
as a lambda-parameter. The predicate is applied to each element. Elements that
make the predicate true are returned in the result collection.

REF:  https://play.kotlinlang.org/byExample/05_Collections/04_filter

*/

// Defines collection of numbers.
val numbers = listOf(1, -2, 3, -4, 5, -6)      

// Gets positive numbers.
val positives = numbers.filter { x -> x > 0 } 

// Uses the shorter it notation to get negative numbers.
val negatives = numbers.filter { it < 0 }      

fun main() {

	println( "numbers: $numbers")
	println( "positives: $positives")
	println( "negatives: $negatives")

}