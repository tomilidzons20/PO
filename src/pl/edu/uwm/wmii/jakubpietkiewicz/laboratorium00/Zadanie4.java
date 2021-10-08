package pl.edu.uwm.wmii.jakubpietkiewicz.laboratorium00;

public class Zadanie4
{
    public static void main(String[] args)
    {
        float saldo = 1000;
        for(int i = 0; i < 3; i++)
        {
                saldo *= 1.06;
                System.out.println(saldo);
        }
    }
}
