@login @regression

  Feature: Bleu Crm Login Page
    Background:
      Given I access bleucrm login page

      Scenario Outline: Validate - Successful Login
        When I enter a username <username>
        And I enter a password <password>
        And I click the login button
        Then I should be presented with the following <loginValidationText>

        Examples:
        | username | password | loginValidationText |
        | hr1@cydeo.com | UserUser | Activity Stream  |
        | helpdesk1@cydeo.com | UserUser | Activity Stream  |
        | marketing1@cydeo.com | UserUser | Activity Stream  |


    Scenario Outline: Validate - Unsuccessful Login
      When I enter a username <username>
      And I enter a password <password>
      And I click the login button
      Then I should be presented with the warning message <loginValidationText>

      Examples:
        | username | password | loginValidationText |
        | h1@cydeo.com | UserUser | Incorrect login or password  |
        | helpdesk1@cydeo.com | UrUser | Incorrect login or password  |
        | maring1@cydeo.com | UserUser | Incorrect login or password  |