open class ProfessorAdjunto(
    override var nomeProfessor: String,
    override var sobrenomeProfessor: String,
    override var codigoProfessor: Int,
    override var tempoDeCasa: Int,
    var qtdadeHorasMonitoria: Int
) : Professor, DigitalHouseManager(){

    override fun equals(other: Any?): Boolean {
        var profA1 = other as? ProfessorAdjunto
        return if (other == codigoProfessor){
            this.codigoProfessor == profA1?.codigoProfessor
        }else{
            super.equals(other)
        }
    }

}


