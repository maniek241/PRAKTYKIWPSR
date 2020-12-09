package kostka;
    public class main {
        public static void main(String[] args){
            //   public static void main(String[] args){

            //       Deck deck= new Deck();

            //     for (Card c: deck.deck){
            //         System.out.println(c);
            //      }

            Dice dice= new Dice(4);

            System.out.println(dice.roll());
        }

    }