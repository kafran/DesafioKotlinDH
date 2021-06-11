class Aluno(
    val nome: String,
    val sobrenome: String,
    val codigo: Int
) {
    override fun equals(other: Any?): Boolean {
        return (other is Aluno) && this.codigo == other.codigo
    }

    override fun toString(): String {
        return "Aluno($nome, $sobrenome)"
    }
}
