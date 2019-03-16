
/*

Smart Casts

The Kotlin compiler is smart enough to perform type casts automatically in
most cases, including: 1. Casts from nullable types to their non-nullable
counterparts. 2. Casts from a supertype to a subtype.

REF:  https://play.kotlinlang.org/byExample/08_productivity_boosters/04_Smart%20Casts

*/


fun main() {

	val date: ChronoLocalDate? = LocalDate.now()    // 1

	if (date != null) {
	    println(date.isLeapYear)                    // 2
	}

	if (date != null && date.isLeapYear) {          // 3
	    println("It's a leap year!")
	}

	if (date == null || !date.isLeapYear) {         // 4
	    println("There's no Feb 29 this year...")
	}

	if (date is LocalDate) {
	    val month = date.monthValue                 // 5
	    println(month)
	}

}
