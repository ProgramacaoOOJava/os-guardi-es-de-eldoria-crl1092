
package edu.crislima.guardioesdeeudora.enums;

public enum ClassePersonagem {
    GUERREIRO("Guerreiro"),
    MAGO("Mago"),
    ARQUEIRO("Arqueiro");
    private final String descricao;
    ClassePersonagem(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
