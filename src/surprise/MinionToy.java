package surprise;

import java.util.ArrayList;

public class MinionToy implements ISurprise{
    private String minion;
    private final static ArrayList<String> listaMinioni = MinionToy.addToList();
    private static int counter;
    private MinionToy(String minion){
        this.minion = minion;
    }
    @Override
    public void enjoy() {
        System.out.println("Surprise openend:");
        System.out.println("Your minion is: " + this.minion);
        System.out.println("Enjoy!");
    }
    private static ArrayList<String> addToList(){
        ArrayList<String> nou = new ArrayList<>();
        nou.add("Bob");
        nou.add("Carl");
        nou.add("Darwin");
        nou.add("Dave");
        nou.add("Frank");
        nou.add("Jerry");
        nou.add("John");
        nou.add("Kevin");
        nou.add("Ken");
        nou.add("Lance");
        nou.add("Larry");
        nou.add("Mark");
        nou.add("Mike");
        nou.add("Norbert");
        nou.add("Paul");
        nou.add("Phil");
        nou.add("Steve");
        nou.add("Stuart");
        nou.add("Tim");
        nou.add("Tom");
        return nou;
    }

    public int getCounter() {
        return counter;
    }
    public static MinionToy generate(){
        if(MinionToy.counter<MinionToy.listaMinioni.size()){
            MinionToy nou = new MinionToy(MinionToy.listaMinioni.get(MinionToy.counter));
            MinionToy.counter++;
            return nou;}
        return new MinionToy("Sorry, no more minions left.");
    }
}
