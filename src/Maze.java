public class Maze {
    private boolean[][] maze;

    public Maze(boolean[][] maze) {
        this.maze = maze;
    }

    public boolean[][] getMaze() {
        return maze;
    }

    public void printMaze() {
        for (boolean[] row : maze) {
            for (boolean cell : row) {
                System.out.print(cell ? "- " : "* ");
            }
            System.out.println();
        }
    }

    // ✅ Interfaz actualizada para devolver MazeResult en lugar de List<Cell>
    public interface MazeSolver {
        MazeResult getPath(boolean[][] grid, Cell start, Cell end);
    }
}
