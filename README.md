# Desafio Santander 2026 - AI Java Back-end

### O que o projeto faz;
- Esse é um fork do projeto dado como exemplo, basicamente tem uma nova funcionalidade que é consultar gastos por período.
### Como executar a aplicação;
- Mesmo formato da aplicação padrão
### Qual melhoria você implementou;
- Foram implementadas as seguintes melhorias:
1. [Correção do bug de conversão do valor na criação de transações](https://github.com/EullerLisowski/dio-spring-boot-learning-track/issues/1)
2. [Implementação da consulta de gastos por período](https://github.com/EullerLisowski/dio-spring-boot-learning-track/issues/2)

### Quais tecnologias foram usadas;
- Segui com as tecnologias do projeto base Spring Boot, Spring AI, JPA e Docker.
### Como testar o fluxo principal;
- Na raiz da pasta 05-spring-ai executar `./gradlew bootRun`
- Com o terminal na pasta `src/test/resources/audio` executar no powershell `curl.exe -X POST "http://localhost:8080/transactions/ai" -H "Content-Type: multipart/form-data;" -F "file=@recording-11.m4a" --output="audio.mp3"`

### O que você aprendeu durante o desafio.
- Durante o desafio eu entendi melhor o uso do padrão de UseCases.
- Por estar em um ambiente um pouco diferente do que o professor usou, tive que procurar outras ferramentas para testar meu projeto, como configuração do docker local, uso do curl para fazer a requisição multipart-form.
- Tive o primeiro contato com o Spring AI, configuração de @Tools, o "cadastro" das mesmas no ChatClient e foi diferente resolver um bug ajustando um prompt invés de métodos/lógica no código.
- Tive contato com o JPA o que ele faz para inferir métodos e o que fazer quando o objetivo não é auto gerado por ele.
- Aprendi mais sobre a injeção de dependências do spring.

