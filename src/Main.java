import java.util.*;

public class Main {
    public static <Linkedlist> LinkedList<Integer> main(String[] args) {
        System.out.println("Hello world!");
        //tablica
        /*
        tablica musi miec zdefiniowany rozmiar ktorego pozniej nie mozna zmienic
        tablica przechowuje typy proste i zlozone
         */
        int[] tablicaliczbLosowych = new int[6];
        //losujemy z zakresu od 1 do 100 wlacznie
        for (int i = 0; i < tablicaliczbLosowych.length; i++) {
            tablicaliczbLosowych[i] = (int) (Math.random() * 100);
        }
        //wypisywanie tablicy na ekranie
        for (int element : tablicaliczbLosowych) {
            System.out.print(element + ",");
        }
        //wypelnianie kolekcji wartosciami losowymi
        /*
        kolekcja moze przechowywac tylko typy zlozone np Integer
        kolekcja nie musi miec zdefiniowanego rozmiaru
        rozmiar moze sie zmieniac w trakcie
        list -> Arraylist or Linkedlist
        set -> Hashset
        map
         */
        ArrayList<Integer> listaliczbLosowych = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int Liczba = (int) (Math.random() * 100);
            listaliczbLosowych.add(Liczba);
        }
        System.out.println("WYlosowana liczba");
        for (Integer element : listaliczbLosowych) {
            System.out.print(element + ",");

        }
        System.out.println(listaliczbLosowych);
        //losowanie do listy bez powtorzen
        ArrayList<Integer> listaliczbLosowychBezPowtorzen = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            liczba = (int) (Math.random() * 100 + 1);
            while (listaliczbLosowychBezPowtorzen.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            listaliczbLosowychBezPowtorzen.add(liczba);
        }
        System.out.println(listaliczbLosowychBezPowtorzen);
    /* lista:
    indeksowana, uporzadkowana, elementy moga sie powtarzac
    zbior: (zazwyczaj)
    nieindeksowany, nieporzadkowana, elementy unikatowe
     */
        HashSet <Integer> zbiorliczbLosowych = new HashSet<>();
        while (zbiorliczbLosowych.size()<6){
            liczba = (int)(Math.random()*100+1);
            zbiorliczbLosowych.add(liczba);
        }
        System.out.println("Zbior liczb losowych");
        System.out.println(zbiorliczbLosowych);
        //lista liczb wczytywana z klawiatury


        Scanner Klawiatura = new Scanner(System.in);
        LinkedList<Integer> listaliczbKlawiatury;
        listaliczbKlawiatury = new LinkedList<>();
        System.out.println("Podaj 6 liczb");
        for (int i = 0; i <6; i++) {
            int wartosc = Klawiatura.nextInt();
            listaliczbKlawiatury.add(wartosc);
        }

        return listaliczbKlawiatury;
    }

    /**
     * wylosujLiczby - metoda ktora losuje liczby calkowite z zakresu od 1 do 100
     * @param ile - liczba wylosowanych wartosci
     * @return - zwracam nam liste z wylosowanymi wartosciami
     */
    private ArrayList<Integer> wylosujLiczby(int ile){
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
        private LinkedList<Integer> wczytajLiczby(int ile){
            LinkedList<Integer> wpisane = new LinkedList<>();
            Scanner klawiatura = new Scanner(System.in);
            System.out.println("podaj "+ile+" licz");
            for (int i = 0; i <ile ; i++) {
                wpisane.add(klawiatura.nextInt());
            }
            return wpisane;
        }
    private void wypiszListe(List<Integer>lista){
        for (Integer element:lista) {
            System.out.print(element+",");
        }

    }
    private ArrayList<Integer> sprawdzktorepowtarzajaSie(ArrayList<Integer> wpisane, LinkedList<Integer> wylosowane){
        ArrayList<Integer> trafione = new ArrayList<>();
        for (Integer element:wylosowane){
            if(wpisane.contains(element)){
                trafione.add(element);
            }
        }
        return trafione;
    }
}



