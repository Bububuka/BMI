package src;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float massOfBody = 66;
        float height = 1.72f;
        float result = service.calculate(massOfBody, height);
        System.out.printf("BMI %.2f", result);
    }
}
