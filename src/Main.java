import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //TODO random ne dela ok vedno je isto   Random rand = new Random(); rand.setSeed(System.currentTimeMillis());
        //0-problem name, 1-number of dimension, 2-maxFes
        //0-problem name, 1-maxFes
        Problem p;
        switch (args[0]) {
            case "1":
                p = new Sphere(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;

            case "2":
                p = new Ackley(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;

            case "3":
                p = new Schwefel(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;

            case "4":
                p = new Rosenbrock(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;

            case "5":
                p = new Bukin(Integer.parseInt(args[2]));
                break;

            case "6":
                p = new PenHolder(Integer.parseInt(args[2]));
                break;

            case "7":
                p = new Easom(Integer.parseInt(args[2]));
                break;

            case "8":
                p = new Neumaier(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;

            default:
                System.out.println("Invalid problem number");
                return;
        }
        System.out.println("Running: " + p.getName() + " problem");
        Double[] x = new Double[Integer.parseInt(args[1])];
        //x[0] = 10.0;
        //x[1] = 23.0;

        double bestSolution = Double.MAX_VALUE;



        while (p.getCurrentFes() < p.getMaxFes()) {
            x = p.generateRandomSolution();
            double fitness = p.evaluate(x);
            if (fitness < bestSolution) {
                bestSolution = fitness;

                System.out.print(p.getCurrentFes() + ".x" + Arrays.toString(x) + " = " +fitness + "\n");
            }

        }
    }
}