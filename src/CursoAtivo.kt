fun main (){

//    var aluno = Aluno("Samuel", "Santos", 1104)
//    var proft = ProfessorTitular("Titular", "XXX", 123, 0, "Espec")
//    var profa = ProfessorAdjunto("Adjunto", "YYY", 321, 0, 10)
//    var teste = Curso(nomeCurso = "Teste", codigoCurso = 123123, qtdadeMaxALunos = 10, professorTitular = proft, professorAdjunto = profa)
//    var matricula = Matricula(aluno, teste)
//
//    teste.addAluno(aluno)
//    teste.excluirAluno(aluno)
//    teste.registrarCurso(teste)
//
//
//
//    profa.registrarProfAdjunto(profa)
//    proft.registrarProfTitular(proft)
//
//    profa.removerProfessor(profa)
//
//    teste.adicionarAluno(aluno)
//
//    teste.matricularAluno(aluno,teste)

    var curso1 = Curso(nomeCurso = "Full Stack", codigoCurso = 20001, qtdadeMaxALunos = 3)
    var curso2 = Curso(nomeCurso = "Android", codigoCurso = 20002, qtdadeMaxALunos = 2)

    var professorTitular = ProfessorTitular(nomeProfessor = "ProfT", sobrenomeProfessor = "tit", codigoProfessor = 1122, tempoDeCasa = 2, especialidade = "tudo")
    var professorAdjunto = ProfessorAdjunto(nomeProfessor = "ProfA", sobrenomeProfessor = "Adj", codigoProfessor = 3366, tempoDeCasa = 2, qtdadeHorasMonitoria = 10)

    var aluno1 = Aluno(nomeAluno = "AAA", sobrenomeAluno = "BBB", codigoAluno = 1)
    var aluno2 = Aluno(nomeAluno = "CCC", sobrenomeAluno = "DDD", codigoAluno = 2)
    var aluno3 = Aluno(nomeAluno = "EEE", sobrenomeAluno = "FFF", codigoAluno = 3)
    var aluno4 = Aluno(nomeAluno = "GGG", sobrenomeAluno = "HHH", codigoAluno = 4)
    var aluno5 = Aluno(nomeAluno = "III", sobrenomeAluno = "JJJ", codigoAluno = 5)
    var aluno6 = Aluno(nomeAluno = "KKK", sobrenomeAluno = "LLL", codigoAluno = 6)
    var aluno7 = Aluno(nomeAluno = "MMM", sobrenomeAluno = "NNN", codigoAluno = 7)
    var aluno8 = Aluno(nomeAluno = "OOO", sobrenomeAluno = "PPP", codigoAluno = 8)

    curso1.matricularAluno(aluno1, curso1)
    curso1.matricularAluno(aluno2, curso1)
    curso2.matricularAluno(aluno3, curso2)
    curso2.matricularAluno(aluno4, curso2)
    curso2.matricularAluno(aluno5, curso2)


}