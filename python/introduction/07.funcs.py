
# https://pythonprogramming.net/introduction-to-python-programming

# Here we've called our function example. After the name of the function, you
# specify any parameters of that function within the parenthesis parameters
# act as variables within the function, they are not necessary to create a
# function, so first let's just do this without any parameters.

def example():
    print('this code will run')
    z = 3 + 9
    print(z)

example()

# The idea of function parameters in Python is to allow a programmer who is
# using that function, define variables dynamically within that function. For
# example:

def simple_addition(num1,num2):
    answer = num1 + num2
    print('num1 is', num1)
    print(answer)

simple_addition(5,3)


# When using defaults, any parameters with defaults should be the last ones
# listed in the function's parameters.

def simple(num1, num2=5):
    pass

# This is just a simple definition of a function, with num1 not being pre-
# defined (not given a default), and num2 being given a default.

def basic_window(width,height,font='TNR'):
    # let us just print out everything
    print(width,height,font)

basic_window(350,500)




