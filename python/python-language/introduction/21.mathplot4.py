
# https://pythonprogramming.net/introduction-to-python-programming

# https://pythonprogramming.net/matplotlib-python-3-basics-tutorial/
# https://pythonprogramming.net/matplotlib-graphing-series/
# https://pythonprogramming.net/matplotlib-intro-tutorial/


from matplotlib import pyplot as plt
from matplotlib import style

style.use('ggplot')

x = [5,8,10]
y = [12,16,6]

x2 = [6,9,11]
y2 = [6,15,7]

# Up to this, everything is about the same, but now you can see we've added
# another parameter to our plt.plot(), which is "label." Just to clarify, for
# those who are not yet totally comfortable with the notion of default
# parameters in functions, some people may be curious about why we are able to
# plot the x, y, and color variable without any sort of assignment, but then
# we have to assign label and linewidth. The main reason here is because there
# are many parameters to pyplot.plot(). It is really easy to forget their
# order. X, y, and color is fairly easy to remember the order, people are good
# at remembering orders of three. After that, the chances of forgetting the
# proper order get quite high, so it just makes sense. There are also many
# parameters to edit, so we just call them specifically. Anyway, we can see
# here that we added a "label," so matplotlib knows what to call the line.
# This doesn't quite yet give us a legend, however. We need to call
# plt.legend(). It's important to call legend AFTER you've plotted what you
# want to be included in the legend.


plt.plot(x,y,'g',label='line one', linewidth=5)
plt.plot(x2,y2,'c',label='line two',linewidth=5)

plt.title('Epic Info')
plt.ylabel('Y axis')
plt.xlabel('X axis')

plt.legend()

plt.grid(True,color='k')

plt.show()

# Okay, well that's good enough for linear charts I'd say. Keep in mind what I
# was saying about how matplotlib first "draws" things to a canvas, then
# finally shows it. Things like legends are drawn when you call them, so, if
# you are using, say, subplots, and call legends at the very end, only the 2nd
# subplot would have a legend. If you wanted a legend on each subplot, then
# you would need to call it per subplot. This is the same with titles! But
# hey, I didn't even cover subplots (multiple graphs on the same "figure,"
# which just means the same window)... if you are curious about those, check
# out the in-depth Matplotlib tutorial series, or the specific matplotlib
# subplots tutorial.















