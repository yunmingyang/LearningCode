import doctest


def test(a, b):
    '''
    >>> test(2, 3) # doctest: +ELLIPSIS
    2
    ...
    '''
    print(a)
    print(b)


if __name__ == '__main__':
    doctest.testmod(verbose=True)
