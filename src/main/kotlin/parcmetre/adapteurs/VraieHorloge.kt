package parcmetre.adapteurs

import parcmetre.behaviors.ToutesLesHorloges
import java.time.LocalDateTime

class VraieHorloge : ToutesLesHorloges {
    override fun maintenantALaMinute(): LocalDateTime {
       return LocalDateTime.now()
    }

}
