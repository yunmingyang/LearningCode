# def deco(func):
#     def inner():
#         print('inner by decorating')
#     return inner


# @deco
# def target():
#     print('running target')


# def test():
#     print('running test')


# print(test)

# # 被装饰器装饰后，函数名称发生变化,y因为装饰方法中返回的是另一个函数
# print(target)
# target()
# registry = []


# def register(func):
#     print('running registry %s' % func)
#     registry.append(func)
#     return func

# # 加载模块立即执行
# @register
# def func1():
#     print('running func1')


# @register
# def func2():
#     print('running func2')


# def func3():
#     print('running func3')


# def main():
#     print('running main')
#     print('registry ->', register)
#     func1()
#     func2()
#     func3()


# if __name__ == "__main__":
#     main()


# def logging(level):
#     def wrapper(func):
#         def inner_wrapper(*args, **kwargs):
#             print("[{level}]: enter function {func}()".format(
#                 level=level,
#                 func=func.__name__))
#             return func(*args, **kwargs)
#         return inner_wrapper
#     return wrapper


# @logging(level='INFO')
# def say(something):
#     print("say {}!".format(something))

# # 如果没有使用@语法，等同于
# # say = logging(level='INFO')(say)


# @logging(level='DEBUG')
# def do(something):
#     print("do {}...".format(something))


# if __name__ == '__main__':
#     say('hello')
#     do("my work")

# 一个应用的例子，若是使用在pyUint or avocado这种框架中
# 可以通过self.来在wrapper中定义变量，而不用使用这种自由变量方式，过于死板
def add_case_id(case_id):
    case_d = []

    def decorator(func):
        def wrapper(*args, **kwargs):
            case_d.append(case_id)
            func(*args, **kwargs)
            case_res = True

            print(case_id)
            print(case_res)
        return wrapper
    return decorator


@add_case_id('123456')
def test():
    print('int the test')


test()
