# cls为仅限关键字参数,即不使用cls=xxx这种形式,不会传参给cls
def tag(name, *content, cls=None, **attrs):
    if cls is not None:
        attrs['class'] = cls
    if attrs:
        attr = ''.join(' %s="%s"' % (key, value)
                       for key, value
                       in attrs.items())
    else:
        attr = ''
    if content:
        return '\n'.join('<%s%s>%s</%s>' % 
                         (name, attr, c, name) for c in content)
    else:
        return '<%s%s />' % (name, attr)

print(tag('br'),
      tag('p', 'hello'),
      tag('p', 'hello', 'world'),
      tag('p', 'hello', id=33),
      tag('p', 'hello', 'world', cls='sidebar'),
      tag(content='testing', name='img'),
      sep='\n')

my_tag={'name': 'img',
        'titile': 'Sunset Boulevard',
        'src': 'sunset.jpg',
        'cls': 'framed'}
# ** 将会使字典的元素作为单个参数传入,且同名键会绑定到相应的参数名上
print(tag(**my_tag))