#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login
  @tag1
  Scenario: Successful login with valid credentials
  
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enter Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then The page Title should be "Dashboard / nopCommerce administration"
    When User click on logout link
    Then The page Title should be "Your store. Login"
    And Close the browser

  #@tag2
  #Scenario Outline: Login Data Driver
   #
    #Given User launch chrome browser
    #When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    #And User enter Email as "<email>" and Password as "<password>"
    #And Click on Login
    #Then The page Title should be "Dashboard / nopCommerce administration"
    #When User click on logout link
    #Then The page Title should be "Your store. Login"
    #And Close the browser
    #Examples: 
      #| email  | password |
      #| admin@yourstore.com |    admin |
      #| admin1@yourstore.com |     admin123 |
