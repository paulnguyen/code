
/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

import java.util.TreeMap

// Calendar Class with Extenstion Function
// as Constructor Argument.  

class Calendar( func: Calendar.() -> Unit ) {

	init {
		func()
	}

	// need to keep track of years
	val years = TreeMap<Int, Year>()

	// year function takes additional lambda func
	fun year( value: Int, func: Year.() -> Unit ) {
		val year = Year(value)
		years.put( value, year )
		year.func()	
	}

}

// Year Class

class Year( val value : Int )

// Main 

fun main(args: Array<String>) {

	// A Calendar DSL
	fun calendar() {

		// Invoke Calendar Constructor
		// Passing in a Lambda.
		// Note:  Lambda moved outside of ()'s
		// Since it's the last item in Arg List
		
		Calendar {
			year(2018) {
				// year func now requests lambda
			}
		}
	}

}
