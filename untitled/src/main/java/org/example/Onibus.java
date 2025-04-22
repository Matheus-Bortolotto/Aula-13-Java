package org.example;

public class Onibus extends TransporteUrbano {
    public Onibus(int capacidade) {
        super("Ônibus", capacidade);
    }

    @Override
    public void mover() {
        System.out.println("O ônibus está se movendo pelas ruas.");
    }

    @Override
    public double calcularCustoViagem() {
        return 2.5;
    }
}
