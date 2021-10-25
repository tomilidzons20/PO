import java.util.Scanner;
import java.util.Random;

public class zad1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 1 <= n <= 100");
        int n;
        while(true){
            n = in.nextInt();
            if(n < 1 || n > 100){
                System.out.println("Zla liczba");
                continue;
            }
            break;
        }
        System.out.println();
        int[] liczby = new int[n];
        for(int i = 0; i < n; i++){
            liczby[i] = new Random().nextInt(1998) - 999;
            System.out.println(liczby[i]);
        }
        //podpunkty
        int wynik1 = 0;
        int wynik2 = 0;
        int wynik3 = 0;
        int naj = liczby[0];
        System.out.println();
        for(int i = 0; i < n; i++){
            // a
            // if(liczby[i] % 2 == 0){
            //     wynik1++;
            // }
            // else{
            //     wynik2++;
            // }

            // b
            // if(liczby[i] > 0){
            //     wynik1++;
            // }
            // if(liczby[i] < 0){
            //     wynik2++;
            // }
            // if(liczby[i] == 0){
            //     wynik3++;
            // }

            // c
            // if(liczby[i] > naj){
            //     naj = liczby[i];
            //     wynik1 = 0;
            // }
            // if(liczby[i] == naj){
            //     wynik1++;
            // }

            // d
            // if(liczby[i] < 0){
            //     wynik1 += liczby[i];
            // }
            // else{
            //     wynik2 += liczby[i];
            // }

            // e
            // if(liczby[i] > 0){
            //     wynik2++;
            // }
            // if(i == n - 1){
            //     if(wynik2 > wynik1){
            //         wynik1 = wynik2;
            //     }  
            //     wynik2 = 0;
            // }
            // if(liczby[i] < 0){
            //     if(wynik2 > wynik1){
            //         wynik1 = wynik2;
            //     }
            //     wynik2 = 0;
            // }

            // f
            // if(liczby[i] > 0){
            //     liczby[i] = 1;
            // }
            // if(liczby[i] < 0){
            //     liczby[i] = -1;
            // }
            // System.out.println(liczby[i]);
        }
        // g
        // int lewy, prawy;
        // while(true){
        //     System.out.println("Podaj lewy");
        //     lewy = in.nextInt();
        //     System.out.println("Podaj prawy");
        //     prawy = in.nextInt();
        //     if(lewy < 1 || lewy > n || prawy < 1 || prawy > n ){
        //         System.out.println("Zla liczba");
        //         continue;
        //     }
        //     break;
        // }
        // for(int i = lewy - 1, j = prawy - 1; i < j; i++, j--){
        //     int tmp = liczby[i];
        //     liczby[i] = liczby[j];
        //     liczby[j] = tmp;
        // }
        // for(int i = 0; i < n; i++){
        //     System.out.println(liczby[i]);
        // }
        // dla a), d)
        // System.out.println("Wynik1:" + wynik1 + " Wynik2:" + wynik2);
        // dla b)
        //System.out.println("Wynik1:" + wynik1 + " Wynik2:" + wynik2 + " Wynik3:" + wynik3);
        // dla c), e)
        //System.out.println("Wynik1:" + wynik1);
        in.close();
    }
}
