
# https://pythonprogramming.net/introduction-to-python-programming


# A tuple is an assortment of data, separated by commas, which makes it
# similar to the Python list, but a tuple is fundamentally different in that a
# tuple is "immutable."

def example():
    return 15, 12

x, y = example()

print(x,y)	# 15 12

# in the above case, we have used a tuple and cannot modify it... and
# we definitely do not want to!

# If you notice, the tuple had no brackets around it at all. If there are no
# encasing brackets or braces of any type, then Python will recognize the data
# as a tuple. Tuples also can have curved brackets like "(" or ")"

x = 10
print(x,y)	# should be: 15 12

# Next, we have the far more popular Python list. To define a list, we use
# square brackets. A Python list acts very much like an array in other
# languages like php.  Here's an example of a list and an example use:

x = [1,3,5,6,2,1,6]

# You can then reference the whole list like:

print(x)

# or a single element by giving its index value.
# index values start at 0 and go up by 1 each time

print(x[0],x[1])


