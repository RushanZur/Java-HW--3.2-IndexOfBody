public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.90;
        double mass = 76;
        double indexOfMass = service.calculate(mass, height);

        System.out.println("Индекс массы тела " + indexOfMass);
    }
}
