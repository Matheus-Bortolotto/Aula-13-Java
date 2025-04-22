package org.example;

public class Metro extends TransporteUrbano {
    public Metro(int capacidade) {
        super("Metrô", capacidade);
    }

    @Override
    public void mover() {
        System.out.println("O metrô está se movendo pelos trilhos.");
    }

    @Override
    public double calcularCustoViagem() {
        return 3.0;
    }
}
