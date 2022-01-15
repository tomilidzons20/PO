package cwiczenia2;

import java.util.Scanner;

public class c2zad1{
    public static double factorial(int n)
    {
        double wynik = 1;
        for(int i = 2; i <= n; i++)
        {
            wynik *= i;
        }
        return wynik;
    }

    public static void main(String[] args)
    {
	    // double wynik = 0;
	    // double wynik2 = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = in.nextInt();
        System.out.println("Podawaj liczby:");
        double[] liczby = new double[n];
        for(int i = 0; i < n; i++)
        {
            liczby[i] = in.nextDouble();
            //pkt.1
            //a
            //wynik += liczby[i];
            //b
            //wynik2 *= liczby[i];
            //c
            //wynik += Math.abs(liczby[i]);
            //d
            //wynik += Math.sqrt(Math.abs(liczby[i]));
            //e
            //wynik2 *= Math.abs(liczby[i]);
            //f
            //wynik += Math.pow(liczby[i], 2);
            //g
            //wynik += liczby[i];
            //wynik2 *= liczby[i];
            //h
            //wynik += Math.pow(-1, i+2) * liczby[i];
            //i
            //wynik += (Math.pow(-1, i+1) * liczby[i]) / factorial(i);
        }
        //pkt2
        for(int i = 1; i < n; i++)
        {
            System.out.println(liczby[i]);
        }
        System.out.println(liczby[0]);
        //System.out.println(wynik);
        //System.out.println(wynik2);
        in.close();
    }
}