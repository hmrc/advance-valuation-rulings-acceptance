# Disabled for now as it is not working
@Method6
@EndToEndJourney
Feature: Method 6 flows

@AccessibilityTest
  Scenario: Method 6 all pages
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    And I select Method 6 and continue in Select the method page
    Then I will be navigated to explain why have you not selected Methods 1-5 to value your goods
    And I enter "various reasons" as my reason why I did not select methods 1 through 5 
    Then I will be navigated to which method do you wish to adapt
    And I select Method 6 as the method I wish to adapt
    Then I will be navigated to how have you used method six to value goods
    And I enter "using calculator" as my explanation of how I have used method six to value goods
    Then I will be navigated to Description of the Goods page
