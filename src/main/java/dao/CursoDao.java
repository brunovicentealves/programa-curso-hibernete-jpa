package dao;

import domain.Curso;

public class CursoDao extends DAO<Curso> {
    @Override
    protected String getSqlString() {
        return "select c from curso c";
    }

    @Override
    protected Class getClassName() {
        return Curso.class;
    }
}
