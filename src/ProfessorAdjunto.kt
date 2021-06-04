open class ProfessorAdjunto(
    override var nomeProfessor: String,
    override var sobrenomeProfessor: String,
    override var codigoProfessor: Int,
    override var tempoDeCasa: Int,
    var qtdadeHorasMonitoria: Int
) : Professor, DigitalHouseManager(){

}


