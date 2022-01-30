package probnasejsa;

import java.io.File;

public class Testing {
    public static void main(String[] args) {
        System.out.println(IntSequence.of(12,53443,324,12));
        System.out.println();
        System.out.println(IntSequence.squares(2));
        for(String elem : Z3.fil("po-gr4-jakubpietkiewicz/src/cwiczenia10", ".txt")){
            System.out.println(elem);
        }
    }
}