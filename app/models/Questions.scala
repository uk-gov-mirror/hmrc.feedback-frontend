/*
 * Copyright 2020 HM Revenue & Customs
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

package models

import models.ccg._
import models.eotho._
import play.api.libs.json.{Format, Json}

case class OtherQuestions(
  ableToDo: Option[Boolean],
  howEasyScore: Option[HowEasyQuestion],
  whyGiveScore: Option[String],
  howDoYouFeelScore: Option[HowDoYouFeelQuestion]
)

object OtherQuestions {
  implicit val formats: Format[OtherQuestions] = Json.format[OtherQuestions]
}

case class OtherQuestionsEmployeeExpensesBeta(
  ableToDo: Option[Boolean],
  howEasyScore: Option[HowEasyQuestion],
  whyGiveScore: Option[String],
  howDoYouFeelScore: Option[HowDoYouFeelQuestion],
  fullName: Option[String],
  email: Option[String]
)

object OtherQuestionsEmployeeExpensesBeta {
  implicit val formats: Format[OtherQuestionsEmployeeExpensesBeta] = Json.format[OtherQuestionsEmployeeExpensesBeta]
}

case class PTAQuestions(
  neededToDo: Option[String],
  ableToDo: Option[Boolean],
  howEasyScore: Option[HowEasyQuestion],
  whyGiveScore: Option[String],
  howDoYouFeelScore: Option[HowDoYouFeelQuestion]
)

object PTAQuestions {
  implicit val formats: Format[PTAQuestions] = Json.format[PTAQuestions]
}

case class BTAQuestions(
  mainService: Option[MainServiceQuestion],
  mainServiceOther: Option[String],
  ableToDo: Option[Boolean],
  howEasyScore: Option[HowEasyQuestion],
  whyGiveScore: Option[String],
  howDoYouFeelScore: Option[HowDoYouFeelQuestion]
)

object BTAQuestions {
  implicit val formats: Format[BTAQuestions] = Json.format[BTAQuestions]
}

case class PensionQuestions(
  ableToDo: Option[Boolean],
  howEasyScore: Option[HowEasyQuestion],
  whyGiveScore: Option[String],
  howDoYouFeelScore: Option[HowDoYouFeelQuestion],
  likelyToDo: Option[LikelyToDoQuestion]
)

object PensionQuestions {
  implicit val formats: Format[PensionQuestions] = Json.format[PensionQuestions]
}

case class EOTHOQuestions(
  numberOfEstablishments: Option[NumberOfEstablishmentsQuestion],
  numberOfEmployees: Option[NumberOfEmployeesQuestion],
  whichRegions: List[WhichRegionQuestion],
  affectedJobs: Option[AffectedJobsQuestion],
  protectAtRiskJobs: Option[Boolean],
  protectHospitalityIndustry: Option[Boolean],
  comparedToMonTueWed: Option[ComparedToMonTueWedQuestion],
  comparedToThurFriSatSun: Option[ComparedToThurFriSatSunQuestion],
  comparedBusinessTurnover: Option[ComparedBusinessTurnoverQuestion],
  encourageReopenSooner: Option[Boolean],
  encourageReturnToRestaurantsSooner: Option[Boolean],
  offerDiscounts: Option[OfferDiscountsQuestion],
  businessFuturePlans: Option[BusinessFuturePlansQuestion])

object EOTHOQuestions {
  implicit val formats: Format[EOTHOQuestions] = Json.format[EOTHOQuestions]
}

case class CCGQuestions(
  complianceCheckUnderstanding: Option[ComplianceCheckUnderstandingQuestion],
  treatedProfessionally: Option[TreatedProfessionallyQuestion],
  whyGiveAnswer: Option[String],
  supportFutureTaxQuestion: Option[SupportFutureTaxQuestion]
)

object CCGQuestions {
  implicit val formats: Format[CCGQuestions] = Json.format[CCGQuestions]
}

case class GiveReasonQuestions(value: Option[GiveReason], reason: Option[String])

object GiveReasonQuestions {

  implicit val formats: Format[GiveReasonQuestions] = Json.format[GiveReasonQuestions]
}
