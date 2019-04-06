
/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/


data class HttpResponse( val code : Int, val message : String)
fun call ( uri: String ) = HttpResponse( 200, "OK" )

fun fun1 () {
	val response = call( "www.google.com" )
	println( response.code  )
	println( response.message )
}

fun fun2 () {
	val (code, message) = call( "www.google.com" )
	println( code  )
	println( message )
}

fun fun3() {
	val call = call( "www.google.com" )
	val (code, message) = call

	println( code  )
	println( call.code )
	println( call.component1() )  // constructor property of data class

	println( message  )
	println( call.message )
	println( call.component2() )  // constructor property of data class
}

fun fun4() {
	val map = mapOf( "one" to 1, "two" to 2, "three" to 3)
	
	for( (k,v) in map ) {
		println( "key = $k, value = $v" )
	}

	for( (_,v) in map ) {
		println( "value = $v" )
	}
}


// Main 

fun main(args: Array<String>) {

	//fun1()
	//fun2()
	//fun3()
	fun4()
}
