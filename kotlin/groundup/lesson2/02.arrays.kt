
/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/


fun main(args: Array<String>) {

	// In Java, Arrays are special features of Language
	// In Kotlin, Arrays are Objects

	val array1 : Array<Int> = arrayOf( 1, 2, 3 )
	val array2 : Array<Any> = arrayOf( 1L, 2.toDouble(), "3" )

    println ( "** Arrays **")
    println ( "Array #1 -- ${array1::class.qualifiedName}" )
    array1.forEach() { it -> println ( "${it::class.qualifiedName} => $it" ) }

    println ( "Array #2 -- ${array2::class.qualifiedName}" )
    array2.forEach() { it -> println ( "${it::class.qualifiedName} => $it" ) }


}

