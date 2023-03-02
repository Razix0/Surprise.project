package surprise;

public class GiveSurpriseAndSing extends AbstractGiveSurprises{

    GiveSurpriseAndSing(String container, int waitTime) {
        super(container, waitTime);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }
}
