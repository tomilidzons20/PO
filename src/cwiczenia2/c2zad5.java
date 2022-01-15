package cwiczenia2;

import java.util.Scanner;

public class c2zad5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = in.nextInt();
        System.out.println("Podawaj liczby rzeczywiste");
        float[] liczby = new float[n];
        for(int i = 0; i < n; i++){
            liczby[i] = in.nextFloat();
        }
        int wynik = 0;
        for(int i = 0; i < n - 1; i++){
            if(liczby[i] > 0 && liczby[i + 1] > 0){
                wynik += 1;
            }
        }
        in.close();
        System.out.println("Ilosc par: " + wynik);
    }
}
