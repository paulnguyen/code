
/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

// Calendar Class with Extenstion Function
// as Constructor Argument.  

class Calendar( func: Calendar.() -> Unit ) {

	// year function takes additional lambda func
	fun year( year: Int, func: Year.() -> Unit ) {
		Year(year).func()	
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
