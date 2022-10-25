public class Easom extends Problem {

    public Easom(int maxFes) {
        super("Easom", 2, maxFes);
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
        fitness = -Math.cos(x[0])*Math.cos(x[1])*Math.exp(-Math.pow( x[0]-Math.PI ,2) - Math.pow(x[1]-Math.PI,2)) ; //TODO prever
        currentFes++;
        return fitness;
    }

    private Double[] generateUpperLimits(){
        upperLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            upperLimit[i] = 100.0;
        }
        return upperLimit;
    }

    private Double[] generateLowerLimits(){
        lowerLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            lowerLimit[i] = -100.0;
        }
        return lowerLimit;
    }
}
