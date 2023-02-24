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

import uk.gov.hmrc.test.ui.pages.base._

object OutlineWhyNotMethodOneOrTwo extends TextAreaPage {
  val pageTitle =
    "Please explain why you have not selected Methods 1 or 2 to value your goods - Advance Ruling Service - GOV.UK"
}

object WhyTransactionValueOfSimilarGoods extends TextAreaPage {
  val pageTitle =
    "Please explain why you have not selected Methods 1 or 2 to value your goods - Advance Ruling Service - GOV.UK"
}

object HaveYouUsedMethodOneToImportSimilarGoods extends YesNoPage {
  val pageTitle =
    "In the past 90 days, have you used Valuation Method 1 to import any goods that are similar to the goods being valued? - Advance Ruling Service - GOV.UK"
}

object DescribeTheSimilarGoods extends TextAreaPage {
  val pageTitle =
    "Describe the similar goods - Advance Ruling Service - GOV.UK"
}

object WillYouBeComparingToSimilarGoods extends YesNoPage {
  val pageTitle =
    "Will you be comparing your goods to similar goods imported by another buyer or seller in the past - Advance Ruling Service - GOV.UK"
}

object ExplainComparisonToSimilarGoods extends TextAreaPage {
  val pageTitle =
    "Explain how you are comparing your goods to similar goods imported by another buyer or seller in the past 90 days - Advance Ruling Service - GOV.UK"
}
