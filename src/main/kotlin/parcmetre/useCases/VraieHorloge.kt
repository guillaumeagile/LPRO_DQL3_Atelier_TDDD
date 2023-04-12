package parcmetre.useCases

import draft.IHorloge
import java.time.LocalDateTime

class VraieHorloge : IHorloge {
    override fun Maintenant(): LocalDateTime = LocalDateTime.now()
}
