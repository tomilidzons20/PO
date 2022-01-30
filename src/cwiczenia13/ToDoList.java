package cwiczenia13;

import java.util.PriorityQueue;

public class ToDoList {

    public ToDoList() {
        this.lista = new PriorityQueue<>();
    }

    public void dodaj(int priorytet, String opis){
        lista.add(new Task(priorytet, opis));
    }

    public Task nastepne(){
        return lista.poll();
    }

    public void zakoncz(){
        lista.clear();
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "lista=" + lista +
                '}';
    }

    private PriorityQueue<Task> lista;
}
