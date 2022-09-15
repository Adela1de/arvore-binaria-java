package com.company;


import java.util.ArrayList;
import java.util.List;

public class Documento {

    private List<Arvore> arvoreList;

    public Documento()
    {
        this.arvoreList = new ArrayList<>();
    }

    public Arvore adicionarArvore(Arvore arvore)
    {
        this.arvoreList.add(arvore);
        return getArvore(arvoreList.indexOf(arvore));
    }

    public void arvoresCriadasDetalhada()
    {
        if(this.arvoreList == null) System.out.println("Nenhuma arvore presente no documento");
        else
        {
            int count = 0;
            for (Arvore a: arvoreList)
            {
                System.out.println("Arvore numero "+count+ " é do tipo Integer");
                count++;
            }
        }
    }

    public List<Arvore> getArvoreList() {
        return arvoreList;
    }

    public Arvore getArvore(int index)
    {
        return this.arvoreList.get(index);
    }

    public void setArvoreList(List<Arvore> arvoreList) {
        this.arvoreList = arvoreList;
    }
}
