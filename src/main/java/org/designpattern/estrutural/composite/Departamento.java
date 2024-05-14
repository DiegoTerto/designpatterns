package org.designpattern.estrutural.composite;

public class Departamento implements Area{
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarEstrutura() {
        System.out.println("  * Departamento: " + nome);
    }

    public void mostrarEstruturaString(StringBuilder estrutura) {
        estrutura.append("   * Departamento: ").append(nome).append("\n");
    }
}
