abstract public class Problem {

    String name;
    int numberOfDimension;
    Double[] upperLimit;
    Double[] lowerLimit;
    int maxFes;
    int currentFes;

    public Problem(String name, int numberOfDimension, int maxFes) {
        this.name = name;
        this.numberOfDimension = numberOfDimension;
        this.maxFes = maxFes;
        currentFes = 0;
    }

    public abstract double evaluate(Double[] x);

    //TODO misel ka de se tu glejalo ce je x v mejah upper in lower limit   limite pa morejo bite random med npr.-5.12 in 5.12
    public Double[] generateRandomSolution() {
        Double[] x = new Double[numberOfDimension];
        for (int i = 0; i < numberOfDimension; i++) {
            x[i] = Math.random() * (upperLimit[i] - lowerLimit[i]) + lowerLimit[i] ;
        }
        return x;
    }

    public int getCurrentFes() {
        return currentFes;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDimension() {
        return numberOfDimension;
    }

    public Double[] getUpperLimit() {
        return upperLimit;
    }

    public Double[] getLowerLimit() {
        return lowerLimit;
    }

    public int getMaxFes() {
        return maxFes;
    }
}
