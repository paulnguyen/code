
/*

Standard Delegates

The Kotlin standard library contains a bunch of useful delegates, like lazy,
observable, and other. You may use them as is. For example lazyis used for
lazy initialization.

REF:  https://play.kotlinlang.org/byExample/07_Delegation/02_DelegatedProperties

*/

class LazySample {
    init {
      println("created!")            // 1
    }
    
    val lazyStr: String by lazy {
        println("computed!")          // 2
        "my lazy"
    }
}

fun main() {
    val sample = LazySample()         // 1
    println("lazyStr = ${sample.lazyStr}")  // 2
    println(" = ${sample.lazyStr}")  // 3
}


