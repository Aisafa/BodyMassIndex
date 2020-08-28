public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double  BodyMassIndex = service.calculate(60, 175);
        System.out.println(String.format("Your Body Mass Index = %.1f ",BodyMassIndex));
    }
}

