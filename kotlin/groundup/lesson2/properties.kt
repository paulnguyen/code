

/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

var count = 10
	get()	= field * 2
	set(value) {
		if ( value < 0)
			println( "Can't set value < 0!")
		else
			field = value
	}

val name = "Uncle Bob"
	get()	= "Hello " + field
	//set(value)  = value // not allowed

lateinit var title : String // not nullable, but must set the value before use

fun main(args: Array<String>) {

	println( "Count: $count" )
	println( "Name: $name" )
	count = 100
	println( "Count: $count" )
	title = "Kings Plays Chess..."
	println( "Title: $title" )

}
