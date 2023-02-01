package parcmetre.domain

import java.time.LocalDateTime
import java.time.Month

class Temps(val lheureMaintenant: LocalDateTime = LocalDateTime.now()) {
    fun now(): LocalDateTime {
       return lheureMaintenant
    }

}
