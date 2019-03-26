/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

// Data Class - No need to implement equals(), hashcode() and toStrkng()

data class Student (
	val name: String,
	val age: Int,
	val grade: String
)

// Note: should have all "val" properties abut "var" is allowed
// Data Classes should be "Value Objects" and Immutable


// Main 

fun main(args: Array<String>) {

	var jim = Student( "Jim", 12, "7" )
	var jim2 = Student( "Jim", 12, "7" )
	var jimmy = Student( "Jimmy", 10, "5" )

	println( jim )
	println( jimmy )

	assert( jim == jim2 )
	//assert( jim == jimmy )
}


