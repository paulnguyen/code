
/*

JS function

You can inline JavaScript code into your Kotlin code using the js("…")
function. This should be used with extreme care.

REF:  https://play.kotlinlang.org/byExample/09_Kotlin_JS/02_js_function

*/


fun main() {
// sampleStart
    js("alert(\"alert from Kotlin!\")") // 1
// sampleEnd    
}


val json = js("{}")               // 1
json.name = "Jane"                // 2
json.hobby = "movies"

println(JSON.stringify(json))     // 3


