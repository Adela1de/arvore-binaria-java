package com.company;


import java.util.ArrayList;
import java.util.List;

public class Documento<T extends Comparable> {

    private List<Arvore<T>> arvoreList;

    public Documento()
    {
        this.arvoreList = new ArrayList<>();
    }

    public void adicionarArvore(Arvore<T> arvore)
    {

        this.arvoreList.add(arvore);
    }

    public void arvoresCriadasDetalhada()
    {
        if(this.arvoreList == null) System.out.println("Nenhuma arvore presente no documento");
        else
        {
            int count = 0;
            for (Arvore a: arvoreList)
            {
                System.out.println("Arvore numero "+count+ " é do tipo " + a.getType());
                count++;
            }
        }
    }

    public List<Arvore<T>> getArvoreList() {
        return arvoreList;
    }

    public Arvore<T> getArvore(int index)
    {
        return this.arvoreList.get(index);
    }

    public void setArvoreList(List<Arvore<T>> arvoreList) {
        this.arvoreList = arvoreList;
    }
}
