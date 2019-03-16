
/*

Map

A map is a collection of key/value pairs, where each key is unique and is used
to retrieve the corresponding value. For creating maps, there are functions
mapOf() and mutableMapOf(). A read-only view of a mutable map can be obtained
by casting it to Map.

REF:    https://play.kotlinlang.org/byExample/05_Collections/03_Map
        https://play.kotlinlang.org/byExample/05_Collections/04_map
    
*/


const val POINTS_X_PASS: Int = 15

// Creates a mutable Map.
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   

// Creates a read-only view of the Map.
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        

fun updatePointsCredit(accountId: Int) {
	// Checks if the Map's key exists.
    if (EZPassAccounts.containsKey(accountId)) {                                        
        println("Updating $accountId...")                
        // Reads the corresponding value and increments it with a constant value.                               
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    } 
}

fun accountsReport() {
    println("EZ-Pass report:")
    // Iterates immutable Map and prints key/value pairs.
    EZPassReport.forEach{                                                               
        k, v -> println("ID $k: credit $v")
    }
}

// map extension function enables you to apply a transformation to all
// elements in a collection. It takes a transformer function as a lambda-
// parameter.

// Defines a collection of numbers.
val numbers = listOf(1, -2, 3, -4, 5, -6)     

// Doubles numbers.
val doubled = numbers.map { x -> x * 2 }      

// Uses the shorter it notation to triple the numbers.
val tripled = numbers.map { it * 3 }          


fun main() {

	// Reads the account points balance, before updates.
    accountsReport()                                                                    

    // Updates an existing account two times.
    updatePointsCredit(1)                                                               
    updatePointsCredit(1)                                                               

    // Tries to update a non-existing account: prints an error message.
    updatePointsCredit(5)                                                               

    // Reads the account points balance, after updates.
    accountsReport()             

    // Show Map Extentions
    println( "numbers: $numbers")
    println( "doubled: $doubled")
    println( "tripled: $tripled")                                                           
}

