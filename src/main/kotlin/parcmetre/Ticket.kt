package parcmetre

import java.time.LocalDateTime

class Ticket(val dateEntree: LocalDateTime, val montantEnEuros: Int) {

    val DateDeSortie: LocalDateTime =
        if (montantEnEuros <= 2)
            dateEntree.plusHours((montantEnEuros * 2).toLong())
        else
            dateEntree.plusMinutes(((montantEnEuros - 2) / 0.05).toLong() ).plusHours(4)

}
