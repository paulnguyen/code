
/*

Map Element Access

When applied to a map, [] operator returns the value corresponding to the
given key, or null if there is no such key in the map. getValue function
returns an existing value corresponding to the given key or throws an
exception if the key wasn't found. For maps created with withDefault, getValue
returns the default value instead of throwing an exception.

REF:  https://play.kotlinlang.org/byExample/05_Collections/15_Map_getValue

*/


fun main() {

	val map = mapOf("key" to 42)

	// Returns 42 because it's the value corresponding to the key "key".
	val value1 = map["key"]                                     

	// Returns null because "key2" is not in the map.
	val value2 = map["key2"]                                    

	// Returns 42 because it's the value corresponding to the key "key".
	val value3: Int = map.getValue("key")                       

	val mapWithDefault = map.withDefault { k -> k.length }
	// Returns the default value because "key2" is absent. For this key it's 4.
	val value4 = mapWithDefault.getValue("key2")                

	try {
		// Throws NoSuchElementException because "anotherKey" is not in the map.
	    map.getValue("anotherKey")                              
	}
	catch (e: NoSuchElementException) {
	    println("Message: $e")
	}

	println( "map: $map")                        
	println( "value1: $value1")                        
	println( "value2: $value2") 		
	println( "value3: $value3")                        
	println( "mapWithDefault: $mapWithDefault")                        
	println( "value4: $value4") 				

}