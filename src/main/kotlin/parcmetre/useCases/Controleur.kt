package parcmetre.useCases

import parcmetre.Ticket


class Controleur {

    fun CreateTicket(){
        var vraiHorloge = VraieHorloge();
        var ticket = Ticket("11-AZE-12", 2.0, vraiHorloge)
        // remplacer somme payée par une abstraction (interface) qui simule la présence d'un paiement par CB
        // on peut imaginer que le vrai systeme de paiement appelle une API Web (Stripe par exemple)

        // et ainsi de suite; jusqu'à la base de données que l'on peut abstraire aussi
    }
}