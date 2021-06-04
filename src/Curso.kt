open class Curso(

    var nomeCurso: String,
    var codigoCurso: Int,
    var qtdadeMaxALunos: Int

) : DigitalHouseManager() {
    fun addAluno(aluno: Aluno) {
        if (qtdadeMaxALunos > listaAlunos.size) {
            listaAlunos.add(aluno)
            println("Aluno adicionado com sucesso!")
        } else {
            println("Limite ultrapassado!!!")
            println(listaAlunos.size)
        }
    }

    fun excluirAluno(aluno: Aluno) {
        for (i in listaAlunos) {
            if (i == aluno) {
                listaAlunos.remove(aluno)
                println("Aluno removido com sucesso!")
                break
            }
        }
    }
}