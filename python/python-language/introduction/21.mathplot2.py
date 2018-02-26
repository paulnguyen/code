
# https://pythonprogramming.net/introduction-to-python-programming

# https://pythonprogramming.net/matplotlib-python-3-basics-tutorial/
# https://pythonprogramming.net/matplotlib-graphing-series/
# https://pythonprogramming.net/matplotlib-intro-tutorial/

# Now, of course, there are some problems with our graph. First off, we
# learned in school that we're supposed to put labels on each axis and that we
# need a title to our graph or chart. Next, in terms of programming, it is
# unlikely that you will actually be filling in data to the plt.plot()
# function. Instead, you will, or at least you should, be only passing
# variables into it. Like plt.plot(x,y). So now let us show plotting variables
# as well as adding some descriptive labels and a good title!

from matplotlib import pyplot as plt

x = [5,8,10]
y = [12,16,6]

plt.plot(x,y)

plt.title('Epic Info')
plt.ylabel('Y axis')
plt.xlabel('X axis')

plt.show()












