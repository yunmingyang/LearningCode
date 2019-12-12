from inspect import signature

def clip(text, max_len=80):
    end = None
    if len(text) > max_len:
        space_before = text.rfind(' ', 0, max_len)
        if space_before >= 0:
            end = space_before
        else:
            space_after = text.rfind(' ', max_len)
            if space_after >= 0:
                end = space_after
    if end is None:
        end = len(text)
    return text[:end].rstrip

print(clip.__defaults__,
      clip.__code__,
      clip.__code__.co_varnames,
      clip.__code__.co_argcount,
      sep='\n')

sig = signature(clip)
print(sig,
      type(sig),
      str(sig),
      sep='\n')
# inspect.Signature对象的parameters属性是一个有序映射
# inspect._empty表示没有默认值,None也算有效默认值
for name, param in sig.parameters.items():
    print(param.kind, ':', name, '=', param.default)