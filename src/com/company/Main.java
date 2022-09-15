package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Documento documento = new Documento();
        Arvore<Integer> arvore = new Arvore<>();
        Scanner s = new Scanner(System.in);

        System.out.println("");

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
