
import java.util.Arrays;
import java.util.List;



public class App {
    public static void main(String[] args) throws Exception {
        //runEjercciosPD();
        runMaze();
    }

    //private static void runEjercciosPD() {
        // EjerciciosPD ejerciciosPD = new EjerciciosPD();
        // System.out.println("Fibonaci Recursivo");
        // long start = System.nanoTime();
        // long resultado = ejerciciosPD.getFibonacci(50);
        // long end = System.nanoTime();
        // long duration = end - start;
        // System.out.println("Resultado = " + resultado + " en tiempo = " + duration);


        // System.out.println("Fibonaci Recursivo Caching ");
        // start = System.nanoTime();
        // resultado = ejerciciosPD.getFibonacciPD(50);
        // end = System.nanoTime();
        // duration = end - start;
        // System.out.println("Resultado = " + resultado + " en tiempo = " + duration);

    private static void runMaze() { 
        boolean[][] predefinedMaze = {
            {true, true, true, true},
            {false, true, true, true},
            {true, true, false, false},
            {true, true, true, true},
        };

        Maze maze = new Maze(predefinedMaze);
        System.out.println("Laberinto cargado");
        maze.printMaze();

        Cell start = new Cell(0, 0);
        Cell end = new Cell(3, 3);

         List<MazeSolver.MazeSolverStrategy> solvers = Arrays.asList(
            new MazeSolverRecursivo()
        );

        MazeSolver.MazeSolverStrategy solver = solvers.get(0);
        List<Cell> path = solver.getPath(predefinedMaze, start, end);
        System.out.println("Camino encontrado:");
        System.out.println(path);
    }
}