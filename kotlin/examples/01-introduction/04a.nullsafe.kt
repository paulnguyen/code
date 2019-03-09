
/*

Null Safety

In an effort to rid the world of NullPointerException, variable types in
Kotlin don't allow the assignment of null. If you need a variable that can be
null, declare it nullable by adding ? at the end of its type.

REF:  https://play.kotlinlang.org/byExample/01_introduction/04_Null%20Safety

*/


// Declares a non-null String variable.
var neverNull: String = "This can't be null"            
                                     

// Declares a nullable String variable.
var nullable: String? = "You can keep a null here"      

// When inferring types, the compiler assumes non-null for variables that are
// initialized with a value.
var inferredNonNull = "The compiler assumes non-null"                                 

// Declares a function with a non-null string parameter.
fun strLength(notNull: String): Int {                   
    return notNull.length
}


fun main() {

	// When trying to assign null to non-nullable variable, 
	// a compilation error is produced.
	neverNull = null   	

	// Sets the null value to the nullable variable. This is OK.
	nullable = null                                         

	// When trying to assign null to a variable with inferred type, a compilation
	// error is produced.
	inferredNonNull = null    

	// Calls the function with a String 
	// (non-nullable) argument. This is OK.
	strLength(neverNull)                                    

	// When calling the function with a String? (nullable) argument, a compilation
	// error is produced.
	strLength(nullable)  

}




