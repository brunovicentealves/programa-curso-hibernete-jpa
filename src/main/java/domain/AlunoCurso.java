
package domain;

import javax.persistence.*;

@Entity
@Table(name = "aluno_curso")
public class AlunoCurso implements BaseEntity {


    @Id
    @GeneratedValue(generator = "sequencia_alunocurso",strategy = GenerationType.AUTO)
    @Column(name = "id_alunocurso")
    private long idAlunoCurso;

    @ManyToOne
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso ;


    public long getIdAlunoCurso() {
        return idAlunoCurso;
    }

    public void setIdAlunoCurso(long idAlunoCurso) {
        this.idAlunoCurso = idAlunoCurso;
    }

    public Aluno getAluno(Curso curso) {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public long getId() {
        return 0;
    }
}
