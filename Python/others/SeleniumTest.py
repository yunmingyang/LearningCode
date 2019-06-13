# import time
# from selenium import webdriver
#
#
# driver = webdriver.Chrome()
# # driver = webdriver.Chrome(executable_path='./chromedriver')
# # webdriver.ChromeOptions().add_argument()
# # options = webdriver.ChromeOptions()
# # options.add_experimental_option('prefs', {'intl.accept_languages': 'en,en_US'})
# # driver = webdriver.Chrome(options = options)
# driver.get('http://www.baidu.com')
#
# driver.find_element_by_css_selector('#kw').send_keys('selenium')
# driver.find_element_by_css_selector('#su').click()
#
# time.sleep(3)
# driver.find_element_by_css_selector(
#     '#content_left div:nth-child(4) h3 a').click()
#
# all_h = driver.window_handles
# print(all_h)
#
# for i in all_h:
#     if i != driver.current_window_handle:
#         driver.switch_to_window(i)
#
# if driver.title == 'Selenium（浏览器自动化测试框架）_百度百科':
#     driver.find_element_by_css_selector('body > div.body-wrapper > div.content-wrapper > div > div.main-content > dl.lemmaWgt-lemmaTitle.lemmaWgt-lemmaTitle- > dd > a.edit-lemma.cmn-btn-hover-blue.cmn-btn-28.j-edit-link').click()
#
# time.sleep(3)
# driver.find_element_by_css_selector('#conter > ul > li:nth-child(1) > a').click()
