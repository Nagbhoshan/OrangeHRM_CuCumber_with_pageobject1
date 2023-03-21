
@tag
Feature: Admin login
  
  @tag1
  Scenario: Admin login with valid inputs
    Given i open chrome browser 
    And  i open with with url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When i enter username as "Admin"
    And i enter userpassword as "Qedge123!@#"
    And i click login butten
    Then i should see admin module displayed
    When i click logout
    Then  i should see login page
    When i close browser

  @tag2
  Scenario Outline: Admin login with invalid inputs
     Given i open chrome browser 
    And  i open with with url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When i enter username as "<username>"
    And i enter userpassword as "<userpassword>"
    And i click login butten
    Then i should see erorr message 
    When i close browser

    Examples: 
    |username|password|
    |Admin|4512|
    |ABCDE|Adrgf|
    |abcd|hddhd|
