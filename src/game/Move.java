package game;

public enum Move {
    ROCK("Камень"), PAPER("Бумага"), SCISSORS("Ножницы"), NONE("Не задано");

    private final String name;

    Move(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
