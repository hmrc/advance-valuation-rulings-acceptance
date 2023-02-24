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

import uk.gov.hmrc.test.ui.pages.base.BasePage

import org.openqa.selenium.By

object DescriptionOfTheGoods extends BasePage {
  val url = s"${BasePage.baseUrl}/advance-valuation-ruling/descriptionOfGoods"

  val pageTitle      = "descriptionOfGoods - Advance Ruling Service - GOV.UK"
  val errorPageTitle = "Error: descriptionOfGoods - Advance Ruling Service - GOV.UK"
  val ele_GoodsName  = By.id("value")

  def errorLoadPage: this.type = {
    onPage(this.errorPageTitle)
    this
  }

  def enterGoodsName(goodsName: String): Unit =
    ele_GoodsName.find.enterText(goodsName)
}
