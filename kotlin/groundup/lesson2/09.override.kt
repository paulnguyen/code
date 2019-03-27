
/*

	Kotlin From the Ground Up LiveLessons Video Training - Justin Lee

	https://learning.oreilly.com/videos/kotlin-from-the/9780135263631

*/


class MyList<E> : ArrayList<E> {

	// hard requirement in Kotlin as part of language (note: annotation in Java)
	override fun clear() {
		// no op -- don't allow bulk delete of list items
	}

}

// Main 

fun main(args: Array<String>) {

}