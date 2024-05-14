package org.designpattern.estrutural.composite;

import java.util.ArrayList;
import java.util.List;

public class Faculdade implements Area{
    private String nome;
    private List<Departamento> departamentos = new ArrayList<>();

    public Faculdade(String nome) {
        this.nome = nome;
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    @Override
    public void mostrarEstrutura() {
        System.out.println(" - Faculdade: " + nome);
        departamentos.forEach(Departamento::mostrarEstrutura);
    }

    @Override
    public void mostrarEstruturaString(StringBuilder estrutura) {
        estrutura.append(" - Faculdade: ").append(nome).append("\n");
        departamentos.forEach(it -> it.mostrarEstruturaString(estrutura));
    }
}
