import java.util.Scanner;

public class Janken {
    public static void main(String[] args) {
        var human = new HumanPlayer();
        var cpu = new CPUPlayer();
        var judge = new Judgement();

        var winner = judge.judge(human, cpu);
        winner.ifPresentOrElse(w -> System.out.println(w.getClass().getSimpleName()),
                () -> System.out.println("引き分け"));
//        System.out.println("Hello, " + scanner.next();
    }
}
