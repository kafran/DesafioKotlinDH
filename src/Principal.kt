fun main() {
    val manager = DigitalHouseManager()

    // Registrar dois professores titulares
    manager.registrarProfTitular("Professor", "Pardal", 1001, "Engenharia")
    manager.registrarProfTitular("Professor", "Girafales", 1002, "Sociologia")

    // Registrar dois professores adjuntos
    manager.registrarProfAdjunto("Professor", "Xavier", 2001, 40)
    manager.registrarProfAdjunto("Mestre", "Yoda", 2002, 40)

    // Regisrar dois cursos
    manager.registrarCurso("Full Stack", 20001, 3)
    manager.registrarCurso("Android", 20002, 2)

    // Alocar professores
    manager.alocarProfessor(20001, 1001, 2001)
    manager.alocarProfessor(20002, 1002, 2002)

    // Registrar alunos
    manager.registrarAluno("Aluno", "Um", 1)
    manager.registrarAluno("Aluno", "Dois", 2)
    manager.registrarAluno("Aluno", "Três", 3)

    // Matricular alunos Full Stack
    manager.matricularAluno(1, 20001)
    manager.matricularAluno(2, 20001)

    // Matricular alunos Android
    manager.matricularAluno(1, 20002)
    manager.matricularAluno(2, 20002)
    manager.matricularAluno(3, 20002)

    println(manager)
}

