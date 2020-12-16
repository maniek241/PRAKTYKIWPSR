package zadabie14data;

public class manin {
    public static void main(String[] args) {
        int [] tab = {1,2,3,5,4,6,7,8,9,10,65,42,2};
              int wynik = 0;
                for (int i=0;i< tab.length;i++) {
                    wynik += tab[i];
                }
                wynik=wynik/tab.length;
                System.out.print("Średnia z tej tablicy to : "+wynik);
    }
}
