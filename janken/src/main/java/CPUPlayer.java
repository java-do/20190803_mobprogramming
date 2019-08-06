import java.util.Random;

public class CPUPlayer implements IPlayer {
    private Random rand = new Random();
    @Override
    public Hand getHand() {
        var i = rand.nextInt(3);
        return Hand.values()[i];
    }
}
