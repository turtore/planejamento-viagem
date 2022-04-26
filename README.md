# Requisitos do desafio: Sistema de Planejamento de Viagem

Um dos maiores perrengues que pessoas que viajam para outros países passam é confundir os horários entre embarque e desembarque. Isso acontece porque, conforme vamos nos movimentando ao redor do planeta, o fuso horário é alterado. Por exemplo, imagine que vamos sair de Brasília no dia 22/01 e nosso vôo sai às 13:00 para Tokyo, no Japão. Considerando que estamos em um voo direto, com duração de 24 horas, chegaremos em Tokyo à 1:00 do dia 24/01. Você pode pensar: "mas ué, se saímos do Brasil dia 22/01, em um vôo de 24 horas de duração, como chegamos dois dias depois ao Japão?" Pois é! Isso ocorre devido ao fuso horário!

Para ajudar as pessoas viajantes, uma empresa aérea contratou sua equipe para desenvolver um sistema para que suas pessoas clientes possam calcular os fusos horários de suas viagens entre os países. 

Então, antes de iniciarmos com a descrição dos requisitos do sistema, queremos dizer que, após completar este desafio, você estará profissional em lidar com datas, horas e fusos horários utilizando Java. Vamos lá! ✈️

A empresa aérea que contratou sua equipe para desenvolver o projeto quer que o sistema receba uma entrada da pessoa usuária indicando, na seguinte ordem:
**1º:** qual é a cidade de origem da sua viagem;
**2º:** a cidade de destino;
**3º:** a data e a hora de partida do seu voo; e
**4º:** a distância entre as cidades em quilômetros.

Após a pessoa usuária inserir essas informações, o sistema deve apresentar um resumo da viagem, indicando data, hora e o nome da cidade de partida, e também data, hora e o nome da cidade de destino. Para facilitar ainda mais a vida das pessoas viajantes, o sistema deve apresentar uma frase deixando claro, para não haver confusão, que a o desembarque será tal hora na cidade destino, o que equivale a tal hora da cidade de origem — assim os familiares da pessoa viajante saberão a que hora podem tentar ligar para saber se correu tudo bem durante o voo, por exemplo.

Com esses requisitos da empresa áerea, a pessoa gerente do projeto fez o levantamento das classes, métodos e atributos que o sistema deve ter e passou a demanda para que fosse desenvolvida por você. Então o sistema deve ter as seguintes classes, métodos e atributos:

## Classes

- Tempo: essa classe é responsável por fazer toda a manipulação de datas, horas e fusos horários do sistema.
    - Atributos:
        - `embarque`: é privado, do tipo da classe `LocalDateTime`, e é responsável por armazenar a data e a hora do embarque da pessoa viajante.
	    - `origem`: é privado, do tipo String, e é responsável por armazenar o nome da cidade de origem da viagem.
	    - `destino`: é privado, do tipo String, e é responsável por armazenar o nome da cidade de destino da viagem.
	    - `duracao`: é privado, do tipo inteiro, e é responsável por armazenar a duração da viagem em horas, no caso é a duração do voo especificamente.
        - `formato`: é privado, do tipo String, e é responsável por representar o formato que a data e a hora deve ter ao ser entrada pela pessoa usuária (ex: "dd/MM/yyyy HH:mm:ss").
	
    - Métodos:
        - Construtor: o método construtor dessa classe `Tempo` deve receber quatro argumentos: String `embarque`, String `origem`, String `destino`, `int` `duracao`, que devem ser usados para inicializar os respectivos atributos. Note que o atributo `embarque` é do tipo `LocalDateTime`, e o argumento recebido é do tipo String, então você deve usar os métodos da classe `LocalDateTime` para fazer essa manipulação.
        - `retonarDesembarqueHorarioLocalDestino`: esse método é público e retorna um valor do tipo String representando data e hora no formato dd/MM/yyyy HH:mm:ss. Ele é responsável por descobrir qual será a data e horário local da cidade destino da pessoa viajante no seu desembarque (levando em consideração a duração do voo). Por exemplo, considerando que o embarque na cidade de origem foi no dia 22/01/22, o voo saiu às 13:00 para a cidade destino que tem uma diferença de 24 horas no fuso horário, ou seja, na cidade destino o embarque da pessoa viajante foi dia 23/04/22 à 01:00. Supondo que o voo tem duração de 24 horas, então esse método deve retornar a String "24/04/22 01:00:00", que representa a data e a hora que o desembarque será feito, levando em consideração o horário da cidade de destino.
        - `retonarDesembarqueHorarioLocalOrigem`: esse método é público e também retorna um valor do tipo String representado data e hora no formato dd/MM/yyyy HH:mm:ss. De forma similar ao anterior, este método deve calcular qual será a data e o horário local na cidade de origem em que a pessoa desembarcará na cidade destino. Considerando o mesmo exemplo anterior, em que o embarque na cidade de origem foi no dia 22/01/22, o voo saiu às 13:00 para a cidade destino que tem uma diferença de 24 horas no fuso horário. Supondo que o voo tem duração de 24 horas, então esse método deve retornar a String "23/04/22 13:00:00", que representa a data e a hora que o desembarque será feito levando em consideração o horário da cidade de origem. Essa informação é relevante para que a pessoa viajante possa avisar aos familiares a que horas elas podem tentar contactar a pessoa viajante.

        ⚠️🔴**DICA: use as classes `LocalDateTime`, `ZoneId`, `ZonedDateTime` e `DateTimeFormatter` do pacote `java.time` para manipular a data e a hora, os fusos horários e os formatos da data e hora, respectivamente. O método estático `getAvailableZoneIds` da classe `ZoneId` retorna um objeto do tipo `Set`, que contém todos os fusos horários suportados pelo pacote `java.util`. Você pode converter esse objeto do tipo `Set` em um array de Strings através do método `toArray` da classe `ZoneId`. Ex:** 🔴⚠️ 
        ```java
        String[] fusosHorarios = new String[ZoneId.getAvailableZoneIds().size()];
        ZoneId.getAvailableZoneIds().toArray(fusosHorarios);
        ```
    
- Viagem: essa classe é responsável por concentrar a manipulação entre voo e os horário. Ela utiliza métodos da classe `Tempo` e da classe `Voo` para enviar as informações para o método `main` que está na classe `Principal`.
    - Atributos:
        - `embarque`: esse atributo é privado do tipo String, e é responsável por armazenar a data e a hora do embarque da pessoa usuária do sistema.
        - `origem`: é privado, do tipo String, e é responsável por armazenar a entrada da pessoa usuária com o nome da cidade de origem da viagem.
        - `destino`: é privado, do tipo String, e é responsável por armazenar o nome da cidade de destino da viagem que é entrada pela pessoa usuária.
        - `distanciaKm`: esse atributo é privado, do tipo `double`, e é responsável por armazenar a entrada da pessoa usuária, indicando a distância em quilômetros entre a cidade de origem e a de destino.
        - `voo`: é do privado do tipo `Voo`, e é responsável por chamar os métodos da classe `Voo`.
	
    - Métodos:
        - Construtor: esse método recebe quatro atributos: `String embarque`, `String origem`, `String destino`, `double distanciaKm`, que são usados para inicializar seus atributos respectivamente.
        - `retonarDesembarqueHorarioLocalDestino`: esse método é público e tem retorno do tipo String. Ele é responsável por instanciar um objeto do tipo `Tempo` e usar o método `retonarDesembarqueHorarioLocalDestino` da classe `Tempo` para receber a String que representa a data e a hora local da cidade de destino durante o desembarque da pessoa viajante.
        - `retornarDuracaoVoo`: esse método é público e tem retorno do tipo inteiro. Ele é responsável por usar o atributo `voo` passando o atributo `distanciaKm` para o método `retornarTempoVoo` da classe `Voo` que retorna um valor do tipo inteiro representando a duração do voo em horas.
        - `retornarInformacaoViagem`: é público e retorna um valor do tipo String que é o resumo da viagem, assim como foi determinado pela empresa aérea. 

- Voo: essa classe é responsável por manipular os métodos relacioandos ao voo.
    - Atributos:
        - `tempoVoo`: esse atributo é privado e do tipo inteiro, usado para armazenar o tempo do voo em horas.
	
    - Métodos:
        - `retornarTempoVoo`: esse método é público e retorna um valor do tipo inteiro que representa a duração do voo em horas. Ele recebe um atributo do tipo `double`, que representa a distância em quilômetros entre a cidade de origem e a cidade de destino. Para esse cálculo, considere que um avião comercial em velocidade de cruzeiro percorre 700 quilômetros por hora. Por exemplo, se a distância entre a cidade de origem e a de destindo é de 8.000 quilômetros, considerando que a velocidade média do avião é de 700 quilômetros por hora, o voo teria duração de 11,4 horas, e esse método deverá retornar o valor 11 (o arrendondamento ocorre porque o retorno é do tipo inteiro).
        - `retornarInformacaoVoo`: esse método é público e tem retorno do tipo String que representa o resumo das informações sobre o voo. Ele recebe quatro argumentos: `String embarque`, `String origem`, `String desembarque`, `String destino`, e os utiliza para formar uma String com o resumo do voo.


## Exemplo

Vamos ver como seria a saída do nosso console depois de uma interação com o nosso sistema de planejamento de viagens. Aqui estamos considerando que a cidade de origem é Recife, que a cidade de destindo é Tokyo, que o embarque do nosso voo será em 22/01/2022 às 18:30:00, e que a distância entre Recife e Tokyo é 16.885 km (busquei essa informação no Google). Com essas informações, a saída no nosso console seria:
```
---------------------------- Bem-vindo ao sistema de planejamento de viagem ----------------------------
	1) Planejar uma nova viagem
	2) Encerrar Sistema

Entre com a opção desejada: 1
Entre com o nome da cidade origem: Recife
Entre com o nome da cidade destino: Tokyo
Entre com a data e o horário da partida (formato: dd/mm/aaaa hh:mm:ss): 22/01/2022 18:30:00
Entre com a distância em km entre a cidade de origem e a de destino: 16.885


---------------------------- Resumo da Viagem ----------------------------
Partida: 22/01/2022 18:30:00
Origem: Recife

Chegada: 24/01/2022 06:30:00
Destino: Tokyo

Atenção: o desembarque em Tokyo será: 24/01/2022 06:30:00 no horário de Tokyo e 23/01/2022 18:30:00 no horário de Recife
--------------------------------------------------------------------------


	1) Planejar uma nova viagem
	2) Encerrar Sistema

Entre com a opção desejada: 
```
Note que, considerando que o avião percorre 700 quilômetros por hora e que a distância entre Recife e Tokyo é de 16.885 quilômetros, a duração arrendondada para um inteiro do voo é 24 horas. Veja também que, com esse sistema, as pessoas viajantes terão informações mais precisas, o que ajudará muito no seu planejamento, e também para elas informarem seus familiares, que poderão ficar menos preocupados.
