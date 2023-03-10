@Method1
@EndToEndJourney
Feature: End To End Journey

  Scenario: Method 1 full flow without upload
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    And I select Method 1 and continue in Select the method page
    And I select "Yes" and continue in Is There a Sale Involved
    And I select "Yes" and continue in Is the sale between related parties
    And I enter "description" and continue in Describe how the parties are related
    And I select "Yes" and continue in Are there any restrictions on the use or resale of the goods
    And I enter "restrictions" and continue in Describe any restrictions on the use or resale of goods
    And I select "Yes" and continue in Is the sale subject to any conditions or circumstances that could restrict you from valuing the goods
    And I enter "various conditions" as the conditions which cannot be calculated and press continue
    Then I will be navigated to Description of the Goods page
    And I enter "nice things" as the description and press continue
    And I select "No" and continue in Have you found the commodity code
    Then I will be navigated to Have the goods been subject to legal challenges
    And I select that the goods have not been subject to legal challenges
    And I select "No" and continue in Do you want to add any confidential information page
    And I select "No" and continue in Do you want to upload any supporting documents page
    Then I will be navigated to the Check Your Answers page
    And I check my answers and click on continue
    Then I will be navigated to the Application Complete page

  Scenario: Method 1 short flow
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    And I select Method 1 and continue in Select the method page
    And I select "Yes" and continue in Is There a Sale Involved
    And I select "No" and continue in Is the sale between related parties
    And I select "No" and continue in Are there any restrictions on the use or resale of the goods
    And I select "No" and continue in Is the sale subject to any conditions or circumstances that could restrict you from valuing the goods
    Then I will be navigated to Description of the Goods page

  Scenario: Method 1 no sale involved
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    And I select Method 1 and continue in Select the method page
    And I select "No" and continue in Is There a Sale Involved
    Then I will be navigated to the Select a Method page


  Scenario: Method 1 full flow with multiple upload
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    And I select Method 1 and continue in Select the method page
    And I select "Yes" and continue in Is There a Sale Involved
    And I select "Yes" and continue in Is the sale between related parties
    And I enter "description" and continue in Describe how the parties are related
    And I select "Yes" and continue in Are there any restrictions on the use or resale of the goods
    And I enter "restrictions" and continue in Describe any restrictions on the use or resale of goods
    And I select "Yes" and continue in Is the sale subject to any conditions or circumstances that could restrict you from valuing the goods
    And I enter "various conditions" as the conditions which cannot be calculated and press continue
    Then I will be navigated to Description of the Goods page
    And I enter "nice things" as the description and press continue
    And I select "No" and continue in Have you found the commodity code
    Then I will be navigated to Have the goods been subject to legal challenges
    And I select that the goods have not been subject to legal challenges
    And I select "No" and continue in Do you want to add any confidential information page
    And I select "Yes" and continue in Do you want to upload any supporting documents page
    And I upload the document "test1.pdf" and continue in Upload supporting documents page
    And I select "Yes" and continue in Do you want this file to be marked as confidential page
    Then I will be navigated to You have uploaded supporting document
    Then I select "Yes" on You have uploaded supporting document
    And I upload the document "test2.json" and continue in Upload supporting documents page
    And I select "Yes" and continue in Do you want this file to be marked as confidential page
    Then I will be navigated to You have uploaded second supporting document
    Then I select "No" on You have uploaded second supporting document
    Then I will be navigated to the Check Your Answers page
    And I check my answers and click on continue
    Then I will be navigated to the Application Complete page
