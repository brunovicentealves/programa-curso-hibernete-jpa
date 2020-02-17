package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "curso")
public class Curso implements BaseEntity {
    @Id
    @GeneratedValue(generator = "sequencia_curso",strategy = GenerationType.AUTO)
    @Column(name ="id_curso")
    private long idCurso;

    @Column(name = "nome_curso")
    private String nome;

    @OneToMany(mappedBy = "curso")
    private List<AlunoCurso> alunoCursoList;

    public Curso() {
    }

    public Curso(String nome) {
        this.nome = nome;
    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
