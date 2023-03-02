package surprise;

import java.util.ArrayList;

public class FIFOBag implements IBag{
    ArrayList<ISurprise> surpriseList;
    public FIFOBag(){
        this.surpriseList = new ArrayList<>();
    }
    @Override
    public void put(ISurprise newSurprise) {
        this.surpriseList.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        this.surpriseList.addAll(bagOfSurprises.getArray());
        bagOfSurprises.removeAll();
    }

    @Override
    public ISurprise takeOut() {
        if (this.surpriseList.size()>0){
            ISurprise surpriseCpy;
            surpriseCpy = this.surpriseList.get(0);
            this.surpriseList.remove(0);
            return surpriseCpy;}
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (this.surpriseList.isEmpty())
            return true;
        return false;
    }

    @Override
    public int size() {
        return this.surpriseList.size();
    }

    @Override
    public ArrayList<ISurprise> getArray() {
        return this.surpriseList;
    }

    @Override
    public void removeAll() {
        this.surpriseList.clear();
    }

    @Override
    public void put(ArrayList<ISurprise> arr) {
        this.surpriseList.addAll(arr);
    }
}
