package main //go programs consist of packages, and start with main

// import a library/package. In this case we import fmt, which brings in 
// standard formatted I/O strings from C
import "fmt"


// syntax for a function in Go. 
// define, name, parms, and your code goes in curly braces.
func main() {
	// print line just outputs what you mass. 
	// Println is a function from the fmt library
	// we can reference other packages from fmt with .
	fmt.Println("Welcome to Go!")
}

// we'll talk more on some other specifics in the next tutorial, 
// such as how or why this main function even runs.

