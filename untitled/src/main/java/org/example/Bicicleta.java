package org.example;

public class Bicicleta extends TransporteUrbano implements MeioEcologico {
    public Bicicleta() {
        super("Bicicleta", 1);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está sendo pedalada pelas ruas.");
    }

    @Override
    public boolean ehEcologico() {
        return true;
    }

    @Override
    public double calcularCustoViagem() {
        return 0.0;
    }
}