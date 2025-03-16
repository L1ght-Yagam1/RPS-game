package game;

import java.util.ArrayList;
import java.util.Collection;

public class Player {
    private String name;
    private String lastChoice;
    private final Collection <String> choices = new ArrayList<>();
    private int score;


    public Player(String name) {
        this.name = name;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setLastChoice(String choice){
        this.lastChoice = choice;
    }

    String getLastChoice(){
        return lastChoice;
    }

    void setScore(int score){
        this.score = score;
    }

    void incrementScore(){
        score += 1;
    }

    int getScore(){
        return score;
    }

    void incrementChoices(String choice){
        this.choices.add(choice);
    }

    Collection<String> getChoices(){
        return choices;
    }
}
