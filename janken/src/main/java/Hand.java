import java.util.EnumSet;

public enum Hand {
    ROCK("R"),
    SCISSORS("S"),
    PAPER("P"),
    UNKNOWN("");

    private String label;

    Hand(String label) {
        this.label = label;
    }

    public static Hand parse(String label) {
        return EnumSet.allOf(Hand.class).stream()
                .filter(h -> h.label.equals(label))
                .findFirst()
                .orElse(UNKNOWN);
    }
}
