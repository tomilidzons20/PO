package cwiczenia10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pliczek {
    public static void main(String[] args){
        try{
            File myObj = new File("po-gr4-jakubpietkiewicz/tekst.txt");
            Scanner in = new Scanner(myObj);
            ArrayList<String> text = new ArrayList<String>();
            while(in.hasNextLine()){
                String data = in.nextLine();
                text.add(data);
            }
            in.close();
            for(int i = 0; i < text.size(); i++){
                System.out.println(text.get(i));
            }
            System.out.println("============================");
            Collections.sort(text);
            for(int i = 0; i < text.size(); i++){
                System.out.println(text.get(i));
            }
        }catch (FileNotFoundException e){
            System.out.println("Error");
        }
    }
}
