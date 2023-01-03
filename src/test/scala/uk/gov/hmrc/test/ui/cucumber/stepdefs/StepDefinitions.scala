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

import uk.gov.hmrc.test.ui.pages.Turnover.{CommodityCode, GoodsName, clickBack, radioOptionSelect, submitPage, thereIsAProblemErrorMessageValidation}
import uk.gov.hmrc.test.ui.pages._

class StepDefinitions extends BaseStepDef {

  Given("I am on the Required Information Page") { () =>
    RequiredInformationPage.invokeURL
  }
  When("I check all the checkboxes and click continue"){()=>
    RequiredInformationPage.loadPage
 RequiredInformationPage.selectAllCheckbox()
  }
  Then("I will be navigated to Planning to Import Goods page") { () =>
 //result should be(PageTileElementClassName)
    PlanningToImportGoods.loadPage
  }
  When("I check not all the checkboxes and click continue"){()=>
    RequiredInformationPage.notSelectAllCheckbox()
  }
  Then("I will be see error message") { () =>
    //result should be(PageTileElementClassName)
    RequiredInformationPage.loadPage
    //thereIsAProblemErrorMessageValidation("Check all the boxes to continue")
    thereIsAProblemErrorMessageValidation("Check all check boxes to continue")

  }
  When("I click on Back link"){()=>
   clickBack()
  }
  When("I click on Cancel application button"){()=>
   // RequiredInformationPage.clickCancelApplication()
  }
  Then("I will be navigated to Required information page"){()=>
    RequiredInformationPage.loadPage
  }
  Then("I will be navigated to ARS Home page") { () =>
   // result should be(PageTileElementClassName)

  }
  When("I select Yes and continue"){()=>
    radioOptionSelect("Yes")
  }
  When("I select No and continue"){()=>
    radioOptionSelect("No")
  }
  Then("i will be navigated to Some of the information you provide") { () =>
    SomeOfTheInfo.loadPage
  }
  Then("i will be navigated to This service is designed for those"){()=>
    ThisServiceIsDesignedForThose.loadPage
ThisServiceIsDesignedForThose.linkNavigationValidation()
  }
  When("I Click on continue without selecting option") { () =>
 //   PlanningToImportGoods.radioOptionSelect("WithoutSelection")
    radioOptionSelect("WithoutSelection")
  }
  Then("i will see Error message in Planning to Import Goods page"){()
    PlanningToImportGoods.loadPage
    thereIsAProblemErrorMessageValidation("Select Yes if you have intention to move goods")

  }
  When("I Click on Continue"){()=>
    submitPage()
  }
  Then("I will be navigated to How We Contact You page"){()=>
    HowWeContactYou.loadPage
  }
  Then("I will be navigated to Method selection page"){()=>
    MethodSelectionPage.loadPage
  }
  When("I select Method and Click continue"){()=>
    MethodSelectionPage.SelectMethod(1)
    submitPage()
  }
  Then ("I will be navigated to Name of the Goods page"){()=>
    NameOfTheGoods.loadPage
  }
  When ("I enter the Goods Name and continue"){()=>
    NameOfTheGoods.enterGoodsName(GoodsName)
    submitPage()
  }
  Then ("I will be navigated to Have you found the commodity code with Goods name"){()=>
    HaveYouFoundTheCommodityCode.loadPage
  }
  When ("I enter the Goods Name with invalid data and continue"){()=>
    NameOfTheGoods.enterGoodsName("abcdefhhijklmnopqrstuvwxyz1234567890abcdefhhijklmnopqrstuvwxyz1234567890abcdefhhijklmnopqrstuvwxyz1234567890abcdefhhijklmnopqrstuvwxyz1234567890")
    submitPage()
  }
  Then ("Then I will be see error message - Name for the goods must be 100 characters or less"){
    NameOfTheGoods.loadPage
    thereIsAProblemErrorMessageValidation("Name for the goods must be 100 characters or less")
  }
  Then("I will be see error message - Enter a short name to describe the goods"){()=>
    NameOfTheGoods.loadPage
    thereIsAProblemErrorMessageValidation("Enter a short name to describe the goods")
  }
  Then ("I will be navigated to What is the commodity code with Goods name"){()=>
WhatIsTheCommodityCode.loadPage
  }
  Then("I will be see error message in Have you found the commodity code page"){()=>
    HaveYouFoundTheCommodityCode.loadPage
    thereIsAProblemErrorMessageValidation("Select Yes if you know the commodity code")
  }
  When("I enter commodity code and continue"){()=>
    WhatIsTheCommodityCode.enterCommodityCode(CommodityCode)
    submitPage()
  }
  Then ("I will be navigated to Which country are the goods coming from"){()=>
    //need to update
  }
  When ("I enter less than 4 digits commodity code and continue"){()=>
    WhatIsTheCommodityCode.enterCommodityCode("123")
    submitPage()
  }
  When ("I enter more than 10 digits commodity code and continue"){()=>
    WhatIsTheCommodityCode.enterCommodityCode("12345678910")
    submitPage()
  }
  Then ("I will be see error message less than 4 digits in What is the commodity code page"){()=>
    WhatIsTheCommodityCode.loadPage
    thereIsAProblemErrorMessageValidation("Commodity code must include minimum 4 digit numbers")
  }
  Then ("I will be see error message more than 10 digits in What is the commodity code page"){()=>
    WhatIsTheCommodityCode.loadPage
    thereIsAProblemErrorMessageValidation("Commodity code cannot exceed 10 digit ")
  }

}