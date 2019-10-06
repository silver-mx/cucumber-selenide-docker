Feature: Login
  Login via basic authentication (user-password)

  Scenario: Login by typing user and password
    Given a user with username user and password password
    When the user logs in
    Then the hello page is shown
