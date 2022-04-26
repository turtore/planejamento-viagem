package com.trybe.acc.java.planejamentodeviagem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VooTest {


  @Test
  @DisplayName("8 - Testa o método retornarTempoVoo")
  void retornarTempoVooTest() {
    Voo voo = new Voo();

    assertEquals(24, voo.retornarTempoVoo(17000));
  }

  @Test
  @DisplayName("9 - Testa o método retornarInformacaoVoo")
  void retornarInformacaoVooTest() {
    Voo voo = new Voo();

    String saida =
        voo.retornarInformacaoVoo("05/05/2022 13:00:00", "Recife", "07/05/2022 01:00:00", "Tokyo");

    assertTrue(saida.contains("07/05/2022"));
  }

}
