public class Schwefel extends Problem {

    public Schwefel(int numberOfDimension, int maxFes) {
        super("Schwefel", numberOfDimension, maxFes);
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
        //Generalized Schwefel's Function No.2.26
        for(int i = 0; i < numberOfDimension; i++){
            fitness += -x[i]*Math.sin(Math.sqrt(Math.abs(x[i])));    //OK
        }
        currentFes++;
        return fitness;
    }

    //set upper and lower bounds


    //Bi moglo bite radndom tude tu notre ne ??
    //TODO al je misljeno da je X med -500 in 500
    private Double[] generateUpperLimits(){
        upperLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            //random uppoerlimit -500-500
            upperLimit[i] = 500.0 ;
        }
        return upperLimit;
    }

    private Double[] generateLowerLimits(){
        lowerLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            lowerLimit[i] = -500.0;
        }
        return lowerLimit;
    }

}
