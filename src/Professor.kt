abstract class Professor {
    abstract val nome: String
    abstract val sobrenome: String
    abstract val codigo: Int
    var tempoDeCasa: Int = 0

    override fun equals(other: Any?): Boolean {
        return (other is Professor) && this.codigo == other.codigo
    }
}

class ProfessorTitular(
    override val nome: String,
    override val sobrenome: String,
    override val codigo: Int,
    val especialidade: String
) : Professor() {
    //TODO
}

class ProfessorAdjunto(
    override val nome: String,
    override val sobrenome: String,
    override val codigo: Int,
    val horasMonitoria: Int
) : Professor() {
    //TODO
}
