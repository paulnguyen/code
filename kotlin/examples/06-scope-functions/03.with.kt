
/*

With

With is a non-extension function that can access members of its argument
concisely: you can omit the instance name when referring to its members. 

REF:  https://play.kotlinlang.org/byExample/06_scope_functions/03_with

*/


fun main() {

	with(configuration) {
	    println("$host:$port")
	}

	// instead of:
	println("${configuration.host}:${configuration.port}")    

}