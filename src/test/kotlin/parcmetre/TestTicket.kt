package parcmetre

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

import java.time.LocalDateTime
import java.time.Month

class TestTicket : StringSpec({

    ("le ticket doit donner une date de sortie correspondante aux heures choisies").config(enabled = true) {
        // Arrange
        var dateEntree = LocalDateTime.of(2023, Month.FEBRUARY, 1, 11, 21)
        var dateSortie = LocalDateTime.of(2023, Month.FEBRUARY, 1, 13, 21)
        var montantPourDeuxHeures = 1

        // ACT
        var ticket = Ticket(dateEntree, montantPourDeuxHeures)

        // Assert
        ticket.DateDeSortie shouldBe dateSortie
    }

    ("le ticket doit donner une date de sortie correspondante aux heures choisies").config(enabled = true) {
        // Arrange
        var dateEntree = LocalDateTime.of(2023, Month.FEBRUARY, 1, 11, 21)
        var dateSortie = LocalDateTime.of(2023, Month.FEBRUARY, 1, 15, 21)
        var montantPourDeuxHeures = 2

        // ACT
        var ticket = Ticket(dateEntree, montantPourDeuxHeures)

        // Assert
        ticket.DateDeSortie shouldBe dateSortie
    }


})