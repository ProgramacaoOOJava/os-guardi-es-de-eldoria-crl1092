package edu.crislima.guardioesdeeudora.personagens;

import edu.crislima.guardioesdeeudora.enums.ClassePersonagem;

public class Mago extends Personagem{
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, ClassePersonagem.MAGO, nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " lança Bola de Fogo Arcana!");
    }
}
