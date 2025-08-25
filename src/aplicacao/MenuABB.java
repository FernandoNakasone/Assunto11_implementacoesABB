package aplicacao;

import arvores.ABBint;

import java.util.Scanner;

public class MenuABB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        ABBint abb = new ABBint();

        do{
            System.out.println("0 - Sair\n1 - Inserir 1 valor na ABB\n2 - Apresenta ABB (em ordem)");
            System.out.print("Opção:");
            opcao = sc.nextInt();

            switch (opcao){
                case 0:
                    System.err.println("Fechando a execução");
                    break;
                case 1:
                    System.out.print("Informe o valor a ser inserido:");
                    int valor = sc.nextInt();
                    abb.root = abb.inserir(abb.root, valor);
                    break;
                case 2:
                    System.out.println("\t Apresentação ABB");
                    abb.show(abb.root);
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 0);

        sc.close();
    }
}
