package probnasejsa;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface IntSequence {
    static List<Integer> of(Integer ... args){
        Stream<Integer> is = Stream.of(args);
        Stream<Integer> ifis = Stream.iterate(1, i -> i).limit(50);
        return Stream.concat(is, ifis).collect(Collectors.toList());
    }

    static List<Integer> squares(Integer n){
        return Stream.iterate(n, i -> i + 1).map(i -> i*i).limit(50).collect(Collectors.toList());
    }
}
