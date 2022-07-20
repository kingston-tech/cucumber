Feature: To validate the login functionality of facebook application

  Background: 
    Given To user should be in facebook login page
@regression
  Scenario Outline: To validate the functionality with invalidate creadtials
    When To user has to fill "<username>" and "<password>"
    And The user has to click "login" button
    Then The user should navigate the invaild login page on the application

    Examples: 
      | username           | password  |
      | Kingston           | 123344455 |
      | Kingston@gmail.com |  98765456 |
@Smoke
  Scenario Outline: To validate the Create New account
    When To user has to fill "<Firstname>" , "<Lastname>" , "<Phonenumber>"
    And The user has to click "singup" button
    Then The user should navigate the invaild login page

    Examples: 
      | Firstname | Lastname | Phonenumber |    
      | Kingston  | kings    |  0987655554 | 
      | Kingston  | A        |  9876543213 | 
        
