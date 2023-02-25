public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 49;
        double high = 1.55;
        double MyBmi = service.calculate(weight, high);
        System.out.println("Индекс массы тела = " + MyBmi);
    }
}
