def factorial(n):
    '''return n!'''
    return 1 if n < 2 else n * factorial(n - 1)
def reverse(word):
    return word[::-1]

fact = factorial
fruits = ['strawberry', 'fig', 'apple', 'cherry', 'raspberry', 'banana']

if __name__ == '__main':
    print(factorial(42))
    print(factorial.__doc__)
    print(type(factorial))
    print(fact)
    print(list(map(fact, range(11))))

    print(reverse('testing'))
    print(sorted(fruits, key=len))
    print(sorted(fruits, key=reverse))

