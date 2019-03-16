
/*

Named Arguments

As with most other programming languages (Java, C++, etc.), Kotlin supports
passing arguments to methods and constructors according to the order they are
defined. Kotlin also supports named arguments to allow clearer invocations and
avoid mistakes with the order of arguments. Such mistakes are hard to find
because they are not detected by the compiler, for example, when two
sequential arguments have the same type.

REF:  https://play.kotlinlang.org/byExample/08_productivity_boosters/01_namedArguments

*/


fun main() {


	println(format("mario", "example.com"))                         // 1
	println(format("domain.com", "username"))                       // 2
	println(format(userName = "foo", domain = "bar.com"))           // 3
	println(format(domain = "frog.com", userName = "pepe"))         // 4


}