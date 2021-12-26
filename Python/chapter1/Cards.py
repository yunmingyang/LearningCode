import collections
from random import choice

Cards = collections.namedtuple('Card', ['rank', 'suit'])
print(Cards)  # 实际的类型名为Card,创建了一个tuple的子类型，使用Cards去调用
print(type(Cards))  # 类型是一个type

# no __setitem__ method, can not be shuffled
class FenchDeck:
    ranks = [str(n) for n in range(2, 11)] + list('JQKA')
    suits = 'spades diamonds clubs hearts'.split()
    suit_values = dict(spades=3, diamoonds=2, clubs=1, hearts=0)

    def __init__(self):
        # 第一个循环为外循环，第二个循环为第一个的内循环
        self._cards = [Cards(rank, suit) for suit in self.suits for rank in self.ranks]

    def __len__(self):
        return len(self._cards)

    def __getitem__(self, position):
        return self._cards[position]

    # Line break after just one object by default
    def __repr__(self, line_break=1):
        count = 0
        temp = ""
        for card in self._cards:
            split = " "
            count += 1
            if count == line_break:
                split = "\n"
                count = 0
            temp += str(card) + split
        return temp

    def spades_high(self, the_card):
        rank_value = self.ranks.index(the_card.rank)
        return rank_value*len(self.suit_values) + rank_value


deck = FenchDeck()
print(len(deck))

print("--------------1-----------------------")
# __getitem__使得可以进行迭代操作，且由于实际交给_cards和下标来进行，还可以进行切片操作
for card in deck:
    print(card)
print("--------------2-----------------------")
# 反向
for card in reversed(deck):
    print(card)
print("--------------3-----------------------")
# 根据
for card in sorted(deck, key=deck.spades_high):
    print(card)
print("--------------result-----------------------")
print(deck)
print("-------------------------------------------")
print(choice(deck))

# 不包括最后一个
print(deck[:3])
