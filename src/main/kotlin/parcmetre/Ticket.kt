package parcmetre

import java.time.LocalDateTime

class Ticket(immatriculation: String, sommePayee: Double, horlogeEntree: IHorloge) {

    val DateHeureSortie: LocalDateTime = horlogeEntree.Maintenant().plusHours((sommePayee * 2).toLong())
}
