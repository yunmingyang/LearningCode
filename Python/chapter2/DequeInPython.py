from collections import deque

# append和popleft都是原子操作
dq = deque(range(10), maxlen=10)
print(dq)

# 旋转
dq.rotate(3)
print(dq)
dq.rotate(-4)
print(dq)

# 满队列入队
# 左
dq.appendleft(-1)
print(dq)
# 右
dq.append(-2)
print(dq)

# extend
# 右
dq.extend([11, 22, 33])
print(dq)
# 左: 由于是一个一个添加所以是逆序
dq.extendleft([10, 20, 30, 40])
print(dq)
