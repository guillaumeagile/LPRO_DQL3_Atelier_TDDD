package exercice_1.regles_metier

interface UneBaseDeTickets {
    fun enregistrer(ticket: Ticket)
     fun retrouver(): List<Ticket>

}
