# lambda函数定义体中不能赋值，也不能使用while、try等语句
from FunObject import fruits

print(sorted(fruits, key=lambda word: word[::-1]))