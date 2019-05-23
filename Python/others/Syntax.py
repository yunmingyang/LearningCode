# # 当该模块被引用时候，其主程序运行
# import sys

# if __name__ == '__main__':
#     print('程序自身在运行')
#     print(__name__)
#     # sys.exit()
# else:
#     print('我来自另一模块')
#     # print(__name__)
#     # sys.exit()

# print('--------------------------------------------------')
# # hello world
# print('hello world!')

# print('--------------------------------------------------')
# # 标识符
# import keyword

# print("python的关键字有",keyword.kwlist)#是一个list不是一个函数

# print('--------------------------------------------------')
# # 注释
# '''
# 注释1
# '''
# """
# 注释2
# """

# print('--------------------------------------------------')
# # 缩进
# a=1
# if True:
#     print("True")
# elif a == 1:
#     print("False")
# print("different indentation")

# print('--------------------------------------------------')
# # 字符串(rjust右对齐,zfill在数字左边添0)
# word = '字符串'
# sentence = "这是一个句子"
# paragraph = """这是一个段落，
# 可以由多行组成"""
# stripStr = '   a.py   '

# print('a',stripStr.rstrip(),'b')

# print('--------------------------------------------------')
# # format(!a使用ascii(),!s使用str,!r使用repr)
# import math

# print('常量PI的值近似为: {}.'.format(math.pi))

# print('--------------------------------------------------')
# # "this""is""string"自动转换为"this is string"
# print(word,sentence,paragraph)

# print('--------------------------------------------------')
# # 加号可以连接字符串
# print(word + sentence + paragraph)

# print('--------------------------------------------------')
# strR = 'Runoob'
# # 字符串截取，从右往左是以-1开始的，且-1代表最后一个字符，但是当使用-1作为尾下标时候，则会截取到-1的前一个字符
# print(strR)
# print(strR[0:-1])
# print(strR[:-1])
# print(strR[:])
# print(strR[0:-1:2])# 步长
# print(strR[0])
# print(strR[2:5])
# print(strR[2:])
# print(strR * 2)
# print(strR[-3:-1])
# print(strR[-3:])
# print(strR[-3])
# print(strR[-1])

# print('--------------------------------------------------')
# # 转义
# print("hello world!\nRunoob!")

# print('--------------------------------------------------')
# # r使转义失效
# print(r"hello world!\nRunoob!")

# print('--------------------------------------------------')
# # 字符串大写转小写
# str1 = 'ABC'
# print(str1.lower())

# print('--------------------------------------------------')
# # 用户输入
# input("\n\n按下enter后退出")

# a = input("请输入一个数字:")
# print(a)

# print('--------------------------------------------------')
# # 同一行显示多条语句
# import sys;x='runoob';sys.stdout.write(x+'\n')

# print('--------------------------------------------------')
# # 多个语句构成代码组(示例)
# '''
# if expression:
#     suite
# elif expression:
#     suite
# else :
#     suite
# '''

# print('--------------------------------------------------')
# # print不换行输出
# print("hello")
# print("world!")

# print("hello",end=" ")
# print("world!")

# print('--------------------------------------------------')
# # import
# print('=====================import===================')
# import sys
# for i in sys.argv :
#     print(i)
# print('\npython路径为',sys.path)
# print('=====================from import===================')
# from sys import argv,path
# print('path:',path)

# print('--------------------------------------------------')
# # 列表推导式
# L1 = ['Hello', 'World', 18, 'Apple', None]
# # 列表推导式，从L1中获取三个字符串并转换为小写
# L2 = [ s.lower() for s in L1 if s in ['Hello','World','Apple'] ]

# print(L2)
# # 集合字典也同样支持推导式
# print('--------------------------------------------------')
# # 矩阵转换
# matrix = [
#     [1,2,3,4],
#     [5,6,7,8],
#     [9,10,11,12]
# ]
# print(matrix)
# matrix = [[row[i] for row in matrix] for i in range(4)]
# print(matrix)

# matrix1 = [
#     [1,2,3,4],
#     [5,6,7,8],
#     [9,10,11,12]
# ]
# transposed = []
# for i in range(4):
#     transposed.append([row[i] for row in matrix1])

# print(transposed)

# matrix2 = [
#     [1,2,3,4],
#     [5,6,7,8],
#     [9,10,11,12]
# ]
# transposed = []
# for i in range(4):
#     transposed_row = []
#     for row in matrix2:
#         transposed_row.append(row[i])
#     transposed.append(transposed_row)

# print(transposed)

# print('--------------------------------------------------')
# # 迭代器（重写__next__方法）
# class MyNumbers:# 未抛出异常此时迭代器会无限进行，若要避免此情况，需要抛出StopIteration异常
#     def __iter__(self):
#         self.a = 1
#         return self
#     def __next__(self):
#         x = self.a # 记录上一次的值
#         self.a += 1
#         return x

# myNumbers = MyNumbers()
# it = iter(myNumbers)

# print(next(it))
# print(next(it))
# print(next(it))
# print(next(it))
# print(next(it))

# print('--------------------------------------------------')
# class MyIt:
#     def __iter__(self):
#         self.a = 1
#         return self
#     def __next__(self):
#         if self.a <= 20:
#             x = self.a
#             self.a += 1
#             return x
#         else:
#             raise StopIteration
            
# mIt = MyIt()
# it = iter(mIt)
 
# for i in it:
#      print(i)

# print('--------------------------------------------------')
# # 生成器
# '''
# import sys

# def fibonacci(n):
#     a, b, counter = 0, 1, 0
#     while True:
#         counter += 1
#         if counter > n :
#             return
#         yield b # 生成器，当运行到此位置时候，函数会暂停并保存当前所有运行信息，并返回yield的值，在下一次执行next()方法时从当前位置继续运行
#         a, b = b, a + b
        
# f = fibonacci(20)

# while True:
#     try:
#         print(next(f),end=" ")
#     except StopIteration:
#         sys.exit()
# '''

# print('--------------------------------------------------')
# # 硬拷贝和浅拷贝
# def noChange(a):# 不可变参数传参相当元软拷贝
#     a = 10

# def change(a):# 可变类型传参相当于硬拷贝，改变参数内容会直接影响原值
#     if isinstance(a,list):# 除了这种方式还有type() is这种方式
#         a[0] = 10
#     else:
#         raise Exception

# b = 5

# noChange(b)
# print(b)

# l = [1,2,3,4,5,6]

# print(l)
# change(l)
# print(l)

# print('--------------------------------------------------')
# # global和nonlocal
# num = 1
# def fun1():
#     global num  # 需要使用 global 关键字声明
#     print(num) 
#     num = 123
#     print(num)
# fun1()
# print(num)
# # 若要使用非当前函数内，且非全局的变量，使用喔咕nonlocal关键字即可

# print('--------------------------------------------------')
# # python数据结构
# # type()和isinstance()
# a,b,c,d = 20,5.5,True,1+3j
# print(type(a),type(b),type(c),type(d))
# #print(isinstance(a,int))
# #区别主要是type()不会认为子类是一种父类类型，isinstance()会认为字类是一种父类类型

# class A:
#     pass
# class B(A):
#     pass

# print(isinstance(A(),A))
# print(type(A()) == A)
# print(isinstance(B(),A))
# print(type(B()) == A)

# print(2 / 4)# 除法得浮点数
# print(type(2 / 4))
# print(2 // 4)# 除法得整数
# print(type(2 // 4))
# print(17 % 3)# 取余数得整数
# print(type(17 % 3))
# print(2 ** 3)
# print(type(2 ** 3))
# print(type(2 + 3 * 5))
# print(type(2.0 + 3 * 5))# 转换为浮点数

# # 字符串
# str2 = 'runoob'
# #str2[5] = a# 字符串不可被改变，这样也不会生成新串

# # List
# # 具体访问方式和字符串一样
# # 元素可更改
# list1 = ['a','b','c','d']
# list2 = ['e','e','e','e']
# list3 = list2 + list1
# print(list1[-1])
# print(list3)
# list4 = list1
# print(list4)
# list1[3]='e'
# print(list4)
# list1 = list2 + list1
# print(list1)
# print(list4)

# # tuple
# tuple1 = (1,'123')
# print(tuple1)
# tup1 = ()
# tup2 = (20,)
# l1 = []
# l2 = [1]
# # 空元组的特殊语法
# print(tup1)
# print(tup2)
# print(l1)
# print(l2)

# # set
# s1 = {} # 一个空字典
# print(type(s1))
# s2 = set() # 空set
# print(type(s2))
# ss1 = {1,2} # 有值的set
# print(type(ss1))
# ss1 = set('a') # 使用set()初始化 
# print(ss1)
# ss1 = set([1,2,3,4,5,6]) # set()中如果想要使用number类型必须使用有迭代器的数据类型
# print(ss1)
# ss2 = set(l2)
# print(ss2)
# print(type(l2),type(ss2))

# # 字典，建值必须唯一以及键值必须使用不可变类型，即tuple,string以及number
# # key必须不同
# dc1 = {():'a'} # 可变类型会导致报错
# dc2 = {1:'b'} # 键若不设置也会报错

# # 数据类型转换
# # 转整数
# x = 1.9
# print(int(x))
# # 转浮点数
# x = 3
# print(float(x))
# # 创建复数
# print(complex(1,3))
# # 字典转字符串
# a = {"a":"c"}
# str1 = str(a)
# print(type(str1))
# print(type(a))
# # 计算字符串表达式值
# print(eval('x ** 3'))
# # 转换，一般只要是序列都可以转
# print(tuple(a))
# print(tuple(tuple1))
# print(tuple(str2))


# print(list(a))
# print(list(tuple1))
# print(list(str2))

# print(set(a))
# print(set(tuple1))
# print(set(str2))

# print(frozenset(a))
# print(frozenset(tuple1))
# print(frozenset(str2))

# print(dict(a='b',b='c'))
# print(dict())

# x = 1000
# print(x)
# print(chr(x))
# print(ord('y'))
# print(hex(x))
# print(oct(x))

# # 列表可以当作堆栈使用
# # 使用队列时候可以使用collections包中的deque

# print('--------------------------------------------------')
# # 字典遍历
# for i,v in enumerate(['tac','tic','toe']):
#     print(i,' ',v)

# print('--------------------------------------------------')
# # 反向遍历
# for i in reversed(range(1,10,2)):
#     print(i)
# # with
# # 重写__enter__以及__exit__方法
# class sample:
#     a = 1
#     def __enter__(self):
#         return self.a
#     def __exit__(self,exc_type, exc_val, exc_tb):
#         print('exit')

# def getSample():
#     return sample()

# with getSample() as useA:
#     print('the project is','type is',type(useA))


class TestClass:
    def __str__(self):
        return '__str__ method'
    def __repr__(self):
        return '__repr__ method'

tc = TestClass()
s = str(tc)
print(s)