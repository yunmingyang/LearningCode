import os
import sys
import bobo

# bobo -- HTTP微框架
@bobo.query('/')
def hello(person):
    return 'Hello %s!' % person

@bobo.query('/exit')
def shut():
    # sys.exit()/exit()/quit()抛出SystemExit异常,exit()/quit()一般用于IDLE退出
    # os._exit()不抛出异常
    os._exit(0)