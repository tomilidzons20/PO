package cwiczenia10;
import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public int compareTo(Osoba os){
        if(nazwisko == os.nazwisko){
            if(dataUrodzenia == os.dataUrodzenia){
                return 1;
            }
        }
        return 0;
    }

    public String toString(){
        return this.getClass().getSimpleName() + "[" + nazwisko + ", " + dataUrodzenia + "]";
    }

    public boolean equals(Osoba os){
        if(compareTo(os) == 1){
            return true;
        }
        return false;
    }

    public Object clone() throws CloneNotSupportedException{
        Osoba os = (Osoba)super.clone();
        return os;
    }

    public void setNazwisko(String naz){
        nazwisko = naz;
    }

    public void setDataUrodzenia(LocalDate data){
        dataUrodzenia = data;
    }
}
