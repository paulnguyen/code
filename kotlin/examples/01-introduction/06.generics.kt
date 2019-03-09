
/*

Generics

Generics are a genericity mechanism that's become standard in modern
languages. Generic classes and functions increase code reusability by
encapsulating common logic that is independent of a particular generic type,
like the logic inside a List<T> is independent of what T is.

REF:  https://play.kotlinlang.org/byExample/01_introduction/06_Generics

*/


// Generic Classes
// The first way to use generics in Kotlin is creating generic classes.

// Defines a generic class MutableStack<E> where E is called the generic type
// parameter. At use-site, it is assigned to a specific type such as Int by
// declaring a MutableStack<Int>.

class MutableStack<E>(vararg items: E) {              

  private val elements = items.toMutableList()

  // Inside the generic class, E can be used as a parameter like any other
  // type.
  fun push(element: E) = elements.add(element)        

  // You can also use E as a return type.
  fun peek(): E = elements.last()                     

  fun pop(): E = elements.removeAt(elements.size - 1)

  fun isEmpty() = elements.isEmpty()

  fun size() = elements.size

  override fun toString() = "MutableStack(${elements.joinToString()})"
}


// Generic Functions You can also generify functions if their logic is
// independent of a specific type. For instance, you can write a utility
// function to create mutable stacks:


fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {


  // Note that the compiler can infer the generic type from the parameters of
  // mutableStackOf so that you don't have to write mutableStackOf<Int>(...).

  val stack = mutableStackOf(0.62, 3.14, 2.7)
  
  println(stack)

}





