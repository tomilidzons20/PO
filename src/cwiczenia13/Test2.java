package cwiczenia13;

public class Test2 {
    public static void main(String[] args) {
        Dict dziennik = new Dict();
        dziennik.dodaj("roman", "bdb");
        dziennik.dodaj("kuba", "db");
        dziennik.dodaj("mati", "zal");
        dziennik.dodaj("graci", "nkw");
        dziennik.zmiana("kuba", "dos");
        dziennik.usun("roman");
        System.out.println(dziennik);
    }
}
