package parcmetre

import java.time.LocalDateTime

class Ticket(immatriculation: String, sommePayee: Int, dateEntree: LocalDateTime) {

    val DateHeureSortie: LocalDateTime = dateEntree
}
