package parcmetre

class FausseImprimante(override val estBienImprimé: Boolean)  : Imprimante {

    override fun Imprime(): Boolean = estBienImprimé

}
