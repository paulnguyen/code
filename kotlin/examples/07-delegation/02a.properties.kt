
/*

Delegated Properties

Kotlin provides a mechanism of delegated properties that allows delegating the
calls of the property set and get methods to a certain object. The delegate
object in this case should have the method getValue. For mutable properties,
you'll also need setValue.

REF:  https://play.kotlinlang.org/byExample/07_Delegation/02_DelegatedProperties

*/


import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()                                               // 1

    override fun toString() = "Example Class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {        // 2     
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { // 2
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main() {
    val e = Example()
    println(e.p)
    e.p = "NEW"
}

