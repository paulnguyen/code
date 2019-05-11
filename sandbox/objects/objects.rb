
#
#	Ruby Programming Language 
#
#	https://www.ruby-lang.org
#
#

##
## Just Enough Ruby from
## Book:  Understanding Computation
##
## https://computationbook.com/
##
## https://github.com/tomstuart/computationbook


## Values
## ------

## Ruby is an expression-oriented language: every valid piece of code produces
## a value when it’s executed. Here’s a quick overview of the different kinds
## of Ruby value.

(true && false) || true
(3 + 3) * (14 / 2)
'hello' + ' world'
'hello world'.slice(6)


## Symbols
## -------

## A Ruby symbol is a lightweight, immutable value representing a name.
## Symbols are widely used in Ruby as simpler and less memory-intensive
## alternatives to strings, most often as keys in hashes (see Data
## Structures). Symbol literals are written with a colon at the beginning:

:my_symbol
:my_symbol == :my_symbol
:my_symbol == :another_symbol


## Arrays
## ------

## Ruby array literals are written as a comma-separated list of values
## surrounded by square brackets:

numbers = ['zero', 'one', 'two']
numbers[1]
numbers.push('three', 'four')
numbers
numbers.drop(2)
numbers

## A range represents a collection of values between a minimum and a maximum.
## Ranges are written by putting a pair of dots between two values:

ages = 18..30
ages.entries
ages.include?(25)
ages.include?(33)


## Hash
## ----

## A hash is a collection in which every value is associated with a key; some
## programming languages call this data structure a “map,” “dictionary,” or
## “associative array.” A hash literal is written as a comma-separated list of
## key => value pairs inside curly brackets:

fruit = { 'a' => 'apple', 'b' => 'banana', 'c' => 'coconut' }
fruit['b']
fruit['d'] = 'date'
fruit

## Hashes often have symbols as keys, so Ruby provides an alternative key:
## value syntax for writing key-value pairs where the key is a symbol. This is
## more compact than the key => value syntax and looks a lot like the popular
## JSON format for JavaScript objects:

dimensions = { width: 1000, height: 2250, depth: 250 }
dimensions[:depth]


## Procs
## -----

## A proc is an unevaluated chunk of Ruby code that can be passed around and
## evaluated on demand; other languages call this an “anonymous function” or
## “lambda.” There are several ways of writing a proc literal, the most
## compact of which is the -> arguments { body } syntax:

multiply = -> x, y { x * y }
multiply.call(6, 9)
multiply.call(2, 3)

## As well as the .call syntax, procs can be called by using square brackets:

multiply[3, 4]


## Control Flow
## ------------
##
## Ruby has if, case, and while expressions, which work in the usual way:

if 2 < 3
     'less'
else
     'more'
end

quantify =
 -> number {
   case number
   when 1
     'one'
   when 2
     'a couple'
   else
     'many'
   end
}

quantify.call(2)
quantify.call(10)

while x < 1000
     x = x * 2
end
x 


## Objects and Methods
## -------------------

## Ruby looks like other dynamic programming languages but it’s unusual in an
## important way: every value is an object, and objects communicate by sending
## messages to each other.[1] Each object has its own collection of methods
## that determine how it responds to particular messages.

o = Object.new

def o.add(x, y)
     x + y
end

o.add(2, 3)


def o.add_twice(x, y)
     add(x, y) + add(x, y)
end

o.add_twice(2, 3)

## Outside of any method definition, the current object is a special top-level
## object called main, and any messages that don’t specify a receiver are sent
## to it; similarly, any method definitions that don’t specify an object will
## be made available through main

def multiply(a, b)
     a * b
end

multiply(2, 3)



## Classes and Inheritance
## -----------------------

## It’s convenient to be able to share method definitions between many
## objects. In Ruby, we can put method definitions inside a class, then create
## new objects by sending the new message to that class. The objects we get
## back are instances of the class and incorporate its methods. For example:

class Calculator
 def divide(x, y)
   x / y
 end
end

c = Calculator.new
c.class
c.divide(10, 2)

## Note that defining a method inside a class definition adds the method to
## instances of that class, not to main:

divide(10, 2) ## NoMethodError: undefined method `divide' for main:Object

## One class can bring in another class’s method definitions through inheritance:

class MultiplyingCalculator < Calculator
 def multiply(x, y)
   x * y
 end
end

mc = MultiplyingCalculator.new
mc.class
mc.class.superclass
mc.multiply(10, 2)
mc.divide(10, 2)

## A method in a subclass can call a superclass method of the same name by
## using the super keyword:

class BinaryMultiplyingCalculator < MultiplyingCalculator
  def multiply(x, y)
    result = super(x, y)
    result.to_s(2)
  end
end

bmc = BinaryMultiplyingCalculator.new
bmc.multiply(10, 2)


## Classes and Modules
## -------------------

## Another way of sharing method definitions is to declare them in a module,
## which can then be included by any class:

module Addition
  def add(x, y)
    x + y
  end
end

class AddingCalculator
  include Addition
end

ac = AddingCalculator.new
ac.add(10, 2)


