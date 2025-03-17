package game;

import java.util.HashMap;
import java.util.Map;

public enum Move {
    ROCK("Камень"), PAPER("Бумага"), SCISSORS("Ножницы"), NONE("Не задано");

    private final String name;

    Move(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static final Map<Move, Move> rules = Map.of(
            ROCK, SCISSORS,
            PAPER, ROCK,
            SCISSORS, PAPER
    );

    public boolean beats(Move other) {
        return rules.get(this) == other;
    }


}
