public class Sphere extends Problem {

    public Sphere(int numberOfDimension, int maxFes) {
        super("Sphere", numberOfDimension, maxFes);
        // set upper and lower bounds
        upperLimit = generateUpperLimits();
        lowerLimit = generateLowerLimits();
    }

    @Override
    public double evaluate(Double[] x) {
        //enable assertion: https://se-education.org/guides/tutorials/intellijUsefulSettings.html
        assert (x.length == numberOfDimension);
        assert (currentFes <= maxFes);
        double fitness = 0.0;
        for(int i = 0; i < numberOfDimension; i++){
            fitness += Math.pow(x[i],2);    //OK
        }
        currentFes++;
        return fitness;
    }

    private Double[] generateUpperLimits(){
        upperLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){

            upperLimit[i] = 5.11 ;
        }
        return upperLimit;
    }

    private Double[] generateLowerLimits(){
        lowerLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            lowerLimit[i] = -5.12;
        }
        return lowerLimit;
    }
}
