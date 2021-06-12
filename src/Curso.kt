class Curso(
    val nome: String,
    val codigo: Int,
    val capacidadeMax: Int
) {
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    private var alunosMatriculados: MutableList<Aluno> = mutableListOf()

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

    fun addProfessor(professor: Professor) {
        when (professor) {
            is ProfessorTitular -> professorTitular = professor
            is ProfessorAdjunto -> professorAdjunto = professor
        }
    }
}
