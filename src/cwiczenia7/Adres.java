package cwiczenia7;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private int kod_pocztowy;

    public Adres(String ulica, int numer_domu, String miasto, int kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, int kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(){
        System.out.println(kod_pocztowy + ", " + miasto);
        System.out.println(ulica + ", " + numer_domu + ", " + numer_mieszkania);
    }

    public boolean przed(Adres adres){
        if(kod_pocztowy < adres.kod_pocztowy){
            return true;
        }
        return false;
    }
}
