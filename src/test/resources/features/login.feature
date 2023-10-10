Feature: Successful login functionality in yltrue.com

  @Test
  Scenario: Successful login with valid credentials and clicking login button
    Given the user is on the login page
    When the user enters valid username: "username" and password: "password"
    Then the user click the "LOGIN" button on the form
#    And the user click the "LOGIN" button on the form
#    Then the user verifies that they are logged in.

