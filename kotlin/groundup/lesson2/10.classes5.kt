/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

// implementations of Suit are locked to same compliation unit
// Note: sealed classes are by default "abstract"

sealed class Suit {
	abstract fun foo()
}

class Heart : Suit() {
	override fun foo() {
		TODO( "Not Implemented")
	}
}

class Diamond : Suit() {
	override fun foo() {
		TODO( "Not Implemented")
	}
}

class Club : Suit() {
	override fun foo() {
		TODO( "Not Implemented")
	}
}

class Spades : Suit() {
	override fun foo() {
		TODO( "Not Implemented")
	}
}

// Main 

fun main(args: Array<String>) {

	val h : Suit = Heart()
	println( h )

}


