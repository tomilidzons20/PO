import java.util.Scanner;

public class zad2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = in.nextInt();
        System.out.println("Podawaj liczby rzeczywiste");
        float[] liczby = new float[n];
        float suma = 0;
        for(int i = 0; i < n; i++){
            liczby[i] = in.nextFloat();
        }
        for(int i = 0; i < n; i++){
            suma += liczby[i];
        }
        System.out.println("Podwojna suma: " + suma * 2);
        in.close();
    }
}
