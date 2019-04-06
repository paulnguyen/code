
/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/

import kotlin.properties.*

// Lazy Delegation

class Delegation {

	// only run this when msg property is accessed
	val msg: String by lazy {
		println( "running lazy..." )
		"hello world!"
	}

	// Observable Delegation
	var age: Int by Delegates.observable( 40 ) { property, oldValue, newValue -> 
		println( property )
		println( "property changed from $oldValue to $newValue" )
	}


	// Not Null Delegate
	var notNull: Int by Delegates.notNull()
}

fun fun1 () {
	val d = Delegation()
	println(d.msg)
	println(d.msg)
}

fun fun2 () {
	val d = Delegation()
	println(d.age)
	d.age = 50
	println(d.age)
}

fun fun3 () {
	val d = Delegation()
	d.notNull = 10  // remove this to see error
	println(d.notNull)
}

interface Base {
	fun doSomething()
}

class Impl: Base {
	override fun doSomething() {
		println( "done!" )
	}
}

// Implementation by Delegation
// If Fun not in Home, delegate to Base
// Note: Favor Composition over Inheritance

class Home (val impl: Impl = Impl()): Base by impl 

class First( var base: Base = Impl() ) : Base by base {
	override fun doSomething() {
		println( "doing something!" )
	}	
}

fun fun4 () {
	Impl().doSomething()
	Home(Impl()).doSomething()
	Home().doSomething()
	First(Impl()).doSomething()
}

// Main 

fun main(args: Array<String>) {

	//fun1()
	//fun2()
	//fun3()
	fun4()
}
