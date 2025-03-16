package game.Bots.Factorys;

import game.Bots.algorithms.Algorithm;
import game.Move;

public interface AlgorithmsFactory {
    Algorithm<Move> createAlgorithm();
}
