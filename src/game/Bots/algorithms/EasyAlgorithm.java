package game.Bots.algorithms;
import game.Move;

import java.util.Random;

public class EasyAlgorithm implements Algorithm<Move> {
    private final Random rand = new Random();

    private int generateChoice() {
        return this.rand.nextInt(3);
    }


    @Override
    public Move execute() {
        return Move.values()[generateChoice()];
    }
}
