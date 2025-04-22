package org.example;

public class SistemaTransporteUrbano {
    public static void main(String[] args) {

        TransporteUrbano onibus = new Onibus(50);
        TransporteUrbano metro = new Metro(200);
        TransporteUrbano bicicleta = new Bicicleta();
        TransporteUrbano patinete = new PatineteEletrico();

        TransporteUrbano[] transportes = {onibus, metro, bicicleta, patinete};

        for (TransporteUrbano transporte : transportes) {
            transporte.exibirInfo();
            transporte.mover();
            System.out.println("Custo da viagem: R$ " + transporte.calcularCustoViagem());

            if (transporte instanceof MeioEcologico) {
                if (((MeioEcologico) transporte).ehEcologico()) {
                    System.out.println("Este transporte é ecológico.");
                } else {
                    System.out.println("Este transporte não é ecológico.");
                }
            }

            System.out.println();
        }
    }
}