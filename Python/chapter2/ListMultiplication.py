row = ['_'] * 3
board = []

for i in range(3):
    board.append(row)
print(board)

# modification will take effect in three sub-list of this list
board[0][1]='X'
print(board)

board = []
for i in range(3):
    # Sub-list will point to different objects, so modification
    # will just take effect in the modification location
    board.append(['_'] * 3)
print(board)

board[0][0] = 'X'
print(board)