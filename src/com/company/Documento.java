package com.company;

import java.util.List;

public class Documento {

    private List<Arvore> arvoreList;

    public Documento()
    {
        this.arvoreList = null;
    }

    public void setArvoreList(List<Arvore> arvoreList) {
        this.arvoreList = arvoreList;
    }

    public List<Arvore> getArvoreList() {
        return arvoreList;
    }
}
