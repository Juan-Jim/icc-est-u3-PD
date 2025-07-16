

public class App {
    public static void main(String[] args) throws Exception {
        runEjercciosPD();
    
    }

    private static void runEjercciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        System.out.println("Fibonaci Recursivo");
        long start = System.nanoTime();
        long resultado = ejerciciosPD.getFibonacci(50);
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Resultado = " + resultado + " en tiempo = " + duration);


        System.out.println("Fibonaci Recursivo Caching ");
        start = System.nanoTime();
        resultado = ejerciciosPD.getFibonacciPD(50);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("Resultado = " + resultado + " en tiempo = " + duration);


    }
}
