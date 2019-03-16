
/*

Html Builder

Kotlin provides you with an option to describe structured data in a
declarative style with builders. Below is an example of a type-safe
Groovy-style builder. In this example, we will describe an HTML page in
Kotlin.

REF:  https://play.kotlinlang.org/byExample/09_Kotlin_JS/06_HtmlBuilder

*/

val result = html {                                            // 1
    head {                                                     // 2
        title { +"HTML encoding with Kotlin" }
    }
    body {                                                     // 2
        h1 { +"HTML encoding with Kotlin" }
        p {
            +"this format can be used as an"                   // 3
            +"alternative markup to HTML"                      // 3
        }

        // an element with attributes and text content
        a(href = "http://jetbrains.com/kotlin") { +"Kotlin" }

        // mixed content
        p {
            +"This is some"
            b { +"mixed" }
            +"text. For more see the"
            a(href = "http://jetbrains.com/kotlin") {
                +"Kotlin"
            }
            +"project"
        }
        p {
            +"some text"
            ul {
                for (i in 1..5)
                li { +"${i}*2 = ${i*2}" }
            }
        }
    }
}


