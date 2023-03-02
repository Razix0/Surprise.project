package surprise;

import java.util.Scanner;

public final class BagFactory1 implements IBagFactory{
    private static BagFactory1 instance = new BagFactory1();
    private BagFactory1(){}

    public static BagFactory1 getInstance() {
        return instance;
    }

    @Override
    public IBag makeBag(String type) {
        switch (type) {
            case "RANDOM":
                return new RandomBag();
            case "FIFO":
                return new FIFOBag();
            case "LIFO":
                return new LIFOBag();
            default:
                System.out.println("Tipul toblei introdus incorect:");
        }
        return null;
    }

}
