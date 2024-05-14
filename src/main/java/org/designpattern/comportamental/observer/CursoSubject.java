package org.designpattern.comportamental.observer;

public interface CursoSubject {
    void registrarAluno(AlunoObserver aluno);
    void removerAluno(AlunoObserver aluno);
    void notificarAlunos();
}
