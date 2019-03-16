
/*

Destructuring Declarations

Destructuring declaration syntax can be very handy, especially when you need
an instance only for accessing its members. It lets you define the instance
without a specific name therefore saving a few lines of code.

REF:  https://play.kotlinlang.org/byExample/08_productivity_boosters/03_Destructuring%20Declarations

*/

val (x, y, z) = arrayOf(5, 10, 15)                              // 1

val map = mapOf("Alice" to 21, "Bob" to 25)
for ((name, age) in map) {                                      // 2
    println("$name is $age years old")          
}

val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))    // 3


data class User(val username: String, val email: String)    // 1

fun getUser() = User("Mary", "mary@somewhere.com")


class Pair<K, V>(val first: K, val second: V) {  // 1
    operator fun component1(): K {              
        return first
    }

    operator fun component2(): V {              
        return second
    }
}


fun main() {

    val user = getUser()
    val (username, email) = user                            // 2
    println(username == user.component1())                  // 3
    val (_, emailAddress) = getUser()       

    val (num, name) = Pair(1, "one")             // 2
    println("num = $num, name = $name")                // 4
    
}

