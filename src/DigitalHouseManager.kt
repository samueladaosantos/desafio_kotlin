import java.time.LocalDateTime
import kotlin.collections.mutableMapOf as mutableMapOf1

open class DigitalHouseManager(

    var listaAlunos: MutableList<Aluno> = mutableListOf(),
    var listaProfessores: MutableList<Professor> = mutableListOf(),
    var listaCurso: MutableList<Curso> = mutableListOf(),
    var listaMatricula: MutableList<Matricula> = mutableListOf(),


) {

    fun registrarCurso(curso: Curso) {
        listaCurso.add(curso)
        println("Curso registrato com sucesso!")
    }

    fun excluirCurso(curso: Curso) {
        for (i in listaCurso) {
            if (i == curso) {
                listaCurso.remove(curso)
                println("Curso removido com sucesso!")
                break
            }
        }
    }

    fun registrarProfAdjunto(professorAdjunto: ProfessorAdjunto) {
        listaProfessores.add(professorAdjunto)
        println("Professor adjunto adicionado com sucesso.")
    }

    fun registrarProfTitular(professorTitular: ProfessorTitular) {
        listaProfessores.add(professorTitular)
        println("Professor titular adicionado com sucesso.")
    }

    fun removerProfessor(codigoProfessor: Professor) {
        for (i in listaProfessores) {
            if (i == codigoProfessor) {
                listaProfessores.remove(codigoProfessor)
                println("Professor renovido com sucesso.")
                break
            }
        }
    }

    fun matricularAluno(aluno: Aluno, curso: Curso) {

        if (aluno in listaAlunos && curso in listaCurso) {

            listaMatricula.add(Matricula(aluno, curso, LocalDateTime.now()))
            println("Matricula efetuada com sucesso!")


        } else {
            println("Matricula não realizada, não há vagas..")
        }
    }

    fun alocarProfessor(codigoCurso: Int, codigoProfessorAdjunto: Int, codigoProfessorTitular: Int) {

        var listaProfCurso: MutableList<Int> = mutableListOf()

        listaProfCurso.add(codigoCurso)
        listaProfCurso.add(codigoProfessorAdjunto)
        listaProfCurso.add(codigoProfessorTitular)
        println("Professor Adjunto nº $codigoProfessorAdjunto, Professor Titular nº $codigoProfessorTitular adicionados ao curso nº $codigoCurso" )

































    }





}






