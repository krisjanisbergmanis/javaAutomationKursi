Feature: this feature is about login

  Scenario: Successfull login
    Given I have opened homepage
    And I have created account
    When I have logged out
    When I select My account menu
      And I select Log in option
      And I enter username
      And I enter Password
      And I press Login button
    Then user account page is opened