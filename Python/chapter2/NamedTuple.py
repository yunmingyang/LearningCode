from collections import namedtuple


City = namedtuple('City', 'name country population coordinates')
tokyo = City('Tokyo', 'Japan', 36.933, (35.689722, 139.691667))

print(tokyo)
print(City._fields)
for field in tokyo:
    print(field)
print(tokyo[0])

LatLong = namedtuple('LatLong', 'lat long')
delhi_data = ('Delhi NCR', 'IN', 21.935, LatLong(28.613889, 77.208889))
# 接受可迭代对象生成类的实例
delhi = City._make(delhi_data)

# _asdict 具名元祖 -> 字典
for key, value in delhi._asdict().items():
    print(key, ':', value)
