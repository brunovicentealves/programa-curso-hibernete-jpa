import dao.AlunoDao;
import dao.CursoDao;
import domain.Aluno;
import domain.AlunoCurso;
import domain.AlunoCursoDao;
import domain.Curso;

public class App {
    public static void main(String[] args) {
        CursoDao cursoDao = new CursoDao();
        cursoDao.save(new Curso("psicologia"));


        AlunoDao alunoDao = new AlunoDao();

        alunoDao.save(new Aluno("Pedro batata "));

        AlunoCursoDao alunoCursoDao = new AlunoCursoDao();
        AlunoCurso alunoCurso = new AlunoCurso();


        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        curso.setIdCurso(2);
        aluno.setIdAluno(1);

        alunoCurso.setAluno(aluno);
        alunoCurso.setCurso(curso);

        alunoCursoDao.save(alunoCurso);




    }
}
