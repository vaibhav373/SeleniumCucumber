$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
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
  "status": "passed"
});
formatter.step({
  "name": "User enter Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "adminDemo.user_enter_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "adminDemo.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "adminDemo.the_page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "adminDemo.user_click_on_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "adminDemo.the_page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "adminDemo.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});