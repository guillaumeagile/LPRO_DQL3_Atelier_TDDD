package exercice_1.regles_metier

import parcmetre.behaviors.ToutesLesHorloges
import java.time.LocalDateTime

class Ticket(horloge: ToutesLesHorloges, duree: Int) {
    val heureDebutStationnement: LocalDateTime = horloge.maintenantALaMinute()
    val heureFinStationnement: LocalDateTime = heureDebutStationnement.plusMinutes(duree.toLong())
}
