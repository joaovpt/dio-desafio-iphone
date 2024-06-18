package funcoes;

public class Phone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + ".");
    }
    
    @Override
    public void atender() {
        System.out.println("Atender ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Mostrando página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
