package edu.crislima.guardioesdeeudora.personagens;

import edu.crislima.guardioesdeeudora.enums.ClassePersonagem;

public class Guerreiro extends Personagem{
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, ClassePersonagem.GUERREIRO, nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " ataca com Golpe de Espada Devastador!");
    }
}
