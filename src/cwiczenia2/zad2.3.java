import java.util.Scanner;

public class zad3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = in.nextInt();
        System.out.println("Podawaj liczby rzeczywiste");
        float[] liczby = new float[n];
        int ld = 0;
        int lu = 0;
        int lz = 0;
        for(int i = 0; i < n; i++){
            liczby[i] = in.nextFloat();
        }
        for(int i = 0; i < n; i++){
            if(liczby[i] > 0){
                ld += 1;
            }
            else if(liczby[i] < 0){
                lu += 1;
            }
            else if(liczby[i] == 0){
                lz += 1;
            }
        }
        System.out.println("Ilosc dodatnich: " + ld);
        System.out.println("Ilosc ujemnych: " + lu);
        System.out.println("Ilosc zer: " + lz);
        in.close();
    }
}
