package Ćwiczeń;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class main {
    public static void main(String[] args) {
        //Zadanie:Posortuj tablice lidzb całkowitych rosnąco
        int [] tab = {4,2,5,76,8,2,14,234,346,32,1};
        int [] wynik = new int [tab.length];

        for (int j =0; j <wynik.length;j++ ) {


            int temp = tab[0];
            int lokalizacja = 0;
            for (int i = 0; i < tab.length; i++) {
                    if (temp > tab[i]) {
                        temp = tab[i];
                        lokalizacja  = i;
                    }
            }
            wynik[j] = temp;
            tab[lokalizacja] = Integer.MAX_VALUE;
            System.out.print(wynik[j] + ", ");
        }
    }
}
