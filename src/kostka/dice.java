package kostka;
import java.security.SecureRandom;

 class Dice {
    int n;
    SecureRandom random;

    public Dice(int n){
        this.n=n;
        random = new SecureRandom();
    }

    public int roll(){

        return this.random.nextInt(n) +1;
    }
}