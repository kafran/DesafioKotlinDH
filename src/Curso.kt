class Curso(
    val nome: String,
    val codigo: Int,
    val professorTitular: ProfessorTitular,
    val professorAdjunto: ProfessorAdjunto,
    val capacidadeMax: Int,
    var alunosMatriculados: MutableList<Aluno> = mutableListOf()
) {
    override fun equals(other: Any?): Boolean {
        return (other is Curso) && this.codigo == other.codigo
    }
}
