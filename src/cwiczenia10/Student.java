package cwiczenia10;

import java.time.LocalDate;

public class Student extends Osoba{
    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen){
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public int compareTo(Student s){
        int test = super.compareTo(s);
        if(sredniaOcen == s.sredniaOcen){
            if(test == 1){
                return 1;
            }
        }
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Student st = (Student)super.clone();
        return st;
    }

    public double show(){
        return sredniaOcen;
    }
}
