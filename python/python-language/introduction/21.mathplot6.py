
# https://pythonprogramming.net/introduction-to-python-programming

# https://pythonprogramming.net/matplotlib-python-3-basics-tutorial/
# https://pythonprogramming.net/matplotlib-graphing-series/
# https://pythonprogramming.net/matplotlib-intro-tutorial/

# How about scatter plots? Super easy, we'll just change .bar() to .scatter(),
# and remove our align parameter:

from matplotlib import pyplot as plt
from matplotlib import style

style.use('ggplot')

x = [5,8,10]
y = [12,16,6]

x2 = [6,9,11]
y2 = [6,15,7]

plt.scatter(x, y)#, align='center')

plt.scatter(x2, y2, color='g')#, align='center')


plt.title('Epic Info')
plt.ylabel('Y axis')
plt.xlabel('X axis')

plt.show()
















