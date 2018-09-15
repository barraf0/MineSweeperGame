import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Minesweeper {


    public static void main(String[] args) {

        GameState gameState = new GameState();
        Boolean choice;
        do {
            Board board = new Board();
            board.letsPlay();
            Scanner input = new Scanner(System.in);
            System.out.println("Czy chcesz grac dalej?");
            choice = input.nextBoolean();
        }
        while (choice);
    }
}

