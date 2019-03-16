
/*

Dynamic

Dynamic is a special type in Kotlin/JS. It basically turns off Kotlin's type
checker. That is needed in order to interoperate with untyped or loosely typed
environments, such as the JavaScript ecosystem.

REF:  https://play.kotlinlang.org/byExample/09_Kotlin_JS/01_dynamic

*/


fun main() {

	val a: dynamic = "abc"                                               // 1
	val b: String = a                                                    // 2

	fun firstChar(s: String) = s[0]

	println("${firstChar(a)} == ${firstChar(b)}")                        // 3

	println("${a.charCodeAt(0, "dummy argument")} == ${b[0].toInt()}")   // 4

	println(a.charAt(1).repeat(3))                                       // 5

	fun plus(v: dynamic) = v + 2

	println("2 + 2 = ${plus(2)}")                                        // 6
	println("'2' + 2 = ${plus("2")}")

}

