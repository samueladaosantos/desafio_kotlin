open class ProfessorTitular(
    override var nomeProfessor: String,
    override var sobrenomeProfessor: String,
    override var codigoProfessor: Int,
    override var tempoDeCasa: Int,
    var especialidade: String

) : Professor, DigitalHouseManager() {

    override fun equals(other: Any?): Boolean {
        var profT1 = other as? ProfessorTitular
        return if (other == codigoProfessor){
            this.codigoProfessor == profT1?.codigoProfessor
        }else{
            super.equals(other)
        }
    }


}