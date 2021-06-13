import java.time.LocalDateTime
import java.util.*

open class Matricula(

    open var aluno: Aluno,
    open var curso: Curso,
    open var data: LocalDateTime


) : DigitalHouseManager() {


}