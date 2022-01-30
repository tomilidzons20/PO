package cwiczenia12;

import java.util.*;

public class zad1 {
    public static void main(String[] args){
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Ala");
        l1.add("ma");
        l1.add("kota");
        l1.add("i");
        l1.add("psa");
        redukuj(l1, 2);
        System.out.println(l1);
        odwroc(l1);
        System.out.println(l1);
        String zdanie = "Baran je koty na złoto. Ogien wojna ludzie.";
        System.out.println(zdanie);
        odwroc_napis(zdanie);
        cyfry(121345);
        pierwsze(100);
        print(l1);
    }

    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        Iterator<T> iter = pracownicy.iterator();
        int help = 0;
        while(iter.hasNext()){
            iter.next();
            help++;
            if(help == n){
                iter.remove();
                help = 0;
            }
        }
    }

    public static <T> void odwroc(LinkedList<T> lista){
        Collections.reverse(lista);
    }

    public static void odwroc_napis(String zdanie){
        Stack<String> stc = new Stack<>();
        String[] tab = zdanie.split("\\p{Punct}");
        for(String e: tab){
            boolean helper = true;
            String[] tab2 = e.split(" ");
            for(String f: tab2) {
                stc.push(f.trim());
            }
            while(!stc.empty()){
                String hlp = stc.pop().toLowerCase();
                if(stc.size() == 0){
                    System.out.print(hlp + ". ");
                }else if(!helper){
                    System.out.print(hlp + " ");
                }else{
                    System.out.print(hlp.substring(0, 1).toUpperCase() + hlp.substring(1) + " ");
                    helper = false;
                }
            }
        }
    }

    public static void cyfry(int n){
        Stack<Integer> stos = new Stack<>();
        while(n != 0){
            int help = n % 10;
            n = n / 10;
            stos.push(help);
        }
        while(!stos.empty()){
            System.out.print(stos.pop() + " ");
        }
    }

    public static void pierwsze(int n){
        System.out.println();
        boolean[] pierwsze = new boolean[n+1];
        Arrays.fill(pierwsze, true);
        for(int i = 2; i < Math.sqrt(n); i++){
            if(pierwsze[i]){
                for(int j = i*i; j <= n; j += i){
                    pierwsze[j] = false;
                }
            }
        }
        for(int i = 2; i < n+1; i++){
            if(pierwsze[i]){
                System.out.print(i + " ");
            }
        }
    }

    public static <E, T extends Iterable<E>> void print(T obj){
        for(E elem: obj){
            System.out.print(elem + ", ");
        }
    }
}
