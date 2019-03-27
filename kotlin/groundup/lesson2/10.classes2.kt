/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

abstract class Base : Runnable

class Child : Base() {
	
	override fun run() {
		TODO( "Not Implemented!" )
	}

	fun important() : String {
		TODO( "Important! Need to finish me.")
		// no need to return empty string here!
	}
}

// Main 

fun main(args: Array<String>) {
	//Child().run()	
	Child().important()
}


/*

Note: TODO will never return anything.

@kotlin.internal.InlineOnly
public inline fun TODO( reason : String ) Nothing 
	throws NotImplementedError( " An operation is not implemented: Not Implemented!" )

*/


