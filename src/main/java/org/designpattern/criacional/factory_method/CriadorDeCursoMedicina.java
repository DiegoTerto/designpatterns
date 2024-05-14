package org.designpattern.criacional.factory_method;

public class CriadorDeCursoMedicina extends CriadorDeCurso{
    @Override
    public Curso criarCurso() {
        return new Medicina();
    }
}
