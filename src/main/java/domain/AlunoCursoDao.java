package domain;

import dao.DAO;

public class AlunoCursoDao extends DAO<AlunoCurso> {
    @Override
    protected String getSqlString() {
        return "select ac from aluno_curso ac";
    }

    @Override
    protected Class getClassName() {
        return AlunoCurso.class;
    }
}
