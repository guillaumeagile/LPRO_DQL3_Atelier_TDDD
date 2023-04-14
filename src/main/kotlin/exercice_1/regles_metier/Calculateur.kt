package exercice_1.regles_metier

import parcmetre.domain.values.Devises
import parcmetre.domain.values.Monnaie

private const val TAUX_HORAIRE = 0.1

class Calculateur {
    companion object {

        fun calculerPrix(duree: Float): Monnaie    {
            return Monnaie( (duree * TAUX_HORAIRE).toInt() , Devises.EUROS)
        }
    }
}
