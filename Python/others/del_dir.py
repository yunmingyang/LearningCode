import os
import shutil

files = os.listdir()
# a list of no delete things
no_del = []

for f in files:
    if f not in no_del:
        print('deleting ', f)
        shutil.rmtree(f)
        print('done')
