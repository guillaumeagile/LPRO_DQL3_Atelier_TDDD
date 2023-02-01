package parcmetre.services

import parcmetre.domain.Ticket
import parcmetre.domain.VraiTemps

class Controleur {

    // POST (HTTP)  /api/ticket
    fun CreerTicket( montant: Int)
    {
        var ticket = Ticket( VraiTemps(), montant)

    }

}