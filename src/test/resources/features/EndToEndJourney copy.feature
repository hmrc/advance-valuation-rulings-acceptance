@EndToEndJourney
Feature: End To End Journey

#kickout pages
  Scenario: This service is designed for those page
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "No" and continue in Are you planning to import goods page
    Then I will be navigated to This service is designed for those

  Scenario: Your EORI details must be up to date to use this service
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "No" and continue in Check the name and address page
    Then I will be navigated to Your EORI details must be up to date to use this service

  Scenario: You must have a commodity code page
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    Then I navigate to Description of the Goods
    And I enter "Coffee" as the description and press continue
    And I select "No" and continue in Have you found the commodity code
    Then I will be navigated to Have the goods been subject to legal challenges

























