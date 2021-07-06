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
Feature: Customers

  Background: 
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enter Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
	
	@Sanity
  Scenario: Add new customer
    Then User can view DashBoard
    When User click on the customer Menu
    And Click on customers Menu Item
    And Click on add new button
    Then User can view add new customer page
    When User enter customer info
    And Click on Save button
    Then User can View Confimation message "The new customer has been added successfully"
    And close browser

@Regression
  Scenario: Search customer by EmailID
    Then User can view DashBoard
    When User click on the customer Menu
    And Click on customers Menu Item
    And Enter Customer Email
    When Click on Seach button
    Then User should found the email id in table
    And Close Browser
   #	 
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
