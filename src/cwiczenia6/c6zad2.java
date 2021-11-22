public class c6zad2 {
    public static void main(String[] args){
        IntegerSet tab1 = new IntegerSet();
        IntegerSet tab2 = new IntegerSet();
        tab1.insertElement(3);
        tab1.insertElement(4);
        tab1.insertElement(7);
        tab2.insertElement(3);
        tab2.insertElement(4);
        tab2.insertElement(7);
        System.out.println(tab1.toString());
        System.out.println(tab2.toString());
        tab1.deleteElement(4);
        System.out.println(tab1.toString());
        System.out.println(IntegerSet.union(tab1, tab2).toString());
        System.out.println(IntegerSet.intersection(tab1, tab2).toString());
    }
}
