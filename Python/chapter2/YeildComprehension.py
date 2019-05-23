import array

# test1
symbols = '%$#^&'
# 唯一参数不需要括号
print(tuple(ord(symbol) for symbol in symbols))

# 其中的第一个参数指定了存储方式
print(array.array('I', (ord(symbol) for symbol in symbols)))

# 笛卡尔积
colors = ['black', 'white', 'green']
sizes = ['L', 'M', 'S']

# 原理还有待确定
for s in ('%s %s' % (color, size) for color in colors for size in sizes):
    print(s)
