@ExampleTag
Feature: Verify actions on Main Page

  Background: Successful login with valid credentials and clicking login button
    Given the user is on the login page
    When the user enters valid username "admin" password "admin"
    Then the user click the "LOGIN" button on the form

  Scenario: Buttons change from disable to enable when click on the other button D0n
    Given the user click the D01 button
    When the DO2 button change from disable to enable
    And the user clicking the D02 button
    Then the DO1 button change from disable to enable

  Scenario Outline: Change font size
    Given the user clicks the "<up>" button four times
    And the font increases in size
    And the user clicks the down "<down>" button four times
    Then the font decreases in size

    Examples:
      | up | down |
      | 4  | 4    |

  Scenario: Enter a color and verify that the background color changes
    Given the user enters a color into the input "blue"
    And the user click the "SET BACKGROUND COLOR" button
    Then the form background color changes
