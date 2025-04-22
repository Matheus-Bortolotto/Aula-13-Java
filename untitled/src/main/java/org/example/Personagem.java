package org.example;

public abstract class Personagem {
    protected String nome;
    protected int vida;

    public Personagem(String nome, int vidda){
        this.nome  =  nome;
        this.vida = vidda;
    }

    public void mover(){
        System.out.println(nome + "está se movendo...");
    }

    public abstract void atacar();
}
