import java.util.Scanner;

public class Difficulty {


    int row;  //number of rows, first dimension
    int col;    //number of columns, second dimension
    int numberOfBombs;



    public Difficulty(){//int row, int col, int numberOfBombs){

        Scanner input = new Scanner(System.in);

        //Display display = new Display();
        //display.displayBoard();
        System.out.print("podaj poziom trudnosci:");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                this.row = row = 6;
                this.col = col = 6;
                this.numberOfBombs = numberOfBombs = 12;
                break;
            case 2:
                this.row = 8;
                this.col = 8;
                this.numberOfBombs = 20;
                break;
            case 3:
                this.row = 10;
                this.col = 10;
                this.numberOfBombs = 30;
                break;
            default:
                System.out.println("podaj poziom z zakresu 1-3");

        }

    }
}
