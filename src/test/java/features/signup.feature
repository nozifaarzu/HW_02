Feature: Signup Feature

  @test
  Scenario: User should be able to create a brand new account with unique email address
    Given user in TalentTEK Homepage
    And user clicks on "Create new account" button
    And user enters First and Last Name
    And user enter their valid email address
    And user enter Password and confirm password
    And user enter "Oct" under Birth month
    And user enter "1" under Birth date
    And user enter "1996" under Birth year
    And user enter their gender as "female"
    And user agrees on terms and condition checkbox
    When user clicks on Create my account button
    Then user should be able to get their studentId


  @regression @smoke @sanity
  Scenario Outline: Create a new user with given list
    Given user in TalentTEK Homepage
    And user clicks on "Create new account" button
    And user enter "<First>" and "<Last>" Name
    Examples:
      |First|Last|
      |QA   |TEST|
      |Salman|Khan|
      |Imran |Hasmi|
      |Kajol |Devgan|