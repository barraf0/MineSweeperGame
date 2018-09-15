import java.util.Scanner;

public class Board {

    public void letsPlay() {
        Difficulty difficulty = new Difficulty();
        BoardGenerator playBoard = new BoardGenerator();
        Move move = new Move();
        GameState state = new GameState();
        Scanner scanner = new Scanner(System.in);
        Cell cell = new Cell();

        int markedFields;
        int size = difficulty.col * difficulty.row;

        do {
            //pobiera wygenerowana tablice
            //System.out.println(playBoard.playBoard.length);
            //wyswietla tablice

            playBoard.displayBoard();

            //wykonuje ruch

            getInput();
            move.mark(2, 2); //counter w dol
            move.select(2, 2); //czy bomba, czy puste
            //sprawdza ruch
            move.isValid();
            if (state.lost || cell.bombCounter == 0) ;


            //tak, game in progress, nie game over


        } while (!state.lost);
    }

    String getInput(){
        System.out.println("Podaj ruch");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
