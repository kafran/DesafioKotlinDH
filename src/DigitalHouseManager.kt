class DigitalHouseManager {
    var alunos: MutableList<Aluno> = mutableListOf()
    var professores: MutableList<Professor> = mutableListOf()
    var cursos: MutableList<Curso> = mutableListOf()
    var matriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nome: String, codigo: Int, capacidadeMax: Int) {
        val curso = Curso(nome, codigo, capacidadeMax)
        cursos.add(curso)
    }

    fun excluirCurso(codigo: Int) {
        cursos.removeAll { curso -> curso.codigo == codigo }
    }

    fun registrarProfAdjunto(
        nome: String,
        sobrenome: String,
        codigo: Int,
        horasMonitoria: Int
    ) {
        val professor = ProfessorAdjunto(nome, sobrenome, codigo, horasMonitoria)
        professores.add(professor)
    }

    fun registrarProfTitular(
        nome: String,
        sobrenome: String,
        codigo: Int,
        especialidade: String
    ) {
        val professor = ProfessorTitular(nome, sobrenome, codigo, especialidade)
        professores.add(professor)
    }

    fun excluirProfessor(codigo: Int) {
        professores.removeAll { prof -> prof.codigo == codigo }
    }

    fun registrarAluno(
        nome: String,
        sobrenome: String,
        codigo: Int
    ) {
        val aluno = Aluno(nome, sobrenome, codigo)
        alunos.add(aluno)
    }
}
