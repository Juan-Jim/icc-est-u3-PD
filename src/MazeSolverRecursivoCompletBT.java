import java.util.*;

public class MazeSolverRecursivoCompletBT implements Maze.MazeSolver {

    private boolean[][] grid;
    private final List<Cell> path;
    private final Set<Cell> visited;
    private Cell end;
    private List<Cell> optimalPath;

    public MazeSolverRecursivoCompletBT() {
        this.path = new ArrayList<>();
        this.visited = new HashSet<>();
        this.optimalPath = new ArrayList<>();
    }

    @Override
    public MazeResult getPath(boolean[][] grid, Cell start, Cell end) {
        if (grid == null || grid.length == 0) {
            return new MazeResult(new ArrayList<>(), new HashSet<>());
        }

        this.grid = grid;
        this.end = end;
        this.path.clear();
        this.visited.clear();
        this.optimalPath.clear();

        if (findPath(start)) {
            this.optimalPath = new ArrayList<>(path);

            System.out.println("RUTA VISITADA");
            System.out.println(visited);
            System.out.println("RUTA OPTIMA");
            System.out.println(optimalPath);
            System.out.println();

            return new MazeResult(optimalPath, visited);
        }

        return new MazeResult(new ArrayList<>(), visited);
    }

    private boolean findPath(Cell current) {
        if (!isInMaze(current) || !isValid(current)) {
            return false;
        }

        path.add(current);
        visited.add(current);

        if (current.equals(end)) {
            return true;
        }

        if (findPath(new Cell(current.getRow() + 1, current.getCol())) ||
            findPath(new Cell(current.getRow() - 1, current.getCol())) ||
            findPath(new Cell(current.getRow(), current.getCol() + 1)) ||
            findPath(new Cell(current.getRow(), current.getCol() - 1))) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    private boolean isInMaze(Cell cell) {
        return cell.getRow() >= 0 && cell.getRow() < grid.length &&
               cell.getCol() >= 0 && cell.getCol() < grid[0].length;
    }

    private boolean isValid(Cell cell) {
        return grid[cell.getRow()][cell.getCol()] && !visited.contains(cell);
    }
}


    
   