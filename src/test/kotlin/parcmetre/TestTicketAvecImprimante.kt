package parcmetre

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
//import io.mockk.every
//import io.mockk.mockk

import parcmetre.domain.Ticket

import java.time.LocalDateTime

class TestTicketAvecImprimante : StringSpec({

    ("le ticket est bien imprimé").config(enabled = true) {
        // Arrange
        var montantPourDeuxHeures = 1
        var ticket = Ticket(leTemps = FauxTemps(LocalDateTime.MIN), montantEnEuros = montantPourDeuxHeures)

        var imprimanteDeTest : Imprimante = FausseImprimante(estBienImprimé = true)
        /* val mok = mockk<Imprimante>()
         every { mok.estBienImprimé} returns true
         var imprimanteDeTest = mok
*/
        // ACT
       val estImprimé =  ticket.Imprime(imprimanteDeTest)

        // Assert
     estImprimé shouldBe true

    }

    ("le ticket est mal imprimé").config(enabled = true) {
        // Arrange
        var montantPourDeuxHeures = 1
        var ticket = Ticket(leTemps = FauxTemps(LocalDateTime.MIN), montantEnEuros = montantPourDeuxHeures)
        var dateSortie = ticket.dateEntree.plusHours(2)

        var imprimanteDeTest : Imprimante = FausseImprimante(estBienImprimé = false)

        // ACT
        val estImprimé =  ticket.Imprime(imprimanteDeTest)

        // Assert
        estImprimé shouldBe false

    }






})