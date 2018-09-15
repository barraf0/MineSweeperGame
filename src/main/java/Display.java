public class Display {

    public String[][] displayArray;
    //Cell[][] dataArray; //singleton
    BoardGenerator dataArray; //= new BoardGenerator();


    int x = 5;

    public void displayBoard() {

        System.out.println("wyswietlam plansze");
        System.out.println();
        System.out.println();
        //System.out.println(dataArray.dataArray.length);
/*
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray[i].length; j++) {
                dataArray[i][j] = new Cell();
                dataArray[i][j].value = 1;

                System.out.print(dataArray[i][j].value + "\t");
            }
            System.out.println();
        }
*/
    }
}