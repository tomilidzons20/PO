package cwiczenia10;
import java.util.ArrayList;
import java.time.LocalDate;

public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ArrayList<Student> osoby = new ArrayList<Student>();
        Student i1 = new Student("baran", LocalDate.now(), 3);
        Student i2 = new Student("owca", LocalDate.now(), 4.5);
        Student i3 = new Student("ja", LocalDate.of(2000, 11, 3), 5);
        Student i4 = (Student)i2.clone();
        i4.setNazwisko("zuk");
        Student i5 = (Student)i1.clone();
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
        System.out.println(osoby.get(0).compareTo(osoby.get(0)));
    }
}
