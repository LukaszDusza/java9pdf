package zadanieWojna;

public enum CardColor {

    CLUBS(1),
    DIAMONDS(2),
    HEARTS(3),
    SPADES(4);

    private int value;

    CardColor(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
