import os
import re
import secrets
import collections

WORD_RE = re.compile(r'[avc]+')

index = collections.defaultdict(list)

with open('test_data', 'w') as fp:
    [fp.write(secrets.token_hex(5) + '\n') for _ in range(10)]

if not os.path.exists('test_data'):
    raise Exception('need data')

with open('test_data', 'r') as fp:
    for line_no, line in enumerate(fp, 1):
        for match in WORD_RE.finditer(line):
            word = match.group()
            column_no = match.start() + 1
            location = (line_no, column_no)
            index[word].append(location)

for word in sorted(index, key=str.upper):
    print(word, index[word])
