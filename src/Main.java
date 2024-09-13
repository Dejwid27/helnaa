import java.util.*;

public class Main {


    public static void main(String[] args){
        ArrayList<Integer> wylosowane = wylosujLiczby(7);
        LinkedList<Integer> wpisane = wczytajLiczby(4);
        ArrayList<Integer> trafione = sprawdzktorepowtarzajaSie(wylosowane, wpisane);
        System.out.println("Liczby wylosowane");
        wypiszListe(wylosowane);
        System.out.println("Liczby wpisane");
        wypiszListe(wpisane);
        System.out.println("Liczby trafione");
        wypiszListe(trafione);

    }

    /**
     * wylosujLiczby - metoda ktora losuje liczby calkowite z zakresu od 1 do 100
     * @param ile - liczba wylosowanych wartosci
     * @return - zwracam nam liste z wylosowanymi wartosciami
     */
    private static ArrayList<Integer> wylosujLiczby(int ile){
        ArrayList<Integer> listaliczbLosowychBezPowtorzen = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            liczba = (int) (Math.random() * 100 + 1);
            while (listaliczbLosowychBezPowtorzen.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            listaliczbLosowychBezPowtorzen.add(liczba);
        }
        return listaliczbLosowychBezPowtorzen;
    }
        private static LinkedList<Integer> wczytajLiczby(int ile){
            LinkedList<Integer> wpisane = new LinkedList<>();
            Scanner klawiatura = new Scanner(System.in);
            System.out.println("podaj "+ile+" licz");
            for (int i = 0; i <ile ; i++) {
                wpisane.add(klawiatura.nextInt());
            }
            return wpisane;
        }
    private static void wypiszListe(List<Integer>lista){
        for (Integer element:lista) {
            System.out.print(element+",");
        }

    }
    private static ArrayList<Integer> sprawdzktorepowtarzajaSie(ArrayList<Integer> wpisane, LinkedList<Integer> wylosowane){
        ArrayList<Integer> trafione = new ArrayList<>();
        for (Integer element:wylosowane){
            if(wpisane.contains(element)){
                trafione.add(element);
            }
        }
        return trafione;
    }
}



