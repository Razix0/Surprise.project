package surprise;

import java.util.ArrayList;

public class FortuneCookie implements ISurprise{
    String quote;
    static final ArrayList<String> zicale = FortuneCookie.addToList();
    private FortuneCookie(String quote){
        this.quote = quote;
    }
    @Override
    public void enjoy() {
        System.out.println("Surprise openend:");
        System.out.println("Fortune cookie opened!");
        System.out.println(this.quote);
        System.out.println("Enjoy!");
    }
    private static ArrayList<String> addToList(){
        ArrayList<String> nou = new ArrayList<>();
        nou.add("You must try, or hate yourself for not trying.");
        nou.add("Be on the lookout for coming events; They cast their shadows beforehand.");
        nou.add("You can make your own happiness.");
        nou.add("If you have something good in your life, don't let it go!");
        nou.add("A very attractive person has a message for you.");
        nou.add("You will marry your lover.");
        nou.add("You are very talented in many ways.");
        nou.add("A dream you have will come true.");
        nou.add("You will travel to many exotic places in your lifetime.");
        nou.add("You already know the answer to the questions lingering inside your head.");
        nou.add("Fortune favors the brave.");
        nou.add("Never give up. You're not a failure if you don't give up.");
        nou.add("It is now, and in this world, that we must live.");
        nou.add("When fear hurts you, conquer it and defeat it!");
        nou.add("LIFE CONSISTS NOT IN HOLDING GOOD CARDS, BUT IN PLAYING THOSE YOU HOLD WELL.");
        nou.add("Its amazing how much good you can do if you dont care who gets the credit.");
        nou.add("A new voyage will fill your life with untold memories.");
        nou.add("If winter comes, can spring be far behind?");
        nou.add("What ever you're goal is in life, embrace it visualize it, and for it will be yours.");
        nou.add("Now is the time to try something new.");
        nou.add("Your shoes will make you happy today.");
        return nou;
    }
    public static FortuneCookie generate(){
        return new FortuneCookie(zicale.get(RandomNumber.randomNr(19)));
    }
}
