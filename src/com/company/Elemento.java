package com.company;

public class Elemento {

    private Integer valor;
    private Elemento esquerda;
    private Elemento direita;

    public Elemento(Integer valor)
    {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Elemento getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento esquerda) {
        this.esquerda = esquerda;
    }

    public Elemento getDireita() {
        return direita;
    }

    public void setDireita(Elemento direita) {
        this.direita = direita;
    }
}
