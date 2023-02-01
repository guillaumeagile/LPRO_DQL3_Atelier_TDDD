package parcmetre.domain

import java.time.LocalDateTime

class Ticket( val  leTemps : Temps,  val montantEnEuros: Int) {
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
