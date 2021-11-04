import java.math.BigInteger;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class c4zad45 {
    public static void main(String[] args){
        // 4)
        // int n = 2;
        // int l = 1;
        // BigInteger a = new BigInteger("0");
        // for(int i = 0; i < n*n; i++){
        //     a = a.add(new BigInteger(String.valueOf(l)));
        //     l *= 2;
        // }
        // System.out.println(a);
        // 5)
        BigDecimal k = new BigDecimal("1000.0");
        BigDecimal p = new BigDecimal("0.04");
        int n = 5;
        for(int i = 0; i < n; i++){
            k = k.multiply(p.add(new BigDecimal("1"))).setScale(2, RoundingMode.HALF_UP);;
        }
        System.out.println(k);
    }
}
