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

import uk.gov.hmrc.test.ui.pages.base.{BasePage, YesNoPage}
import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.DescriptionOfTheGoods.onPage

//object HaveYouFoundTheCommodityCode extends YesNoPage {
//
//  val pageTitle =
//    "Have you found the commodity code for the - Advance Ruling Service - GOV.UK"
//}



object HaveYouFoundTheCommodityCode extends BasePage {
  val url = s"${BasePage.baseUrl}/advance-valuation-ruling/hasCommodityCode"

  val pageTitle      = "Do you have a commodity code for the goods? - Advance Ruling Service - GOV.UK"
//  val errorPageTitle = "Error: descriptionOfGoods"
//  val ele_GoodsName  = By.id("value")

//  def errorLoadPage: this.type = {
//    onPage(this.errorPageTitle)
//    this
//  }
//
//  def enterGoodsName(goodsName: String): Unit =
//    ele_GoodsName.find.enterText(goodsName)
}
