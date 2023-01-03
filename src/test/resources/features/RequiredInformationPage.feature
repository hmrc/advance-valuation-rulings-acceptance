@RequiredInformationPage

Feature: Checking all the checkboxes


#
#
#
  Scenario: Required Information page - Check error message
    Given I am on the Required Information Page
    When I check not all the checkboxes and click continue
    Then I will be see error message


  Scenario: Required Information page - Check all the checkboxes
    Given I am on the Required Information Page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
##
#  Scenario : Required Information page - Check Back link Functionality
#    Given I am on the Required Information Page
#    When I click on Back link
#    Then I will be navigated to ARS Home page
#
#  Scenario : Required Information page - Check Cancel application button Functionality
#    Given I am on the Required Information Page
#    When I click on Cancel application button
#    Then I will be navigated to ARS Home page

  Scenario: Planning to import Goods - Yes
    Given I am on the Required Information Page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then i will be navigated to Some of the information you provide

  Scenario: Planning to import Goods - No
    Given I am on the Required Information Page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select No and continue
    Then i will be navigated to This service is designed for those
#
#  Scenario: Planning to import Goods - Without Selecting Yes or No
#    Given I am on the Required Information Page
#    When I check all the checkboxes and click continue
#    Then I will be navigated to Planning to Import Goods page
#    When I Click on continue without selecting option
#    Then i will see Error message in Planning to Import Goods page
#
#
   Scenario: Planning to import Goods - Back and Cancel Application
    Given I am on the Required Information Page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
     When I click on Back link
     Then I will be navigated to Required information page
     When I check all the checkboxes and click continue
     Then I will be navigated to Planning to Import Goods page
##     When I click on Cancel application button
##    Then I will be navigated to ARS Home page

  Scenario: Some of the information you provide - Agree and continue
    Given I am on the Required Information Page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then i will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page

    Scenario: Some of the information you provide - Back and Cancel application
    Given I am on the Required Information Page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then i will be navigated to Some of the information you provide
    When I click on Back link
    Then I will be navigated to Planning to Import Goods page
      When I select Yes and continue
      Then i will be navigated to Some of the information you provide
#      When I click on Cancel application button
#    Then I will be navigated to ARS Home page


  Scenario: How We Contact You - continue
    Given I am on the Required Information Page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then i will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page
    When I Click on Continue
    Then I will be navigated to Method selection page

  Scenario: How We Contact You - Back and Cancel Application
    Given I am on the Required Information Page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then i will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page
    When I click on Back link
    Then i will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page
#    When I click on Cancel application button
#    Then I will be navigated to ARS Home page