@RequiredInformationPage

Feature: ARS Home,Required Information,Planning to Import Goods,Some of the Info and How we Contact pages
  #Checking all the checkboxes
#ARS Home,Required Information,Planning to Import Goods,Some of the Info and How we Contact pages

  Scenario: ARS Home Page - Start new application - ARS-358 - 1/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page

  Scenario: Required Information page - Check error message - ARS-358 - 3/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check not all the checkboxes and click continue
    Then I will be see error message in Required Information Page


  Scenario: Required Information page - Check all the checkboxes and continue - ARS-358 - 2/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page

  Scenario: Required Information page - Back and Cancel application - ARS-358 - 3/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I click on Back link
    Then I will be navigated to ARS Home page
    When I Click on Continue
    Then I will be navigated to Required information page
#    When I click on Cancel application button
#    Then I will be navigated to ARS Home page


  Scenario: Planning to import Goods - Without Selecting Yes or No - ARS-358 - 6/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I Click on continue without selecting option
    Then I will see Error message in Planning to Import Goods page


  Scenario: Planning to import Goods - Back and Cancel - ARS-358 - 6/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I click on Back link
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
#     When I click on Cancel application button
#    Then I will be navigated to ARS Home page

  Scenario: Planning to import Goods - Yes - ARS-358 - 4/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then I will be navigated to Some of the information you provide

  Scenario: Planning to import Goods - No - ARS-358 - 5,7/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select No and continue
    Then I will be navigated to This service is designed for those



  Scenario: Some of the information you provide - Agree and continue - ARS-358 - 8/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then I will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page

    Scenario: Some of the information you provide - Back and Cancel application - ARS-358 - 9/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then I will be navigated to Some of the information you provide
    When I click on Back link
    Then I will be navigated to Planning to Import Goods page
      When I select Yes and continue
      Then I will be navigated to Some of the information you provide
#      When I click on Cancel application button
#    Then I will be navigated to ARS Home page


  Scenario: How We Contact You - continue - ARS-358 - 10/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then I will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page
    When I Click on Continue
    Then I will be navigated to Address page
#
  Scenario: How We Contact You - Back and Cancel Application - ARS-358 - 11/11
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then I will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page
    When I click on Back link
    Then I will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page
#    When I click on Cancel application button
#    Then I will be navigated to ARS Home page