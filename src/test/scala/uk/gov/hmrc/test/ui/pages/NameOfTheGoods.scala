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

object NameOfTheGoods extends BasePage {


  val pageTitle = "What is the name of the goods?"
  val ele_PageTitleClass        = "govuk-heading-xl"
  val ele_GoodsName="value"

  def loadPage: this.type = {
    onPage(this.ele_PageTitleClass,this.pageTitle)
    this
  }
  def enterGoodsName(GoodsName: String ): Unit = {
    driver.findElement(By.id(ele_GoodsName)).clear()
    driver.findElement(By.id(ele_GoodsName)).sendKeys(GoodsName)
  }
}
