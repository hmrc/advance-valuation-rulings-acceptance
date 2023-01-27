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

object UploadSupportingDocuments extends BasePage {

  val pageTitle          =
    "Upload supporting documents for the " + GoodsName + " - Advance Ruling Service - GOV.UK"
  val ele_UploadDocument = "//input[@id='file-upload-1']"
  val uploadFilePath     = "/Users/sitaramireddytanunboddi/Desktop/ARS/ARS-365.xlsx"

  def loadPage: this.type = {
    onPage(this.pageTitle)
    this
  }

  def uploadDocument() {
    driver
      .findElement(By.xpath(ele_UploadDocument))
      .sendKeys(uploadFilePath)
  }
}
