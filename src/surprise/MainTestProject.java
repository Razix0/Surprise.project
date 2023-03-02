package surprise;

public class MainTestProject {
    public static void main(String[] args) {
        IBag bag1 = BagFactory1.getInstance().makeBag("FIFO");
        bag1.put(GatherSurprise.gather());
        GiveSurpriseAndHug g2 = new GiveSurpriseAndHug("RANDOM",1);
        g2.put(bag1);
        System.out.println(g2.isEmpty());
        bag1.takeOut();

        bag1.put(GatherSurprise.gather());
        bag1.put(GatherSurprise.gather());
        bag1.put(GatherSurprise.gather());
        bag1.put(GatherSurprise.gather());
        bag1.put(GatherSurprise.gather());
        bag1.put(GatherSurprise.gather());
        System.out.println(bag1.size());
        GiveSurpriseAndApplause g1 = new GiveSurpriseAndApplause("FIFO",2);
        g1.put(bag1.takeOut());
        g1.put(bag1.takeOut());
        g1.put(bag1.takeOut());
        g1.put(bag1.takeOut());
        g1.put(bag1.takeOut());
        g1.put(bag1.takeOut());
        System.out.println(bag1.size());
        g1.giveAll();
        System.out.println(g1.isEmpty());

    }

}
