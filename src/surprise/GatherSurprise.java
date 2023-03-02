package surprise;

import java.util.ArrayList;

public final class GatherSurprise {
    private GatherSurprise(){}
    public static ArrayList<ISurprise> gather(int n){
        ArrayList<ISurprise> nou = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nou.add(GatherSurprise.gather());
        }
        return nou;
    }
    public static ISurprise gather(){
        int random = RandomNumber.randomNr(Integer.MAX_VALUE)%3;
        return switch (random) {
            case 0 -> Candies.generate();
            case 1 -> FortuneCookie.generate();
            case 2 -> MinionToy.generate();
            default -> null;
        };
    }
}
