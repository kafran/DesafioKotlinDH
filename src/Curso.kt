class Curso(
    val nome: String,
    val codigo: Int
) {
    override fun equals(other: Any?): Boolean {
        return (other is Curso) && this.codigo == other.codigo
    }
}