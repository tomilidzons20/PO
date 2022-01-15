package cwiczenia4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class c4zad23 {
    public static void main(String[] args){
        try{
            File myFile = new File("bagno.txt");
            if(myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
            } else{
                System.out.println("File already exists");
            }
            Scanner read = new Scanner(myFile);
            int wynik = 0;
            int wynik2 = 0;
            String wyraz = "ziel";
            char c = 'b';
            // while(read.hasNextLine()){
            //     String data = read.nextLine();
            //     System.out.println(data);
            // }
            while(read.hasNextLine()){
                String data = read.nextLine();

                // zad2
                for(int i = 0; i < data.length(); i++){
                    if(data.charAt(i) == c){
                        wynik++;
                    }
                }
                
                // zad3
                int j = 0;
                while((j = data.indexOf(wyraz, j)) != -1){
                    wynik2++;
                    j++;
                }
            }
            System.out.println(wynik);
            System.out.println(wynik2);
            read.close();
        } catch(FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        } catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
