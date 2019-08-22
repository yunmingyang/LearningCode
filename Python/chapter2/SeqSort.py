fruits = ['grape', 'rasberry', 'apple', 'banana']
print('the fruits: ' + str(fruits) + '\nafter sort: ' + str(sorted(fruits)))
print('the fruits: ' + str(fruits) + '\nafter sort: ' + str(sorted(fruits, reverse=True)))
print('the fruits: ' + str(fruits) + '\nafter sort: ' + str(sorted(fruits, key=len)))
print('the fruits: ' + str(fruits) + '\nafter sort: ' + str(sorted(fruits, reverse=True, key=len)))
print('the fruit: ' + str(fruits))
fruits.sort()
print('the fruit: ' + str(fruits))