package cwiczenia13;

import java.lang.Comparable;

public class Student implements Comparable<Student>{

    public Student(String imie, String nazw) {
        this.imie = imie;
        this.nazw = nazw;
        this.id = nid++;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazw() {
        return nazw;
    }

    public void setNazw(String nazw) {
        this.nazw = nazw;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        return nazw.compareTo(o.getNazw());
    }

    @Override
    public String toString() {
        return imie + " " + nazw + " ,id: " + id;
    }

    private String imie;
    private String nazw;
    private final int id;
    private static int nid = 0;
}
