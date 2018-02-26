
# https://pythonprogramming.net/introduction-to-python-programming

# https://pythonprogramming.net/matplotlib-python-3-basics-tutorial/
# https://pythonprogramming.net/matplotlib-graphing-series/
# https://pythonprogramming.net/matplotlib-intro-tutorial/

# Great, so we're Matplotlib wizards now, and we're ready to journey into the
# real world and plot stuff! One of the more popular file types that you'll
# first start using is CSVs. Eventually, you'll probably find that people stop
# using CSV files and use either databases or they are using something like
# HDF5 formatting. For now, let's just cover CSV. There are obviously many
# ways to read files in Python. You can use Python's CSV module that is a part
# of the standard library. You can make use of Numpy's loadtxt as well, which
# we'll be using. Another fantastic choice is using Pandas! So there are many
# choices to consider, but, for now, we're going to use Numpy. Depending on
# your goals and requirements, you might eventually wind up choosing something
# else. I like NumPy because it's very open-ended for data analysis, yet still
# very powerful. I also think Pandas is going to be a great choice for most
# people, but it is less open-ended. Enough on that though. Make sure you have
# NumPy installed. If you do not:

# https://pypi.python.org/pypi/numpy
# or
# http://www.lfd.uci.edu/~gohlke/pythonlibs/#numpy

# Once you have NumPy, you're going to need some sample data! Either grab some
# that you'd like to use if you think you are going to be able to make the
# necessary edits, or feel free to use this sample data:


from matplotlib import pyplot as plt
from matplotlib import style
import numpy as np

style.use('ggplot')

x,y = np.loadtxt('21.mathplot7.csv',
                 unpack=True,
                 delimiter = ',')

plt.plot(x,y)

plt.title('Epic Info')
plt.ylabel('Y axis')
plt.xlabel('X axis')

plt.show()











