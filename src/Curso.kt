class Curso(
    val nome: String,
    val codigo: Int,
    val capacidadeMax: Int,
    private var alunosMatriculados: MutableList<Aluno> = mutableListOf()
) {
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null

    override fun equals(other: Any?): Boolean {
        return (other is Curso) && this.codigo == other.codigo
    }

    fun addAluno(aluno: Aluno): Boolean {
        if (alunosMatriculados.size < capacidadeMax) {
            alunosMatriculados.add(aluno)
            return true
        }
        return false
    }

    fun delAluno(aluno: Aluno) {
        alunosMatriculados.remove(aluno)
    }
}
