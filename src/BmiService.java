public class BmiService {
    public double calculate(double mass, double height) {
        double indexMass;
        indexMass = ( mass / (height *  height));
        return indexMass;
    }
}
