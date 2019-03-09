
/*

Equality Checks

Kotlin uses == for structural comparison and === for referential comparison.
More precisely, a == b compiles down to a == null ? b == null : a.equals(b)


REF:  https://play.kotlinlang.org/byExample/02_control_flow/04_Equality%20Checks

*/


fun main() {


	val authors = setOf("Shakespeare", "Hemingway", "Twain")
	val writers = setOf("Twain", "Shakespeare", "Hemingway")

	// Returns true because it calls authors.equals(writers) and sets ignore
	// element order.
	println(authors == writers)   

	// Returns false because authors and writers are distinct references.
	println(authors === writers)  


}