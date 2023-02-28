@EndToEndJourney
@Method2
Feature: Method 2 flows

@AccessibilityTest
  Scenario: Method 2 all pages answered 'yes'
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    And I select Method 2 and continue in Select the method page
    Then I will be navigated to Outline Why Not Method One page
    And I enter "not applicable" as my reason why I did not select method 1
    Then I will be navigated to In the Past Have you used Method 1 to import any goods
    And I select that I have used Method 1 to import goods and press continue
    Then I will be navigated to Describe the Identical Goods
    And I enter "many details" as the description of the identical goods and press continue
    Then I will be navigated to Description of the Goods page
    
  Scenario: Method 2: Will not compare goods to those imported by another party
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    And I select Method 2 and continue in Select the method page
    Then I will be navigated to Outline Why Not Method One page
    And I enter "not applicable" as my reason why I did not select method 1
    Then I will be navigated to In the Past Have you used Method 1 to import any goods
    And I select that I have not used Method 1 to import goods and press continue
    Then I will be navigated to will you be comparing your goods to identical goods imported by another party
    And I select that I will not be comparing my goods to identical goods imported by another party
    Then I will be navigated to the Select a Method page

  Scenario: Method 2: Will compare goods to those imported by another party
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    And I select Method 2 and continue in Select the method page
    Then I will be navigated to Outline Why Not Method One page
    And I enter "not applicable" as my reason why I did not select method 1
    Then I will be navigated to In the Past Have you used Method 1 to import any goods
    And I select that I have not used Method 1 to import goods and press continue
    Then I will be navigated to will you be comparing your goods to identical goods imported by another party
    And I select that I will be comparing the goods to identical goods imported by another party
    Then I will be navigated to Explain How You are Comparing Goods to identical goods imported by another party
    And I enter "a detailed explaination" as my explanation of how I am comparing my goods to identical goods imported by another party
    Then I will be navigated to Description of the Goods page

@upload
  Scenario: Method 2: Upload document
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    And I select Method 2 and continue in Select the method page
    Then I will be navigated to Outline Why Not Method One page
    And I enter "not applicable" as my reason why I did not select method 1
    Then I will be navigated to In the Past Have you used Method 1 to import any goods
    And I select that I have not used Method 1 to import goods and press continue
    Then I will be navigated to will you be comparing your goods to identical goods imported by another party
    And I select that I will be comparing the goods to identical goods imported by another party
    Then I will be navigated to Explain How You are Comparing Goods to identical goods imported by another party
    And I enter "a detailed explaination" as my explanation of how I am comparing my goods to identical goods imported by another party

    Then I will be navigated to Description of the Goods page
    And I enter "a detailed description of the Goods" in my Description of the Goods page

   Then I will be navigated to have you found commodity code goods page
   And I select "Yes" and continue in Have you found the commodity code

   Then I will be navigated to enter commodity code page
   And I enter "1234" in my enter commodity code

   Then I will be navigated to Have the goods been subject to legal challenges
   And I select "Yes" and continue in legal challenges page
