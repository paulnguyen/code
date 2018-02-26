
# https://pythonprogramming.net/introduction-to-python-programming

# A local variable cannot be accessed globally

# this variable has no parent function, but is actually NOT a global variable.
# it just so happens that it is committed to memory before the function is called
# so we are able to iterate, or call it out, but we cannot do much else.

x = 6

def example():
    print(x)
    # z, however, is a local variable.  
    z = 5
    # this works
    print(z)
    
example()

# this does not, which often confuses people, because z has been defined
# and successfully even was called... the problem is that it is a local
# variable only, and you are attempting to access it globally.

print(z)


