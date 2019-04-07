
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
class Year( val value : Int ){

	val months = mutableMapOf<String, Month>()

	init {
		// months += java.time.Month.values().map { it.name to Month() }
		// 	.toMap()
	}

	// Add January Function
	fun january( func: Month.() -> Unit ) {
		months["january"]?.func()
	}

}

// Month Class
class Month( val value : Int ) {

	val days = TreeMap<Int, Day>()

	fun day( value: Int, func: Day.() -> Unit ) {
		days.getOrPut( value ) { Day(value) }
			.func()
	}

}

// Day Class
class Day(var value : Int) {

	val events = mutableListOf<Event>()

	fun from( range: IntRange, function: Event.() -> Unit ) {
		val event = Event()
		events += event 
		event.function()
	}

}

class Event {
	var title : String = ""
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
			year(2018) {
				january {
					day(1) {
						from( 1..8 ) {
							title = "Sleeping" 
						}
					}
				}
			}
		}
	}

}
