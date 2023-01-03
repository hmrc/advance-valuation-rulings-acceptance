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

object ThisServiceIsDesignedForThose extends BasePage {


  val PageTile = "This service is designed for those who are importing goods into Great Britain"
  val ele_PageTitleClass        = "govuk-heading-xl"
 val ele_Bindingvalueinformation=""
  val ele_AdvanceTariffruling="advance_tariff_rulings_link"
  val ele_AdvanceOriginruling="advance_origin_rulings_link"
  val Bindingvalueinformation = "https://www.gov.uk/guidance/moving-qualifying-goods-from-northern-ireland-to-the-rest-of-the-uk"
   val AdvanceTariffruling = "https://www.gov.uk/guidance/apply-for-an-advance-tariff-ruling"
   val AdvanceOriginruling = "https://www.gov.uk/guidance/apply-for-an-advance-origin-ruling"
  def loadPage: this.type = {
    onPage(this.ele_PageTitleClass,this.PageTile)
    this
  }
  def linkNavigationValidation(): Unit ={
    assert(driver.findElement(By.id(ele_AdvanceTariffruling)).getAttribute("href")==AdvanceTariffruling)
    assert(driver.findElement(By.id(ele_AdvanceOriginruling)).getAttribute("href")==AdvanceOriginruling)
    assert(driver.findElement(By.id(ele_Bindingvalueinformation)).getAttribute("href")==Bindingvalueinformation)
  }
}
