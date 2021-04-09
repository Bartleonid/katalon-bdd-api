Feature: GET Feature

  #Background: 
    #Given I am connected

  Scenario: Verify Get Request
    When I make a GET request
    Then I get response code "200"

