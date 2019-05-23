from selenium import webdriver as WB
# from selenium.webdriver.common.by import By
import time

# driver = WB.Chrome(executable_path='./chromedriver')
# 除了PATH和同级目录中，貌似load driver时候都会失败
# WB.ChromeOptions().add_argument()
# options = WB.ChromeOptions()
# options.add_experimental_option('prefs', {'intl.accept_languages': 'en,en_US'})
# driver = WB.Chrome(options = options)
# driver.get("http://10.66.8.155:9090")
driver = WB.Chrome()
driver.get('http://www.baidu.com')

driver.find_element_by_css_selector('#kw').send_keys('selenium')
driver.find_element_by_css_selector('#su').click()

time.sleep(3)
driver.find_element_by_css_selector(
    '#content_left div:nth-child(4) h3 a').click()
# 弹出新窗口，必须通过window切换到新的窗口上才可以定位新窗口元素
all_h = driver.window_handles
print(all_h)
for i in all_h:
    if i != driver.current_window_handle:
        driver.switch_to_window(i)

if driver.title == 'Selenium（浏览器自动化测试框架）_百度百科':
    driver.find_element_by_css_selector(
        'body > div.body-wrapper > div.content-wrapper > div > div.main-content > dl.lemmaWgt-lemmaTitle.lemmaWgt-lemmaTitle- > dd > a.edit-lemma.cmn-btn-hover-blue.cmn-btn-28.j-edit-link').click()
time.sleep(3)
driver.find_element_by_css_selector(
    '#conter > ul > li:nth-child(1) > a').click()


# def login(user_name,pass_word):
#     name = driver.find_element(By.CSS_SELECTOR,'#login-user-input')
#     name.send_keys(user_name)

#     pwd = driver.find_element(By.CSS_SELECTOR,'#login-password-input')
#     pwd.send_keys(pass_word)

#     driver.find_element(By.CSS_SELECTOR,'#login-button').click()

# login('root','1qaz9ol.')

# time.sleep(1)
# driver.find_element_by_link_text('Virtual Machines').click()

# time.sleep(1)
# driver.switch_to.frame('cockpit1:localhost/machines')
# driver.find_element_by_css_selector('#vm-test-row').click()
# driver.find_element_by_css_selector('#vm-test-off-caret').click()
# driver.find_element_by_css_selector('#vm-test-forceOff').click()


# time.sleep(1)
# driver.find_element_by_css_selector('#vm-test-disks').click()
# driver.find_element_by_css_selector('#vm-test-disks-adddisk').click()

# time.sleep(1)
# driver.find_element_by_css_selector('#vm-test-disks-adddisk-new-name').send_keys('abc')
# driver.find_element_by_css_selector('#vm-test-disks-adddisk-new-diskfileformat > button').click()
# driver.find_element_by_css_selector('#vm-test-disks-adddisk-new-diskfileformat > ul > li:nth-child(2) > a').click()
# driver.find_element_by_css_selector('#vm-test-disks-adddisk-dialog-add').click()
# driver.find_element_by_css_selector('#app a').click()

# time.sleep(1)
# driver.find_element(By.CSS_SELECTOR,'#create-storage-pool').click()

# time.sleep(1)
# driver.find_element(By.CSS_SELECTOR,'#storage-pool-dialog-name').send_keys()
