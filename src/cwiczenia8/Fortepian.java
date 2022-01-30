package cwiczenia8;
import java.time.LocalDate;

class Fortepian extends Instrument{
    public Fortepian(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek(){
        return "piu piu";
    }
}
