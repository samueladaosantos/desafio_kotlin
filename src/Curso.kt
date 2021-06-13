open class Curso(

    var nomeCurso: String,
    var codigoCurso: Int,
    open var qtdadeMaxALunos: Int,


) : DigitalHouseManager() {

    fun addAluno(aluno: Aluno): Boolean {

        return if (qtdadeMaxALunos > listaAlunos.size) {
            listaAlunos.add(aluno)

        } else
            return false
    }

    fun excluirAluno(aluno: Aluno) {
        for (i in listaAlunos) {
            if (i == aluno) {
                listaAlunos.remove(aluno)
                println("Aluno removido com sucesso!")
                break
            }else{
                println("Aluno não encontrato.")
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        var curso2 = other as? Curso
        return if (other == codigoCurso){
            this.codigoCurso == curso2?.codigoCurso
        }else {
            super.equals(other)
        }

    }
}