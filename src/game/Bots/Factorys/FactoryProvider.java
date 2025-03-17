package game.Bots.Factorys;

import game.Bots.Difficult;
import game.Bots.algorithms.EasyAlgorithm;

public class FactoryProvider {
    public static AlgorithmsFactory getAlgorithmsFactory(Difficult difficulty) {
        switch (difficulty) {
            case Difficult.Easy ->  new EasyBotFactory();
            case Difficult.Medium -> new EasyAlgorithm();
        }
        return new EasyBotFactory();
    }
}
