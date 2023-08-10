
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi;
        bmi = service.calculate();
        System.out.println("bmi-индекс:" + bmi);
    }
}