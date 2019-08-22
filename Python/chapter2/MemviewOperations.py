from array import array

# 短整型有符号整数
numbers = array('h', [-2, -1, 0, 1, 2])

memv = memoryview(numbers)
print(memv[0])
print(len(memv))

# 无符号字符
memv_oct = memv.cast('B')
print(memv_oct.tolist())

# 修改高8位为4
memv_oct[5] = 4
print(numbers)
