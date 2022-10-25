public class Rosenbrock extends Problem{

    public Rosenbrock(int numberOfDimension, int maxFes) {
        super("Rosenbrock", numberOfDimension, maxFes);
        //TODO set upper and lower bounds
        upperLimit = generateUpperLimits();
        lowerLimit = generateLowerLimits();
    }

    @Override
    public double evaluate(Double[] x) {
        //enable assertion: https://se-education.org/guides/tutorials/intellijUsefulSettings.html
        assert (x.length == numberOfDimension);
        assert (currentFes <= maxFes);
        double fitness = 0.0;
        for(int i = 0; i < numberOfDimension-1; i++){
            fitness += 100*Math.pow(x[i+1] - Math.pow(x[i],2) ,2) + Math.pow(x[i]-1,2); //TODO neke fali
        }
        currentFes++;
        return fitness;
    }

    //TODO set upper and lower bounds
    private Double[] generateUpperLimits(){
        upperLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            upperLimit[i] = 2.048;
        }
        return upperLimit;
    }

    private Double[] generateLowerLimits(){
        lowerLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            lowerLimit[i] = -2.048;
        }
        return lowerLimit;
    }
}
