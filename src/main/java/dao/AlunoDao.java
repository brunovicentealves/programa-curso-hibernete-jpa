package dao;

import domain.Aluno;

public class AlunoDao  extends  DAO<Aluno>{

    @Override
    protected String getSqlString() {
        return "select a from aluno a";
    }

    @Override
    protected Class getClassName() {
        return Aluno.class;
    }
}
