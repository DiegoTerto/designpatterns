package org.designpattern.estrutural.composite;

import org.designpattern.comportamental.observer.Aluno;
import org.designpattern.comportamental.observer.CursoOnline;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObserverTest {

    @Test
    public void testNotificacaoAlunos() {
        CursoOnline curso = new CursoOnline();

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");

        curso.registrarAluno(aluno1);
        curso.registrarAluno(aluno2);

        curso.notificarAlunos();

        assertTrue(aluno1.recebeuNotificacao());
        assertTrue(aluno2.recebeuNotificacao());
    }
}
