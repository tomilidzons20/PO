package cwiczenia11;

import java.util.ArrayList;
import java.lang.Comparable;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Collections;

public class ArrayUtil{
    public static void main(String[] args){
        ArrayList<Integer> t1 = new ArrayList<>();
        t1.add(1);
        t1.add(2);
        t1.add(3);
        t1.add(4);
        t1.add(7);
        t1.add(8);
        t1.add(9);
//        System.out.println(isSorted(t1));
        System.out.println(binSearch(t1, 5));
        ArrayList<LocalDate> t2 = new ArrayList<>();
        t2.add(LocalDate.of(2000, 10, 15));
        t2.add(LocalDate.of(2005, 10, 15));
        t2.add(LocalDate.of(2005, 8, 15));
        t2.add(LocalDate.now());
        System.out.println(binSearch(t2, LocalDate.now()));
        ArrayList<Integer> t3 = new ArrayList<>();
        t3.add(5);
        t3.add(7);
        t3.add(3);
        t3.add(0);
        t3.add(1);
        selectionSort(t3);
        System.out.println(t3);
        selectionSort(t2);
        System.out.println(isSorted(t2));
    }

    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> lista){
        Iterator<T> iter = lista.iterator();
        T el = iter.next();
        while(iter.hasNext()){
            T el2 = iter.next();
//            System.out.println(el + " <-> " + el2 + " cmp: " + el.compareTo(el2));
            if(el.compareTo(el2) > 0) {
                return false;
            }
            el = el2;
        }
        return true;
    }

    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T obj){
        int res = Collections.binarySearch(tab, obj);
        if(res < 0){
            return -1;
        }
        return res;
    }

    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab){
        for(int i = 0; i < tab.size(); i++){
            int mindex = i;
            for(int j = i + 1; j < tab.size(); j++){
                if(tab.get(j).compareTo(tab.get(mindex)) < 0) {
                    mindex = j;
                }
            }
        T tym = tab.get(i);
        tab.set(i, tab.get(mindex));
        tab.set(mindex, tym);
        }
    }
}
