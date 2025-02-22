package main;

import controle.ControleTarefa;
import tarefa.Tarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n=== CONTROLE DE TAREFAS ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção:");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Descrição: ");
                    String descricao = scanner.nextLine();

                    Tarefa tarefa = new Tarefa(id, descricao);

                    ControleTarefa.getInstance().adicionarTarefa(tarefa);
                    System.out.println("Tarefa adicionada!");

                    break;

                case 5:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        }
    }
}
