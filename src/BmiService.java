public class BmiService {
    public double calculate(double weight, double high) {
        double result;
        result = weight / (high * high);
        return result;
    }
}
