import java.util.Optional;
import java.util.Random;

public class Judgement {

    public Optional<IPlayer> judge(IPlayer player1, IPlayer player2) {
        var hand1 = player1.getHand();
        var hand2 = player2.getHand();

        if (hand1 == Hand.ROCK && hand2 == Hand.SCISSORS) {
            return Optional.of(player1);
        }
        if (hand1 == Hand.SCISSORS && hand2 == Hand.PAPER) {
            return Optional.of(player1);
        }
        if (hand1 == Hand.PAPER && hand2 == Hand.ROCK) {
            return Optional.of(player1);
        }

        if (hand2 == Hand.ROCK && hand1 == Hand.SCISSORS) {
            return Optional.of(player2);
        }
        if (hand2 == Hand.SCISSORS && hand1 == Hand.PAPER) {
            return Optional.of(player2);
        }
        if (hand2 == Hand.PAPER && hand1 == Hand.ROCK) {
            return Optional.of(player2);
        }

        return Optional.empty();
    }
}
