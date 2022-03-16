public class BmiService {
    public float calculate(int massOfBody, int height) {
        float height1 = height * height / 100;
        float bmi = (massOfBody / height1) * 100;
        return bmi;
    }
}

