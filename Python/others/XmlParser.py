import xml.etree.ElementTree as ET


xml = ET.ElementTree(file='')
print(xml)
print(xml.find('//cpu/model').attrib)
