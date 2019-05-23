import xml.etree.ElementTree as ET


xml = ET.ElementTree(file='/home/yunyang/test333.xml')
print(xml)
print(xml.find('//cpu/model').attrib)
