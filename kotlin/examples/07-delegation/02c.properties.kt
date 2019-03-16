
/*

Storing Properties in a Map

Property delegation can be used for storing properties in a map. This is handy
for tasks like parsing JSON or doing other "dynamic" stuff.

REF:  https://play.kotlinlang.org/byExample/07_Delegation/02_DelegatedProperties

*/


class User(val map: Map<String, Any?>) {
    val name: String by map                // 1
    val age: Int     by map                // 1
}

fun main() {
    val user = User(mapOf(
            "name" to "John Doe",
            "age"  to 25
    ))

    println("name = ${user.name}, age = ${user.age}")
}

