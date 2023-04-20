package parcmetre.domain

import parcmetre.Imprimante
import java.time.LocalDateTime

class Ticket(val  leTemps : Temps, val montantEnEuros: Int) {
    fun  Imprime(imprimante: Imprimante): Boolean{
       return  imprimante.Imprime()
    }

    fun Imprime2(imprimante: Imprimante) {
       // imprimante.Imprime()  // tester l'efficacité du SPY en commentant cette ligne
    }

    val dateEntree: LocalDateTime
    init {
        dateEntree = leTemps.now()
    }

    val DateDeSortie: LocalDateTime =
        if (montantEnEuros <= 2)
            dateEntree.plusHours((montantEnEuros * 2).toLong())
        else
            dateEntree.plusMinutes(((montantEnEuros - 2) / 0.05).toLong() ).plusHours(4)

}
