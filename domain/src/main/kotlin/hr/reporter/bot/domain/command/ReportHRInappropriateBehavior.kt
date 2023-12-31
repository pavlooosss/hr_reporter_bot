package hr.reporter.bot.domain.command

import hr.reporter.bot.domain.model.HRIdentifier
import hr.reporter.bot.domain.model.InappropriateBehavior
import hr.reporter.bot.domain.model.ReporterIdentifier

data class ReportHRInappropriateBehavior(
    val hrIdentifier: HRIdentifier,
    val inappropriateBehavior: InappropriateBehavior,
    val reporterIdentifier: ReporterIdentifier
)
