@employees @regression

Feature: Bleu Crm Employees Page

  Background:
    Given I access bleuCrm login page
    And I enter username "hr1@cydeo.com"
    And I enter password "UserUser"
    And I click the loginButton
    And I click the employees button


  Scenario: Validate Top Menu Modules
    Then I should be presented with the module list

  @smoke
  Scenario: Add New Department
    When I click add department button
    And I enter department name "Cucumber"
    And I click add button