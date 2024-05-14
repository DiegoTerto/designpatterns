package org.designpattern.criacional.factory_method;

public class CriadorDeCursoEngenharia extends CriadorDeCurso{
    public Curso criarCurso() {
        return new Engenharia();
    }
}
