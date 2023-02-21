/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages._
import uk.gov.hmrc.test.ui.pages.RequiredInformationPage.{onPage, submitPage}
import uk.gov.hmrc.test.ui.pages.Turnover.{GoodsName, arsHomePageText, radioOptionSelect}



class StepDefinitions extends BaseStepDef {


  When("I click on Start new application in ARS Home") {
    () =>
      onPage(arsHomePageText)
      submitPage()
  }
  And(
    "I check all the checkboxes and click continue in Information you need to complete an application page"
  ) {
    () =>
      RequiredInformationPage.loadPage
      RequiredInformationPage.selectAllCheckbox()
      submitPage()
  }
  And("I select {string} and continue in Are you planning to import goods page") {
    (radioOption: String) =>
      PlanningToImportGoods.loadPage
      radioOptionSelect(radioOption)
      submitPage()
  }
  And("I click on Continue in Some of the information you provide") {
    () =>
      SomeOfTheInfo.loadPage
      submitPage()
  }
  And("I click on continue in How We Contact You page") {
    () =>
      HowWeContactYou.loadPage
      submitPage()
  }
  And("I select {string} and continue in Check the name and address page") {
    (radioOption: String) =>
      AddressPage.loadPage
      radioOptionSelect(radioOption)
      submitPage()
  }
  And("I select {string} and continue in Have you found the commodity code") {
    (radioOption: String) =>
      HaveYouFoundTheCommodityCode.loadPage
      radioOptionSelect(radioOption)
      submitPage()
  }
  And("I select {string} and continue in Do you want to add any confidential information page") {
    (radioOption: String) =>
      DoYouWantToAddAnyConfidentialInformation.loadPage
      radioOptionSelect(radioOption)
      submitPage()
  }
  And("I select {string} and continue in Are the Goods being shipped directly page") {
    (radioOption: String) =>
      AreTheGoodsBeingShippedDirectly.loadPage
      radioOptionSelect(radioOption)
      submitPage()
  }
  And("I select {string} and continue in Do you want to upload any supporting documents page") {
    (radioOption: String) =>
      DoYouWantToUploadAnySupportingDocuments.loadPage
      radioOptionSelect(radioOption)
      submitPage()
  }

  And(
    "I enter Name- {string} Email- {string},Phone- {string} details and continue in Provide your contact details page"
  ) {
    (name: String, email: String, phone: String) =>
      ProvideYourContactDetails.loadPage
      ProvideYourContactDetails.enterContactDetails(name, email, phone)
      submitPage()
  }
  And("I select Method {int} and continue in Select the method page") {
    (mtehodNumber: Int) =>
      MethodSelectionPage.loadPage
      MethodSelectionPage.selectMethod(mtehodNumber)
      submitPage()
  }
  And("I enter Name of the Goods {string} and continue in What is the name of the goods page") {
    (goodsName: String) =>
      GoodsName = goodsName
      NameOfTheGoods.loadPage
        .enterGoodsName(GoodsName)
      submitPage()
  }
  And("I select {string} and continue in Have you found the commodity code page") {
    (radioOption: String) =>
      HaveYouFoundTheCommodityCode.loadPage
      radioOptionSelect(radioOption)
      submitPage()
  }

  And("I enter the commodity code {string} and continue in What is the commodity code page") {
    (commodityCode: String) =>
      WhatIsTheCommodityCode.loadPage
        .enterCommodityCode(commodityCode)
      submitPage()
  }
  And("I enter country {string} and continue in Which country are the Goods coming from page") {
    (country: String) =>
      WhichCountryAreTheGoodsComingFrom.loadPage
        .enterCountry(country)
      submitPage()
  }

  And("I enter description and continue in How would you describe the Goods page") {
    () =>
      HowWouldYouDescribeTheGoods.loadPage
        .enterGoodsDescription("Goods Description")
      submitPage()
  }
  And("I enter description and continue in How are the Goods made page") {
    () =>
      HowAreTheGoodsMade.loadPage
        .enterHowItMade("How it Made Description")
      submitPage()
  }

  And(
    "I enter the details and continue in What confidential information would you like to add page"
  ) {
    () =>
      WhatConfidentialInformationWouldYouLikeToAdd.loadPage
        .enterConfidentialInfo("Confidential info")
      submitPage()
  }

  And("I upload the document {string} and continue in Upload supporting documents page") {
    (filePath: String) =>
      val fullFilePath = "src/test/resources/testdata/" + filePath + ".pdf"
      UploadSupportingDocuments.loadPage
        .uploadDocument(fullFilePath)
      submitPage()
  }
  And("I select {string} and continue in Do you want this file to be marked as confidential page") {
    (radioOption: String) =>
      DoYouWantThisFileToBeMarkAsConfidential.loadPage
      radioOptionSelect(radioOption)
      submitPage()
  }

  Then("I will be navigated to This service is designed for those") {
    () =>
      ThisServiceIsDesignedForThose.loadPage
      ThisServiceIsDesignedForThose.linkNavigationValidation()
  }
  Then("I will be navigated to Your EORI details must be up to date to use this service")(
    () => YourEORIMustBeUpToDate.loadPage
  )
  Then("I will be navigated to You must have a commodity code") {
    () =>
      YouMustHaveACommodityCode.loadPage
      YouMustHaveACommodityCode.linkNavigationValidation()
  }
  Then("I will be navigated to You have uploaded supporting document") {
    () => YouHaveUploadedSupportingDocument.loadPage
  }

  Then("I will be navigated to Why Computed Value page")(() => WhyComputedValue.loadPage)

  And("I enter a reason and continue in Why Computed Value page") {
    () =>
      WhyComputedValue.enterReasonForComputedValue("Reasonable argument with evidence")
      submitPage()
  }

  Then("I will be navigated to Explain Reason Computed Value page") {
    () => ExplainWhyComputedValue.loadPage
  }

  And("I enter a reason and continue in Explain Reason Computed Value page") {
    () =>
      ExplainWhyComputedValue.enterReasonForComputedValue("Detailed explanation")
      submitPage()
  }

  Then("I will be navigated to Explain Why Transaction of Similar Goods page") {
    () => WhyTransactionValueOfSimilarGoods.loadPage
  }

  And("I enter a reason and continue in Explain Why Transaction of Similar Goods page") {
    () =>
      WhyTransactionValueOfSimilarGoods.enterReasonForComputedValue("Detailed explanation")
      submitPage()
  }

  Then("I will be navigated to Have You Used Method One In the Past page") {
    () => HaveYouUsedMethodOneInPast.loadPage
  }

  And("I select {string} and continue in Have You Used Method One In the Past page") {
    (radioOption: String) =>
      radioOptionSelect(radioOption)
      submitPage()
  }

  Then("I will be navigated to Explain Why Identical Goods page") {
    () => WhyIdenticalGoods.loadPage
  }

  And("I enter a reason and continue in Explain Why Identical Goods page") {
    () =>
      WhyIdenticalGoods.enterReasonForComputedValue("Detailed explanation")
      submitPage()
  }



}
