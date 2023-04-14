package exercice_1.regles_metier

import parcmetre.domain.values.Devises
import parcmetre.domain.values.Monnaie

class Calculateur {
    companion object {
        fun calculerPrix(duree: Int): Monnaie    {
            return Monnaie(3, Devises.EUROS)
        }
    }
}
