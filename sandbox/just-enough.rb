
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


## ==================
## Misc Ruby Features
## ==================


## Parallel assignment 
## -------------------

## Assigns values to several variables at once by breaking apart an array:

greeting = 'hello'
greeting 

width, height, depth = [1000, 2250, 250]
height

## String Interpolation
## --------------------

## Strings can be single- or double-quoted. Ruby automatically performs
## interpolation on double-quoted strings, replacing any #{expression} with
## its result:

"hello #{'dlrow'.reverse}"

## If an interpolated expression returns an object that isn’t a string, that
## object is automatically sent a to_s message and is expected to return a
## string that can be used in its place. We can use this to control how
## interpolated objects appear:

o = Object.new

def o.to_s
  'a new object'
end

"here is #{o}"


## Inspecting Objects
## ------------------

## Something similar happens whenever IRB needs to display an object: the
## object is sent the inspect message and should return a string
## representation of itself. All objects in Ruby have sensible default
## implementations of #inspect, but by providing our own definition, we can
## control how an object appears on the console:

o = Object.new

def o.inspect
  '[my object]'
end

o


## Printing Strings
## ----------------

## The #puts method is available to every Ruby object (including main), and
## can be used to print strings to standard output:

x = 128

while x < 1000
  puts "x is #{x}"
  x = x * 2
end


## Variadic Methods
## ----------------

## Method definitions can use the * operator to support a variable number of
## arguments:

def join_with_commas(*words)
  words.join(', ')
end

join_with_commas('one', 'two', 'three')

## A method definition can’t have more than one variable-length parameter, but
## normal parameters may appear on either side of it:

def join_with_commas(before, *words, after)
  before + words.join(', ') + after
end

join_with_commas('Testing: ', 'one', 'two', 'three', '.')


## The * operator can also be used to treat each element of an array as a
## separate argument when sending a message:

arguments = ['Testing: ', 'one', 'two', 'three', '.']

join_with_commas(*arguments)


## And finally, * works in parallel assignment too:

before, *words, after = ['Testing: ', 'one', 'two', 'three', '.']

before
words
after


## Blocks
## ------

## A block is a piece of Ruby code surrounded by do/end or curly brackets.
## Methods can take an implicit block argument and call the code in that block
## with the yield keyword:

def do_three_times
  yield
  yield
  yield
end

do_three_times { puts 'hello' }


## Blocks can take arguments:

def do_three_times
  yield('first')
  yield('second')
  yield('third')
end

do_three_times { |n| puts "#{n}: hello" }

## yield returns the result of executing the block:

def number_names
  [yield('one'), yield('two'), yield('three')].join(', ')
end

number_names { |name| name.upcase.reverse }


## Enumerable
## ----------

## Ruby has a built-in module called Enumerable that’s included by Array,
## Hash, Range, and other classes that represent collections of values.
## Enumerable provides helpful methods for traversing, searching, and sorting
## collections, many of which expect to be called with a block. Usually the
## code in the block will be run against some or all values in the collection
## as part of whatever job the method does. For example:

(1..10).count { |number| number.even? }

(1..10).select { |number| number.even? }

(1..10).any? { |number| number < 8 }

(1..10).all? { |number| number < 8 }

(1..5).each do |number|
  if number.even?
    puts "#{number} is even"
  else
    puts "#{number} is odd"
  end
end

(1..10).map { |number| number * 3 }


## It’s common for the block to take one argument and send it one message with
## no arguments, so Ruby provides a &:message shorthand as a more concise way
## of writing the block { |object| object.message }:

(1..10).select(&:even?)

['one', 'two', 'three'].map(&:upcase)

## One of Enumerable’s methods, #flat_map, can be used to evaluate an
## array-producing block for every value in a collection and concatenate the
## results:

['one', 'two', 'three'].map(&:chars)

['one', 'two', 'three'].flat_map(&:chars)

## Another useful method is #inject, which evaluates a block for every value
## in a collection and accumulates a final result:

(1..10).inject(0) { |result, number| result + number }

(1..10).inject(1) { |result, number| result * number }

['one', 'two', 'three'].inject('Words:') { |result, word| "#{result} #{word}" }


## Struct
## ------

## Struct is a special Ruby class whose job is to generate other classes. A
## class generated by Struct contains getter and setter methods for each of
## the attribute names passed into Struct.new. The conventional way to use a
## Struct-generated class is to subclass it; the subclass can be given a name,
## and it provides a convenient place to define any additional methods. For
## example, to make a class called Point with attributes called x and y, we
## can write:

class Point < Struct.new(:x, :y)
  def +(other_point)
    Point.new(x + other_point.x, y + other_point.y)
  end

  def inspect
    "#<Point (#{x}, #{y})>"
  end
end

## Now we can create instances of Point, inspect them in IRB, and send them messages:

a = Point.new(2, 3)

b = Point.new(10, 20)

a + b


## As well as whatever methods we define, a Point instance responds to the
## messages x and x= to get and set the value of its x attribute, and
## similarly for y and y=:

a.x

a.x = 35

a + b

## Classes generated by Struct.new have other useful functionality, like an
## implementation of the equality method #==, which compares the attributes of
## two Structs to see if they’re equal:

Point.new(4, 5) == Point.new(4, 5)

Point.new(4, 5) == Point.new(6, 7)


## Monkey Patching
## ---------------

## New methods can be added to an existing class or module at any time. This
## is a powerful feature, usually called monkey patching, which lets us extend
## the behavior of existing classes:

class Point
  def -(other_point)
    Point.new(x - other_point.x, y - other_point.y)
  end
end

Point.new(10, 15) - Point.new(1, 1)

## We can even monkey patch Ruby’s built-in classes:

class String
  def shout
    upcase + '!!!'
  end
end

'hello world'.shout


## Defining Constants
## ------------------

## Ruby supports a special kind of variable, called a constant, which should
## not be reassigned once it’s been created. (Ruby won’t prevent a constant
## from being reassigned, but it will generate a warning so we know we’re
## doing something bad.) Any variable whose name begins with a capital letter
## is a constant. New constants can be defined at the top level or within a
## class or module:

NUMBERS = [4, 8, 15, 16, 23, 42]

class Greetings
  ENGLISH = 'hello'
  FRENCH  = 'bonjour'
  GERMAN  = 'guten Tag'
end

NUMBERS.last

Greetings::FRENCH

## Class and module names always begin with a capital letter, so class and
## module names are constants too.


## Removing Constants
## ------------------

## When we’re exploring an idea with IRB it can be useful to ask Ruby to
## forget about a constant altogether, especially if that constant is the name
## of a class or module that we want to redefine from scratch instead of
## monkey patching its existing definition. A top-level constant can be
## removed by sending the remove_const message to Object, passing the
## constant’s name as a symbol:

NUMBERS.last

Object.send(:remove_const, :NUMBERS)

NUMBERS.last

Greetings::GERMAN

Object.send(:remove_const, :Greetings)

Greetings::GERMAN

## We have to use Object.send(:remove_const, :NAME) instead of just
## Object.remove_const(:NAME), because remove_const is a private method that
## ordinarily can only be called by sending a message from inside the Object
## class itself; using Object.send allows us to bypass this restriction
## temporarily.

