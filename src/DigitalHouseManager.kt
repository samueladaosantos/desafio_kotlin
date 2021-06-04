open class DigitalHouseManager(

    var listaAlunos: MutableList<Aluno> = mutableListOf(),
    var listaProfessores: MutableList<Professor> = mutableListOf(),
    var listaCurso: MutableList<Curso> = mutableListOf(),
    var listaMatricula: MutableList<Matricula> = mutableListOf()

) {
    fun registrarCurso(curso: Curso){
        listaCurso.add(curso)
        println("Curso registrato com sucesso!")
    }

    fun excluirCurso(curso: Curso){
        for (i in listaCurso){
            if (i == curso){
                listaCurso.remove(curso)
                println("Curso removido com sucesso!")
                break
            }
        }
    }

    fun registrarProfAdjunto (professorAdjunto: ProfessorAdjunto){
        listaProfessores.add(professorAdjunto)
        println ("Professor adjunto adicionado com sucesso.")
    }

    fun registrarProfTitular (professorTitular: ProfessorTitular){
        listaProfessores.add(professorTitular)
        println ("Professor titular adicionado com sucesso.")
    }

    fun removerProfessor (codigoProfessor: Professor){
        for (i in listaProfessores){
            if ( i == codigoProfessor){
                listaProfessores.remove(codigoProfessor)
                println("Professor renovido com sucesso.")
                break
            }
        }
    }

    fun adicionarAluno (aluno: Aluno){
        listaAlunos.add(aluno)
        println("Aluno adicionado com sucesso.")
    }

    fun matricularAluno(aluno: Aluno, curso: Curso){

        for( i in listaAlunos){
            if( i == aluno){
                println("Aluno encontrato")
                true
                break
            }
        }
        for (i in listaCurso){
            if( i == curso){
                println("Curso encontrado")
                true
                break
            }else{
                println("Curso não encontrado")
                break
            }
        }


    }






}