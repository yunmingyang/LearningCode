import random
import bisect

SIZE = 9

random.seed(1729)

my_list = []
for i in range(SIZE):
    new_item = random.randrange(SIZE)
    bisect.insort(my_list, new_item)
    print('%2d -> ' % new_item, my_list)