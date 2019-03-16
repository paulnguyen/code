
/*

Also

Also works like apply: it executes a given block and returns the object
called. Inside the block, the object is referenced by it, so it's easier to
pass it as an argument. This function is handy for embedding additional
actions, such as logging in call chains. 

REF:  https://play.kotlinlang.org/byExample/06_scope_functions/05_also

*/


fun main() {

	val jake = Person("Jake", 30, "Android developer")   // 1
    	.also {                                          // 2 
        	writeCreationLog(it)                         // 3
    	}

}