package aplicacao;

import arvores.ABBint;

import java.util.Scanner;

public class MenuABB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        ABBint abb = new ABBint();

        do{
            System.out.println("0 - Sair\n1 - Inserir 1 valor na ABB\n2 - Apresenta ABB (em ordem)\n3 - Apresenta quantidade de nos da ABB\n4 - Verifica se o NO existe\n5 - Conta quantidade de comparações para pesquisar 1 valor na abb");
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
                case 3:
                    System.out.println("Quantidade de nos:" + abb.contaNos(abb.root,0));
                    break;
                case 4:
                    System.out.print("Informe o valor a ser procurado:");
                    valor = sc.nextInt();
                    if(abb.achou(abb.root,valor)){
                        System.out.println("Valor encontrado");
                    } else {
                        System.out.println("Valor não encontrado");
                    }
                    break;
                case 5:
                    System.out.print("Informe o valor a ser procurado:");
                    valor = sc.nextInt();
                    System.out.println("Número de consultas realizadas: " + abb.contaAchou(abb.root,valor,0));
                    break;
                default:
                    System.out.println("Opção inválida ");
            }
        }while (opcao != 0);

        sc.close();
    }
}
