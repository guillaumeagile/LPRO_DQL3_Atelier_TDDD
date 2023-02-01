package parcmetre.domain

import java.time.LocalDateTime


class VraiTemps() : Temps {
    override fun now(): LocalDateTime {
       return  LocalDateTime.now()
    }
}
