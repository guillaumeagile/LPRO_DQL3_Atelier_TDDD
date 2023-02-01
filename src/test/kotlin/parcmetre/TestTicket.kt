package parcmetre

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import parcmetre.domain.Temps
import parcmetre.domain.Ticket

import java.time.LocalDateTime
import java.time.Month

class TestTicket : StringSpec({

    ("le ticket doit donner une date de sortie correspondante pour un euros").config(enabled = true) {
        // Arrange
        var dateEntree = LocalDateTime.of(2023, Month.FEBRUARY, 1, 11, 21)
        var dateSortie = LocalDateTime.of(2023, Month.FEBRUARY, 1, 13, 21)
        var montantPourDeuxHeures = 1

        // ACT
        var ticket = Ticket( Temps(dateEntree), montantPourDeuxHeures)

        // Assert
        ticket.DateDeSortie shouldBe dateSortie
    }

    ("le ticket doit donner une date de sortie correspondante pour deux euros").config(enabled = true) {
        // Arrange
        var dateEntree = LocalDateTime.of(2023, Month.FEBRUARY, 1, 11, 21)
        var dateSortie = LocalDateTime.of(2023, Month.FEBRUARY, 1, 15, 21)
        var montantPourDeuxHeures = 2

        // ACT
        var ticket = Ticket( Temps(dateEntree),montantPourDeuxHeures)

        // Assert
        ticket.DateDeSortie shouldBe dateSortie
    }

    ("le ticket doit donner une date de sortie correspondante pour cinq euros").config(enabled = true) {
        // Arrange
        var dateEntree = LocalDateTime.of(2023, Month.FEBRUARY, 1, 11, 21)
        var dateSortie = LocalDateTime.of(2023, Month.FEBRUARY, 1, 16, 21)
        var montantEnEuros = 5

        // ACT
        var ticket = Ticket( Temps(dateEntree),montantEnEuros)

        // Assert
        ticket.DateDeSortie shouldBe dateSortie
    }

    ("le ticket doit donner une date de sortie correspondante pour quatorze euros").config(enabled = true) {
        // Arrange
        var dateEntree = LocalDateTime.of(2023, Month.FEBRUARY, 1, 11, 0)
        var dateSortie = LocalDateTime.of(2023, Month.FEBRUARY, 1, 19, 0)
        var montantEnEuros = 14

        // ACT
        var ticket = Ticket( Temps(dateEntree),montantEnEuros)

        // Assert
        ticket.DateDeSortie shouldBe dateSortie
    }

})