# Disabled for now as it is not working
@Method3
Feature: Method 3 flows

@AccessibilityTest
  Scenario: Method 3 all pages
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    And I select Method 2 and continue in Select the method page
    Then I will be navigated to Explain Why Not Method One page
    And I enter "not applicable" as my reason why I did not select method 1
    Then I will be navigated to Explain Why Not Method One page
    And I enter a reason and continue in Explain Why Identical Goods page
    Then I will be navigated to Have You Used Method One In the Past page
    And I select "Yes" and continue in Have You Used Method One In the Past page


@ZAP
  Scenario: Method 3 flow
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    And I select Method 3 and continue in Select the method page
    Then I will be navigated to Explain Why Transaction of Similar Goods page
    And I enter a reason and continue in Explain Why Transaction of Similar Goods page
    Then I will be navigated to Have You Used Method One In the Past page
    And I select "Yes" and continue in Have You Used Method One In the Past page

#
#  Scenario: Method 2 flow
#    Given I am on the ARS Home Page
#    When I Click on Continue
#    Then I will be navigated to Required information page
#    When I check all the checkboxes and click continue
#    Then I will be navigated to Planning to Import Goods page
#    When I select Yes and continue
#    Then I will be navigated to Some of the information you provide
#    When I Click on Continue
#    Then I will be navigated to How We Contact You page
#    When I Click on Continue
#    Then I will be navigated to Address page
#    When I select Yes and continue
#    Then I will be navigating to Provide your contact details
#    When I enter details and continue in Provide your contact details page
#    Then I will be navigated to Method selection page
#    When I select Method 2 and Click continue
#    Then I will be navigated to Name of the Goods page
#    When I enter the Goods Name and continue
#    Then I will be navigated to Have you found the commodity code with Goods name
#    When I select Yes and continue
#    Then I will be navigated to What is the commodity code with Goods name
#    When I enter commodity code and continue
#    Then I will be navigated to Which country are the goods coming from