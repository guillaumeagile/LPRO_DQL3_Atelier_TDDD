package parcmetre.domain.values


import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class TestThatDevise: StringSpec({


    "je peux acheter une chevre avec des dollars".config(enabled = true) {
        // Arrange
        val laPayeDeChasseurDePrime = Monnaie(500, Devises.DOLLARS)
        val lePrixDuneChevreNoire = Monnaie(500, Devises.DOLLARS)
        //Act

        // Assert
        laPayeDeChasseurDePrime shouldBe lePrixDuneChevreNoire
    }

    "je ne peux pas acheter un spinner avec ma paye".config(enabled = true) {
        // Arrange
        val laPayeDeChasseurDePrime = Monnaie(500, Devises.DOLLARS)
        val lePrixDunSpinner = Monnaie(50000, Devises.DOLLARS)
        //Act

        // Assert
        laPayeDeChasseurDePrime shouldNotBe lePrixDunSpinner
    }

    "je peux echanger des Euros avec des dollars".config(enabled = true) {
        // Arrange
        val unDollar = Monnaie(1, Devises.DOLLARS)
        val deuxEuros = Monnaie(2, Devises.EUROS)
        //Act

        // Assert
        unDollar shouldBe deuxEuros
    }

})