import collections

Cards = collections.namedtuple('Card', ['rank', 'suit'])
print(Cards)  # 实际的类型名为Card,创建了一个和tuple的子类型，使用Cards去调用
print(type(Cards))  # 类型是一个type


class FenchDeck:
    ranks = [str(n) for n in range(2, 11)] + list('JQKA')
    suits = 'spades diamonds clubs hearts'.split()

    def __init__(self):
        # 第一个循环为外循环，第二个循环为第一个的内循环
        self._cards = [Cards(rank, suit)
                       for suit in self.suits for rank in self.ranks]

    def __len__(self):
        return len(self._cards)

    def __getitem__(self, position):
        return self._cards[position]


deck = FenchDeck()
print(len(deck))

for card in deck:  # __getitem__使得可以进行迭代操作，且由于实际交给_cards和下标来进行，还可以进行切片操作
    print(card)
