
/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/


fun main(args: Array<String>) {

	// val name1 : String = null // not allowed
	val name2 : String = "Bob"
	val name3 : String? = null // Ok

    println( "$name2, $name3" )
    println ( "** name2 **")
    print_name( name2 )
    println ( "** name3 **")
    print_name( name3 )

}


fun print_name( name : String? ) {

	// explicit check -- like in Java
	if ( name != null ) {
		// Safe to dereference name in here!
		println( name )
	}

	// safe dereference operator: ?
	val upper : String? = name?.toUpperCase()
	println( upper )

	// using let & lambda expression
	name?.let { it : String -> 
		println( it.toUpperCase() )
	}

}

