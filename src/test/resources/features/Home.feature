@home @regression

Feature: Bleu Crm Home Page

  Background:
    Given I access bleuCrm login page
    And I enter username "hr1@cydeo.com"
    And I enter password "UserUser"
    And I click the loginButton

  Scenario: Create a New Task
    When I click the Task button
    And I enter task title "Project Cucumber"
    And I enter task content "JENKINS is the way."
    And I click send button
    Then I should be presented with the popup