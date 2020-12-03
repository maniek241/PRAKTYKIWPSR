package ZADANIA;

public class zadanie {
    public static void main(String[] args) {
        int [] tab = {1,2,3,5,4,6,7,8,9,10};
        int wynik=0;
        for (int i=0;i<tab.length; i++ ){
           wynik+=tab[i];
        }
            System.out.println( "Lidzba po dodaniu wynosi " + wynik);

    }
}
