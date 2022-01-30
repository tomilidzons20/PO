package cwiczenia8;
import java.time.LocalDate;

class Flet extends Instrument{
    public Flet(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek(){
        return "fiu fiu";
    }
}
