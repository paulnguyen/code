
# https://pythonprogramming.net/introduction-to-python-programming


import statistics

# Above, we have referenced the statistics module and loaded it into memory
# under the statistics object. This will allow us to reference any of the
# functions within the statistics module. To do so, we will need to mention
# statistics, followed by a period, then the function name. A simple
# exhibition of the mean function from statistics could look like this:


example_list = [5,2,5,6,1,2,6,7,2,6,3,5,5]
print(statistics.mean(example_list))

# The generated output from this will be the mean, or average, of the list.

# Sometimes, however, you will see people use the "as" statement in their
# imports. This will allow you to basically rename the module to whatever you
# want. People generally do this to shorten the name of the module.
# Matplotlib.pyplot is often imported as plt and numpy is often imported as
# np, for example


import statistics as s
print(s.mean(example_list))


# What if you don't even want to type that S though? Well there's an app for
# that! You can just import each function within the module you plan to use:

from statistics import mean
# so here, we've imported the mean function only.
print(mean(example_list))

# and again we can do as
from statistics import mean as m
print(m(example_list))


# What about more functions?

from statistics import mean as m, median as d
print(m(example_list))
print(d(example_list))


# What if we want to just import everything from statistics like we did
# initially, but we don't want to type the statistics because we have fat
# fingers and this will just slow us down?.

from statistics import *
print(mean(example_list))






