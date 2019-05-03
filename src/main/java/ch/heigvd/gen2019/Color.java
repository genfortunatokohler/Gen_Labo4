package ch.heigvd.gen2019;

public enum Color {
    blue(1),
    red(2),
    yellow(3);

    private int value;

    Color(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
}
