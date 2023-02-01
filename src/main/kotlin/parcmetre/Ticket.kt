package parcmetre

import java.time.LocalDateTime

class Ticket(val dateEntree: LocalDateTime, val montantEnEuros: Int) {

    val DateDeSortie: LocalDateTime =  dateEntree.plusHours ((montantEnEuros * 2).toLong())


}
