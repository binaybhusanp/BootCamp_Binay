/**
 * Created by badkass on 7/18/2017.
 */
public class GameOfLifeRevised {
    static int n = 5;

    int[][] currentGeneration;

    public GameOfLifeRevised(int[][] currentGeneration) {
        this.currentGeneration = currentGeneration;
    }

    public GameOfLifeRevised nextGeneration() {
        int[][] newGeneration = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int neighbors = countLiveNeighbors(row, col, currentGeneration);
                newGeneration[row][col] = (WillbeAlive(neighbors, isAlive(currentGeneration[row][col])) ? 1 : 0);
            }
        }
        GameOfLifeRevised newGen = new GameOfLifeRevised(newGeneration);
        newGen.displayGeneration();
        return newGen;
    }

    private void displayGeneration() {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(currentGeneration[row][col]);
            }
            System.out.println();
        }
    }
    private static boolean staysOn(int neighbors) {
        return (neighbors == 3 || neighbors == 2);
    }

    private static boolean overPopulated(int neighbors) {

        return neighbors > 3;
    }

    private static boolean underPopulated(int neighbors) {

        return neighbors < 2;
    }

    public int countLiveNeighbors(int x, int y, int[][] grid) {
        int neighbors = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (!(i == 0 && j == 0)) {
                    if (isAlive(cellAt(x + i,y + j)))
                        neighbors++;
                }
            }
        }
        return neighbors;
    }

    private int getIndex(int i) {
        if (i < 0)
            i = i + n;
        return i % n;
    }

    public static boolean isAlive(int cellStatus) {
        return ((cellStatus == 1) ? true : false);

    }

    public int cellAt(int i, int j){
        return currentGeneration[getIndex(i)][getIndex(j)];
    }


    static class Cell{
        boolean alive;
        public boolean isAlive(){
            return alive;
        }

    }
    public static boolean WillbeAlive(int neighbors, boolean status) {
        if (underPopulated(neighbors) || overPopulated(neighbors)) {
            return false;
        } else if (neighbors == 3) {
            return true;
        } else if (neighbors == 2 && status)
            return true;
        return false;//count==2 and dead
    }
}
