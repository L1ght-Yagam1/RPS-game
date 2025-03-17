package game.Bots;

import game.Bots.Factorys.AlgorithmsFactory;
import game.Move;


import static game.Bots.Factorys.FactoryProvider.getAlgorithmsFactory;

public class Bot {
    private final Difficult difficult;
    private Move choice;

    public Bot() {
        this.difficult = Difficult.Easy;
        this.choice = Move.NONE;
    }

    public Bot(Difficult difficult) {
        this.difficult = difficult;
        this.choice = Move.NONE;
    }

    public Move getChoice() {
        AlgorithmsFactory factory = getAlgorithmsFactory(difficult);

        var algorithm = factory.createAlgorithm();

        this.choice = algorithm.execute();

        return this.choice;
    }


    @Override
    public String toString() {
        return "Bot [difficult=" + difficult + "]";
    }
}
