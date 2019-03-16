
/*

Find, FindLast

Find and FindLast functions return the first or the last collection element
that matches the given predicate. If there are no such elements, functions
return null.


REF:  https://play.kotlinlang.org/byExample/05_Collections/06_find

*/


fun test_find() {

	// Defines a collection of words.
	val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  

	// Looks for the first word starting with "some".
	val first = words.find { it.startsWith("some") }                                

	// Looks for the last word starting with "some".
	val last = words.findLast { it.startsWith("some") }                             

	// Looks for the first word containing "nothing".
	val nothing = words.find { it.contains("nothing") }     

	println( "words: $words")
	println( "first: $first")
	println( "last: $last")                        
	println( "nothing: $nothing")                        

}


fun main() {

	test_find()

}