package game;

import java.util.Scanner;

public class Game {

    private Player player;

    private final Scanner scanner = new Scanner(System.in);

    static int gameId;

    // Запуск игры
    public void run() {
        System.out.println("""
                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                *Добро пожаловать в игру RPS*
                *ROCK, PAPER and SCISSORS!!!*
                *Для выхода используйте QUIT*
                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                """);
        this.player = createPlayer();


        while (true) {
            gameId += 1;
            String input = getPlayerInput();

            if (input.equals("QUIT")) {
                break;
            }
            else {
                System.out.println(gameId);
                Move choice = setPlayerChoice(input);
                if (choice != Move.NONE) {
                    System.out.println("Вы выбрали: " + choice.getName());
                }
            }
        }
    }

    // Получаем ввод игрока
    private String getPlayerInput() {
        System.out.println("_________________");
        System.out.println("Your choice: ");
        return scanner.nextLine().toUpperCase();
    }


    // Даём игроку выбор
    private Move setPlayerChoice(String choice) {
        try {
            Move move = Move.valueOf(choice);

            player.setLastChoice(choice);
            player.incrementChoices(choice);

            return move;

        } catch (IllegalArgumentException e) {
            System.out.println("""
                        Такого выбора не существует, выберите из следующих:
                        -Камень
                        -Ножницы
                        -Бумага
                        """);
            return Move.NONE;
        }
    }

    // Создаём игрока
    private Player createPlayer() {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        return new Player(name);
    }

}
