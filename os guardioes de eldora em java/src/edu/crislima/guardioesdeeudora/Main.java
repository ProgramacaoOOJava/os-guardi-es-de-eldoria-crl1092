package edu.crislima.guardioesdeeudora;

import edu.crislima.guardioesdeeudora.personagens.Arqueiro;
import edu.crislima.guardioesdeeudora.personagens.Guerreiro;
import edu.crislima.guardioesdeeudora.personagens.Mago;
import edu.crislima.guardioesdeeudora.personagens.Personagem;

import java.util.ArrayList;

public class Main {
    static void main() {
        //inicialização dos personagens
        ArrayList<Personagem> personagens = new ArrayList<Personagem>();
        personagens.add(new Guerreiro("Ragnar", 8,120,12.5));
        personagens.add(new Arqueiro("Anna", 10,200,22.0));
        personagens.add(new Mago("Athena",30,80,18.9));

        //exibição dos personagens
        for (Personagem personagem : personagens) {
            personagem.usarHabilidadeEspecial();
        }
       
    }
}