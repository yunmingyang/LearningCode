import json

dict1 = dict()
dict1['title'] = 'rhel-8-rc3'
dict1['results'] = {}

with open('a', 'r+') as f:
    for line in f:
        temp = line.split(":")
        dict1['results'][temp[0]] = temp[1].strip()

print(dict1)
with open('b.json', 'w') as f:
    json.dump(dict1, f, indent=4)
