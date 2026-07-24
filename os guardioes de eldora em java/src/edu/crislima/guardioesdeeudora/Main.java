package edu.crislima.guardioesdeeudora;

import edu.crislima.guardioesdeeudora.personagens.Personagem;

public class Main {
    public static void main(String[] args) {

        Personagem heroi1 = new Personagem("Arthemis", "arqueira", 5,80,12.5);

        heroi1.exibirInfoPersonagem();
    }
}