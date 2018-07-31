Feature: this feature is about creating new accounts

  Scenario: Successfull sign-up
    Given I have opened homepage
    When I select My account menu
      And I select Sign up button
      And I enter First name
      And I enter Last name
      And I enter Mobile number
      And I enter Email address
      And I confirm Password
      And I select Sign up password
    Then user account page is opened


  Scenario: Unsuccessfull sign-up
    Given I have opened homepage
    When I select My account menu
      And I select Sign up button
      And I enter First name
      And I enter Last name
      And I enter Mobile number
      And I enter Email address
      And I confirm Password
      And I select Sign up password
    Then user account page is opened