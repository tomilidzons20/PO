package cwiczenia8;
import java.time.LocalDate;

public class TestOsoba {
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];
        String[] imiona = {"Jan", "Maciej"};
        ludzie[0] = new Pracownik("Kowalski", imiona, LocalDate.now(), true, 50000, LocalDate.now());
        ludzie[1] = new Student("Nowak", imiona, LocalDate.now(), true, "informatyka", 4.5);

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ", " + p.getImiona() + ", " + p.getDataUrodzenia() + ", " + p.getPlec() + ", " + p.getOpis());
        }
    }
}
