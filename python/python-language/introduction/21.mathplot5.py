
# https://pythonprogramming.net/introduction-to-python-programming

# https://pythonprogramming.net/matplotlib-python-3-basics-tutorial/
# https://pythonprogramming.net/matplotlib-graphing-series/
# https://pythonprogramming.net/matplotlib-intro-tutorial/

# On to bar charts and scatter plots!

# Bar charts with matplotlib are basically 1 slight change, same with scatter
# plots. The only major change I like to make to bar charts is to center them,
# and that's about it:

from matplotlib import pyplot as plt
from matplotlib import style

style.use('ggplot')

x = [5,8,10]
y = [12,16,6]

x2 = [6,9,11]
y2 = [6,15,7]


plt.bar(x, y, align='center')
plt.bar(x2, y2, color='g', align='center')


plt.title('Epic Info')
plt.ylabel('Y axis')
plt.xlabel('X axis')

plt.show()


