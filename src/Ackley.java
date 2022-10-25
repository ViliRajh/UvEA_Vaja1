public class Ackley extends Problem {

    public Ackley(int numberOfDimension, int maxFes) {
        super("Ackley", numberOfDimension, maxFes);
        //set upper and lower bounds
        upperLimit = generateUpperLimits();
        lowerLimit = generateLowerLimits();
    }

    @Override
    public double evaluate(Double[] x) {
        //enable assertion: https://se-education.org/guides/tutorials/intellijUsefulSettings.html
        assert (x.length == numberOfDimension);
        assert (currentFes <= maxFes);
        double fitness = 0.0;
        //Ackley function   danke copilot
        double tmp1 = 0.0;
        double tmp2 = 0.0;
        for(int i = 0; i < numberOfDimension; i++){
            tmp1 += x[i]*x[i];
            tmp2 += Math.cos(2*Math.PI*x[i]);
        }
        fitness = -20*Math.exp(-0.2*Math.sqrt(tmp1/numberOfDimension)) - Math.exp(tmp2/numberOfDimension) + 20 + Math.E;
        //TODO preveri

        currentFes++;
        return fitness;
    }

    //implement generateUpperLimits() and generateLowerLimits()

    private Double[] generateUpperLimits(){
        upperLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            //random uppoerlimit -5.12-5.12
            upperLimit[i] = 32.768 ;
        }
        return upperLimit;
    }

    private Double[] generateLowerLimits(){
        lowerLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            lowerLimit[i] = -32.768;
        }
        return lowerLimit;
    }



}
