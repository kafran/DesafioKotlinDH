class Professor(
    val nome: String,
    val sobrenome: String,
    val tempoDeCasa: Int,
    val codigo: Int
) {
    override fun equals(other: Any?): Boolean {
        return (other is Professor) && this.codigo == other.codigo
    }
}