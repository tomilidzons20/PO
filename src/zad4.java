import java.util.Scanner;

public class zad4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = in.nextInt();
        System.out.println("Podawaj liczby rzeczywiste");
        float[] liczby = new float[n];
        for(int i = 0; i < n; i++){
            liczby[i] = in.nextFloat();
        }
        float nm = liczby[0];
        float nw = liczby[0];
        for(int i = 0; i < n; i++){
            if(liczby[i] < nm){
                nm = liczby[i];
            }
            if(liczby[i] > nw){
                nw = liczby[i];
            }
        }
        System.out.println("Najmniejsza liczba: " + nm);
        System.out.println("Najwieksza liczba: " + nw);
        in.close();
    }
}
