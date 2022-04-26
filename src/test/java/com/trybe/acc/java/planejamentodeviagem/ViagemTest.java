package com.trybe.acc.java.planejamentodeviagem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ViagemTest {

  @Test
  @DisplayName("4 - Testa o método construtor da classe viagem")
  void construtorTest() {
    Viagem viagem = new Viagem("05/05/2022 13:00:00", "Recife", "Tokyo", 17000);

    assertEquals("07/05/2022 01:00:00", viagem.retonarDesembarqueHorarioLocalDestino());
  }

  @Test
  @DisplayName("5 - Testa o método retonarDesembarqueHorarioLocalDestino da classe Viagem")
  void retonarDesembarqueHorarioLocalDestinoTest() {
    Viagem viagem = new Viagem("05/05/2022 13:00:00", "Recife", "Tokyo", 17000);

    assertEquals("07/05/2022 01:00:00", viagem.retonarDesembarqueHorarioLocalDestino());
  }

  @Test
  @DisplayName("6 - Testa o método retornarDuracaoVoo")
  void retornarDuracaoVooTest() {
    Viagem viagem = new Viagem("05/05/2022 13:00:00", "Recife", "Tokyo", 17000);

    assertEquals(24, viagem.retornarDuracaoVoo());
  }

  @Test
  @DisplayName("7 - Testa o método retornarInformacaoViagem")
  void retornarInformacaoViagemTest() {
    Viagem viagem = new Viagem("05/05/2022 13:00:00", "Recife", "Tokyo", 17000);

    assertTrue(viagem.retornarInformacaoViagem().contains("07/05/2022"));
  }

}
