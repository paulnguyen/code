
/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/


fun main(args: Array<String>) {

    println ( "** String **")
    print_string( "Hello" )

    // Multiline Strings
    println ( """ This is a Multi-Line 
    	          String.  The End!
    	      """ )

}

fun foo1() : String { return "bar" }
fun foo2( n : Int ) : String { return "bar"+n  }
fun foo3( s : String ) : String { return "bar"+s  }

fun print_string( str : String ) {

	val abc : String = "xyz"

	// typicall Java Way
	println ( "The String (Java Way): " + str )

	// Kotlin Way with String Templates
	println ( "The String (Kotlin Way): ${str}"  ) // string template example
	println ( "The String (Another Kotlin Way): $str"    ) // curlies no needed
	println ( "Simple Math (String Template Expression): ${1+1}" ) // math expression
	println ( "Func Call in String Template #1: ${foo1()}" ) // function call also works
	println ( "Func Call in String Template #2: ${foo2(1)}" ) // function call also works
	println ( "Func Call in String Template #3: ${foo3("abc")}" ) // a string literal inside
	println ( "Func Call in String Template #4: ${foo3(abc)}" ) // a local var literal inside

}