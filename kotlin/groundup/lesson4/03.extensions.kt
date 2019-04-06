
/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

fun titleCase( string : String ) : String {
	return string.split( " " )
		.map{ it[0].toUpperCase() + it.substring(1)}
		.joinToString("")
}

fun fun1 () {
	val string = "I am a full sentence."
	println( titleCase(string) )
}

fun String.toTitleCase() : String{
	return split( " " )
		.map{ it[0].toUpperCase() + it.substring(1)}
		.joinToString("")	
}

fun fun2 () {
	val string = "I am a full sentence."
	println( string.toTitleCase() )
	println(  "I am a full sentence.".toTitleCase() )
}

enum class Letter { A, B, C }

fun String.toLetter() : Letter {
	return try {
			Letter.valueOf( this )
		} catch ( e: IllegalArgumentException ) {
			Letter.A
		}
}

fun fun3() {
	println( "A".toLetter() )
	println( "a".toLetter() )
}

data class Student(
	val name : String,
	val age : Int
)

data class Class( 
	val students : List<Student>
)

val Class.oldest : Student?
	get() = students.maxBy { it.age  }

fun fun4() {
	val classroom = Class( listOf(
			Student("Jane",12),
			Student("Jimmy", 13),
			Student("Harod", 11)
		))
	println( classroom )
	println( classroom.oldest )
}

// Main 

fun main(args: Array<String>) {

	//fun1()
	//fun2()
	//fun3()
	fun4()

}
