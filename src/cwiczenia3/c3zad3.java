package cwiczenia3;

import java.util.Scanner;
import java.util.Random;

public class c3zad3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 1 <= m,n,k <= 10");
        int m, n, k;
        while(true){
            m = in.nextInt();
            n = in.nextInt();
            k = in.nextInt();
            if(m < 1 || m > 10 || n < 1 || n > 10 || k < 1 || k > 10){
                System.out.println("Zla liczba");
                continue;
            }
            break;
        }
        in.close();
        int[][] ma = new int[m][n];
        int[][] mb = new int[n][k];
        int[][] mc = new int[m][k];
        //ma
        System.out.println();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ma[i][j] = new Random().nextInt(5);
                System.out.print(ma[i][j]);
            }
            System.out.println();
        }
        //mb
        System.out.println();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                mb[i][j] = new Random().nextInt(5);
                System.out.print(mb[i][j]);
            }
            System.out.println();
        }
        //mc
        System.out.println();
        int i, j, f;
        for(i = 0; i < m; i++){
            int suma = 0;
            for(f = 0; f < k; f++){
                suma = 0;
                for(j = 0; j < n; j++){
                    suma += ma[i][j] * mb[j][f];
                }
                mc[i][f] = suma;
            }
        }
        for(i = 0; i < m; i++){
            for(j = 0; j < k; j++){
                System.out.print(mc[i][j] + " ");
            }
            System.out.println();
        }
    }
}
