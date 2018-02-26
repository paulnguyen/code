
# https://pythonprogramming.net/introduction-to-python-programming

# https://pythonprogramming.net/matplotlib-python-3-basics-tutorial/
# https://pythonprogramming.net/matplotlib-graphing-series/
# https://pythonprogramming.net/matplotlib-intro-tutorial/

# With that, we're ready to use styles. Be sure to poke around the styles
# files, to get a feel for how they work and maybe customize them yourself a
# bit if you like. From there, using them is simple enough:

from matplotlib import pyplot as plt
from matplotlib import style

style.use('ggplot')

x = [5,8,10]
y = [12,16,6]

x2 = [6,9,11]
y2 = [6,15,7]

# can plot specifically, after just showing the defaults:
plt.plot(x,y,linewidth=5)
plt.plot(x2,y2,linewidth=5)

plt.title('Epic Info')
plt.ylabel('Y axis')
plt.xlabel('X axis')

plt.show()


# Here, as you can see, the only reference to styling that we've made is the
# style.use() function, as well as the line width changes. We could also
# change the line colors if we wanted, instead of using the default colors,
# and get a chart like:














