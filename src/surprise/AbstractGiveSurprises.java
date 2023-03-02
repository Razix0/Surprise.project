package surprise;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
    IBag container;
    int waitTime;
    AbstractGiveSurprises(String container,int waitTime){
        this.container = BagFactory1.getInstance().makeBag(container);
        this.waitTime = waitTime;
    }
    public void put(ISurprise newSurprise){
        this.container.put(newSurprise);
    }
    public void put(IBag bag){
        this.container.put(bag);
    }
    public void give(){
        this.container.takeOut().enjoy();
        this.giveWithPassion();
    }
    public void giveAll(){
        int n = this.container.size();
        for (int i = 0; i < n; i++) {
            try {
                // TODO Auto-generated catch block
                TimeUnit.SECONDS.sleep(this.waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.container.takeOut().enjoy();
            this.giveWithPassion();
        }
    }
    public boolean isEmpty(){
        return this.container.isEmpty();
    }
    abstract void giveWithPassion();
}
