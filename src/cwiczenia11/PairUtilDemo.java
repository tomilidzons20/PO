package cwiczenia11;

public class PairUtilDemo {
    public static void main(String[] args){
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        // Pair<String> mm = ArrayAlg.<String>minmax(words);
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        mm = PairUtil.swap(mm);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}