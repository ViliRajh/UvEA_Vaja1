import java.util.Arrays;

public class Neumaier extends Problem {
    public Neumaier(int numberOfDimension, int maxFes) {
        super("Neumaier 'Trid'", numberOfDimension, maxFes);
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
        double tmp1 = 0.0;
        double tmp2 = 0.0;

        for(int i = 0; i < numberOfDimension; i++){

            tmp1 += Math.pow(x[i]-1,2);
        }
        for(int i = 1; i < numberOfDimension; i++){
            tmp2 += x[i]*x[i-1];
        }
        fitness = tmp1-tmp2;    //OK
        currentFes++;
        return fitness;
    }

    private Double[] generateUpperLimits(){
        upperLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            //random uppoerlimit -5.12-5.12
            upperLimit[i] = 100.0 ;   //ja misel ka je tak ka sen napsa ker tu ej  -n^2 < xi < n^2
        }
        return upperLimit;
    }

    //todo tu se bos te moga pazite ka de loverlimit mese od upper ap pa se pac do lover <0 upper pa >0
    private Double[] generateLowerLimits(){
        lowerLimit = new Double[numberOfDimension];
        for(int i = 0; i < numberOfDimension; i++){
            lowerLimit[i] = -100.0;
        }
        return lowerLimit;
    }

}
