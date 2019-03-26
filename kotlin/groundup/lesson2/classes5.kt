/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

// implementations of Suit are locked to same compliation unit
// Note: sealed classes are by default "abstract"

sealed class Suit

class Heart : Suit()
class Diamond : Suit()
class Club : Suit()
class Spades : Suit()

// Main 

fun main(args: Array<String>) {

	val h : Suit = Heart()
	println( h )

}


