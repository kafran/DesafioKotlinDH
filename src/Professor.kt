abstract class Professor {
    abstract val nome: String
    abstract val sobrenome: String
    abstract val tempoDeCasa: Int
    abstract val codigo: Int

    override fun equals(other: Any?): Boolean {
        return (other is Professor) && this.codigo == other.codigo
    }
}

class ProfessorTitular(
    override val nome: String,
    override val sobrenome: String,
    override val tempoDeCasa: Int,
    override val codigo: Int,
    val especialidade: String
) : Professor() {
    //TODO
}

class ProfessorAdjunto(
    override val nome: String,
    override val sobrenome: String,
    override val tempoDeCasa: Int,
    override val codigo: Int,
    val horasMonitoria: Int
) : Professor() {
    //TODO
}
