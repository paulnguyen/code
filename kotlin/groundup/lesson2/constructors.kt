

/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

import java.io.InputStream
import java.io.InputStreamReader
import java.io.FileInputStream

// Import with Alias
// import java.io.InputStreamReader as ISR


// Class extends another class, chaning constructor calls
// Note: stream is not accessible outside contstructor
class Reader1(stream : InputStream, size : Int) : InputStreamReader(stream) {

	val bufferSize: Int
	var somethingElse: String? = null

	// init block (primary constructor) is pre-pending any "secondary" contructor
	init {
		stream.close() // can reference stream in contructor context
		bufferSize = size * 1024
	}

	// secondary constructor calls primary contructor via this() call
	constructor(stream : InputStream) : this(stream, 12) {
		somethingElse = "some value"
	}

	// func members can not reference stream
	fun fun1() {
		//stream.close() // compile error
	}

	// nexted class / scoped within outer class
	// Note: in Java, inner class has this reference to outer class
	// In Kotlin, this is more like a static nested class
	// such that an instance of Foo doesn't also need an instance of Reader1
	class Foo1 {

	}

	// inner class -- like in Java
	inner class Foo2 {

	}

}


fun bar() {
	val foo1 = Reader1.Foo1()  // note "new" keyword not needed to call constructor
	//val foo2 = Reader1.Foo2(FileInputStream("/tmp/config.json"),10).Foo2() // need implicit reference to Reader1
}

// stream is also a property on Reader2 
// Note: stream is accessible inside Class
class Reader2(val stream : InputStream) : InputStreamReader(stream) {

	lateinit var bufferName: String  // late init only applies to var (i.e. not val)

	// init block is pre-pending any contructor
	init {
		stream.close() // can reference stream in contructor context
	}

	// can also reference stream here (class member)
	fun fun1() {
		stream.close() // compiles okay
	}

}


// Main 

fun main(args: Array<String>) {

}
