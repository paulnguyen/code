/*

Partition

Partition function splits the original collection into pair of lists using a
given predicate: Elements for which the predicate is true. Elements for which
the predicate is false.

REF:  https://play.kotlinlang.org/byExample/05_Collections/11_partition

*/

fun main() {

	// Defines a collection of numbers.
	val numbers = listOf(1, -2, 3, -4, 5, -6)               

	// Splits numbers into a Pair of lists with even and odd numbers.
	val evenOdd = numbers.partition { it % 2 == 0 }           

	// Splits numbers into two lists with positive and negative numbers. Pair
	// destructuring is applied here to get the Pair members.
	val (positives, negatives) = numbers.partition { it > 0 } 

	println( "numbers: $numbers")                        
	println( "evenOdd: $evenOdd")                        
	println( "positives: $positives") 	
	println( "negatives: $negatives") 	

}