# <div align=center> Emi Calculator App Automation With Selenium Appium </div>

### <div align=center>EMI Calculator is a simple loan calculation tool that helps the user to quickly calculate EMI and view payment schedule. In this repository, Selenium WebDriver & Appium  are used to automate the Emi Calculator App.</div>

### Tools & Technology used:
- Selenium Webdriver
- Appium
- Android Studio
- Appium Inspector
- TestNG Framework
- Java
- Intellij idea
- Gradle
- Allure

### Prerequisites

- jdk
- gradle

### How to run this project:
- Clone this project
- Give this following command for checking the connectivity with emulator : ```adb devices```
- Open Appium Server with this following command: ```appium```
- Open Appium Inspector
- Set desired capabilites in json format & click Start Session:
``` 
 {
  "platformName": "android",
  "appium:platformVersion": "11",
  "appium:automationName": "UIAutomator2",
  "appium:appPackage": "com.continuum.emi.calculator",
  "appium:appActivity": "com.finance.emicalci.activity.Splash_screnn",
  "appium:app": "D:\\apk\\emi_calculator.apk"
}
```
- Open ```build.gradle``` file as a project with Intellij IDEA
- Open ```terminal```
- Give this following command: ```gradle clean test```
- For generating Allure Report use these commands: ```allure generate allure-results --clean -output``` & ```allure serve allure-results```

### Allure Report

![screencapture-192-168-0-152-11085-index-html-2023-10-13-11_21_18](https://github.com/Shaishab10/Emi_Calculator_App_Automation_With_Selenium_Appium/assets/54171379/7107ca77-64cb-4560-9526-4e0e7e668050)
![screencapture-192-168-0-152-11085-index-html-2023-10-13-11_21_44](https://github.com/Shaishab10/Emi_Calculator_App_Automation_With_Selenium_Appium/assets/54171379/c9657709-629d-4804-8ea4-457369055db8)

### Output Video

https://github.com/Shaishab10/Emi_Calculator_App_Automation_With_Selenium_Appium/assets/54171379/25dbd263-51e6-48f0-ad32-9299f64431d3


