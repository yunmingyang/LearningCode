import re
import secrets

index = {}
WORD_RE = re.compile(r'[abc]+')

with open('test_data', 'w+', encoding='utf-8') as f:
    [f.writelines(secrets.token_hex(10) + '\n') for _ in range(10)]

with open('test_data', encoding='utf-8') as fp:
    # enumerate: 用于将一个可遍历的数据对象(如列表、元组或字符串)组合为一个索引序列, 同时列出数据和数据下标
    for line_no, line in enumerate(fp, 1):
        # finditer: pattern在string里所有的非重复匹配,返回为一个迭代器iterator保存了匹配对象
        for match in WORD_RE.finditer(line):
            word = match.group()
            column_no = match.start() + 1
            location = (line_no, column_no)
            # # without setdefault
            # occurrences = index.get(word, [])
            # occurrences.append(location)
            # index[word] = occurrences
            # with setdefault
            index.setdefault(word, []).append(location)
# 以字母顺序打印出结果
for word in sorted(index, key=str.upper):
    print(word, index[word])
