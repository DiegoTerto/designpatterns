package org.designpattern.criacional.factory_method;

public class MainFactoryMethod {
    public static void main(String[] args) {
        CriadorDeCurso criadorEngenharia = new CriadorDeCursoEngenharia();
        Curso engenharia = criadorEngenharia.criarCurso();
        engenharia.detalhes();

        CriadorDeCurso criadorMedicina = new CriadorDeCursoMedicina();
        Curso medicina = criadorMedicina.criarCurso();
        medicina.detalhes();
    }
}