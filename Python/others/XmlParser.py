import xml.etree.ElementTree as ET


xml = ET.ElementTree(file='')
xml.find('.//').set('', '')
print(xml.find('.//').attrib)
xml.write('')
