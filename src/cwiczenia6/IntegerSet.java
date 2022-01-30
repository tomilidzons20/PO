package cwiczenia6;

public class IntegerSet {
    boolean[] table;

    public IntegerSet(){
        this.table = new boolean[100];
    }

    static IntegerSet union(IntegerSet t1, IntegerSet t2){
        IntegerSet t3 = new IntegerSet();
        for(int i = 0; i < 100; i++){
            if(t1.table[i] == true || t2.table[i] == true){
                t3.table[i] = true;
            }
        }
        return t3;
    }

    static IntegerSet intersection(IntegerSet t1, IntegerSet t2){
        IntegerSet t3 = new IntegerSet();
        for(int i = 0; i < 100; i++){
            if(t1.table[i] == true && t2.table[i] == true){
                t3.table[i] = true;
            }
        }
        return t3;
    }

    public void insertElement(int el){
        table[el - 1] = true;
    }

    public void deleteElement(int el){
        table[el - 1] = false;
    }

    @Override
    public String toString(){
        String wynik = "";
        for(int i = 0; i < 100; i++){
            if(table[i] == true){
                wynik += i + 1;
                wynik += " ";
            }
        }
        return wynik;
    }

    public boolean equals(boolean[] t2){
        for(int i = 0; i < 100; i++){
            if(table[i] != t2[i]){
                return false;
            }
        }
        return true;
    }
}
