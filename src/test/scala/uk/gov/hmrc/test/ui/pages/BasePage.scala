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

import uk.gov.hmrc.test.ui.driver.BrowserDriver

import org.openqa.selenium.By
import org.scalatest.matchers.should.Matchers

//import javax.xml.bind.WhiteSpaceProcessor.trim

trait BasePage extends BrowserDriver with Matchers {
  val continueButton = "govuk-button"
val backLink_xpath="//a[@class='govuk-back-link  js-visible' and contains(text(),'Back')]"
  val elm_errorMessageTitle="error-summary-title"
  val error_msgText="There is a problem"
  val elm_errorMessage2="//p[@id='value-error']"
  val GoodsName="Coffee"
  val CommodityCode="1234"
  val radioOptionYes="(//input[@type='radio'])[1]"
  val radioOptionNo="value-no"
  val ele_CancelApplication="cancel_application"
val arsHomePageTitle="govuk-heading-xl"
  val arsHomePageText="Your applications and rulings"
  val ele_StartNewApplication="csrfToken"
  val URL_nameOfTheGoods: String = "http://localhost:9000/advance-valuation-rulings-frontend/nameOfGoods"
  val URL_requiredInformation: String = "http://localhost:9000/advance-valuation-rulings-frontend/requiredInformation"
  val invalidGoodsName="abcdefhhijklmnopqrstuvwxyz1234567890abcdefhhijklmnopqrstuvwxyz1234567890abcdefhhijklmnopqrstuvwxyz1234567890abcdefhhijklmnopqrstuvwxyz1234567890"
  val URL_ARSHomePage="http://localhost:9000/advance-valuation-rulings-frontend/accountHome"
  def submitPage(): Unit = {
    driver.findElement(By.className(continueButton)).click()
    Thread.sleep(1000)
  }


  def invokeURL(URL:String){
    driver.navigate().to(URL)
  }
  def onPage(ele_PageTitleClass:String,pageTitle: String): Unit = {
    var actual = driver.findElement(By.className(ele_PageTitleClass)).getText
    actual=actual.trim
    println("Actual   -"+actual)
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
  def cancelApplication(): Unit ={
    driver.findElement(By.id(ele_CancelApplication)).click()
  }
  def arsHomePageValidation(): Unit ={
    onPage(this.arsHomePageTitle,this.arsHomePageText)
    assert(driver.findElement(By.name(ele_StartNewApplication)).isDisplayed)
  }
  def thereIsAProblemErrorMessageValidation(errorMessage: String): Unit ={
    assert(driver.findElement(By.id(elm_errorMessageTitle)).getText==error_msgText)
    assert(driver.findElement(By.xpath(elm_errorMessage2)).isDisplayed)
    assert(driver.findElement(By.xpath("//a[contains(text(),'"+errorMessage+"')]")).isDisplayed)
  }
  def radioOptionSelect(radioOption: String){

    radioOption match {
      case "Yes" =>driver.findElement(By.xpath(radioOptionYes)).click()
      case "No" => driver.findElement(By.id(radioOptionNo)).click()
      case _=>Thread.sleep(1000)
    }
    submitPage()
  }

}

case class PageNotFoundException(s: String) extends Exception(s)
