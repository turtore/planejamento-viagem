package com.trybe.acc.java.planejamentodeviagem;

import java.math.BigDecimal;

public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public double retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = new BigDecimal(distanciaKm / 700.0).toBigInteger().doubleValue();

    return duracaoDouble;
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {

    return embarque + " " + origem + " " + desembarque + " " + destino;
  }
}
