import random
import string
import secrets

m_dict = {}

def random_string(length=10):
    if length <= 0:
        raise Exception('the length should be greater than 0')
    # 大小写字母加数字
    # return ''.join(
    #     random.choice(string.ascii_letters + string.digits)
    #     for _ in range(length))
    # random.choices()生成随机字符串list
    # return ''.join(
    #     random.choices(string.digits + string.ascii_letters, k=length))
    # length代表字节
    return secrets.token_hex(length)

# key对应value长度为0
def dict_test():
    m_dict['a'] = ''

    print(m_dict)
    print(len(m_dict['a']))

if __name__ == '__main__':
    dict_test()
    # print(random_string())
