
/*

Functions with vararg Parameters

Varargs allow you to pass any number of arguments by separating them with commas.

REF:  https://play.kotlinlang.org/byExample/01_introduction/02_Functions

*/

fun main () {

	// The vararg modifier turns a parameter into a vararg.
	fun printAll(vararg messages: String) {                            
	    for (m in messages) println(m)
	}
	
	// This allows calling printAll with any number of string arguments.
	printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 

	// Thanks to named parameters, you can even add another parameter of the
	// same type after the vararg. This wouldn't be allowed in Java because
	// there's no way to pass a value.
	fun printAllWithPrefix(vararg messages: String, prefix: String) {  
	    for (m in messages) println(prefix + m)
	}
	
	// Using named parameters, you can set a value to prefix separately from the vararg.
	printAllWithPrefix(
	    "Hello", "Hallo", "Salut", "Hola", "你好",
	    prefix = "Greeting: "                                          
	)

	// At runtime, a vararg is just an array. To pass it along into a vararg
	// parameter, use the special spread operator * that lets you pass in
	// *entries (a vararg of String) instead of entries (an Array<String>).
	fun log(vararg entries: String) {
	    printAll(*entries)                                             
	}

}