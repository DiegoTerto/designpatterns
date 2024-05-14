package org.designpattern.comportamental.observer;

import java.util.ArrayList;
import java.util.List;

public class CursoOnline implements CursoSubject {
    private List<AlunoObserver> alunos = new ArrayList<>();

    public void registrarAluno(AlunoObserver aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(AlunoObserver aluno) {
        alunos.remove(aluno);
    }

    public void notificarAlunos() {
        for (AlunoObserver aluno : alunos) {
            aluno.atualizar();
        }
    }
}
