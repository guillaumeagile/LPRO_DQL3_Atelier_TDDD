package parcmetre

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import parcmetre.domain.VraiTemps
import parcmetre.domain.Ticket

import java.time.LocalDateTime
import java.time.Month

class TestTicketAvecDateCourante : StringSpec({

    ("le ticket doit donner une date de sortie correspondante pour un euros avec la date en cours").config(enabled = true) {
        // Arrange
        var montantPourDeuxHeures = 1

        // ACT
        var ticket = Ticket(leTemps = VraiTemps(), montantEnEuros = montantPourDeuxHeures)

        var dateSortie = ticket.dateEntree.plusHours(2)
        // Assert
        ticket.DateDeSortie shouldBe dateSortie
    }

    ("le ticket doit donner une date de sortie correspondante pour un euros et une entrée le lundi matin à 8h").config(enabled = true) {
        // Arrange
        var montantPourDeuxHeures = 1

        // ACT
            var ticket = Ticket(
                montantEnEuros = montantPourDeuxHeures,
                leTemps = FauxTemps(LocalDateTime.of(2023, Month.FEBRUARY, 1, 8, 0)))

        var dateSortie = LocalDateTime.of(2023, Month.FEBRUARY, 1, 10, 0)
        // Assert
        ticket.DateDeSortie shouldBe dateSortie
    }






})