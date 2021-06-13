fun main (){

    var profT1 = ProfessorTitular("João", "Santos", 1100, 1,"Android")
    var profT2 = ProfessorTitular("José", "Silva", 1101, 3,"Android e IOS")
    var profA1 = ProfessorAdjunto("Maria", "Pereira", 1200, 5,15)
    var profA2 = ProfessorAdjunto("Pedro", "Cunha", 1201,5,45)

    var curso1 = Curso("Full Stack", 20001,3)
    var curso2 = Curso("Android", 20002,2)

    curso1.alocarProfessor(20001,1200,1100)
    curso1.alocarProfessor(2002,1201,1101)

    var aluno1 = Aluno(nomeAluno = "AAA", sobrenomeAluno = "BBB", codigoAluno = 1)
    var aluno2 = Aluno(nomeAluno = "CCC", sobrenomeAluno = "DDD", codigoAluno = 2)
    var aluno3 = Aluno(nomeAluno = "EEE", sobrenomeAluno = "FFF", codigoAluno = 3)
    var aluno4 = Aluno(nomeAluno = "GGG", sobrenomeAluno = "HHH", codigoAluno = 4)
    var aluno5 = Aluno(nomeAluno = "III", sobrenomeAluno = "JJJ", codigoAluno = 5)
    var aluno6 = Aluno(nomeAluno = "KKK", sobrenomeAluno = "LLL", codigoAluno = 6)
    var aluno7 = Aluno(nomeAluno = "MMM", sobrenomeAluno = "NNN", codigoAluno = 7)
    var aluno8 = Aluno(nomeAluno = "OOO", sobrenomeAluno = "PPP", codigoAluno = 8)


    curso1.addAluno(aluno1)
    curso1.addAluno(aluno2)

    curso2.addAluno(aluno3)
    curso2.addAluno(aluno4)
    curso2.addAluno(aluno5)

    curso1.registrarCurso(curso1)
    curso2.registrarCurso(curso2)

    curso1.matricularAluno(aluno1,curso1)
    curso1.matricularAluno(aluno2,curso1)

    curso2.matricularAluno(aluno3,curso2)
    curso2.matricularAluno(aluno4,curso2)
    curso2.matricularAluno(aluno5,curso2)







}