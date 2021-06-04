open class ProfessorTitular(
    override var nomeProfessor: String,
    override var sobrenomeProfessor: String,
    override var codigoProfessor: Int,
    override var tempoDeCasa: Int,
    var especialidade: String
) : Professor, DigitalHouseManager() {


}