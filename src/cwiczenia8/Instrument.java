package cwiczenia8;
import java.time.LocalDate;

abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji){
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public String getProducent(){
        return producent;
    }

    public LocalDate getRokProdukcji(){
        return rokProdukcji;
    }

    public abstract String dzwiek();

    public boolean equals(Instrument instr){
        if(producent == instr.producent && rokProdukcji == instr.rokProdukcji){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return producent + ", rp: " + rokProdukcji + ", dzwiek: "+ dzwiek();
    }
}
