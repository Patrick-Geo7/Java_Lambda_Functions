public class MyNewCalculator extends Calculator<Double, Integer>{

    private Converter<Double, Integer> myConverter = Double::intValue;
    private final OutputPrinter<Integer> printer;
    public MyNewCalculator(OutputPrinter<Integer> printer) {
        this.printer = printer;
    }
    public void add(InputProvider<Double> input1, InputProvider<Double> input2) {
        process(input1, input2, myConverter, (x, y) -> x + y, printer);
    }
    public void subtract(InputProvider<Double> input1, InputProvider<Double> input2) {
        process(input1, input2, myConverter, (x, y) -> x - y, printer);
    }
    public void multiply(InputProvider<Double> input1, InputProvider<Double> input2) {
        process(input1, input2, myConverter, (x, y) -> x * y, printer);
    }
}

