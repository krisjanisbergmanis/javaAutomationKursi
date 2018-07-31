Feature: this feature is about login

  Scenario: Successfull login
    Given I have opened homepage
    When I select My account menu
      And I select Log in option
      And I enter Email address
      And I confirm Password
      And I press Login button
    Then I am logged in