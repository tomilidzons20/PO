package cwiczenia10;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ArrayList<Osoba> osoby = new ArrayList<Osoba>();
        Osoba i1 = new Osoba("baran", LocalDate.now());
        Osoba i2 = new Osoba("owca", LocalDate.now());
        Osoba i3 = new Osoba("ja", LocalDate.of(2000, 11, 3));
        Osoba i4 = (Osoba)i2.clone();
        i4.setNazwisko("zuk");
        Osoba i5 = (Osoba)i1.clone();
        i5.setDataUrodzenia(LocalDate.now().plusDays(1));
        osoby.add(i1);
        osoby.add(i2);
        osoby.add(i3);
        osoby.add(i4);
        osoby.add(i5);
        for(int i = 0; i < osoby.size(); i++){
            Osoba a = osoby.get(i);
            System.out.println(a);
        }
        System.out.println(osoby.get(0).compareTo(osoby.get(1)));
    }
}
