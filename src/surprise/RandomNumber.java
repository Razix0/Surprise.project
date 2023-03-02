package surprise;

import java.util.Random;

public final class RandomNumber {
    static Random random;
    private RandomNumber(){
    }
    public static int randomNr(int n){
        if (n==0)
            return 0;
        RandomNumber.random = new Random();
        return RandomNumber.random.nextInt(n);
    }
    public static int randomNr(){
        RandomNumber.random = new Random();
        return RandomNumber.random.nextInt();
    }
}
