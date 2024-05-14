package org.designpattern.estrutural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniversidadeTest {

    @Test
    public void deveTestarEstruturaUniversidade() {
        Universidade universidade = new Universidade();
        Faculdade faculdadeEngenharia = new Faculdade("Engenharia");
        Faculdade faculdadeCiencias = new Faculdade("Ciências");

        universidade.adicionar(faculdadeEngenharia);
        universidade.adicionar(faculdadeCiencias);

        faculdadeEngenharia.adicionarDepartamento(new Departamento("Engenharia Civil"));
        faculdadeEngenharia.adicionarDepartamento(new Departamento("Engenharia Elétrica"));
        faculdadeCiencias.adicionarDepartamento(new Departamento("Física"));
        faculdadeCiencias.adicionarDepartamento(new Departamento("Química"));


        String estruturaEsperada = "Universidade:\n" +
                " - Faculdade: Engenharia\n" +
                "   * Departamento: Engenharia Civil\n" +
                "   * Departamento: Engenharia Elétrica\n" +
                " - Faculdade: Ciências\n" +
                "   * Departamento: Física\n" +
                "   * Departamento: Química\n";


        assertEquals(estruturaEsperada, obterEstrutura(universidade));
    }

    // Método auxiliar para obter a estrutura da universidade como uma string
    private String obterEstrutura(Universidade universidade) {
        StringBuilder estrutura = new StringBuilder();
        universidade.mostrarEstruturaString(estrutura);
        return estrutura.toString();
    }

}