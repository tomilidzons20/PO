import java.util.ArrayList;
import java.util.Collections;

public class c5zad3 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>();
        if(a.size() == b.size()){
            for(int i = 0; i < a.size(); i++){
                c.add(a.get(i));
                c.add(b.get(i));
            }
        }
        else if(a.size() > b.size()){
            for(int i = 0; i < b.size(); i++){
                c.add(a.get(i));
                c.add(b.get(i));
            }
            for(int i = b.size(); i < a.size(); i++){
                c.add(a.get(i));
            }
        }
        else if(a.size() < b.size()){
            for(int i = 0; i < a.size(); i++){
                c.add(a.get(i));
                c.add(b.get(i));
            }
            for(int i = a.size(); i < b.size(); i++){
                c.add(b.get(i));
            }
        }
        Collections.sort(c);
        return c;
    }
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(1);
        a.add(4);
        a.add(2);
        a.add(9);
        a.add(4);
        a.add(1);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);
        b.add(2);
        b.add(9);
        b.add(4);
        b.add(1);
        Collections.sort(a);
        Collections.sort(b);
        System.out.println(mergeSorted(a, b));
    }
}
