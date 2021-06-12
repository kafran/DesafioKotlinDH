class DigitalHouseManager {
    var alunos: MutableList<Aluno> = mutableListOf()
    var professores: MutableList<Professor> = mutableListOf()
    var cursos: MutableList<Curso> = mutableListOf()
    var matriculas: MutableList<Matricula> = mutableListOf()

    override fun toString(): String {
        val str = """
            Alunos = $alunos
            Professores = $professores
            Cursos = $cursos
            Matriculas = $matriculas
            """
        return str
    }

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

    fun matricularAluno(
        codigoAluno: Int,
        codigoCurso: Int
    ) {
        val aluno = alunos.find { aluno -> aluno.codigo == codigoAluno }
        val curso = cursos.find { curso -> curso.codigo == codigoCurso }

        if (aluno == null || curso == null)
            throw NullPointerException("Aluno ou Curso não encontrado.")

        if (curso.addAluno(aluno)) {
            val matricula = Matricula(aluno, curso)
            matriculas.add(matricula)
            println("Matrícula realizada.")
        } else {
            println("Não foi possível realizar a matrícular porque não há vagas.")
        }
    }

    fun alocarProfessor(
        codigoCurso: Int,
        codigoProfTitular: Int,
        codigoProfAdjunto: Int
    ) {
        val curso = cursos.find { curso -> curso.codigo == codigoCurso }

        if (curso == null)
            //TODO
            throw NullPointerException("Professor não encontrado.")

        val profTitular = professores.find { prof -> prof.codigo == codigoProfTitular }
        val profAdjunto = professores.find { prof -> prof.codigo == codigoProfAdjunto }

        if (profTitular == null || profAdjunto == null)
            //TODO
            throw NullPointerException("Professor não encontrado.")

        curso.addProfessor(profTitular)
        curso.addProfessor(profAdjunto)
    }

    fun procurarCursoPorAluno(codigo: Int): List<Curso> {
        val listaDeMatricula = matriculas.filter { matricula -> matricula.aluno.codigo == codigo }
        var listaDeCursos = mutableListOf<Curso>()
        listaDeMatricula.forEach {
            listaDeCursos.add(it.curso)
        }
        return listaDeCursos
    }
}
