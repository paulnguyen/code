
# https://pythonprogramming.net/introduction-to-python-programming
# https://docs.python.org/3/library/statistics.html


# Since Python is such a popular programming language for data analysis, it
# only makes sense that it comes with a statistics module. Sadly, this is not
# available in Python 2.7, but that's okay because we're in Python 3!


import statistics

example_list = [5,2,5,6,1,2,6,7,2,6,3,5,5]

x = statistics.mean(example_list)
print(x)

y = statistics.median(example_list)
print(y)

z = statistics.mode(example_list)
print(z)

a = statistics.stdev(example_list)
print(a)

b = statistics.variance(example_list)
print(b)

