package cwiczenia8;
import java.util.ArrayList;
import java.time.LocalDate;

public class TestInstrumenty {
    public static void main(String[] args)
    {
        ArrayList<Instrument> instrumenty = new ArrayList<Instrument>();
        Flet i1 = new Flet("bose", LocalDate.now());
        Skrzypce i2 = new Skrzypce("bose1", LocalDate.now());
        Fortepian i3 = new Fortepian("bose2", LocalDate.now());
        Flet i4 = new Flet("bose3", LocalDate.now());
        Flet i5 = new Flet("bose4", LocalDate.now());
        instrumenty.add(i1);
        instrumenty.add(i2);
        instrumenty.add(i3);
        instrumenty.add(i4);
        instrumenty.add(i5);
        for(int i = 0; i < instrumenty.size(); i++){
            Instrument a = instrumenty.get(i);
            System.out.println(a.dzwiek());
        }
        System.out.println(instrumenty);
    }
}
