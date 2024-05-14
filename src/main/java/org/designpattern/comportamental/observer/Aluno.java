package org.designpattern.comportamental.observer;

public class Aluno implements AlunoObserver{
    private String nome;
    private boolean recebeuNotificacao = false;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void atualizar() {
        System.out.println("Notificação para o aluno " + nome + ": O curso foi atualizado!");
        recebeuNotificacao = true;
    }

    public boolean recebeuNotificacao() {
        return recebeuNotificacao;
    }
}
