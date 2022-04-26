package com.trybe.acc.java.planejamentodeviagem;

import java.util.Scanner;

public class Principal {

  /**
   * Método principal com o menu do sistema.
   * 
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int op;

    System.out.println(
        "-------------------- Bem-vindo ao sistema de planejamento de viagem --------------------");

    do {
      System.out.println("Planejar uma nova viagem ou encerrar o sistema?");
      System.out.println("    1) Sim");
      System.out.println("    2) Encerrar Sistema");
      System.out.println();
      System.out.print("Entre com a opção desejada: ");
      op = scanner.nextInt();
      scanner.nextLine();

      if (op == 1) {
        System.out.print("Entre com o nome da cidade origem: ");
        String origem = scanner.nextLine();
        System.out.print("Entre com o nome da cidade destino: ");
        String destino = scanner.nextLine();
        System.out
            .print("Entre com a data e o horário da partida (formato: dd/mm/aaaa hh:mm:ss): ");
        String partida = scanner.nextLine();
        System.out.print("Entre com a distância em km entre a cidade de origem e a de destino: ");
        Double distanciaKm = scanner.nextDouble();

        Viagem viagem = new Viagem(partida, origem, destino, distanciaKm);

        System.out.println(
            "\n\n---------------------------- Resumo da Viagem ----------------------------");
        System.out.println(viagem.retornarInformacaoViagem());
        System.out.println(
            "--------------------------------------------------------------------------\n\n");

      } else if (op == 2) {
        System.out.println("Encerrando o sistema...");
        break;
      } else {
        System.out.println("Opção inválida, tente novamente!");
      }

    } while (true);

    System.out.println("Sistema Encerrado!");
    scanner.close();

  }

}
