import java.util.*;

public class Main {


    public static void main(String[] args) {
        Gra gra1 = new Gra();
        gra1.zagraj();
        System.out.println("pierwsze" + sitoEratosferesa(200));
    }

    /* do kartkowki

     */
    static ArrayList<Integer> sitoEratosferesa(int liczba) {
        //orzgitiwanie listy z wartosciami logicznymi
        ArrayList<Boolean> logiczne = new ArrayList<>();
        logiczne.add(false);
        logiczne.add(false);
        for (int i = 0; i < liczba; i++) {
            logiczne.add(true);
        }
        //wykreslanie wielokrotnosci liczb pierwszych
        for (int i = 0; i < liczba; i++) {
            if (logiczne.get(i).equals(true)) {
                //wykreslanie zmiana na false
                for (int k = i * 2; k < liczba; k = k + i) {
                    logiczne.set(k, false);
                }
            }
        }
        ArrayList<Integer> pierwsze = new ArrayList<>();
        for (int i = 0; i < logiczne.size(); i++) {
            if (logiczne.get(i).equals(true))
                pierwsze.add(i);
        }

        return pierwsze;
    }
}






