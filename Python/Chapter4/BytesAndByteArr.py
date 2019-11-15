cafe = bytes('cafe', encoding='utf_8')
print(cafe)
# Each element is a number between 0 to 255
print(cafe[0])
# The slice of bytes is still the same type
print(cafe[:1])

cafe_arr = bytearray(cafe)
print(cafe_arr)
print(cafe_arr[:1])