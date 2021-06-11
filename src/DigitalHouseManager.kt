class DigitalHouseManager {
    var alunos: MutableList<Aluno> = mutableListOf()
    var professores: MutableList<Professor> = mutableListOf()
    var cursos: MutableList<Curso> = mutableListOf()
    var matriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nome: String, codigo: Int, capacidadeMax: Int) {
        val curso = Curso(nome, codigo, capacidadeMax)
        cursos.add(curso)
    }

    fun excluirCurso(codigo: Int){
        cursos.removeAll {
            curso -> curso.codigo == codigo
        }
    }
}
