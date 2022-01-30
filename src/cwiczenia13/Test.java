package cwiczenia13;

public class Test {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        list.dodaj(1, "jeden");
        list.dodaj(2, "dwa");
        list.dodaj(5, "piec");
        list.dodaj(4, "cztery");
        list.dodaj(3, "trzy");
        System.out.println(list.nastepne());
        System.out.println(list);
    }
}
