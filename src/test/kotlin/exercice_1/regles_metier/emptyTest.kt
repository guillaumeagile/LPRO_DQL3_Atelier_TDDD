package exercice_1.regles_metier

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import parcmetre.domain.values.Devises
import parcmetre.domain.values.Monnaie

class `1_TestCalculateur` : StringSpec({

    "Quand je choisi 30mn  alors je dois payer 3 EUR".config(enabled = true) {
        // Arrange
        val sommeAttendue = Monnaie(3, Devises.EUROS)

         //Act
        val sommeAPayer =  Calculateur.calculerPrix(30)

        // Assert
        sommeAPayer shouldBe sommeAttendue
    }
})