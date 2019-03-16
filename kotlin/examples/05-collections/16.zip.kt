
/*

Zip

Zip function merges two given collections into a new collection. By default,
the result collection contains Pairs of source collection elements with the
same index. However, you can define own structure of the result collection
element.

The size of the result collection equals to the minumum size of a source
collection.

REF:  https://play.kotlinlang.org/byExample/05_Collections/16_zip

*/


fun main() {

	// Defines two collections.
	val A = listOf("a", "b", "c")                  
	val B = listOf(1, 2, 3, 4)                     

	// Merges them into a list of pairs. The infix notation is used here.
	val resultPairs = A zip B                      

	// Merges them into a list of String values by the given transformation.
	val resultReduce = A.zip(B) { a, b -> "$a$b" } 

	println( "A: $A")                        
	println( "B: $B")                        
	println( "resultPairs: $resultPairs") 		
	println( "resultReduce: $resultReduce") 	

}


