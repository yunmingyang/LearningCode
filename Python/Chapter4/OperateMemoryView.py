import urllib3
import struct

url = 'https://sunjs.oss-cn-beijing.aliyuncs.com/daigou/201804/20/1524230875542.png!dt'
http = urllib3.PoolManager()
r = http.request('GET', url)

fmt='<6sHH'

img = memoryview(r.data)
print(img.tolist()[:10])
header = img[:10]
print(bytes(header))
print(struct.unpack(fmt, header))
# a error raised as read only
# header[0] = 0
print(img.tolist()[:10])
