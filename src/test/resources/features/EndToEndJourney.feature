@EndToEndJourney

Feature: End To End Journey

#kickout pages
  Scenario: This service is designed for those page
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select No and continue
    Then I will be navigated to This service is designed for those


Scenario: Your EORI details must be up to date to use this service
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
    When I select No and continue
    Then I will be navigated to Your EORI details must be up to date to use this service


  Scenario: You must have a commodity code page
    Given I am on the Name Of the Goods
    Then I will be navigated to Name of the Goods page
    When I enter the Goods Name and continue
    Then I will be navigated to Have you found the commodity code with Goods name
    When I select No and continue
    Then I will be navigated to You must have a commodity code

    # End 2 End Flow
  Scenario: How We Contact You - continue
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



  Scenario: What is the Commodity code  - Continue
    Given I am on the Name Of the Goods
    Then I will be navigated to Name of the Goods page
    When I enter the Goods Name and continue
    Then I will be navigated to Have you found the commodity code with Goods name
    When I select Yes and continue
    Then I will be navigated to What is the commodity code with Goods name
    When I enter commodity code and continue
    Then I will be navigated to Which country are the goods coming from