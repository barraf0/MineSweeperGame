import java.util.Random;

public class BoardGenerator {

    Difficulty difficulty = new Difficulty();

    public Cell[][] dataArray = new Cell[difficulty.row][difficulty.col];

    public BoardGenerator(){


        for (int i=0; i<dataArray.length;i++){
            for (int j=0; j<dataArray[i].length;j++){
                dataArray[i][j] = new Cell();
                dataArray[i][j].shown = false;
                dataArray[i][j].value = 0;
                setUpBombs(i,j);
                assignValues(i,j);
                //System.out.print(dataArray[i][j].value + "\t");


            }

        }
    }

    public void displayBoard() {
        System.out.println("wyswietlam plansze");


        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray[i].length; j++) {
                //if (!dataArray[i][j].shown) {System.out.print("Z\t");}
                if (dataArray[i][j].isBomb) {System.out.print("B\t");}
                //else if (dataArray[i][j].value == 1){System.out.print("1\t");}
                else {System.out.print(dataArray[i][j].value+"\t");}

                    //System.out.print(dataArray[i][j].value + "\t");
                }
                System.out.println();
            }
        }

    public void assignValues(int i, int j){



    }

    public boolean setUpBombs(int i, int j){
        Difficulty diff = difficulty;
        Random random = new Random();
        int x = 0;
        boolean bomb = false;
        while (x<diff.numberOfBombs){bomb = dataArray[i][j].isBomb = random.nextBoolean();
        x++;}
        return bomb;
    }

    }
