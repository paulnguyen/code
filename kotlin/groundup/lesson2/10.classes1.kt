/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

class A1 {
	fun foo() {
		println( "A1" )
	}
}

interface B {
	fun foo() {
		println( "B" ) // default implementation
	}
}

// compile error classes closed by default in Kotlin
// class C1: A1() {	
// 	override fun foo() {
// 	}	
// }


// must declare if class can be extended
open class A2 {
	open fun foo() {
		println( "A2" )
	}
}

class C2: A2(), B {
	// foo() must be open in base class
	override fun foo() {

		// two foo's.  from A2 and B
		//super.foo()

		// two foo's.  Select A2's or B's super() 
		// or both!
		super<A2>.foo()
		super<B>.foo()

		println( "C2" )
	}
}


// Main 

fun main(args: Array<String>) {
	C2().foo() ;
}



