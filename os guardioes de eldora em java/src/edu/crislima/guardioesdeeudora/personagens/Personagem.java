package edu.crislima.guardioesdeeudora.personagens;

import edu.crislima.guardioesdeeudora.enums.ClassePersonagem;

public abstract class Personagem {
    private String nome;
    private ClassePersonagem classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(ClassePersonagem classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    public void setPoderBase(double poderBase) {
        this.poderBase = poderBase;
    }

    //construtor
    public Personagem(String nome, ClassePersonagem classe, int nivel, int pontosDeVida, double poderBase) {
        this.setNome(nome);
        this.setClasse(classe);
        this.setNivel(nivel);
        this.setPontosDeVida(pontosDeVida);
        this.setPoderBase(poderBase);
    }

    //Metodo para exibir as informações dos pesonagem
    public void exibirStatus(){
        System.out.println("\n----- Exibindo personagem ----- \n" );
        System.out.println("Nome do personagem: " + getNome());
        System.out.println("Classe do personagem: " + classe.getDescricao());
        System.out.println("Nivel do Personagem: " + getNivel());
        System.out.println("Pontos de vida do personagem: " + getPontosDeVida());
        System.out.println("Poder Base do personagem: " + getPoderBase());
    }

    abstract public void usarHabilidadeEspecial();
}
