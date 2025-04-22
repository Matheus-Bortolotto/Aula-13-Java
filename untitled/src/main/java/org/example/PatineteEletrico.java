package org.example;

public class PatineteEletrico extends TransporteUrbano implements MeioEcologico {
    public PatineteEletrico() {
        super("Patinete Elétrico", 1);
    }

    @Override
    public void mover() {
        System.out.println("O patinete elétrico está se movendo.");
    }

    @Override
    public boolean ehEcologico() {
        return true;
    }

    @Override
    public double calcularCustoViagem() {
        return 1.5;
    }
}
