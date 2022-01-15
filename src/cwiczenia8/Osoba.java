package cwiczenia8;
import java.time.LocalDate;

abstract class Osoba
{
    public Osoba(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String getPlec()
    {
        if(plec){
            return "M";
        }
        return "K";
    }

    public String getImiona()
    {
        String im = "";
        for(int i = 0; i < imiona.length; i++){
            im += imiona[i] + " ";
        }
        return im;
    }
    
    public LocalDate getDataUrodzenia()
    {
        return dataUrodzenia;
    }

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;
}
