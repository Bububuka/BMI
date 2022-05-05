package src;

public class BmiService {
    public float calculate(float massOfBody, float height) {
        return massOfBody / (height * height);
    }
}

