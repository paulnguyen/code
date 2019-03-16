
/*


Apply

apply executes a block of code on an object and returns the object itself.
Inside the block, the object is referenced by this. This function is handy for
initializing objects. 

REF:  https://play.kotlinlang.org/byExample/06_scope_functions/04_apply

*/


fun main() {

	val jake = Person()                                     // 1
	val stringDescription = jake.apply {                    // 2
	    name = "Jake"                                       // 3
	    age = 30
	    about = "Android developer"
	}.toString()           

}