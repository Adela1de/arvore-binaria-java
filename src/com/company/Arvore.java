package com.company;

public class Arvore<T extends Comparable> {

    private Elemento<T> raiz;

    public Arvore()
    {
        this.raiz = null;
    }

    public void adicionar(T valor)
    {
        Elemento<T> novoElemento = new Elemento<>(valor);
        Integer branch = 1;

        if(this.raiz == null)
        {
            this.raiz = novoElemento;
            System.out.println("Elemento adicionado na raiz");
        }
        else
        {
            Elemento<T> atual = this.raiz;
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
            Elemento<T> elementoAtual = this.raiz;
            Integer branch = 1;

            if(elementoAtual.getEsquerda() != null) {
                System.out.println("Valor a esquerda : " + elementoAtual.getEsquerda());
                elementoAtual = elementoAtual.getEsquerda();
            }

            while(true)
            {
                if(elementoAtual.getEsquerda() != null && elementoAtual != this.raiz)
                {
                    System.out.println("Elemento da "+branch+"º branch a esquerda: "+elementoAtual.getEsquerda() +" e a direita: "+elementoAtual.getEsquerda());
                    elementoAtual = elementoAtual.getEsquerda();
                }
                else break;
            }
        }
    }

    public void printarDireita()
    {
        if(this.raiz == null) System.out.println("Árvore atualmente não possui nenhum elemento");
        else
        {
            System.out.println("Valor da raiz: "+this.raiz.getValor());
            Elemento<T> elementoAtual = this.raiz;
            Integer branch = 1;

            if(elementoAtual.getDireita() != null)
            {
                System.out.println("Valor a esquerda : " + elementoAtual.getDireita().toString());
                elementoAtual = elementoAtual.getDireita();
            }

            while(true)
            {
                if(elementoAtual.getDireita() != null && elementoAtual != this.raiz)
                {
                    System.out.println("Elemento da "+branch+"º branch a esquerda: "+elementoAtual.getEsquerda().toString() +" e a direita: "+elementoAtual.getEsquerda().toString());
                    elementoAtual = elementoAtual.getEsquerda();
                }
                else break;
            }
        }
    }
}
