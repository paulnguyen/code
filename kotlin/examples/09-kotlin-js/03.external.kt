
/*

External declarations

External keyword allows to declare existing JavaScript API in a type-safe way.

REF:  https://play.kotlinlang.org/byExample/09_Kotlin_JS/03_external

*/


external fun alert(msg: String)   // 1

fun main() {
  alert("Hi!")                    // 2
}

