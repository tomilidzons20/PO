package cwiczenia7;

public class TestNazwanyPunkt{
    public static void main(String[] args){
        // NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        // a.show();

        // Punkt b = new Punkt(3, 5);
        // b.show();

        // Punkt c = new NazwanyPunkt(3, 6, "tawerna");
        // c.show();

        // a = b;                 --- powoduje błąd kompilacji  (dlaczego ?)
        // a = (NazwanyPunkt) b;     --- powoduje błąd wykonania   (dlaczego ?)

        // a = c;                 --- powoduje błąd kompilacji  (dlaczego ?)

        // a = (NazwanyPunkt) c;
        // a.show();

        // Adres d = new Adres("bagienna", 41, 2, "bagno", 125);
        // Adres e = new Adres("bagienna", 42, 2, "bagno", 128);
        // d.pokaz();
        // e.pokaz();
        // System.out.println(d.przed(e));

        // Osoba f = new Student("Pie", 2000, "informatyka");
        // System.out.println(f);
        // Osoba g = new Nauczyciel("Mie", 1992, 5000);
        // System.out.println(g);

        BetterRectangle h = new BetterRectangle(3, 4);
        System.out.println(h.getArea() + ", " + h.getPeremiter());
    }
}
