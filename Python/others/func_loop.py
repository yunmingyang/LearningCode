def test():
    print('1')


def main(func):
    timeout = 10
    while timeout >= 0:
        func()
        timeout -= 1


if __name__ == '__main__':
    main(test)
    main(lambda: print(2))
