# 📱 Desafio iPhone
Este projeto é uma representação das funcionalidades do iPhone de 2007, modelado e implementado em Java com base no [vídeo de lançamento](https://www.youtube.com/watch?v=9ou608QQRq8). O objetivo é demonstrar como o iPhone pode atuar como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet, utilizando conceitos de Programação Orientada a Objetos e Interfaces.

# 📊 Diagrama de Classes
<p align="center">
  <img src="diagrama-uml/Diagrama-desafio-iphone.PNG" alt="diagrama de classes">
</p>

Diagrama feito no [Astah UML](https://astah.net/).

# ⚙ Funcionalidades

Nesta seção irá apresentar uma breve descrição das funcionalidades.
### Reprodutor Musical
- `tocar()`: Reproduz uma música.
- `pausar()`: Pausa a música que está tocando.
- `selecionarMusica(String musica)`: Seleciona uma música específica para tocar.

### Aparelho Telefônico
- `ligar(String numero)`: Realiza uma chamada para o número especificado.
- `atender()`: Atende uma chamada.
- `iniciarCorreioVoz()`: Inicia o correio de voz.

### Navegador na Internet
- `exibirPagina(String url)`: Exibe a página web especificada pela URL.
- `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página atual do navegador.

### Estrutura do Projeto

- ReprodutorMusical: Interface que define os métodos relacionados à reprodução de música.
- AparelhoTelefonico: Interface que define os métodos relacionados ao uso telefônico.
- NavegadorNaInternet: Interface que define os métodos relacionados à navegação na internet.
- Phone: Classe que implementa todas as interfaces acima, representando um iPhone com todas as suas funcionalidades.
- Iphone: Classe principal para testar as funcionalidades implementadas na classe iPhone.

# 💡 Como Executar

Clone o repositório:
```bash
git clone https://github.com/joaovpt/dio-desafio-iphone
```
Após fazer o clone, abra sua IDE preferida e explore o código-fonte e o diagrama para entender como eles estão relacionados.

Caso queira olhar o enunciado do desafio, [clique aqui](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/poo).





