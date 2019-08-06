import java.util.Scanner;

public class HumanPlayer implements IPlayer {
    Scanner scanner = new Scanner(System.in);
    @Override
    public Hand getHand() {
        return Hand.parse(scanner.next());
    }
}
