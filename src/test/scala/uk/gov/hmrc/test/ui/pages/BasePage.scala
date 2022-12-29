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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.driver.BrowserDriver

//import javax.xml.bind.WhiteSpaceProcessor.trim

trait BasePage extends BrowserDriver with Matchers {
  val continueButton = "govuk-button"
val backLink_xpath="//a[@class='govuk-back-link  js-visible' and contains(text(),'Back')]"
  def submitPage(): Unit =
    driver.findElement(By.className(continueButton)).click()

  def onPage(ele_PageTitleClass:String,pageTitle: String): Unit = {
    var actual = driver.findElement(By.className(ele_PageTitleClass)).getText
    actual=actual.trim
    println("Actual -"+actual)
    println("Expected -"+pageTitle)
    assert(actual==pageTitle)
//    if (actual != pageTitle)//driver.getTitle != pageTitle)
//      throw PageNotFoundException(
//        s"Expected '$pageTitle' page, but found '$actual' page."
//      )
  }
  def clickBack(): Unit= {
    driver.findElement(By.xpath(backLink_xpath)).click()
  }

}

case class PageNotFoundException(s: String) extends Exception(s)
