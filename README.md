### Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes do Código de Ética e Conduta e do Manual da Pessoa Estudante da Trybe.

---

# Boas vindas ao repositório do desafio da Aceleração Java!

Você já usa o GitHub diariamente para desenvolver os exercícios, certo? Agora, para desenvolver o desafio, você deverá seguir as instruções a seguir. Fique atento a cada passo, e se tiver qualquer dúvida, nos envie por _Slack_! #vqv 🚀

Aqui você vai encontrar os detalhes de como estruturar o desenvolvimento do seu desafio a partir deste repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

---
# Instruções para entregar seu projeto

## Não se esqueça de consultar as documentações!

⚠️ **Importante**:

Esse projeto tem como intuito te treinar para ter mais familiaridade com a documentação de aplicações, por tanto, poderão haver alguns comandos ou atributos que não estão no curso, mas que devem ser descritos no decorrer dos requisitos.

Nesses casos, é importante se atentar a aquilo que o requisito pede, e lembrar sempre de utilizar a [documentação oficial](https://docs.oracle.com/en/java/javase/11/) do Java para pesquisar detalhes sobre comandos.


## Antes de começar a desenvolver

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://course.betrybe.com/intro/git/) sempre que precisar!

1. Clone o repositório
  * Por exemplo: `git clone git@github.com:tryber/desafio-aceleracao.git`
  * Entre no diretório do repositório que você acabou de clonar:
    * neste caso `cd desafio-aceleracao`

2. Instale as dependências:
    * `mvn install`

3. Crie uma branch a partir da branch `main`

  * Verifique que você está na branch `main`
    * Exemplo: `git branch`
  * Se não estiver, mude para a branch `main`
    * Exemplo: `git checkout main`
  * Agora, crie uma branch onde você vai guardar os commits do seu desafio
    * Você deve criar uma branch no seguinte formato: `nome-de-usuario-nome-do-desafio`
    * Exemplo:
      * `git checkout -b joaozinho-acc-java-sample`

4. Adicione a sua branch com o novo `commit` ao repositório remoto

  - Usando o exemplo anterior:
    - `git push -u origin joaozinho-acc-java-sample`

5. Crie um novo `Pull Request` _(PR)_
  * Vá até a aba de _Pull Requests_ deste repositório no GitHub
  * Clique no botão verde _"New pull request"_
  * Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
  * Clique no botão verde _"Create pull request"_
  * Adicione uma descrição para o _Pull Request_ e clique no botão verde _"Create pull request"_
  * **Não se preocupe em preencher mais nada por enquanto!**
  * Volte até a página de _Pull Requests_ do repositório e confira que o seu _Pull Request_ está criado
 
 ⚠️ **Lembre-se do CheckStyle! Deixe seu Eclipse configurado para arrumar o estilo automaticamente. Qualquer dúvida, volte no conteúdo.**

---

## Durante o desenvolvimento

* ⚠ **PULL REQUESTS COM ISSUES NO CHECKSTYLE NÃO SERÃO AVALIADAS, ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠

* Faça `commits` das alterações que você fizer no código regularmente

* Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto

* Os comandos que você utilizará com mais frequência são:
  1. `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_
  2. `git add` _(para adicionar arquivos ao stage do Git)_
  3. `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_
  4. `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_
  5. `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_

---

## Depois de terminar o desenvolvimento (opcional)

Para **"entregar"** seu projeto, siga os passos a seguir:

* Vá até a página **DO SEU** _Pull Request_, adicione a label de _"code-review"_ e marque seus colegas
  * No menu à direita, clique no _link_ **"Labels"** e escolha a _label_ **code-review**
  * No menu à direita, clique no _link_ **"Assignees"** e escolha **o seu usuário**
  * No menu à direita, clique no _link_ **"Reviewers"** e digite `students`, selecione o time `tryber/students-sd-0x`

Se ainda houver alguma dúvida sobre como entregar seu projeto, [aqui tem um video explicativo](https://vimeo.com/362189205).

---

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

Para te dar uma ajudinha neste desafio, vamos implementar agora a classe `Principal` com o método `main` para incializar nosso sistema.
```java
package com.trybe.planejamentoviagem;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int op;
		
		System.out.println("---------------------------- Bem-vindo ao sistema de planejamento de viagem ----------------------------");		
		
		do {
			System.out.println("	1) Planejar uma nova viagem");
			System.out.println("	2) Encerrar Sistema");
			System.out.println();
			System.out.print("Entre com a opção desejada: ");
			op = scanner.nextInt();
			scanner.nextLine();
			
			if(op == 1) {
				System.out.print("Entre com o nome da cidade origem: ");
				String origem = scanner.nextLine();
				System.out.print("Entre com o nome da cidade destino: ");
				String destino = scanner.nextLine();
				System.out.print("Entre com a data e o horário da partida (formato: dd/mm/aaaa hh:mm:ss): ");
				String partida = scanner.nextLine();
				System.out.print("Entre com a distância em km entre a cidade de origem e a de destino: ");
				Double distanciaKm = scanner.nextDouble();
				
				Viagem viagem = new Viagem(partida, origem, destino, distanciaKm);
		
				System.out.println("\n\n---------------------------- Resumo da Viagem ----------------------------");
				System.out.println(viagem.retornarInformacaoViagem());
				System.out.println("--------------------------------------------------------------------------\n\n");
				
			} else if(op == 2) {
				System.out.println("Encerrando o sistema...");
				break;
			} else {
				System.out.println("Opção inválida, tente novamente!");
			}
			
		} while(true);
		
		System.out.println("Sistema Encerrado!");
		scanner.close();
	}
    
}
```
Iniciamos nosso método `main` com a declaração do nosso `scanner` da classe `Scanner`, pois assim a pessoa usuária poderá inserir entradas no nosso sistema. Também declaramos uma variável para armazenar a opção escolhida no menu pela pessoa usuária. Depois disso, montamos um menuzinho bem legal para aparecer de uma forma agradável no console do Java.

Colocamos nosso código dentro de um laço infinito para poder ficar interagindo com o sistema até cansarmos. Após a pessoa usuária inserir a opção desejada, usamos os blocos condicionais para implementar o que cada opção vai gerar. No primeiro bloco condicional, que representa a opção 1, pedimos para que a pessoa usuária entre com o nome da cidade de origem, depois a de destino, a data e hora da partida e a distância em quilômetros entre cidade de origem e destino. Depois disso, instanciamos um objeto do tipo da classe `Viagem`, passando as informações para seu construtor, e chamamos o método `retornarInformacaoViagem`, que retorna uma String representando o resumo da viagem.

Muito legal, né? Agora você já tem a primeira classe desse desafio, pode começar a implementar as outras! #VQV 

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

Tá vendo como um sistema desenvolvido por você pode diminuir as dores de cabeça e preocupações de várias pessoas e famílias? Mãos à obra! Aperte o cinto e #VQV 💺


---

# Avisos Finais

Ao finalizar e submeter o desafio, não se esqueça de avaliar sua experiência preenchendo o formulário. Leva menos de 3 minutos!

Link: [Formulário](https://be-trybe.typeform.com/to/PsefzL2e)

O avaliador automático não necessariamente avalia seu projeto na ordem em que os requisitos aparecem no readme. Isso acontece para deixar o processo de avaliação mais rápido. Então, não se assuste se isso acontecer, ok?

---
