package surprise;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises{
    GiveSurpriseAndApplause(String container, int waitTime) {
        super(container, waitTime);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Loud applause to you… For it is in giving that we receive.");
    }
}
