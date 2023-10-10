@Test
Feature: Verify actions on Main Page

  Background: Successful login with valid credentials and clicking login button
    Given the user is on the login page
    When the user enters valid username: "username" and password: "password"
    Then the user click the "LOGIN" button on the form

  Scenario Outline: Buttons change from disable to enable when click on the other button D0n!
    Given the user click the "<D01>" button
    When the DO2 button change from disable to enable
    And the user clicking the "<D02>" button
    Then the DO1 button change from disable to enable

    Examples:
      | D01  | D02  |
      | DO1! | DO2! |
