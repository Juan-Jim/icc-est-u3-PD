import java.util.ArrayList;
import java.util.List;

public class MazeSolverRecursivo implements MazeSolver.MazeSolverStrategy {

    @Override
    public List<Cell> getPath(boolean[][] grid, Cell start, Cell end) {
        List<Cell> path = new ArrayList<>();

        if (findPath(grid, start, end, path)) {
            return path;
        }

        return new ArrayList<>();
    }

    private boolean findPath(boolean[][] grid, Cell current, Cell end, List<Cell> path) {
        int row = current.row;
        int col = current.getCol();

        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || !grid[row][col]) {
            return false;
        }

        if (row == end.row && col == end.getCol()) {
            path.add(0, current);
            return true;
        }

        if (findPath(grid, new Cell(row + 1, col), end, path)) {
            path.add(0, current);
            return true;
        }

        if (findPath(grid, new Cell(row, col + 1), end, path)) {
            path.add(0, current);
            return true;
        }

        if (findPath(grid, new Cell(row, col - 1), end, path)) {
            path.add(0, current);
            return true;
        }

        if (findPath(grid, new Cell(row - 1, col), end, path)) {
            path.add(0, current);
            return true;
        }

        return false;
    }
}
