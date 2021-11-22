import java.util.Scanner;

public class test3 {

    public static String delete(String str, char c){
        int count = 1;
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(count != 1 && arr[i] == c){
                arr[i] = 0;
            }
            if(count == 1 && arr[i] == c){
                count++;
            }
        }
        String str2 = new String(arr);
        for(int i = 0; i < str2.length(); i++){
            if(str2.charAt(i) == '\0'){
                str2 = str2.substring(0, i) + str2.substring(i+1);
            }
        }
        System.out.println(str2.length());
        return str2;
    }
    public static void main(String[] args){
        System.out.println("Podaj napis");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Podaj znak");
        char c = in.next().charAt(0);
        System.out.println(delete(str, c));
        in.close();
    }
}
