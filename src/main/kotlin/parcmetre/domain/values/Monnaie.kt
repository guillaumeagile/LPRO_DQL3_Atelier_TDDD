package parcmetre.domain.values

data class Monnaie(val valeur: Int, val devise: Devises) {

    companion object {
        const val DOLLAR_VERS_EUROS = 2
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Monnaie)
            return false
        if (this.devise == other.devise )
           return (this.valeur == other.valeur)
        if (this.devise == Devises.DOLLARS && other.devise == Devises.EUROS)
            return (this.valeur * DOLLAR_VERS_EUROS == other.valeur)
        return false
    }
}

enum class Devises {
    DOLLARS,
    EUROS

}