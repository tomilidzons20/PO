import java.util.ArrayList;

public class c5zad1{

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i = 0; i < a.size(); i++){
            c.add(a.get(i));
        }
        for(int i = 0; i < b.size(); i++){
            c.add(b.get(i));
        }
        return c;
    }
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        System.out.println(append(a,b));
    }
}