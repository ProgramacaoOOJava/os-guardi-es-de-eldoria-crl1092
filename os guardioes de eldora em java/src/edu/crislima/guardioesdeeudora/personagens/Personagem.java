package edu.crislima.guardioesdeeudora.personagens;

public class Personagem {
    String nome;
    String classe;
    int nivelPersonagem;
    int pontosDeVida;
    double poderBase;

    //construtor
    public Personagem(String nome, String classe, int nivelPersonagem, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivelPersonagem = nivelPersonagem;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    //Metodo para exibir as informações dos pesonagem
    public void exibirInfoPersonagem(){
        System.out.println("----- Exibindo personagem ----- " );
        System.out.println("Nome do personagem: " + nome);
        System.out.println("Classe do personagem: " + classe);
        System.out.println("Nivel do Personagem: " + nivelPersonagem);
        System.out.println("Pontos de vida do personagem: " + pontosDeVida);
        System.out.println("Poder Base do personagwm: " + poderBase);
    }
}
