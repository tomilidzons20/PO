import java.util.Scanner;
import java.util.Random;

public class zad2 {

    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc){
        for(int i = 0; i < n; i++){
            tab[i] = new Random().nextInt(maxWartosc * 2) + minWartosc;
            System.out.println(tab[i]);
        }
    }

    public static int ileNieparzystych(int tab[]){
        int wynik = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 == 1 || tab[i] % 2 == -1){
                wynik++;
            }
        }
        return wynik;
    }

    public static int ileParzystych(int tab[]){
        int wynik = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 == 0){
                wynik++;
            }
        }
        return wynik;
    }

    public static int ileDodatnich(int tab[]){
        int wynik = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                wynik++;
            }
        }
        return wynik;
    }

    public static int ileUjemnych(int tab[]){
        int wynik = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                wynik++;
            }
        }
        return wynik;
    }

    public static int ileZerowych(int tab[]){
        int wynik = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == 0){
                wynik++;
            }
        }
        return wynik;
    }

    public static int ileMaksymalnych(int tab[]){
        int wynik = 0;
        int naj = tab[0];
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > naj){
                naj = tab[i];
                wynik = 0;
            }
            if(tab[i] == naj){
                wynik++;
            }
        }
        return wynik;
    }

    public static int sumaDodatnich(int tab[]){
        int wynik = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                wynik += tab[i];
            }
        }
        return wynik;
    }

    public static int sumaUjemnych(int tab[]){
        int wynik = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                wynik += tab[i];
            }
        }
        return wynik;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]){
        int wynik1 = 0;
        int wynik2 = 0;
        for(int i = 0; i < tab.length; i++){
        if(tab[i] > 0){
                wynik2++;
            }
            if(i == tab.length - 1){
                if(wynik2 > wynik1){
                    wynik1 = wynik2;
                }  
                wynik2 = 0;
            }
            if(tab[i] < 0){
                if(wynik2 > wynik1){
                    wynik1 = wynik2;
                }
                wynik2 = 0;
            }
        }
        return wynik1;
    }

    public static void signum(int tab[]){
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                tab[i] = 1;
            }
            if(tab[i] < 0){
                tab[i] = -1;
            }
            System.out.println(tab[i]);
        }
    }

    public static void odwrocFragment(int tab[], int lewy, int prawy){
        for(int i = lewy - 1, j = prawy - 1; i < j; i++, j--){
                int tmp = tab[i];
                tab[i] = tab[j];
                tab[j] = tmp;
            }
            for(int i = 0; i < tab.length; i++){
                System.out.println(tab[i]);
            }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 1 <= n <= 100");
        int n;
        int minWartosc = -999;
        int maxWartosc = 999;
        while(true){
            n = in.nextInt();
            if(n < 1 || n > 100){
                System.out.println("Zla liczba");
                continue;
            }
            break;
        }
        int[] liczby = new int[n];
        System.out.println();
        generuj(liczby, n, minWartosc, maxWartosc);
        System.out.println();
        System.out.println(dlugoscMaksymalnegoCiaguDodatnich(liczby));
        System.out.println();
        // signum(liczby);
        int lewy, prawy;
        while(true){
            System.out.println("Podaj lewy");
            lewy = in.nextInt();
            System.out.println("Podaj prawy");
            prawy = in.nextInt();
            if(lewy < 1 || lewy > n || prawy < 1 || prawy > n ){
                System.out.println("Zla liczba");
                continue;
            }
            break;
        }
        odwrocFragment(liczby, lewy, prawy);
        System.out.println();
        in.close();
    }
}
