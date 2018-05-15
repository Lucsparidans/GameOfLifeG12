package GoodCode;

public class Cell {
    private CellState cellState;

    public CellState getState(){
        return cellState;
    }
    public void setState(CellState newState){
        cellState = newState;
    }
}
