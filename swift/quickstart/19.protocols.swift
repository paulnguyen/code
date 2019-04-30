

/*

    Swift Protocols

	https://docs.swift.org/swift-book/LanguageGuide/Protocols.html


	Protocol Syntax

	You define protocols in a very similar way to classes, structures, and enumerations:

	    protocol SomeProtocol {
	        // protocol definition goes here
	    }

	Custom types state that they adopt a particular protocol by placing the protocol’s name after the type’s name, separated by a colon, as part of their definition. Multiple protocols can be listed, and are separated by commas:

	    struct SomeStructure: FirstProtocol, AnotherProtocol {
	        // structure definition goes here
	    }

	If a class has a superclass, list the superclass name before any protocols it adopts, followed by a comma:

	    class SomeClass: SomeSuperclass, FirstProtocol, AnotherProtocol {
	        // class definition goes here
	    }

*/




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



