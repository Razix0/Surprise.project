package surprise;

import java.util.ArrayList;

public final class Candies implements ISurprise{
   private final static ArrayList<String> bomboane = Candies.addToList();
   private int numarBomboane;
   private String numeBomboane;
    private Candies(int numarBomboane,String numeBomboane){
        this.numarBomboane =numarBomboane;
        this.numeBomboane = numeBomboane;
    }
    @Override
    public void enjoy() {
        System.out.println("Surprise openend:");
        System.out.println("You got " + this.numarBomboane +" " + this.numeBomboane);
        System.out.println("Enjoy!");
    }
    private static ArrayList<String> addToList(){
        ArrayList<String> nou = new ArrayList<>();
        nou.add("Skittles");
        nou.add("Jolly Rancher");
        nou.add("Milk Duds");
        nou.add("Baby Ruth");
        nou.add("Starburst");
        nou.add("SweetTarts");
        nou.add("Bit o Honey");
        nou.add("Werther’s Original");
        nou.add("Riesen");
        nou.add("Pop Rocks");
        nou.add("Nestle Crunch Bar");
        nou.add("Jawbreakers");
        nou.add("Twizzlers");
        nou.add("Toblerone");
        nou.add("Smarties");
        nou.add("Mr. Goodbar");
        nou.add("Pez Candy Dispenser");
        nou.add("Blow Pops");
        nou.add("Almond Joy");
        nou.add("Sour Patch Kids");
        return nou;
    }
    public static Candies generate(){
        return new Candies(RandomNumber.randomNr(100), Candies.bomboane.get(RandomNumber.randomNr(19)));
    }
}
