@RequiredInformationPage

Feature: Checking all the checkboxes


  Scenario: Check all the checkboxes
    Given I am on the Required Information Page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page

#
#
#  Scenario : Check error message
#    Given I am on the Required Information Page
#    When I check not all the checkboxes and click continue
#    Then I will be see error message
#
#  Scenario : Check Back link Functionality
#    Given I am on the Required Information Page
#    When I click on Back link
#    Then I will be navigated to ARS Home page
#
#  Scenario : Check Cancel application button Functionality
#    Given I am on the Required Information Page
#    When I click on Cancel application button
#    Then I will be navigated to ARS Home page