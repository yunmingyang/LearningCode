inputstring = u'\nDoor:\xa0No\tvum\t'
move = dict.fromkeys((ord(c) for c in u"\xa0\n\t"))
print(move)
out = inputstring.translate(move)
print(out)
