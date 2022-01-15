package cwiczenia8;
import java.time.LocalDate;

class Skrzypce extends Instrument{
    public Skrzypce(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    public String dzwiek(){
        return "skrr skrr";
    }
}