@EndToEndJourney

Feature: End To End Journey


Scenario: Upload document

Given I am on the ARS Home Page
When I click on Start new application in ARS Home
And I check all the checkboxes and click continue in Information you need to complete an application page
And I select "Yes" and continue in Are you planning to import goods page
And  I click on Continue in Some of the information you provide
And I click on continue in How We Contact You page
And I select "Yes" and continue in Check the name and address page
And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
And I select Method 2 and continue in Select the method page
Then I will be navigated to Explain Why Identical Goods page
And I enter a reason and continue in Explain Why Identical Goods page
Then I will be navigated to Have You Used Method One In the Past page
And I select "Yes" and continue in Have You Used Method One In the Past page