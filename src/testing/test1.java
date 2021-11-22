import java.util.Scanner;

public class test1 {

    public static void showPrimes(int[] list){
        for(int i = 0; i < list.length; i++){
            if(list[i] > 1){
                for(int j = 2; j < list[i]; j++){
                    if(list[i] % j == 0){
                        break;
                    }
                }
                System.out.print(list[i] + ", ");
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna n");
        int n = in.nextInt();
        int[] tab = new int[n];
        System.out.println("Podawaj liczby naturalne");
        for(int i = 0; i < n; i++){
            tab[i] = in.nextInt();
        }
        showPrimes(tab);
        in.close();
    }
}
