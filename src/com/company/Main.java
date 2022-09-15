package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        Documento<Integer> documento = new Documento<>();
        gerenciarDocumento(documento);

    }

    public static <T extends Comparable> void gerenciarDocumento(Documento documento)
    {
        Integer menu = 1;
        while(menu != 0)
        {
            System.out.println(
                    "\n\nDigite 1 para adicionar uma nova árvore do tipo Integer ao documento.\n" +
                            "Digite 2 para a quantidade de árvores.\n" +
                            "Digite 3 para acessar uma árvore já criada.\n" +
                            "Digite qualquer outro número para sair.\n"
            );
            System.out.print("Escolha:");
            menu = s.nextInt();
            if(menu == 1) gerenciarArvore(documento.adicionarArvore(new Arvore<Integer>()));
            else if(menu == 2)
            {
                System.out.println("A quantidade de árvores presentes no documento: ");
                documento.arvoresCriadasDetalhada();
            }
            else if(menu == 3)
            {
                documento.arvoresCriadasDetalhada();
                System.out.print("Informe a arvore que deseja acessar: ");
                int x = s.nextInt();
                if(documento.getArvore(x) == null) System.out.println("Arvore informada não existe! ");
                else gerenciarArvore(documento.getArvore(x));
            }
            else break;
        }
    }

    private static <T extends Comparable> void gerenciarArvore(Arvore arvore)
    {
        Integer menu = 1;
        while (menu != 0)
        {
            System.out.println(
                    "\n\nDigite 1 para adicionar mais um valor.\n" +
                            "Digite 2 para imprimir os valores a esquerda.\n" +
                            "Digite 3 para imprimir os valores a direita.\n" +
                            "Digite qualquer outro número para sair.\n"
            );
            System.out.print("Escolha:");
            menu = s.nextInt();

            if(menu == 1)
            {
                System.out.print("Digite o valor que deseja adicionar: ");
                Integer valor = s.nextInt();
                arvore.adicionar(valor);
            }
            else if(menu == 2) arvore.printarEsquerda();
            else if(menu == 3) arvore.printarDireita();
            else break;
        }
    }
}
