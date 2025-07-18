import java.util.List;
import java.util.Set;

public class MazeResult {
    private List<Cell> path;
    private Set<Cell> visitedCells;

    public MazeResult(List<Cell> path, Set<Cell> visitedCells) {
        this.path = path;
        this.visitedCells = visitedCells;
    }

    public List<Cell> getPath() {
        return path;
    }

    public Set<Cell> getVisitedCells() {
        return visitedCells;
    }
}
