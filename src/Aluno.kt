open class Aluno(
    open var nomeAluno: String,
    open var sobrenomeAluno: String,
    open var codigoAluno: Int
) {

    override fun equals(other: Any?): Boolean {
        var aluno2 = other as? Aluno
        return if (other == codigoAluno) {
            this.codigoAluno == aluno2?.codigoAluno
        } else {
            super.equals(other)
        }
    }


}