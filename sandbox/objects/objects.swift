


/*

    A Swift Tour

    https://developer.apple.com/swift/
    https://developer.apple.com/library/content/documentation/Swift/Conceptual/Swift_Programming_Language/GuidedTour.html

*/



/*
 
 Objects and Classes

 Use class followed by the class’s name to create a class. 
 A property declaration in a class is written the same way 
 as a constant or variable declaration, except that it is 
 in the context of a class. Likewise, method and function 
 declarations are written the same way.
 
*/

print( "\nObjects and Classes" )
print( "---------------------" )


class Shape1 {
    var numberOfSides = 0
    func simpleDescription() -> String {
        return "A shape with \(numberOfSides) sides."
    }
}

class Shape2 {
    var numberOfSides = 0
    let day = "Monday"
    func simpleDescription() -> String {
        return "A shape with \(numberOfSides) sides."
    }
    func greet(_ person: String) {
        print ( "Hello \(person), today is \(day)." )
    }
}

/*
 
 Create an instance of a class by putting parentheses 
 after the class name. Use dot syntax to access the 
 properties and methods of the instance.

*/


var shape = Shape2()
shape.numberOfSides = 7
var shapeDescription = shape.simpleDescription()
print( "shapeDescription: ", shapeDescription )
shape.greet( "John" )



/*
 
    Object Constructor / Deconstructor

    This version of the Shape class is missing something important: 
    an initializer to set up the class when an instance is created. 
    Use init to create one.
 
    1.  Notice how self is used to distinguish the name property from
        the name argument to the initializer.
 
    2.  Use deinit to create a deinitializer if you need to perform 
        some cleanup before the object is deallocated.
 
*/

print( "\nObject Constructor/Deconstructor -- Initializer/Deinitializer in Swift Lingo" )
print( "-----------------------------------------------------------------------------" )

 class NamedShape {
    
    var numberOfSides: Int = 0
    var name: String
 
    init(name: String, sides: Int = 10) {
        //print( "** NamedShape.init() **" )
        self.name = name
        self.numberOfSides = sides
    }
    
    deinit {
        //print( "** NamedShape.deinit() **" )
    }
    
    func simpleDescription() -> String {
        return "A shape named \(name) with \(numberOfSides) sides."
    }
    
 }

var named_shape1 = NamedShape( name: "shape1" )
print( "named_shape1: ", named_shape1 )
print( named_shape1.simpleDescription() )


/*

    Sub-Classes & Explicit Method Overrides

    Subclasses include their superclass name after their class name, 
    separated by a colon. There is no requirement for classes to 
    subclass any standard root class, so you can include or omit a 
    superclass as needed.
 
    Methods on a subclass that override the superclass’s implementation 
    are marked with override—overriding a method by accident, without override, 
    is detected by the compiler as an error. The compiler also detects methods 
    with override that don’t actually override any method in the superclass.
 
*/

print( "\nSub Classes & Explicit Method Overrides " )
print( "-----------------------------------------" )


class Square: NamedShape {
    var sideLength: Double
    
    init(sideLength: Double, name: String) {
        self.sideLength = sideLength
        super.init(name: name)
        numberOfSides = 4
    }
    
    func area() -> Double {
        return sideLength * sideLength
    }
    
    override func simpleDescription() -> String {
        return "A square with sides of length \(sideLength)."
    }
}

let test = Square(sideLength: 5.2, name: "my test square")
print( "test: ", test )
print( "test.area(): ", test.area() )
print( "test.simpleDescription(): ", test.simpleDescription() )


/*

    Properties with Getters and Setters

    In addition to simple properties that are stored, 
    properties can have a getter and a setter.
 
*/

print( "\nProperties with Getters() and Setters() " )
print( "---------------------------------------" )

class EquilateralTriangle: NamedShape {
    var sideLength: Double = 0.0
    
    init(sideLength: Double, name: String) {
        self.sideLength = sideLength
        super.init(name: name)
        numberOfSides = 3
    }
    
    var perimeter: Double {
        get {
            return 3.0 * sideLength
        }
        set {
            sideLength = newValue / 3.0
        }
    }
    
    override func simpleDescription() -> String {
        return "An equilateral triangle with sides of length \(sideLength)."
    }
}

var triangle = EquilateralTriangle(sideLength: 3.1, name: "a triangle")
print("triangle.perimeter:  ", triangle.perimeter)
triangle.perimeter = 9.9
print("triangle.perimeter:  ", triangle.perimeter)
print("triangle.sideLength: ", triangle.sideLength)

/*
 
    Will Set & Did Set / Around Execution of Setting a Value

    If you don’t need to compute the property but still need to 
    provide code that is run before and after setting a new value, 
    use willSet and didSet. The code you provide is run any time 
    the value changes outside of an initializer. 
 
    For example, the class below ensures that the side length 
    of its triangle is always the same as the side length of 
    its square.
 
*/

print( "\nwillSet and didSet: code that is run before and after setting a new value" )
print( "-------------------------------------------------------------------------" )

class TriangleAndSquare {
    
    var triangle: EquilateralTriangle {
        willSet {
            square.sideLength = newValue.sideLength
        }
    }
    
    var square: Square {
        willSet {
            triangle.sideLength = newValue.sideLength
        }
    }
    
    init(size: Double, name: String) {
        square = Square(sideLength: size, name: name)
        triangle = EquilateralTriangle(sideLength: size, name: name)
    }
}

var triangleAndSquare = TriangleAndSquare(size: 10, name: "another test shape")
print("triangleAndSquare.square.sideLength: ", triangleAndSquare.square.sideLength)
print("triangleAndSquare.triangle.sideLength: ", triangleAndSquare.triangle.sideLength)
triangleAndSquare.square = Square(sideLength: 50, name: "larger square")
print("triangleAndSquare.triangle.sideLength: ", triangleAndSquare.triangle.sideLength)


/*

    Optional Values and the ? Operator

    When working with optional values, you can write ? before operations 
    like methods, properties, and subscripting. If the value before 
    the ? is nil, everything after the ? is ignored and the value of 
    the whole expression is nil. Otherwise, the optional value is 
    unwrapped, and everything after the ? acts on the unwrapped value. 
 
    In both cases, the value of the whole expression is an optional value.

*/

print( "\nOptional Values and the ? operator" )
print( "----------------------------------" )

let optionalSquare1: Square? = Square(sideLength: 2.5, name: "optional square")
let sideLength1 = optionalSquare1?.sideLength
print( sideLength1 )

var optionalSquare2: Square? = Square(sideLength: 2.5, name: "optional square")
optionalSquare2 = nil
let sideLength2 = optionalSquare2?.sideLength
print( sideLength2 )




/*
 
    Nested Functions

    Functions can be nested. Nested functions have 
    access to variables that were declared in the 
    outer function. You can use nested functions 
    to organize the code in a function that is 
    long or complex.
 
*/

print( "\nNested Functions" )
print( "----------------" )

func returnFifteen() -> Int {
    var y = 10
    func add() {
        y += 5
    }
    add()
    return y
}

print( "returnFifteen(): ", returnFifteen() )



/*
    Functions as Arguments

    A function can take another function as one of its arguments.
*/

print( "\nFunctions as function args (higher-order functions)" )
print( "---------------------------------------------------" )

func hasAnyMatches(list: [Int], condition: (Int) -> Bool) -> Bool {
    for item in list {
        if condition(item) {
            return true
        }
    }
    return false
}

func lessThanTen(number: Int) -> Bool {
    return number < 10
}

var numbers = [20, 19, 7, 12]
print( "numbers: ", numbers )
print( "lastThenTen: ", lessThanTen )
print( "hasAnyMatches(list: numbers, condition: lessThanTen): ", hasAnyMatches(list: numbers, condition: lessThanTen))




/*

    Swift Protocols (i.e. like Java Interfaces)

    https://docs.swift.org/swift-book/LanguageGuide/Protocols.html

*/


print( "\nSwift protocols - like interfaces in Java" )
print( "---------------------------------------------------" )



/*

Property Requirements

A protocol can require any conforming type to provide an instance property or
type property with a particular name and type. The protocol doesn’t specify
whether the property should be a stored property or a computed property—it
only specifies the required property name and type. The protocol also
specifies whether each property must be gettable or gettable and settable

*/


protocol SomeProtocol {
    var mustBeSettable: Int { get set }
    var doesNotNeedToBeSettable: Int { get }
}


// Here’s an example of a protocol with a single instance property requirement:

protocol FullyNamed {
    var fullName: String { get }
}

class Starship: FullyNamed {
    var prefix: String?
    var name: String
    init(name: String, prefix: String? = nil) {
        self.name = name
        self.prefix = prefix
    }
    var fullName: String {
        return (prefix != nil ? prefix! + " " : "") + name
    }
}

var ncc1701 = Starship(name: "Enterprise", prefix: "USS")
print ( ncc1701.fullName )



/*

Method Requirements

Protocols can require specific instance methods and type methods to be
implemented by conforming types. These methods are written as part of the
protocol’s definition in exactly the same way as for normal instance and type
methods, but without curly braces or a method body. Variadic parameters are
allowed, subject to the same rules as for normal methods. Default values,
however, can’t be specified for method parameters within a protocol’s
definition.

*/

// The following example defines a protocol with a single instance method requirement:

protocol RandomNumberGenerator {
    func random() -> Double
}

class LinearCongruentialGenerator: RandomNumberGenerator {
    var lastRandom = 42.0
    let m = 139968.0
    let a = 3877.0
    let c = 29573.0
    func random() -> Double {
        lastRandom = ((lastRandom * a + c).truncatingRemainder(dividingBy:m))
        return lastRandom / m
    }
}

let generator = LinearCongruentialGenerator()

print("Here's a random number: \(generator.random())")
print("And another one: \(generator.random())")




/*

Mutating Method Requirements

It’s sometimes necessary for a method to modify (or mutate) the instance it
belongs to. For instance methods on value types (that is, structures and
enumerations) you place the mutating keyword before a method’s func keyword to
indicate that the method is allowed to modify the instance it belongs to and
any properties of that instance. This process is described in Modifying Value
Types from Within Instance Methods.

*/

// The toggle() method is marked with the mutating keyword as part of the
// Togglable protocol definition, to indicate that the method is expected to
// mutate the state of a conforming instance when it’s called:

protocol Togglable {
    mutating func toggle()
}

enum OnOffSwitch: Togglable {
    case off, on
    mutating func toggle() {
        switch self {
        case .off:
            self = .on
        case .on:
            self = .off
        }
    }
}

var lightSwitch = OnOffSwitch.off
print ( lightSwitch )
lightSwitch.toggle()
print ( lightSwitch )


/*

Initializer Requirements

Protocols can require specific initializers to be implemented by conforming
types. You write these initializers as part of the protocol’s definition in
exactly the same way as for normal initializers, but without curly braces or
an initializer body:

*/

protocol SomeProtocolInit {
    init(someParameter: Int)
}

// You can implement a protocol initializer requirement on a conforming class
// as either a designated initializer or a convenience initializer. In both
// cases, you must mark the initializer implementation with the required
// modifier:

class SomeClass: SomeProtocolInit {
    required init(someParameter: Int) {
        // initializer implementation goes here
    }
}


// If a subclass overrides a designated initializer from a superclass, and
// also implements a matching initializer requirement from a protocol, mark
// the initializer implementation with both the required and override
// modifiers:

class SomeSuperClass {
    init(someParameter: Int) {
        // initializer implementation goes here
    }
}

class SomeSubClass: SomeSuperClass, SomeProtocolInit {
    // "required" from SomeProtocol conformance; "override" from SomeSuperClass
    required override init(someParameter: Int) {
        super.init( someParameter: someParameter )
        // initializer implementation goes here
    }
}


 
