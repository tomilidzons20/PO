package cwiczenia13;

import java.util.TreeMap;
import java.util.Map;

public class Dict {
    public Dict() {
        this.dict = new TreeMap<>();
    }

    public void dodaj(String nazw, String ocena){
        dict.put(nazw, ocena);
    }

    public void dodaj(String nazw){
        dict.put(nazw, "");
    }

    public void usun(String nazw){
        dict.remove(nazw);
    }

    public void zmiana(String nazw, String ocena){
        dict.put(nazw, ocena);
    }

    @Override
    public String toString() {
        String res = "";
        for(Map.Entry<String, String> entry : dict.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            res += key + ": " + value + "\n";
        }
        return res;
    }

    private Map<String, String> dict;
}
