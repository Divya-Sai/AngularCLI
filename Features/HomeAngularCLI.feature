Feature: Home Page
  Scenario: user should click on Containers
    Given Open Chrome browser
    When  Launch the "http://localhost:4200/"
    Then  verify the title of the page
    And User should click on Angular
    And  quit the browser