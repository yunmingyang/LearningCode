import random

class BingoCage:
    def __init__(self, items):
        # return range object, need to convert to list
        self._items = list(items)
        random.shuffle(self._items)

    def pick(self):
        try:
            return self._items.pop()
        except IndexError:
            raise LookupError('pick from empty BingoCage')
    # make the object callable 
    def __call__(self):
        return self.pick()


class Test:
    def __call__(self):
        print('Calllllll')

test = Test()
test()

bingo = BingoCage(range(3))
print(callable(bingo))
print(bingo.pick())
print(bingo())
print(bingo())