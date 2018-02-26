
# https://pythonprogramming.net/introduction-to-python-programming

# Keep in mind that lists are mutable, and using these functions change the
# list. Here is some example code of list manipulation: Since lists are
# mutable, this means that we will be using lists for things where we might
# intend to manipulate the list of data, so how can we do that? Turns out we
# can do all sorts of things. We can add, remove, count, sort, search, and do
# quite a few other things to python lists.

# first we need an example list:

x = [1,6,3,2,6,1,2,6,7]

# lets add something.
# we can do .append, which will add something to the end of the list, like:

x.append(55)
print(x)

# What if you have an exact place that you'd like to put something in a list,
# instead of just at the very end?

x.insert(2,33)
print(x)

# Here we say that we want to insert, at the index of 2, the number 33. The
# reason that went in the 3rd place, again, is because we start at the zero
# element, then go 1, 2...etc with lists.

# Now we can remove things. .remove() will remove the first instance of the
# value in the list. If it doesn't exist, there will be an error:

x.remove(6)
print(x)

print(x[5])	# remember how we can reference an item by index in a list?
print(x.index(1)) # we can also search for this index

# Now here, we can see that it actually returned a 0, meaning the first
# element was a 1... when we knew there was another with an index of 5. So,
# instead we might want to know before-hand how many examples there are

print(x.count(1))

# We can also sort the list:

x.sort()
print(x)

# What if these were strings? like:

y = ['Jan','Dan','Bob','Alice','Jon','Jack']
y.sort()
print(y)
y.reverse()
print(y)








