
@tag
Feature: Addnew Employee registration


  @tag1
  Scenario: Add new employee registration with valid inputs
     Given i open chrome browser 
    And  i open with with url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When i enter username as "Admin"
    And i enter userpassword as "Qedge123!@#"
    And i click login butten
    When i click PIM link
    And  i click Add Employee link
    And i enter firstname As "Nagabhoosha"
    And i enter lastname AS "Kohli"
    And i take employee id value
    And i create login details
    And i enter user name as "Nagabhooshan"
    And i enter password as "Nagu123!@#"
    And i enter conformpassword as "Nagu123!@#"
    And i select status "Enabled"
    And i click save buteen
    Then i should see Personal details 
    When i click Edit buteen
    And  i enter Other Id "Nagu343"
    And i enter Driver's License Number "Nagu1432"
    And i enter License Expiry Date 
    And i click Gender
    And i select Marital Status
    And i select Nationality
    And i enter Date of Birth
    And i save personal details
    When i click Employee List link 
    And i enter taken employee id 
    And i click search butten
    Then i shoud see employee table in  new employee registration 
     When i click logout
     When i close browser
     
     
     
     