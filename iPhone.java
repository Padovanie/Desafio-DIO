import Apps.AparelhoEletronico;
import Apps.NavegadorInternet;
import Apps.ReprodutorMusical;
public class iPhone implements AparelhoEletronico, NavegadorInternet, ReprodutorMusical {
    public void tocar(){
        System.out.println("Tocando a música...");
    }
    public void pausar(){
        System.out.println("Música pausada.");
    }
    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }

    public void exibirPagina(String url){
        System.out.println("Entrando no site: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando aba.");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a página");
    }
    public void ligar(String numero){
        System.out.println("Ligando para: " + numero);
    }
    public void atender(){
        System.out.println("Chamada atendida");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Chamada não atendida. Iniciando correio de voz...");
    }
    public static void main(String[] args){
        iPhone iphone = new iPhone();
        iphone.selecionarMusica("My Girl - Rolling Stones");
        iphone.tocar();
        iphone.pausar();
        iphone.ligar("11 9 12345678");
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("web.dio.me");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        iphone.atender();

    }
}
