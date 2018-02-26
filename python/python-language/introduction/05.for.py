
# https://pythonprogramming.net/introduction-to-python-programming


# This code will print out each item in that list. Usually, people will choose
# to actually do something with the item in the list, more than just printing
# it out, but this is just a basic example.

exampleList = [1,5,6,6,2,1,5,2,1,4]

for x in exampleList:
    print(x)

print( "========" )

# This code is actually what is known as a generator function, and is highly
# efficient. The above works very much like the "counter" function we made
# with a while loop. The only difference is this one is much faster and more
# efficient in many cases.

for x in range(1,11):
    print(x)