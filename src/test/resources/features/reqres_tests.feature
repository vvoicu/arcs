@Regression
Feature: Reqres API Test

  In order to demonstrate cucumber and restassured
  As a project outline
  I want to create Api calls that will point to Reqres API

  @SomeTag1
  Scenario: User Post call
    Given I have user details
    When I post for user creation
    Then I should see user creation message
    
    
  @SeTag2
  Scenario: Some User Post Creation
    Given I have user details
    When I post for user creation
    Then I should see user creation message