package exercice_1.regles_metier

class ParcMetre(val laBase: UneBaseDeTickets) {
    fun creer(ticket: Ticket) {
        laBase.enregistrer(ticket)
    }

    fun retrouverTous(): List<Ticket> = laBase.retrouver()

}
