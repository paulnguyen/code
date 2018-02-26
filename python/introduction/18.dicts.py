
# https://pythonprogramming.net/introduction-to-python-programming


# Dictionaries are a data structure in Python that are very similar to
# associative arrays. They are non-ordered and contain "keys" and "values."
# Each key is unique and the values can be just about anything, but usually
# they are string, int, or float, or a list of these things. Dictionaries are
# defined with {} curly braces.


# Dictionary of names and ages. 

exDict = {'Jack':15,'Bob':22,'Alice':12,'Kevin':17}
print(exDict)

# How old is Jack?

print(exDict['Jack'])

# We find a new person that we want to insert:

exDict['Tim'] = 14
print(exDict)

# Tim just had a birthday though!

exDict['Tim'] = 15
print(exDict)

# Then Tim died.

del exDict['Tim']
print(exDict)

# Next we want to track hair color

exDict = {'Jack':[15,'blonde'],'Bob':[22, 'brown'],'Alice':[12,'black'],'Kevin':[17,'red']}
print(exDict['Jack'][1])



