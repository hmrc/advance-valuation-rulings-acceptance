@GoodsInformation

Feature: Goods Information

#
#  Scenario: Name Of the Goods  - with out data Continue
#    Given I am on the Name Of the Goods
##    When I check all the checkboxes and click continue
##    Then I will be navigated to Planning to Import Goods page
##    When I select Yes and continue
##    Then I will be navigated to Some of the information you provide
##    When I Click on Continue
##    Then I will be navigated to How We Contact You page
##    When I Click on Continue
##    Then I will be navigated to Method selection page
##    When I select Method and Click continue
#    Then I will be navigated to Name of the Goods page
#    When I Click on Continue
#    Then I will be see error message - Enter a short name to describe the goods
#
#
#  Scenario: Name Of the Goods  - with invalid data Continue
#    Given I am on the Name Of the Goods
##    When I check all the checkboxes and click continue
##    Then I will be navigated to Planning to Import Goods page
##    When I select Yes and continue
##    Then I will be navigated to Some of the information you provide
##    When I Click on Continue
##    Then I will be navigated to How We Contact You page
##    When I Click on Continue
##    Then I will be navigated to Method selection page
##    When I select Method and Click continue
#    Then I will be navigated to Name of the Goods page
#    When I enter the Goods Name with invalid data and continue
#    Then I will be see error message - Name for the goods must be 100 characters or less
#
#
#  Scenario: Name Of the Goods  - Continue
#    Given I am on the Name Of the Goods
##    When I check all the checkboxes and click continue
##    Then I will be navigated to Planning to Import Goods page
##    When I select Yes and continue
##    Then I will be navigated to Some of the information you provide
##    When I Click on Continue
##    Then I will be navigated to How We Contact You page
##    When I Click on Continue
##    Then I will be navigated to Method selection page
##    When I select Method and Click continue
#    Then I will be navigated to Name of the Goods page
#    When I enter the Goods Name and continue
#    Then I will be navigated to Have you found the commodity code with Goods name
#
#
#  Scenario: Name Of the Goods  - Back and Cancel application
#    Given I am on the Name Of the Goods
##    When I check all the checkboxes and click continue
##    Then I will be navigated to Planning to Import Goods page
##    When I select Yes and continue
##    Then I will be navigated to Some of the information you provide
##    When I Click on Continue
##    Then I will be navigated to How We Contact You page
##    When I Click on Continue
##    Then I will be navigated to Method selection page
##    When I select Method and Click continue
##    Then I will be navigated to Name of the Goods page
##    When I click on Back link
##    Then I will be navigated to Method selection page
##    When I select Method and Click continue
##    Then I will be navigated to Name of the Goods page
#    When I click on Cancel application button
#    Then I will be navigated to ARS Home page


  Scenario: Have you found the commodity code  - without selecting yes or no Continue
    Given I am on the Name Of the Goods
#        When I check all the checkboxes and click continue
#        Then I will be navigated to Planning to Import Goods page
#        When I select Yes and continue
#        Then I will be navigated to Some of the information you provide
#        When I Click on Continue
#        Then I will be navigated to How We Contact You page
#        When I Click on Continue
#        Then I will be navigated to Method selection page
#        When I select Method and Click continue
    Then I will be navigated to Name of the Goods page
    When I enter the Goods Name and continue
    Then I will be navigated to Have you found the commodity code with Goods name
    When I Click on Continue
    Then I will be see error message in Have you found the commodity code page

  Scenario: Have you found the commodity code  - Yes Continue
    Given I am on the Name Of the Goods
#    When I check all the checkboxes and click continue
#    Then I will be navigated to Planning to Import Goods page
#    When I select Yes and continue
#    Then I will be navigated to Some of the information you provide
#    When I Click on Continue
#    Then I will be navigated to How We Contact You page
#    When I Click on Continue
#    Then I will be navigated to Method selection page
#    When I select Method and Click continue
    Then I will be navigated to Name of the Goods page
    When I enter the Goods Name and continue
    Then I will be navigated to Have you found the commodity code with Goods name
        When I select Yes and continue
        Then I will be navigated to What is the commodity code with Goods name

    Scenario: Have you found the commodity code  - No Continue
        Given I am on the Name Of the Goods
#        When I check all the checkboxes and click continue
#        Then I will be navigated to Planning to Import Goods page
#        When I select Yes and continue
#        Then I will be navigated to Some of the information you provide
#        When I Click on Continue
#        Then I will be navigated to How We Contact You page
#        When I Click on Continue
#        Then I will be navigated to Method selection page
#        When I select Method and Click continue
        Then I will be navigated to Name of the Goods page
        When I enter the Goods Name and continue
        Then I will be navigated to Have you found the commodity code with Goods name
        When I select No and continue
        Then I will be navigated to You must have a commodity code




  Scenario: Have you found the commodity code  - Back and Cancel application
    Given I am on the Name Of the Goods
#        When I check all the checkboxes and click continue
#        Then I will be navigated to Planning to Import Goods page
#        When I select Yes and continue
#        Then I will be navigated to Some of the information you provide
#        When I Click on Continue
#        Then I will be navigated to How We Contact You page
#        When I Click on Continue
#        Then I will be navigated to Method selection page
#        When I select Method and Click continue
    Then I will be navigated to Name of the Goods page
    When I enter the Goods Name and continue
    Then I will be navigated to Have you found the commodity code with Goods name
    When I click on Back link
    Then I will be navigated to Name of the Goods page
    When I enter the Goods Name and continue
    Then I will be navigated to Have you found the commodity code with Goods name
    When I click on Cancel application button
    Then I will be navigated to ARS Home page


Scenario: You must have a commodity code - Links Validation Back and Cancel application
  Given I am on the Name Of the Goods
#        When I check all the checkboxes and click continue
#        Then I will be navigated to Planning to Import Goods page
#        When I select Yes and continue
#        Then I will be navigated to Some of the information you provide
#        When I Click on Continue
#        Then I will be navigated to How We Contact You page
#        When I Click on Continue
#        Then I will be navigated to Method selection page
#        When I select Method and Click continue
  Then I will be navigated to Name of the Goods page
  When I enter the Goods Name and continue
  Then I will be navigated to Have you found the commodity code with Goods name
  When I select No and continue
  Then I will be navigated to You must have a commodity code


#
#    Scenario: What is the Commodity code  - Continue
#        Given I am on the Name Of the Goods
##        When I check all the checkboxes and click continue
##        Then I will be navigated to Planning to Import Goods page
##        When I select Yes and continue
##        Then I will be navigated to Some of the information you provide
##        When I Click on Continue
##        Then I will be navigated to How We Contact You page
##        When I Click on Continue
##        Then I will be navigated to Method selection page
##        When I select Method and Click continue
#        Then I will be navigated to Name of the Goods page
#        When I enter the Goods Name and continue
#        Then I will be navigated to Have you found the commodity code with Goods name
#        When I select Yes and continue
#        Then I will be navigated to What is the commodity code with Goods name
#        When I enter commodity code and continue
#        Then I will be navigated to Which country are the goods coming from
#
#    Scenario: What is the Commodity code  - less than 4 digits Continue
#        Given I am on the Name Of the Goods
##        When I check all the checkboxes and click continue
##        Then I will be navigated to Planning to Import Goods page
##        When I select Yes and continue
##        Then I will be navigated to Some of the information you provide
##        When I Click on Continue
##        Then I will be navigated to How We Contact You page
##        When I Click on Continue
##        Then I will be navigated to Method selection page
##        When I select Method and Click continue
#        Then I will be navigated to Name of the Goods page
#        When I enter the Goods Name and continue
#        Then I will be navigated to Have you found the commodity code with Goods name
#        When I select Yes and continue
#        Then I will be navigated to What is the commodity code with Goods name
#        When I enter less than 4 digits commodity code and continue
#        Then I will be see error message less than 4 digits in What is the commodity code page
#
#    Scenario: What is the Commodity code  - more than 10 digits Continue
#        Given I am on the Name Of the Goods
##        When I check all the checkboxes and click continue
##        Then I will be navigated to Planning to Import Goods page
##        When I select Yes and continue
##        Then I will be navigated to Some of the information you provide
##        When I Click on Continue
##        Then I will be navigated to How We Contact You page
##        When I Click on Continue
##        Then I will be navigated to Method selection page
##        When I select Method and Click continue
#        Then I will be navigated to Name of the Goods page
#        When I enter the Goods Name and continue
#        Then I will be navigated to Have you found the commodity code with Goods name
#        When I select Yes and continue
#        Then I will be navigated to What is the commodity code with Goods name
#        When I enter more than 10 digits commodity code and continue
#        Then I will be see error message more than 10 digits in What is the commodity code page
#
#    Scenario: What is the Commodity code  - Back and Cancel applications
#        Given I am on the Name Of the Goods
##        When I check all the checkboxes and click continue
##        Then I will be navigated to Planning to Import Goods page
##        When I select Yes and continue
##        Then I will be navigated to Some of the information you provide
##        When I Click on Continue
##        Then I will be navigated to How We Contact You page
##        When I Click on Continue
##        Then I will be navigated to Method selection page
##        When I select Method and Click continue
#        Then I will be navigated to Name of the Goods page
#        When I enter the Goods Name and continue
#        Then I will be navigated to Have you found the commodity code with Goods name
#        When I select Yes and continue
#        Then I will be navigated to What is the commodity code with Goods name
#        When I click on Back link
#        Then I will be navigated to Have you found the commodity code with Goods name
#        When I select Yes and continue
#        Then I will be navigated to What is the commodity code with Goods name
#        When I click on Cancel application button
#        Then I will be navigated to ARS Home page