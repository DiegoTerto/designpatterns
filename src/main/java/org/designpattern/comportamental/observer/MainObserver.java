package org.designpattern.comportamental.observer;

import org.designpattern.estrutural.composite.Departamento;
import org.designpattern.estrutural.composite.Faculdade;
import org.designpattern.estrutural.composite.Universidade;

public class MainObserver {
    public static void main(String[] args) {
        CursoOnline curso = new CursoOnline();
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");

        curso.registrarAluno(aluno1);
        curso.registrarAluno(aluno2);

        curso.notificarAlunos();
    }
}