package com.company;

public class Arvore {

    private Elemento raiz;

    public Arvore()
    {
        this.raiz = null;
    }

    public void adicionar(Integer valor)
    {
        Elemento novoElemento = new Elemento(valor);
        Integer branch = 1;

        if(this.raiz == null)
        {
            this.raiz = novoElemento;
            System.out.println("Elemento adicionado na raiz");
        }
        else
        {
            Elemento atual = this.raiz;
            while(true)
            {
                if(novoElemento.getValor().compareTo(atual.getValor()) == -1)
                {
                    if(atual.getEsquerda() != null)
                    {
                        atual = atual.getEsquerda();
                        branch++;
                    }
                    else
                    {
                        atual.setEsquerda(novoElemento);
                        System.out.println("Elemento adicionado na "+branch+"º branch a esquerda");
                        break;
                    }
                }
                else
                {
                    if(atual.getDireita() != null)
                    {
                        atual = atual.getDireita();
                        branch++;
                    }
                    else
                    {
                        atual.setDireita(novoElemento);
                        System.out.println("Elemento adicionado na "+branch+"º branch a direita");
                        break;
                    }
                }
            }
        }
    }

    public void printarEsquerda()
    {
        if(this.raiz == null) System.out.println("Árvore atualmente não possui nenhum elemento");
        else
        {
            System.out.println("Valor da raiz: "+this.raiz.getValor());
            Elemento elementoAtual = this.raiz;
            Integer branch = 2;

            if(elementoAtual.getEsquerda() != null) {
                System.out.println("Valor a esquerda da raiz: " + elementoAtual.getEsquerda().getValor());
                elementoAtual = elementoAtual.getEsquerda();
            }

            while(true)
            {
                if(elementoAtual.getEsquerda() != null)
                {
                    String direita = "";
                    direita = elementoAtual.getDireita() == null ? " e a direita vazio" :  " e a direita: " + elementoAtual.getDireita().getValor();
                    System.out.println("\nElemento da "+branch+"º branch a esquerda: "+elementoAtual.getEsquerda().getValor() + direita);
                    elementoAtual = elementoAtual.getEsquerda();
                    branch++;
                }
                else
                {
                    System.out.println("\nNão há mais elementos na árvore");
                    break;
                }
            }
        }
    }

    public void printarDireita()
    {
        if(this.raiz == null) System.out.println("Árvore atualmente não possui nenhum elemento");
        else
        {
            System.out.println("Valor da raiz: "+this.raiz.getValor());
            Elemento elementoAtual = this.raiz;
            Integer branch = 2;

            if(elementoAtual.getDireita() != null)
            {
                System.out.println("Valor a direita da raiz : " + elementoAtual.getDireita().getValor());
                elementoAtual = elementoAtual.getDireita();
            }

            while(true)
            {
                if(elementoAtual.getDireita() != null)
                {
                    String esquerda = "";
                    esquerda = elementoAtual.getEsquerda() == null ? " e a esquerda vazio" :  " e a esquerda: " + elementoAtual.getEsquerda().getValor();
                    System.out.print("\nElemento da "+branch+"º branch a direita: "+elementoAtual.getDireita().getValor() + esquerda);
                    elementoAtual = elementoAtual.getDireita();
                    branch++;
                }
                else
                {
                    System.out.println("\nNão há mais elementos na árvore");
                    break;
                }
            }
        }
    }
}
