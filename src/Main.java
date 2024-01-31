public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(105,1.86);
        System.out.println(index);
    }
}