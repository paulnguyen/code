
/*

First, Last

These functions return the first and the last element of the collection
correspondingly. You can also use them with a predicate; in this case, they
return the first or the last element that matches the given predicate.

REF:  https://play.kotlinlang.org/byExample/05_Collections/07_firstlast

*/


// first, last:
//
// If a collection is empty or doesn't contain elements matching the
// predicate, the functions throw NoSuchElementException.

fun test1() {

	val numbers = listOf(1, -2, 3, -4, 5, -6)            // Defines a collection of numbers.

	val first = numbers.first()                          // Picks the first element.
	val last = numbers.last()                            // Picks the last element.

	val firstEven = numbers.first { it % 2 == 0 }        // Picks the first even element.
	val lastOdd = numbers.last { it % 2 != 0 }           // Picks the last odd element.

	println( "*** test1 ***" )
	println( "numbers: $numbers")
	println( "first: $first")
	println( "last: $last")                        
	println( "firstEven: $firstEven") 	
	println( "lastOdd: $lastOdd") 	

}



// firstOrNull, lastOrNull:
//
// These functions work almost the same way with one difference: they return
// null if there are no matching elements.

fun test2() {

	val words = listOf("foo", "bar", "baz", "faz")         // Defines a collection of words.
	val empty = emptyList<String>()                        // Defines an empty collection.

	val first = empty.firstOrNull()                        // Picks the first element from empty collection. It supposed to be null.
	val last = empty.lastOrNull()                          // Picks the last element from empty collection. It supposed to be null as well.

	val firstF = words.firstOrNull { it.startsWith('f') }  // Picks the first word starting with 'f'.
	val firstZ = words.firstOrNull { it.startsWith('z') }  // Picks the first word starting with 'z'.
	val lastF = words.lastOrNull { it.endsWith('f') }      // Picks the last word ending with 'f'.
	val lastZ = words.lastOrNull { it.endsWith('z') }      // Picks the last word ending with 'z'.

	println( "*** test2 ***" )
	println( "words: $words")
	println( "empty: $empty")

	println( "first: $first")
	println( "last: $last")                        

	println( "firstF: $firstF") 	
	println( "firstZ: $firstZ") 		
	println( "lastF: $lastF") 		
	println( "lastZ: $lastZ") 			

}


fun main() {

	test1()
	test2()

}
