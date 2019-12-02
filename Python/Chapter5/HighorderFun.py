# 不定变量函数apply在python3中已经移除,因为fn(*args, **keywords)可以替代它
from FunObject import fact
from functools import reduce
from operator import add

# 列表推导式代替map filter
print(list(map(fact, range(6))))
print([fact(n) for n in range(6)])
print(list(map(fact, filter(lambda n: n % 2, range(6)))))
print([fact(n) for n in range(6) if n % 2])

# sum替代reduce
print(reduce(add, range(600)))
print(sum(range(600)))

# all
cond = [False, True]
cond1 = [False, False]
cond2 = [True, True]
print(all(cond))
print(all(cond1))
print(all(cond2))

# any
cond = [False, True]
cond1 = [False, False]
cond2 = [True, True]
print(any(cond))
print(any(cond1))
print(any(cond2))