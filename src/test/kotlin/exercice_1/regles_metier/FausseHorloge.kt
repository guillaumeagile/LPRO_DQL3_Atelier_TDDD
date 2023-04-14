import parcmetre.behaviors.ToutesLesHorloges
import java.time.LocalDateTime

class FausseHorloge(val leMaintenant: LocalDateTime) : ToutesLesHorloges {
    override fun maintenantALaMinute(): LocalDateTime = leMaintenant

}
