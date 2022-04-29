public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.62F;
        int weight = 64;
        float bodyIndexMass = service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела:" + bodyIndexMass);

    }
}
