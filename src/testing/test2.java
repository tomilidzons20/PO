import java.util.Scanner;
import java.util.Random;

public class test2 {

    public static void max(int[] tab){
        int max = tab[0];
        int count = 0;
        for(int i = 1; i < tab.length; i++){
            if(tab[i] > max){
                count = 0;
                max = tab[i];
            }
            if(tab[i] == max){
                count++;
            }
        }
        System.out.println("\nNajwiekszy element: " + max);
        System.out.println("Ilosc jego wystapien: " + count);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna n");
        int n = in.nextInt();
        int[] tab = new int[n];
        for(int i = 0; i < n; i++){
            tab[i] = new Random().nextInt(100) - 50;
            System.out.print(tab[i] + " ");
        }
        max(tab);
        in.close();
    }
}
