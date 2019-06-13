# import getopt
# import sys

# opt,args = getopt.getopt(sys.argv[1:],'h:',['help'])# 第一个从1开始取是因为，0为当前文件名，所以
# print(opt,args)

# for optName,optValue in opt:
#     if optName == '-h':
#         print('help info')
#         exit()
#     elif optName == '--help':
#         print('exact help info')
#         exit()


# import time
# from selenium import webdriver

# driver = webdriver.Chrome('/home/yunyang/cockpit-auto/chromedriver')
# driver.get('http://www.baidu.com')
# print('machines_create'.replace(',','_'))

# import subprocess

# print(subprocess.check_output("avocado list ./ -t machines_pkg |awk '{{print $2}}'|awk -F':' '{{print $1}}'|sed -n '1p'",shell=True))

# import sys

# print(sys.path)

# import os
# print(os.getcwd())
# print('ENV IS',os.getenv('TEST'))


# if 'a' in 'sdasdasdasd':
#     print('sssssss')

# print(os.path)
# os.path.join()

# 三目运算符在python中实现
# def dosomething():
#     print('in the first func')
#     return 1

# b = 1
# c = 2
# d = 3
# a = dosomething() if b == 1  else  d
# print(a)

str = "No VM is running or defined on this host"
# 默认用空格作分割
print(str.split())
