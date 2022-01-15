package cwiczenia5;

import java.util.ArrayList;

public class c5zad2 {

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
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
        return c;
    }
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(9);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(2);
        b.add(4);
        b.add(6);
        b.add(8);
        b.add(10);
        System.out.println(merge(a, b));
    }
}
