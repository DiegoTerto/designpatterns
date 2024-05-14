package org.designpattern.estrutural.composite;

import org.designpattern.criacional.factory_method.CriadorDeCurso;
import org.designpattern.criacional.factory_method.CriadorDeCursoEngenharia;
import org.designpattern.criacional.factory_method.CriadorDeCursoMedicina;
import org.designpattern.criacional.factory_method.Curso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryMethodTest {
    @Test
    public void testCriacaoCursoEngenharia() {
        CriadorDeCurso criadorEngenharia = new CriadorDeCursoEngenharia();
        Curso engenharia = criadorEngenharia.criarCurso();
        assertEquals("Detalhes do curso: Engenharia", obterDetalhesCurso(engenharia));
    }

    @Test
    public void testCriacaoCursoMedicina() {
        CriadorDeCurso criadorMedicina = new CriadorDeCursoMedicina();
        Curso medicina = criadorMedicina.criarCurso();
        assertEquals("Detalhes do curso: Medicina", obterDetalhesCurso(medicina));
    }

    private String obterDetalhesCurso(Curso curso) {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Detalhes do curso: ");
        detalhes.append(curso.getClass().getSimpleName());
        return detalhes.toString();
    }
}
