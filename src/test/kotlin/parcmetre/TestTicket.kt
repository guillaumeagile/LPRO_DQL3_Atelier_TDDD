package parcmetre

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

import java.time.LocalDateTime
import java.time.Month

class TestTicket : StringSpec({


    ("le ticket doit mentionner l'heure de sortie meme si le paimùent est à 0").config(enabled = true) {
        // Arrange
        var dateEntree = LocalDateTime.of(2016, Month.APRIL, 15, 3, 15)

        var sut : Ticket =  Ticket("00-AAA-00", 0, dateEntree)


        // Assert
        sut.DateHeureSortie shouldBe dateEntree

    }
})