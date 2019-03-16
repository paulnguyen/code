

/*

Any, All, None

These functions check the existence of collection elements that match a given
predicate.

REF:  https://play.kotlinlang.org/byExample/05_Collections/05_existential

*/


// Function any returns true if the collection contains at least one element
// that matches the given predicate.

fun test_any() {

	// Defines a collection of numbers.
	val numbers = listOf(1, -2, 3, -4, 5, -6)            

	// Checks if there are negative elements.
	val anyNegative = numbers.any { it < 0 }             

	// Checks if there are elements greater than 6.
	val anyGT6 = numbers.any { it > 6 }  

	println( "any - numbers: $numbers")
	println( "any - anyNegative: $anyNegative")
	println( "any - anyGT6: $anyGT6")

}
                


// Function all returns true if all elements in collection match the given
// predicate.

fun test_all() {

	// Defines a collection of numbers.
	val numbers = listOf(1, -2, 3, -4, 5, -6)            

	// Checks whether all elements are even.
	val allEven = numbers.all { it % 2 == 0 }            

	// Checks whether all elements are less than 6.
	val allLess6 = numbers.all { it < 6 }    

	println( "all - numbers: $numbers")
	println( "all - allEven: $allEven")
	println( "all - allLess6: $allLess6")	

}
            


// Function none returns true if there are no elements that match the given
// predicate in the collection.

fun test_none() {

	// Defines a collection of numbers.
	val numbers = listOf(1, -2, 3, -4, 5, -6)            

	// Checks if there are no odd elements (all elements are even).
	val allEven = numbers.none { it % 2 == 1 }           

	// Checks if there are no elements greater than 6.
	val allLess6 = numbers.none { it > 6 } 

	println( "none - numbers: $numbers")
	println( "none - allEven: $allEven")
	println( "none - allLess6: $allLess6")	

}
              

fun main() {

	test_any()
	test_all()
	test_none()

}


