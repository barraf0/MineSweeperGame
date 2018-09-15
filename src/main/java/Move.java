public class Move {
    public int x = 0;
    public int y = 0;
    public String ruch;
    BoardGenerator b;
    GameState state;
    Cell cell;

    public void select (int x,int y){
        if (b.dataArray[x][y].isBomb){state.lost=true;}
        else {b.dataArray[x][y].shown=true;}
    }

    public void mark (int x,int y){
        if (b.dataArray[x][y].isBomb) {cell.bombCounter--;}
    }

    public boolean isValid (){

        return true;
    }
}
