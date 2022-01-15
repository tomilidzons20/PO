package cwiczenia4;

import java.util.Scanner;
import java.util.Arrays;

public class c4zad1 {

    public static int countChar(String str, char c){
        int wynik = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                wynik++;
            }
        }
        return wynik;
    }

    public static int countSubStr(String str, String subStr){
        int wynik = 0;
        int i = 0;
        while((i = str.indexOf(subStr, i)) != -1){
            wynik++;
            i++;
        }
        return wynik;
        // return str.split(subStr, -1).length - 1;
    }

    public static String middle(String str){
        int dl = str.length();
        int sr = dl / 2;
        String odp = "";
        if(dl % 2 == 0){
            odp += (str.charAt(sr));
            odp += (str.charAt(sr - 1));
        }
        else{
            odp += (str.charAt(sr));
        }
        return odp;
    }

    public static String repeat(String str, int n){
        String odp = "";
        for(int i = 0; i < n; i++){
            odp += str;
        }
        return odp;
    }

    public static int[] where(String str, String subStr){
        int[] wynik = new int[20];
        int i = 0, j = 0;
        while((i = str.indexOf(subStr, i)) != -1){
            wynik[j] = i;
            j++;
            i++;
        }
        return Arrays.copyOf(wynik, j);
    }

    public static String change(String str){
        StringBuffer strB = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            char zn = str.charAt(i);
            if(Character.isUpperCase(zn)){
                strB.append(Character.toLowerCase(zn));
            }
            else{
                strB.append(Character.toUpperCase(zn));
            }
        }
        return strB.toString();
    }

    public static String nice(String str){
        StringBuffer strB = new StringBuffer(str);
        int counter = 0;
        for(int i = str.length(); i > 0; i--){
            if(counter == 3){
                strB.insert(i, "'");
                counter = 0;
            }
            counter++;
        }
        return strB.toString();
    }

    public static String nice2(String str, char c, int n){
        StringBuffer strB = new StringBuffer(str);
        int counter = 0;
        for(int i = str.length(); i > 0; i--){
            if(counter == n){
                strB.insert(i, c);
                counter = 0;
            }
            counter++;
        }
        return strB.toString();
    }
    public static void main(String[] args){
        System.out.println("Podaj napis");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        // a)
        // System.out.println("Podaj znak");
        // char c = in.next().charAt(0);
        // System.out.println("Ilosc znakow w napisie: " + countChar(str, c));
        // b)
        // System.out.println("Podaj drugi napis");
        // String subStr = in.next();
        // System.out.println("Ilosc napisow w napisie: " + countSubStr(str, subStr));
        // c)
        // System.out.println("Srodkowe znaki w napisie: " + middle(str));
        // d)
        // System.out.println("Konkatenacja: " + repeat(str, 3));
        // e)
        // System.out.println("Podaj drugi napis");
        // String subStr = in.next();
        // System.out.println("Tabela indexow: " + Arrays.toString(where(str, subStr)));
        // f)
        // System.out.println("Zmieniony napis: " + change(str));
        // g)
        System.out.println("Zmieniony napis: " + nice2(str, '>', 2));
        in.close();
    }
}