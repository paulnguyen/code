
/*

Sorted

Sorted returns a list of collection elements sorted according to their natural
sort order (ascending). sortedBy sorts elements according to natural sort
order of the values returned by specified selector function.

REF:  https://play.kotlinlang.org/byExample/05_Collections/14_sorted

*/

fun main() {

	// Defines a collection of shuffled numbers.
	val shuffled = listOf(5, 4, 2, 1, 3)     

	// Sorts it in the natural order.
	val natural = shuffled.sorted()          

	// Sorts it in the inverted natural order by using -it as a selector function.
	val inverted = shuffled.sortedBy { -it } 

	println( "shuffled: $shuffled")                        
	println( "natural: $natural")                        
	println( "inverted: $inverted") 		

}