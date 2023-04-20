package parcmetre

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
//import io.mockk.every
//import io.mockk.mockk

import parcmetre.domain.Ticket

import java.time.LocalDateTime

class TestTicketAvecImprimante : StringSpec({

    ("le ticket est bien imprimé").config(enabled = true) {
        // Arrange
        var montantPourDeuxHeures = 1
        var ticket = Ticket(leTemps = FauxTemps(LocalDateTime.MIN), montantEnEuros = montantPourDeuxHeures)

        //var imprimanteDeTest : Imprimante = FausseImprimante(estBienImprimé = true)
         val spy = mockk<Imprimante>()
         every { spy.Imprime() } returns true
         var imprimanteDeTest = spy

        // ACT
       // val estImprimé =  ticket.Imprime(imprimanteDeTest)
        // cas d'une API peut verbeuse (design souvent constaté, mais contesté) -> fonction malhonnête
        ticket.Imprime2(imprimanteDeTest)

        // Assert
        // estImprimé shouldBe true  // je ne peux pas le vérifier :(
        verify {  spy.Imprime() }

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