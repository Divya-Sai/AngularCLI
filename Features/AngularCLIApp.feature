Feature: Login to Angular CLI Application
  Scenario: Successful login to browser
    Given Open Chrome browser
    When  Launch the "http://localhost:4200/"
    Then  verify the title of the page
    And  quit the browser