package game.Bots.Factorys;

import game.Bots.algorithms.Algorithm;
import game.Bots.algorithms.EasyAlgorithm;
import game.Move;

public class EasyBotFactory implements AlgorithmsFactory{

    @Override
    public Algorithm<Move> createAlgorithm() {
        return new EasyAlgorithm();
    }
}
