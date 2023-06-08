@Login
Feature: Login
  As a user, I want to login

  @LGN01
  Scenario: LGN01 - User want to login using correct credential
    When User click login text link
    And User input email "jamal@mytestmail.net"
    And User input password "a1b2.C3d4e5"
    And User click Sign In button
    Then Verify User see Welcome Message
