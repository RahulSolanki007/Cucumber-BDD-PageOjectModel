Feature: feature to Test login functionality

  @SmokeTest
  Scenario: Check login is successfull with valid credentials
    Given user is on login page
    When user enters username and passsword
    And clicks on login button
    Then user is navigated to the home page
    
    
