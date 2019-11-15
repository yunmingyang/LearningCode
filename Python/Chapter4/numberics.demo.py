import unicodedata
import re


re_digit = re.compile(r'\d')

sample = '1\xbc\xb2\u0969\u136b\u216b\u2466\u2480\u3285'

print(type(sample))
for c in sample:
    print('U+%04x' % ord(c),
          c.center(6),
          're_dig' if re_digit.match(c) else '_',
          'isdig' if c.isdigit() else '_',
          'isnum' if c.isnumeric() else '_',
          format(unicodedata.numeric(c), '5.2f'),
          unicodedata.name(c),
          sep='\t')