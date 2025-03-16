package game.Bots.Factorys;

import game.Bots.Difficult;
import game.Bots.algorithms.EasyAlgorithm;

public class FactoryProvider {
    public static AlgorithmsFactory getAlgorithmsFactory(Difficult difficulty) {
        switch (difficulty) {
            case Easy -> new EasyAlgorithm();
            case Medium -> new EasyAlgorithm();
        }
        return null;
    }
}
