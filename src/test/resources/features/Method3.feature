# Disabled for now as it is not working
@Method3
@EndToEndJourney
Feature: Method 3 flows

  @AccessibilityTest
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
    And I select "Yes" and continue in Have You Used Method One In the Past 90 days
    Then I will be navigated to Describe the Similar Goods page
    And I enter a reason and continue in Describe the Similar Goods page

