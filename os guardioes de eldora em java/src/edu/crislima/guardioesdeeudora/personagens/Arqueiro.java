package edu.crislima.guardioesdeeudora.personagens;

import edu.crislima.guardioesdeeudora.enums.ClassePersonagem;

public class Arqueiro extends Personagem{
    public Arqueiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, ClassePersonagem.ARQUEIRO, nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + "usa flechas incendiarias teleguiadas ");
    }
}
