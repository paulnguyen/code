
/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

// Calendar Class with Extenstion Function
// as Constructor Argument.  
class Calendar( func: Calendar.() -> Unit ) {

	fun year( i: Int ) {
		
	}

}


// Main 

fun main(args: Array<String>) {

	// A Calendar DSL
	fun calendar() {

		// Invoke Calendar Constructor
		// Passing in a Lambda.
		// Note:  Lambda moved outside of ()'s
		// Since it's the last item in Arg List
		
		Calendar {
			year(2018)
		}
	}

}
