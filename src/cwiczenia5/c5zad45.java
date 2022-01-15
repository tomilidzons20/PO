package cwiczenia5;

import java.util.ArrayList;

public class c5zad45 {

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i = a.size() - 1; i >= 0; i--){
            c.add(a.get(i));
        }
        return c;
    }

    public static void reverse(ArrayList<Integer> a){
        for(int i = 0, j = a.size()-1; i <= j; i++, j--){
            int tym = a.get(j);
            a.set(j, a.get(i));
            a.set(i, tym);
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(1);
        a.add(4);
        a.add(4);
        System.out.println(reversed(a));
        reverse(a);
        System.out.println(a);
    }
}
