package parcmetre

import parcmetre.domain.Temps
import java.time.LocalDateTime


class FauxTemps(val valeurDeTemps: LocalDateTime) : Temps {
    override fun now(): LocalDateTime {
       return  valeurDeTemps
    }

}
