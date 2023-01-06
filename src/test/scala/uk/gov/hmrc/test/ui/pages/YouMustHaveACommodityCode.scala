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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By

object YouMustHaveACommodityCode extends BasePage {


  val PageTile = ""
  val ele_PageTitleClass        = "govuk-heading-xl"
  val ele_ImportingGoodsIntoUk=""
  val ele_CustomValueOfYourImportedGoods=""
val ele_GetALegallyBindingDecision=""
  val ImportingGoodsIntoUk = "https://www.gov.uk/import-goods-into-uk"
   val CustomValueOfYourImportedGoods = "https://www.gov.uk/guidance/prepare-to-work-out-the-customs-value-of-your-imported-goods"
   val GetALegallyBindingDecision = "https://www.gov.uk/guidance/apply-for-an-advance-tariff-ruling"
  def loadPage: this.type = {
    onPage(this.ele_PageTitleClass,this.PageTile)
    this
  }
  def linkNavigationValidation(): Unit ={
    assert(driver.findElement(By.id(ele_ImportingGoodsIntoUk)).getAttribute("href")==ImportingGoodsIntoUk)
    assert(driver.findElement(By.id(ele_CustomValueOfYourImportedGoods)).getAttribute("href")==CustomValueOfYourImportedGoods)
    assert(driver.findElement(By.id(ele_GetALegallyBindingDecision)).getAttribute("href")==GetALegallyBindingDecision)
  }
}
