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

object RequiredInformationPage extends BasePage {

  import org.openqa.selenium.By
  import uk.gov.hmrc.test.ui.conf.TestConfiguration

    val url: String = TestConfiguration.url("advance-valuation-rulings") + "/requiredInformation"
  // val url: String = "https://www.google.com"

  val title = "Information you need to continue your application"

    val checkbox1 = "value_0"
    val checkbox2 = "value_1"
    val checkbox3 = "value_2"
    val checkbox4 = "value_3"
    val checkbox5 = "value_4"
    val checkbox6 = "value_5"
    val checkbox7 = "value_6"
    val checkbox8 = "value_7"
    val Continue = "govuk-button"
    val Back = "govuk-back-link"
    val CancelApplication = ""
  val errorMessage1="";
  val errorMessage2="";

    def loadPage: this.type = {
      println(url)
      driver.navigate().to(url)
      onPage(title)
      this
    }

    def selectAllCheckbox() :PlanningToImportGoods.type ={


      driver.findElement(By.id(checkbox1)).click()
     driver.findElement(By.id(checkbox2)).click()
      driver.findElement(By.id(checkbox3)).click()
     driver.findElement(By.id(checkbox4)).click()
    driver.findElement(By.id(checkbox5)).click()
      driver.findElement(By.id(checkbox6)).click()
     driver.findElement(By.id(checkbox7)).click()
      driver.findElement(By.id(checkbox8)).click()
      submitPage()
      PlanningToImportGoods
    }

    def notSelectAllCheckbox() :this.type ={
      val rand = new scala.util.Random
      val i=rand.nextInt(7)

      if (i!=0) driver.findElement(By.id(checkbox1)).click()
      if (i!=1)driver.findElement(By.id(checkbox2)).click()
      if (i!=2)driver.findElement(By.id(checkbox3)).click()
      if (i!=3)driver.findElement(By.id(checkbox4)).click()
      if (i!=4)driver.findElement(By.id(checkbox5)).click()
      if (i!=5)driver.findElement(By.id(checkbox6)).click()
      if (i!=6)driver.findElement(By.id(checkbox7)).click()
      if (i!=7)driver.findElement(By.id(checkbox8)).click()
      submitPage()
      this
    }
  def errorMessageValidation() : this.type ={
    assert(driver.findElement(By.id(errorMessage1)).isDisplayed)
    assert (driver.findElement(By.id(errorMessage2)).isDisplayed)
    this
  }

    def clickBack(): Unit = {
      driver.findElement(By.className(Back)).click()
      val backPagetitle="";
      onPage(backPagetitle)
    }

    def clickCancelApplication(): Unit = {
      driver.findElement(By.id(CancelApplication)).click()
      val backPagetitle="";
      onPage(backPagetitle)
    }


}
