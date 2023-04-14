package exercice_1.regles_metier

class FausseBase : UneBaseDeTickets {

    val listDesTickets = mutableListOf<Ticket>()

    override fun enregistrer(ticket: Ticket) {
        listDesTickets.add(ticket)
    }

    override fun retrouver(): List<Ticket> = listDesTickets

}

