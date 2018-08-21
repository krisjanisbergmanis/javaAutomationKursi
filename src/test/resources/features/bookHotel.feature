Feature: booking
@bookin
  Scenario: Book hotel
    Given I have opened homepage
    And I am in Signup form
    And I have created account
    When When I select Home button in Navigation bar
    And I select book Hotels button
    And I enter Rendezvous Hotels hotel
#    And I select hotel located in Singapore

    And I select 01.09.2019 as Check in date
    And I select 07.09.2019 as Check out date
    And I select 2 Adult and 2 Children
    And I select Search button
    And I select Junior Suites room
    And I select “CONFIRM THIS BOOKING” button
    Then Unpaid invoice page is opened

