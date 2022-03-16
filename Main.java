public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massOfBody = 96;
        int height = 234;
        float result = service.calculate (massOfBody, height);
        System.out.printf ("BMI %.2f", result);
    }
}
