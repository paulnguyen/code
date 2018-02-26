
# https://pythonprogramming.net/introduction-to-python-programming

# Example CSV File:
#
#	1/2/2014,5,8,red
#	1/3/2014,5,2,green
#	1/4/2014,9,1,blue

import csv

# how to open a CSV file and read each row, as well as reference specific data
# on each row

with open('17.example.csv') as csvfile:
    readCSV = csv.reader(csvfile, delimiter=',')
    for row in readCSV:
        print(row)
        print(row[0])
        print(row[0],row[1],row[2],)

# how to pull out specific data from the spreadsheet and save it to a list
# variable:

print( '=============' )
with open('17.example.csv') as csvfile:
    readCSV = csv.reader(csvfile, delimiter=',')
    dates = []
    colors = []
    for row in readCSV:
        color = row[3]
        date = row[0]
        dates.append(date)
        colors.append(color)
    print(dates)
    print(colors)


