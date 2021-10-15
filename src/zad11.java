import java.util.Scanner;

public class zad11 {
    public static int factorial(int n)
    {
        int wynik = 1;
        for(int i = 2; i <= n; i++)
        {
            wynik *= i;
        }
        return wynik;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = in.nextInt();
        System.out.println("Podawaj liczby naturalne");
        float[] liczby = new float[n];
        int wynik = 0;
        for(int i = 0; i < n; i++){
            liczby[i] = in.nextFloat();
            // a
            // if(liczby[i] % 2 == 0){
            //     wynik += 1;
            // }
            
            // b
            // if(liczby[i] % 3 == 0 && liczby[i] % 5 != 0){
            //     wynik += 1;
            // }

            // c
            // double pierw = Math.sqrt(liczba);
            // if((pierw - Math.floor(pierw)) == 0){
            //     wynik += 1;
            // }
            // f
            // if((i + 1) % 2 == 1 && liczby[i] % 2 == 0){
            //     wynik += 1;
            // }
            // g
            // if(liczby[i] % 2 == 1 && liczby[i] > 0){
            //     wynik += 1;
            // }
            // h
            // if(Math.abs(liczby[i]) < Math.pow(i + 1, 2)){
            //     wynik += 1;
            // }
        }
        // d
        // for(int i = 0; i < n; i++){
        //     if(i > 0 && i < n-1 && liczby[i] < ((liczby[i-1] + liczby[i+1]) / 2)){
        //         wynik += 1;
        //     }
        // }
        // e
        // for(int i = 0; i < n; i++){
        //     if(Math.pow(2, i) < liczby[i] && liczby[i] < factorial(i)){
        //         wynik += 1;
        //     }
        // }
        System.out.println("Wynik: "+ wynik);
        in.close();
    } 
}
