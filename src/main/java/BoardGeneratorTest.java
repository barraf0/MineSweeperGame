import java.util.Arrays;
import java.util.stream.Stream;

public class BoardGeneratorTest {

    public static void main(String[] args) {
        //Difficulty difficulty = new Difficulty();
        Runner runner = new Runner();

        //display only
        for (int i=0; i<runner.dataArray.length;i++){
            for (int j=0; j<runner.dataArray[i].length;j++){
                runner.dataArray[i][j]=new Cell();
                runner.dataArray[i][j].value = 1;

                System.out.print(runner.dataArray[i][j].value + "\t");
            }
            System.out.println();
        }
        /*
        System.out.println("1:");
        System.out.println(Arrays.deepToString(runner.dataArray));
        System.out.println("2:");
        Stream.of(runner.dataArray).forEach(System.out::println);
        System.out.println("3:");
        System.out.println(runner.dataArray[0][0].value);
*/

    }


    public static class Runner{
        Difficulty difficulty = new Difficulty();
        Cell[][] dataArray = new Cell[difficulty.row][difficulty.col];



        public Runner(){

            //int[][] dataArray = new int[4][3];

            for (int i=0; i<dataArray.length;i++){
                for (int j=0; j<dataArray[i].length;j++){
                    dataArray[i][j]=new Cell();
                    dataArray[i][j].value = 1;
                    //System.out.print(Arrays.deepToString(dataArray[0][0].value) + "\t");
                    //System.out.println(dataArray[0][0].value);
                }
                //System.out.println();
            }
        }
    }
}
