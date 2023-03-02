package surprise;

public class GiveSurpriseAndHug extends AbstractGiveSurprises{
    GiveSurpriseAndHug(String container, int waitTime) {
        super(container, waitTime);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
