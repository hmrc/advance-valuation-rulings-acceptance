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
import uk.gov.hmrc.test.ui.pages.Turnover.{arsHomePageText, radioOptionSelect, GoodsName}

class StepDefinitions extends BaseStepDef {
  var GoodsnameIs = ""
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

  And("I upload the document and continue in Upload supporting documents page") {
    () =>
      UploadSupportingDocuments.loadPage
        .uploadDocument()
      submitPage()
  }
  And("I select {string} and continue in Do you want this file to be marked as confidential page") {
    (radioOption: String) =>
      DoYouWantThisFileToBeMarkAsConfidential.loadPage
      radioOptionSelect(radioOption)
      submitPage()
  }

  Then("I will be navigated to This service is designed for those") {
    () => ThisServiceIsDesignedForThose.loadPage
    // ThisServiceIsDesignedForThose.linkNavigationValidation()
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

  //  Given("I am on the Required Information Page")(() => invokeURL(URL_requiredInformation))
  //  Given("I am on the Name Of the Goods")(() => invokeURL(URL_nameOfTheGoods))
  //  Given("I am on the ARS Home Page")(() => invokeURL(URL_ARSHomePage))
  //  Given("I am on the Upload document page")(() => invokeURL(URL_Upload))
//  When("I check all the checkboxes and click continue") {
//    () =>
//      RequiredInformationPage.loadPage
//      RequiredInformationPage.selectAllCheckbox()
//  }
//  Then("I will be navigated to Planning to Import Goods page") {
//    () =>
//      // result should be(PageTileElementClassName)
//      PlanningToImportGoods.loadPage
//  }
//  When("I check not all the checkboxes and click continue") {
//    () => RequiredInformationPage.notSelectAllCheckbox()
//  }
//  Then("I will be see error message in Required Information Page") {
//    () =>
//      // result should be(PageTileElementClassName)
//      RequiredInformationPage.error_LoadPage
//      thereIsAProblemErrorMessageValidation("Check all check boxes to continue")
//  }
//  When("I click on Back link")(() => clickBack())
//  When("I click on Cancel application button") {
//    () =>
//      // RequiredInformationPage.clickCancelApplication()
//  }
//  Then("I will be navigated to Required information page") {
//    () => RequiredInformationPage.loadPage
//  }
//  Then("I will be navigated to ARS Home page") {
//    () =>
//      // result should be(PageTileElementClassName)
//
//  }
//  When("I select Yes and continue")(() => radioOptionSelect("Yes"))
//  // When("I select No and continue")(() => radioOptionSelect("No"))
//  Then("I will be navigated to Some of the information you provide") {
//    () => SomeOfTheInfo.loadPage
//  }
//  Then("I will be navigated to This service is designed for those") {
//    () => ThisServiceIsDesignedForThose.loadPage
//    // ThisServiceIsDesignedForThose.linkNavigationValidation()
//  }
//  When("I Click on continue without selecting option") {
//    () =>
//      //   PlanningToImportGoods.radioOptionSelect("WithoutSelection")
//      radioOptionSelect("WithoutSelection")
//  }
//  Then("I will see Error message in Planning to Import Goods page") {
//    ()
//    PlanningToImportGoods.error_LoadPage
//    thereIsAProblemErrorMessageValidation("Select Yes if you have intention to move goods")
//
//  }
//  When("I Click on Continue")(() => submitPage())
//  Then("I will be navigated to How We Contact You page")(() => HowWeContactYou.loadPage)
//  Then("I will be navigated to Address page")(() => AddressPage.loadPage)
//  Then("I will be navigated to Method selection page")(() => MethodSelectionPage.loadPage)
//  When("I select Method and Click continue") {
//    () =>
//      MethodSelectionPage.selectMethod(1)
//      submitPage()
//  }
//  When("I select Method 2 and Click continue") {
//    () =>
//      MethodSelectionPage.selectMethod(2)
//      submitPage()
//  }
//  Then("I will be navigated to Name of the Goods page")(() => NameOfTheGoods.loadPage)
//
//  When("I enter the Goods Name and continue") {
//    () =>
//      NameOfTheGoods.enterGoodsName(GoodsName)
//      submitPage()
//  }
//  Then("I will be navigated to Have you found the commodity code with Goods name") {
//    () => HaveYouFoundTheCommodityCode.loadPage
//  }
//  When("I enter the Goods Name with invalid data and continue") {
//    () =>
//      NameOfTheGoods.enterGoodsName(invalidGoodsName)
//      submitPage()
//  }
//  Then("I will be see error message - Name for the goods must be 100 characters or less") {
//    () =>
//      NameOfTheGoods.errorLoadPage
//      thereIsAProblemErrorMessageValidation("Name for the goods must be 100 characters or less")
//  }
//  Then("I will be see error message - Enter a short name to describe the goods") {
//    () =>
//      NameOfTheGoods.errorLoadPage
//      thereIsAProblemErrorMessageValidation("Enter a short name to describe the goods")
//  }
//  Then("I will be navigated to What is the commodity code with Goods name") {
//    () => WhatIsTheCommodityCode.loadPage
//  }
//  Then("I will be see error message in Have you found the commodity code page") {
//    () =>
//      HaveYouFoundTheCommodityCode.errorLoadPage
//      thereIsAProblemErrorMessageValidation("Select Yes if you know the commodity code")
//  }
//  When("I enter commodity code and continue") {
//    () =>
//      WhatIsTheCommodityCode.enterCommodityCode(CommodityCode)
//      submitPage()
//  }
//  Then("I will be navigated to Which country are the goods coming from") {
//    () => WhichCountryAreTheGoodsComingFrom.loadPage
//  }
//  When("I enter less than 4 digits commodity code and continue") {
//    () =>
//      WhatIsTheCommodityCode.enterCommodityCode("123")
//      submitPage()
//  }
//  When("I enter more than 10 digits commodity code and continue") {
//    () =>
//      WhatIsTheCommodityCode.enterCommodityCode("12345678910")
//      submitPage()
//  }
//  Then("I will be see error message less than 4 digits in What is the commodity code page") {
//    () =>
//      WhatIsTheCommodityCode.errorLoadPage
//      thereIsAProblemErrorMessageValidation("Commodity code must include minimum 4 digit numbers")
//  }
//  Then("I will be see error message more than 10 digits in What is the commodity code page") {
//    () =>
//      WhatIsTheCommodityCode.errorLoadPage
//      thereIsAProblemErrorMessageValidation("Commodity code cannot exceed 10 digit")
//  }
//
//  When("I enter alphabets in commodity code and continue") {
//    () =>
//      WhatIsTheCommodityCode.enterCommodityCode("ABCDEF")
//      submitPage()
//  }
//  Then(
//    "I will be see error message Commodity codes must only include numbers in What is the commodity code page"
//  ) {
//    () =>
//      WhatIsTheCommodityCode.errorLoadPage
//      thereIsAProblemErrorMessageValidation("Commodity codes must only include numbers")
//  }
//  Then("I will see error message Select Yes shown if the address is correct in Address page") {
//    () =>
//      AddressPage.error_LoadPage
//      thereIsAProblemErrorMessageValidation("Select Yes shown if the address is correct")
//  }
//  Then("I will be navigating to Provide your contact details") {
//    () => ProvideYourContactDetails.loadPage
//  }
//  Then("I will be navigating to Your EORI must be up to date") {
//    () => YourEORIMustBeUpToDate.loadPage
//  }
//  When("I enter details and continue in Provide your contact details page") {
//    () =>
//      ProvideYourContactDetails.loadPage
//      ProvideYourContactDetails.enterContactDetails(name, email, phone)
//      submitPage()
//  }
//  Then("I will see error message in Provide your contact details page") {
//    () =>
//      ProvideYourContactDetails.loadPage
//      thereIsAProblemErrorMessageValidation("")
//  }
//  When("I click on Find Your Commodity Page button")(() => submitPage())
//  Then("I will be navigated to Find Your Commodity Code page")(() => FindYourCommodity.loadPage)
//  Then("I will be navigated to Your EORI details must be up to date to use this service")(
//    () => YourEORIMustBeUpToDate.loadPage
//  )
//  When("I enter country name and click continue") {
//    () =>
//      WhichCountryAreTheGoodsComingFrom.enterCountry(countryName)
//      submitPage()
//  }
//  Then("I will be navigated to Are the Goods being shipped directly page") {
//    () => AreTheGoodsBeingShippedDirectly.loadPage
//  }
//  Then("I will be navigated to How would you describe the") {
//    () => HowWouldYouDescribeTheGoods.loadPage
//  }
//  When("I enter the Goods Description and continue") {
//    () =>
//      HowWouldYouDescribeTheGoods.enterGoodsDescription(GoodsDescription)
//      submitPage()
//  }
//  Then("I will be navigated to How are the Goods made page")(() => HowAreTheGoodsMade.loadPage)
//  When("I enter How it made description and continue") {
//    () =>
//      HowAreTheGoodsMade.enterHowItMade(howITMadeDescription)
//      submitPage()
//  }
//  Then("I will be navigated to  Do you want to add any confidential information page") {
//    () => DoYouWantToAddAnyConfidentialInformation.loadPage
//  }
//  Then("I will be navigated to What confidential information would you like to add") {
//    () => WhatConfidentialInformationWouldYouLikeToAdd.loadPage
//  }
//  When("I enter confidential information and continue") {
//    () =>
//      WhatConfidentialInformationWouldYouLikeToAdd.enterConfidentialInfo(confidentailInformation)
//      submitPage()
//  }
//  Then("I will be navigated to Do you want to upload any supporting documents") {
//    () => DoYouWantToUploadAnySupportingDocuments.loadPage
//  }
//  Then("I will be navigated to Upload supporting documents page") {
//    () => UploadSupportingDocuments.loadPage
//  }
//  When("I enter or select document and continue") {
//    () =>
//      UploadSupportingDocuments.uploadDocument()
//      submitPage()
//  }
//  Then("I will be navigated to Do you want this file to be marked as confidential page") {
//    () => DoYouWantThisFileToBeMarkAsConfidential.loadPage
//  }
//  Then("I will be navigated to You have uploaded supporting document") {
//    () => YouHaveUploadedSupportingDocument.loadPage
//  }

}
