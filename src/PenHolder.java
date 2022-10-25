public class PenHolder extends Problem{
    //Two-dimensional PenHolder function

    public PenHolder(int maxFes) {
        super("PenHolder", 2, maxFes);
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
        //fitness = -Math.exp(-Math.sqrt(Math.pow(x[0]-Math.PI,2) + Math.pow(x[1]-Math.PI,2)))*Math.cos(x[0])*Math.cos(x[1]); //TODO prever ker toto pa neman pojma
        fitness = -Math.exp(Math.pow(Math.abs(Math.exp(Math.abs(-Math.sqrt(Math.pow(x[0],2)+Math.pow(x[1],2)/Math.PI+1)))*Math.cos(x[0])*Math.cos(x[1])),-1));
        currentFes++;
        return fitness;
    }

    private Double[] generateUpperLimits(){
        upperLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            upperLimit[i] = 11.0 ;
        }
        return upperLimit;
    }

    private Double[] generateLowerLimits(){
        lowerLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            lowerLimit[i] = -11.0;
        }
        return lowerLimit;
    }

//z copiloton ide skoz :)
}
