
/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/


// like a Singleton (compliler enforced)
// note: object can also extends / implements, etc...

object Formatter: Runnable {
	override fun run() {
		TODO( "Not Implemented!" )
	}
}

// companion objects - scoped to a class

class Formatting {
	// note: object can also extends / implements, etc...
	companion object {
		val pattern = "YYYY/MM/DD"
		fun format() : String {
			return "The String!"
		}
	}
}

// anonymous inner class

fun anon_inner_class() {
	val runnable : Runnable = object : Runnable {
		override fun run() {
			TODO( "Not Implemented!")
		}
	}
}

fun anon_lambda_way() {
	val runnable : Runnable = Runnable { TODO( "Not Implemented!") }
}


// Main 

fun main(args: Array<String>) {

	// calling companion object
	// looks like a static call
	val o = Formatting()
	println( o )
	// v.format() // doesn't work
	val v = Formatting.format()
	println( v )
	println( Formatting.pattern )

	// not allowed - can not call constructor
	// var f = Formatter()
	Formatter.run()

}

