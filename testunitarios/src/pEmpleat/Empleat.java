package pEmpleat;

public class Empleat {
    public double calculaSalariBrut(String tipusEmpleat, double vendesMes, int horesExtra) {
        if (tipusEmpleat == null || (!tipusEmpleat.equals("venedor") && !tipusEmpleat.equals("encarregat"))) {
            try {
                throw new Exception("El tipus d'empleat no és correcte");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        if (vendesMes < 0 || horesExtra < 0) {
            try {
                throw new Exception("El valor no pot ser negatiu");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        double salariBase = (tipusEmpleat.equals("venedor")) ? 1000 : 1500;
        double prima = (vendesMes >= 2500) ? 200 : (vendesMes >= 1000) ? 100 : 0;
        double salariBrut = salariBase + prima + (horesExtra * 18.57);
        return salariBrut;
    }

    public double calculaSalariNet(double salariBrut) {
        if (salariBrut < 0) {
            try {
                throw new Exception("El valor no pot ser negatiu");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        double retencio;
        if (salariBrut <= 999) {
            retencio = 0;
        } else if (salariBrut <= 1500) {
            retencio = 0.16;
        } else {
            retencio = 0.20;
        }

        return salariBrut * (1 - retencio);
    }
}
