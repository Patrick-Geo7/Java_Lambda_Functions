import java.util.Scanner;
public class Main implements InputProvider<Double>, OutputPrinter<Integer> {
    private Scanner scanner = new Scanner(System.in);

    public void print(Integer value) {
        System.out.println("Output is: " + value + "\n");
    }

    public Double getInput() {
        return scanner.nextDouble();
    }

    public void start() {
        MyCalculator c = new MyCalculator(this);
        System.out.println("Add--------------");
        c.add(this, this);
        System.out.println("Subtract---------");
        c.subtract(this, this);
        System.out.println("Multiply---------");
        c.multiply(this, this);
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
//    public class Main {
//
//        public void start() {
//            Scanner scanner = new Scanner(System.in);
//            InputProvider<Double> supplier = scanner::nextDouble;
//            MyNewCalculator c =
//                    new MyNewCalculator((v) -> {
//                        System.out.println("Output is: " + v + "\n");
//                    });
//            System.out.println("Add--------------");
//            c.add(supplier, supplier);
//            System.out.println("Subtract---------");
//            c.subtract(supplier, supplier);
//            System.out.println("Multiply---------");
//            c.multiply(supplier, supplier);
//        }
//
//        public static void main(String[] args) {
//            new Main().start();
//        }
//    }

