
/*

Working with Nulls

Sometimes Kotlin programs need to work with null values, such as when
interacting with external Java code or representing a truly absent state.
Kotlin provides null tracking to elegantly deal with such situations.

REF:  https://play.kotlinlang.org/byExample/01_introduction/04_Null%20Safety

*/


// Declares a non-null String variable.
var neverNull: String = "This can't be null"            
                                     

// Declares a nullable String variable.
var nullable: String? = "You can keep a null here"      


// A function that takes in a nullable string and returns its description.
fun describeString(maybeString: String?): String {      

	// f the given string is not null and not empty, return information about
	// its length.
    if (maybeString != null && maybeString.length > 0) {        
        return "String of length ${maybeString.length}"
    } else {

    	// Otherwise, tell the caller that the string is empty or null.
        return "Empty or null string"                           
    }
}


fun main() {

	// Check a Nullable String (not null)
	var msg1 = describeString(nullable)
	println( msg1 )

	// Check a Nullable String (set as null)
	nullable = null
	var msg2 = describeString(nullable)
	println( msg2 )

}




