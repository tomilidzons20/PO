package cwiczenia13;

import java.util.Map;
import java.util.TreeMap;

public class Dict1 {
    public Dict1() {
        this.dict = new TreeMap<>();
    }

    public void dodaj(Student stud, String ocena){
        dict.put(stud, ocena);
    }

    public Student szukaj(int id){
        for(Map.Entry<Student, String> entry: dict.entrySet()){
            Student key = entry.getKey();
            if(key.getId() == id){
                return key;
            }
        }
        return null;
    }

    public void usun(int id){
        dict.remove(szukaj(id));
    }

    public void zmiana(int id,  String ocena){
        dict.put(szukaj(id), ocena);
    }

    @Override
    public String toString() {
        String res = "";
        for(Map.Entry<Student, String> entry : dict.entrySet()){
            Student key = entry.getKey();
            String value = entry.getValue();
            res += key + ": " + value + "\n";
        }
        return res;
    }

    private Map<Student, String> dict;
}

