package org.designpattern;

import org.designpattern.estrutural.composite.Departamento;
import org.designpattern.estrutural.composite.Faculdade;
import org.designpattern.estrutural.composite.Universidade;

public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();
        Faculdade faculdadeEngenharia = new Faculdade("Engenharia");
        Faculdade faculdadeCiencias = new Faculdade("Ciências");

        universidade.adicionar(faculdadeEngenharia);
        universidade.adicionar(faculdadeCiencias);

        faculdadeEngenharia.adicionarDepartamento(new Departamento("Engenharia Civil"));
        faculdadeEngenharia.adicionarDepartamento(new Departamento("Engenharia Elétrica"));
        faculdadeCiencias.adicionarDepartamento(new Departamento("Física"));
        faculdadeCiencias.adicionarDepartamento(new Departamento("Química"));

        universidade.mostrarEstrutura();
    }
}