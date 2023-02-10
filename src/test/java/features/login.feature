Feature: Login Feature
  Scenario: user should be able to login with valid credentials
    Given user in TalentTek homepage
    And user enter valid email address
    And user enter valid password
    When user clicks on Log In button
    Then user should be able to log in successfully

  Scenario: User should not be able to login with valid email and invalid password
    Given User in TalentTEK Homepage
    And User enter valid email address
    And User enter invalid password
    When User clicks on Log In button
    Then User should be able to see " You have entered an incorrect email or student ID."

  Scenario: User should not be able to login with invalid email and valid password
    Given User in TalentTEK Homepage
    And User enter invalid email address
    And User enter valid password
    When User clicks on Log In button
    Then User should be able to see " You have entered an incorrect email or student ID."

  Scenario: User should not be able to login with invalid email and  password
    Given User in TalentTEK Homepage
    And User enter invalid email address
    And User enter invalid password
    When User clicks on Log In button
    Then User should be able to see " You have entered an incorrect email or student ID."