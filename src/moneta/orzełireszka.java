package moneta;

import java.security.SecureRandom;

public class orzełireszka {
//      tutaj zrobiłem funkcje która twoży losową Maciek Poborca :D lidzbe od 0 do 1
    public static int losowanie(){
        SecureRandom random = new SecureRandom();
//      tutaj jest kod do randomowej lidzby
        int a = random.nextInt(2);
//        w tym miejscu returnujemy a czyli losowo wygenerowaną lidzbe
        return a;


    }

    public static void main(String[] args) {
//        tutaj mamy linijke na pobranie losowo wygenerowanej lidzby z góry
        int a =losowanie();
//        w tym miejscu mamy poruwnanie jesli lidzba jest 1 to wypisujemy orzeł jeśli jest to inna lidzba wypisujemy reszka
        if(a==1){
            System.out.print("Orzeł");
        }
        else {
            System.out.print("Reszka");
        }



    }
    }




