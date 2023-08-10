public class BmiService {
    public int calculate() {
        int weightInKg = 98;
        double heightInMeters = 1.87;
        int bmi = (int) (weightInKg / heightInMeters / heightInMeters);
        return bmi;
    }
}


