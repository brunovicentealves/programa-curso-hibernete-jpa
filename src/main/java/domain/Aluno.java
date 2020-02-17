package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "aluno")
public class Aluno  implements BaseEntity{
    @Id
    @GeneratedValue(generator = "sequencia_aluno",strategy = GenerationType.AUTO)
    @Column(name = "id_aluno")
    private long idAluno;
    @Column(name = "nome_aluno")
    private String Nome;

    @OneToMany(mappedBy = "aluno")
    private List<AlunoCurso> alunoCursoList;

    public Aluno() {
    }

    public Aluno(String nome) {
        Nome = nome;
    }

    public long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(long idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public List<AlunoCurso> getAlunoCursoList() {
        return alunoCursoList;
    }

    public void setAlunoCursoList(List<AlunoCurso> alunoCursoList) {
        this.alunoCursoList = alunoCursoList;
    }

    @Override
    public long getId() {
        return 0;
    }
}
