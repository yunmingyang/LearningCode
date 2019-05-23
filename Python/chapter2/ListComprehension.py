# _*_ coding = utf-8 _*_

symbols = '$#%&^'

# for loop
first = []
for symbol in symbols:
    first.append(ord(symbol))

print(first)

# forlistcomprehension.
# 列表推导式的原则是创建新列表，尽量保持简短，若是列表推导式过长，则可以考虑用for循环重写
second = [ord(symbol) for symbol in symbols]
print(second)

# a bug for old version,x in the listcomprehension will cover the truth x
# but it will not appear in the python3.7
x = 'some test'
temp = [x for x in 'ABC']
print('x =', x, 'temp=', temp)

# filter & map
# listcomprehension
symbol1 = '$%^&*'
beyond_ascii = [ord(x) for x in symbol1 if ord(x) > 40]
print(beyond_ascii)

# filter & map
beyond_ascii1 = list(filter(lambda c: c > 40, map(ord, symbol1)))
print(beyond_ascii1)

# another listcomprehension -- shirt
colors = ['black', 'white', 'green']
sizes = ['L', 'M', 'S']
shirt = [(color, size) for color in colors for size in sizes]
print(shirt)
