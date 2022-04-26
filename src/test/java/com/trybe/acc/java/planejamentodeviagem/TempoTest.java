package com.trybe.acc.java.planejamentodeviagem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TempoTest {

  @Test
  @DisplayName("1 - Testa o método construtor")
  void construtorTest() {
    Tempo tempo = new Tempo("05/05/2022 13:00:00", "Recife", "Tokyo", 24);

    assertEquals("07/05/2022 01:00:00", tempo.retonarDesembarqueHorarioLocalDestino());
  }

  @Test
  @DisplayName("2 - Testa o método retonarDesembarqueHorarioLocalDestino")
  void retonarDesembarqueHorarioLocalDestinoTest() {
    Tempo tempo = new Tempo("05/05/2022 13:00:00", "Recife", "Tokyo", 24);

    assertEquals("07/05/2022 01:00:00", tempo.retonarDesembarqueHorarioLocalDestino());
  }

  @Test
  @DisplayName("3 - Testa o método retonarDesembarqueHorarioLocalOrigem")
  void retonarDesembarqueHorarioLocalOrigemTest() {
    Tempo tempo = new Tempo("05/05/2022 13:00:00", "Recife", "Tokyo", 24);

    assertEquals("06/05/2022 13:00:00", tempo.retonarDesembarqueHorarioLocalOrigem());
  }

}
