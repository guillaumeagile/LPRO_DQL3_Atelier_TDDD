package parcmetre.useCases

import parcmetre.IHorloge
import java.time.LocalDateTime

class VraieHorloge : IHorloge {
    override fun Maintenant(): LocalDateTime = LocalDateTime.now()
}
