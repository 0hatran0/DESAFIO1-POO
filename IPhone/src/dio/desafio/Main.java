package dio.desafio;

import dio.desafio.inovacao.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("\nAparelho Telefonico");
        iphone.ligar("+55 (48) 98989-8989");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nNavegador de Internet");
        iphone.exibirPagina("https://github.com/0hatran0/DESAFIO1-POO.git");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("\nReprodutor Musical");
        iphone.selecionarMusica("Me & You");
        iphone.tocar();
        iphone.pausar();
    }
}