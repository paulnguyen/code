
/*

Canvas (Hello Kotlin)

The following example demonstrates usage of HTML5 Canvas from Kotlin. Here
strange creatures are watching the kotlin logo. You can drag'n'drop them as
well as the logo. Doubleclick to add more creatures but be careful. They may
be watching you!

REF:  https://play.kotlinlang.org/byExample/09_Kotlin_JS/05_Canvas

*/


CanvasState(canvas).apply {
    addShape(Kotlin)
    addShape(Creature(size * 0.25, this))
    addShape(Creature(size * 0.75, this))
}

