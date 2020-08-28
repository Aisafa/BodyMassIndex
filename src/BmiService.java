public class BmiService {
    public double  calculate(double  weight, double  growth) {
        double growthsqrt = Math.pow (growth / 100 , 2);
        double BodyMassindex = weight / growthsqrt;
        return BodyMassindex;
    }
}
