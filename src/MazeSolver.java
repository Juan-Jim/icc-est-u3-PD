import java.util.List;

public class MazeSolver {
    public interface MazeSolverStrategy {
        List<Cell> getPath(boolean[][] grid, Cell start, Cell end);
    }
}

