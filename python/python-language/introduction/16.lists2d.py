
# https://pythonprogramming.net/introduction-to-python-programming

# In this Python 3 tutorial, we cover the concept of multi-dimensional lists.
# Multi dimensional lists are lists within lists, or lists within lists within
# lists... you get the point. It can get very confusing very fast, but it is
# good to know that it is an option. Usually a dictionary will be the better
# choice rather than a multi-dimensional list in Python, but, if you are
# familiar with multi-dimensional arrays in other languages, you might want to
# continue that concept in Python.

x = [[2,6],[6,2],[8,2],[5,12]]
print(x[2])	# [8, 2]


# We can also take this deeper since we have more dimensions now:

print(x[2][1])	# 2

# This can go on indefinitely with very thick lists. You might see how this
# can quickly get messy, so let's consider how to properly display lists in
# code that have many dimensions. You might not typically hard code multi-
# dimensional lists, but there are some instances where you will.

y = [[5,2],
     [6,2],
     [3,1],
     [12,6]
    ]

print(y)


