/*
 * Copyright 2022 HM Revenue & Customs
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

import uk.gov.hmrc.test.ui.pages.{PlanningToImportGoods, RequiredInformationPage, SomeOfTheInfo, ThisServiceIsDesignedForThose}

class StepDefinitions extends BaseStepDef {

  Given("I am on the Required Information Page") { () =>
    RequiredInformationPage.invokeURL
  }
  When("I check all the checkboxes and click continue"){()=>
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
    //RequiredInformationPage.loadPage
    RequiredInformationPage.errorMessageValidation()

  }
  When("I click on Back link"){()=>
    RequiredInformationPage.clickBack()
  }
  When("I click on Cancel application button"){()=>
   // RequiredInformationPage.clickCancelApplication()
  }
  Then("I will be navigated to ARS Home page") { () =>
   // result should be(PageTileElementClassName)

  }
  When("I select Yes and continue"){()=>
    PlanningToImportGoods.radioOptionSelect("Yes")
  }
  When("I select No and continue"){()=>
    PlanningToImportGoods.radioOptionSelect("No")
  }
  Then("i will be navigated to Some of the information you provide") { () =>
    SomeOfTheInfo.loadPage
  }
  Then("i will be navigated to This service is designed for those"){()=>
    ThisServiceIsDesignedForThose.loadPage
ThisServiceIsDesignedForThose.linkNavigationValidation()
  }
}