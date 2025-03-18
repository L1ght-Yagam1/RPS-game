package game;

import java.util.Map;

public enum Move {
    ROCK("Камень"),
    PAPER("Бумага"),
    SCISSORS("Ножницы"),
    LIZARD("Ящерица"),
    SPOCK("Спок"),
    WELL("Колодец"),
    NONE("Не задано");

    private final String name;

    Move(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static final Map<Move, Move[]> rules = Map.of(
            ROCK, new Move[]{SCISSORS, LIZARD},
            PAPER, new Move[]{ROCK, SPOCK, WELL},
            SCISSORS, new Move[]{PAPER, LIZARD},
            LIZARD, new Move[]{PAPER, SPOCK},
            SPOCK, new Move[]{SCISSORS, ROCK},
            WELL, new Move[]{ROCK, SCISSORS}
    );

    public boolean beats(Move other) {
        for (Move move : rules.get(this)) {
            if (move == other) {
                return true;
            }
        }
        return false;
    }
}

