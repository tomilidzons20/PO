public class RachunekBankowy {

    static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldo){
        this.saldo = saldo;
    }

    public double obliczMiesieczneOdsetki(){
        double odsetki = (saldo * rocznaStopaProcentowa) / 12;
        saldo += odsetki;
        return odsetki;
    }

    public static void setRocznaStopaProcentowa(double procent){
        rocznaStopaProcentowa = procent;
    }

}
