package cwiczenia13;

public class TestStudent {
    public static void main(String[] args) {
        Dict1 dziennik = new Dict1();
        Student a = new Student("marian", "paz");
        Student b = new Student("arnold", "bo");
        Student c = new Student("tadeusz", "nor");
        Student d = new Student("karol", "kra");
        dziennik.dodaj(a, "bdb");
        dziennik.dodaj(b, "db");
        dziennik.dodaj(c, "dos");
        dziennik.dodaj(d, "zal");
        dziennik.zmiana(2, "bdb");
        dziennik.usun(3);
        System.out.println(dziennik);
    }
}
