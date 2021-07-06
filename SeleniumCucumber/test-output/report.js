$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Vaibhav/eclipse-workspace/SeleniumCucumber/Features/Customers.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "adminDemo.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "adminDemo.user_opens_URL(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d91.0.4472.114)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-IUIGTE3\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.114, chrome: {chromedriverVersion: 91.0.4472.19 (1bf021f248676..., userDataDir: C:\\Users\\Vaibhav\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:56604}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b48ba46bbe38a21740243d148b10d21b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat stepDefinitions.adminDemo.user_opens_URL(adminDemo.java:38)\r\n\tat ✽.User opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"(file:/C:/Users/Vaibhav/eclipse-workspace/SeleniumCucumber/Features/Customers.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enter Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "adminDemo.user_enter_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "adminDemo.click_on_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add new customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User can view DashBoard",
  "keyword": "Then "
});
formatter.match({
  "location": "adminDemo.user_can_view_DashBoard()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on the customer Menu",
  "keyword": "When "
});
formatter.match({
  "location": "adminDemo.user_click_on_the_customer_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "adminDemo.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on add new button",
  "keyword": "And "
});
formatter.match({
  "location": "adminDemo.click_on_add_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "adminDemo.user_can_view_add_new_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "adminDemo.user_enter_customer_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "adminDemo.click_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can View Confimation message \"The new customer has been added successfully\"",
  "keyword": "Then "
});
formatter.match({
  "location": "adminDemo.user_can_View_Confimation_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMSteps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "adminDemo.user_launch_chrome_browser()"
});
