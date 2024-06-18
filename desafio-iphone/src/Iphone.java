import funcoes.Phone;

public class Iphone {
    public static void main(String[] args) {
        Phone iphone15 = new Phone();
        
        //Exemplos
        //Testando Reprodutor Musical
        System.out.println("Testando ReprodutorMusical:");
        iphone15.selecionarMusica("It's Ok - Tom Rosenthal");
        iphone15.tocar();
        iphone15.pausar();

        //Testando Aparelho Telefônico
        System.out.println("\nTestando AparelhoTelefonico:");
        iphone15.ligar("912345678");
        iphone15.atender();
        iphone15.iniciarCorreioVoz();

        //Testanto Navegador na Internet
        System.out.println("\nTestando NavegadorInternet:");
        iphone15.exibirPagina("https://web.dio.me/");
        iphone15.adicionarNovaAba();
        iphone15.atualizarPagina();
    }
}
