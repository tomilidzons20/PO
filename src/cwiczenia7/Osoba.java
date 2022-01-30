package cwiczenia7;

class Osoba {
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String toString(){
        return nazwisko + ", " + rokUrodzenia;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public int getRokUrodzenia(){
        return rokUrodzenia;
    }
}

class Student extends Osoba{
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek){
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek(){
        return kierunek;
    }

    @Override
    public String toString(){
        return getNazwisko() + ", " + getKierunek() + ", " + kierunek;
    }
}

class Nauczyciel extends Osoba{
    private float pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, float pensja){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public float getPensja(){
        return pensja;
    }

    @Override
    public String toString(){
        return getNazwisko() + ", " + pensja + ", " + getRokUrodzenia();
    }
}
