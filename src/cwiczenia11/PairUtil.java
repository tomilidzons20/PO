package cwiczenia11;

public class PairUtil<T> extends Pair<T>{
    public static <T> Pair<T> swap(Pair<T> para){
        return new Pair<>(para.getSecond(), para.getFirst());
    }
}
