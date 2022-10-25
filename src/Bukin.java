public class Bukin extends Problem {
    public Bukin(int maxFes) {
        super("Bukin", 2, maxFes);
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
        fitness = 100*Math.sqrt(Math.abs(x[1]-0.01*Math.pow(x[0],2))) + 0.01*Math.abs(x[0]+10);  //OK
        currentFes++;
        return fitness;
    }

    //TODO to se pite za vsak slocej ka k se narede... ker milen ka se x gleja

    private Double[] generateUpperLimits(){
        upperLimit = new Double[numberOfDimension];
        upperLimit[0] = -5.0;
        upperLimit[1] = 3.0;
        return upperLimit;
    }

    private Double[] generateLowerLimits(){
        lowerLimit = new Double[numberOfDimension];
        lowerLimit[0] = -15.0;
        lowerLimit[1] = -3.0;
        return lowerLimit;
    }
}
