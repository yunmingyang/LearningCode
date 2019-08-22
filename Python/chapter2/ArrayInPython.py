from random import random
from array import array


# type code is 'd', it mean that the type of number
# in the array is double
floats = array('d', (random() for i in range(10 ** 7)))
print(floats[-1])

fp = open('num.bin', 'wb')
floats.tofile(fp)
fp.close()

floats2 = array('d')
fp = open('num.bin', 'rb')
floats2.fromfile(fp, 10 ** 7)
fp.close()
print(floats2[-1])
print(floats == floats2)