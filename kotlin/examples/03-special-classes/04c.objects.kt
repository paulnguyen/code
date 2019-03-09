
/*

Object Declaration

You can also use the object declaration. It isn't an expression, and can't be
used in a variable assignment. You should use it to directly access its
members:

REF:  https://play.kotlinlang.org/byExample/03_special_classes/04_Object

*/

// Creates an object declaration.
object DoAuth {                                            
    // Defines the object method.     
    fun takeParams(username: String, password: String){         
        println("input Auth parameters = $username:$password")
    }
}

fun main(){
    // Calls the method. This is when the object is actually created.
    DoAuth.takeParams("foo", "qwerty")                          
}



