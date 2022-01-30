package cwiczenia13;

public class Task implements Comparable<Task>{

    public Task(int priorytet, String opis) {
        this.opis = opis;
        this.priorytet = priorytet;
    }

    @Override
    public int compareTo(Task o) {
        if(priorytet < o.priorytet){
            return -1;
        }
        if(priorytet > o.priorytet){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Task{" +
                "opis='" + opis + '\'' +
                ", priorytet=" + priorytet +
                '}';
    }

    public String opis;
    public int priorytet;
}
